package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class wb1 implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final lb1 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public wb1(Context context, lb1 lb1Var) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = lb1Var;
    }

    public final void a() {
        boolean z = this.d;
        lb1 lb1Var = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= 0.0f) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                lb1Var.y();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        lb1Var.y();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.y();
    }
}
