package defpackage;

import android.media.MediaPlayer;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class th implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ short a;
    public final /* synthetic */ short b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ String d;

    public th(short s, short s2, TextView textView, String str) {
        this.a = s;
        this.b = s2;
        this.c = textView;
        this.d = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            short s = (short) (i + this.a);
            MediaPlayer mediaPlayer = xs.a;
            xs.f(this.b, s);
            this.c.setText(this.d + " (" + (s / 100) + " dB)");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
