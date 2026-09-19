package com.extremestudios.musicmanevo;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.audiofx.Visualizer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public final class VisualizerSpectrumView extends View {
    private static final String TAG = "AudioVisualizer";
    private static final int BAR_COUNT = 28;
    private static final float MIN_FREQUENCY_HZ = 40f;
    private static final float MAX_FREQUENCY_HZ = 16000f;

    private final Paint barPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint gridPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final float[] levels = new float[BAR_COUNT];
    private Visualizer visualizer;
    private int attachedSessionId = -1;
    private float sampleRateHz = 44100f;
    private float peakLevel;
    private long peakWarningUntil;
    private boolean permissionMissing;

    public VisualizerSpectrumView(Context context) {
        this(context, null);
    }

    public VisualizerSpectrumView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VisualizerSpectrumView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        gridPaint.setColor(Color.argb(45, 176, 0, 255));
        gridPaint.setStrokeWidth(dp(1));
        textPaint.setColor(Color.argb(190, 255, 255, 255));
        textPaint.setTextSize(dp(10));
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public void attachToSession(int audioSessionId) {
        if (audioSessionId <= 0 || audioSessionId == attachedSessionId) return;
        if (getContext().checkSelfPermission(Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            permissionMissing = true;
            invalidate();
            return;
        }

        releaseVisualizer();
        permissionMissing = false;
        try {
            Visualizer next = new Visualizer(audioSessionId);
            visualizer = next;
            attachedSessionId = audioSessionId;
            int[] captureRange = Visualizer.getCaptureSizeRange();
            next.setCaptureSize(Math.min(1024, captureRange[1]));
            next.setScalingMode(Visualizer.SCALING_MODE_AS_PLAYED);
            sampleRateHz = next.getSamplingRate() / 1000f;
            next.setDataCaptureListener(new Visualizer.OnDataCaptureListener() {
                @Override
                public void onWaveFormDataCapture(Visualizer visualizer, byte[] waveform, int samplingRate) {
                    updatePeak(waveform);
                }

                @Override
                public void onFftDataCapture(Visualizer visualizer, byte[] fft, int samplingRate) {
                    updateSpectrum(fft, samplingRate / 1000f);
                }
            }, Visualizer.getMaxCaptureRate(), true, true);
            next.setEnabled(true);
        } catch (RuntimeException error) {
            Log.w(TAG, "Visualizer unavailable for audio session " + audioSessionId, error);
            releaseVisualizer();
        }
    }

    public void releaseVisualizer() {
        Visualizer current = visualizer;
        visualizer = null;
        attachedSessionId = -1;
        if (current != null) {
            try {
                current.setEnabled(false);
            } catch (RuntimeException ignored) {
            }
            try {
                current.release();
            } catch (RuntimeException ignored) {
            }
        }
        for (int i = 0; i < levels.length; i++) levels[i] = 0f;
        peakLevel = 0f;
        invalidate();
    }

    private void updatePeak(byte[] waveform) {
        int maximum = 0;
        for (byte sample : waveform) {
            maximum = Math.max(maximum, Math.abs((sample & 0xff) - 128));
        }
        float measured = Math.min(1f, maximum / 128f);
        peakLevel = measured > peakLevel ? measured : (peakLevel * 0.82f) + (measured * 0.18f);
        if (measured >= 0.96f) peakWarningUntil = System.currentTimeMillis() + 450L;
        postInvalidateOnAnimation();
    }

    private void updateSpectrum(byte[] fft, float capturedSampleRateHz) {
        if (capturedSampleRateHz > 0f) sampleRateHz = capturedSampleRateHz;
        int captureSize = fft.length;
        float upperFrequency = Math.min(MAX_FREQUENCY_HZ, sampleRateHz / 2f);
        double frequencyRatio = upperFrequency / MIN_FREQUENCY_HZ;

        for (int bar = 0; bar < BAR_COUNT; bar++) {
            double progress = (bar + 0.5d) / BAR_COUNT;
            float frequency = (float) (MIN_FREQUENCY_HZ * Math.pow(frequencyRatio, progress));
            int bin = Math.max(1, Math.min((captureSize / 2) - 1,
                    Math.round(frequency * captureSize / sampleRateHz)));
            int fftIndex = bin * 2;
            float real = fft[fftIndex];
            float imaginary = fft[fftIndex + 1];
            float magnitude = (float) Math.sqrt((real * real) + (imaginary * imaginary));
            float normalized = Math.min(1f, (float) (Math.log10(1f + magnitude) / 2.15f));
            levels[bar] = normalized > levels[bar]
                    ? (levels[bar] * 0.30f) + (normalized * 0.70f)
                    : (levels[bar] * 0.82f) + (normalized * 0.18f);
        }
        postInvalidateOnAnimation();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float labelHeight = dp(28);
        float graphBottom = height - labelHeight;
        float graphTop = dp(14);
        float availableHeight = Math.max(1f, graphBottom - graphTop);

        for (int line = 1; line <= 3; line++) {
            float y = graphTop + (availableHeight * line / 4f);
            canvas.drawLine(dp(12), y, width - dp(12), y, gridPaint);
        }

        float gap = dp(3);
        float barWidth = Math.max(dp(3), (width - dp(24) - gap * (BAR_COUNT - 1)) / BAR_COUNT);
        float barsWidth = (barWidth * BAR_COUNT) + (gap * (BAR_COUNT - 1));
        float startX = (width - barsWidth) / 2f;
        float upperFrequency = Math.min(MAX_FREQUENCY_HZ, sampleRateHz / 2f);
        double frequencyRatio = upperFrequency / MIN_FREQUENCY_HZ;

        for (int bar = 0; bar < BAR_COUNT; bar++) {
            float frequency = (float) (MIN_FREQUENCY_HZ
                    * Math.pow(frequencyRatio, (bar + 0.5d) / BAR_COUNT));
            barPaint.setColor(colorForFrequency(frequency));
            float barHeight = Math.max(dp(2), levels[bar] * availableHeight);
            float left = startX + bar * (barWidth + gap);
            canvas.drawRoundRect(left, graphBottom - barHeight, left + barWidth, graphBottom,
                    barWidth / 2f, barWidth / 2f, barPaint);
        }

        textPaint.setColor(Color.rgb(0, 214, 255));
        canvas.drawText("LOW", width * 0.18f, height - dp(8), textPaint);
        textPaint.setColor(Color.rgb(176, 0, 255));
        canvas.drawText("MID", width * 0.50f, height - dp(8), textPaint);
        textPaint.setColor(Color.rgb(255, 61, 129));
        canvas.drawText("HIGH", width * 0.82f, height - dp(8), textPaint);

        if (permissionMissing) {
            textPaint.setColor(Color.WHITE);
            textPaint.setTextSize(dp(11));
            canvas.drawText("IZINKAN AKSES AUDIO UNTUK VISUALIZER", width / 2f, height / 2f, textPaint);
        } else if (System.currentTimeMillis() < peakWarningUntil) {
            barPaint.setColor(Color.RED);
            canvas.drawCircle(width - dp(22), dp(20), dp(5), barPaint);
            textPaint.setTextAlign(Paint.Align.RIGHT);
            textPaint.setColor(Color.RED);
            textPaint.setTextSize(dp(9));
            canvas.drawText("PEAK", width - dp(31), dp(23), textPaint);
            textPaint.setTextAlign(Paint.Align.CENTER);
            postInvalidateOnAnimation();
        }
    }

    private int colorForFrequency(float frequency) {
        if (frequency < 250f) return Color.rgb(0, 214, 255);
        if (frequency < 4000f) return Color.rgb(176, 0, 255);
        return Color.rgb(255, 61, 129);
    }

    private float dp(float value) {
        return value * getResources().getDisplayMetrics().density;
    }

    @Override
    protected void onDetachedFromWindow() {
        releaseVisualizer();
        super.onDetachedFromWindow();
    }
}
