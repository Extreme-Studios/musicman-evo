package defpackage;

import android.media.MediaPlayer;
import android.media.audiofx.Virtualizer;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class sv implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Virtualizer virtualizer;
        switch (this.a) {
            case 0:
                if (z) {
                    MediaPlayer mediaPlayer = xs.a;
                    MediaPlayer mediaPlayer2 = xs.a;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(i);
                    }
                }
                break;
            default:
                if (z) {
                    MediaPlayer mediaPlayer3 = xs.a;
                    short s = (short) i;
                    xs.l = s;
                    try {
                        Virtualizer virtualizer2 = xs.d;
                        if (virtualizer2 != null && virtualizer2.getStrengthSupported() && (virtualizer = xs.d) != null) {
                            virtualizer.setStrength(s);
                            break;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = this.a;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }
}
