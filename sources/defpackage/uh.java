package defpackage;

import android.media.audiofx.LoudnessEnhancer;
import android.widget.SeekBar;
import android.widget.TextView;
import com.extremestudios.musicmanevo.EqualizerActivity;

/* JADX INFO: loaded from: classes.dex */
public final class uh implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ EqualizerActivity a;

    public uh(EqualizerActivity equalizerActivity) {
        this.a = equalizerActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            xs.n = i;
            try {
                LoudnessEnhancer loudnessEnhancer = xs.f;
                if (loudnessEnhancer != null) {
                    loudnessEnhancer.setTargetGain(i);
                }
            } catch (Exception unused) {
            }
            TextView textView = this.a.F;
            if (textView == null) {
                jn.k("gainLabel");
                throw null;
            }
            textView.setText("Master Gain (" + (i / 100) + " dB)");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
