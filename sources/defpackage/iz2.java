package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class iz2 {
    public final ii2 a;
    public final Handler b;
    public b83 c;
    public qk1 d;
    public int f;
    public w81 h;
    public float g = 1.0f;
    public int e = 0;

    public iz2(Context context, Looper looper, b83 b83Var) {
        this.a = ar.t(new n92(context, 4));
        this.c = b83Var;
        this.b = new Handler(looper);
    }

    public final void a(qk1 qk1Var) {
        if (Objects.equals(this.d, qk1Var)) {
            return;
        }
        this.d = qk1Var;
        this.f = qk1Var == null ? 0 : 1;
    }

    public final int b(int i, boolean z) {
        int iRequestAudioFocus;
        if (i == 1 || this.f != 1) {
            d();
            e(0);
            return 1;
        }
        int i2 = this.e;
        if (z) {
            if (i2 != 2) {
                if (this.h == null) {
                    qk1 qk1Var = qk1.b;
                    qk1 qk1Var2 = this.d;
                    qk1Var2.getClass();
                    ay2 ay2Var = new ay2(this);
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new w81(ay2Var, handler, qk1Var2);
                }
                AudioManager audioManager = (AudioManager) this.a.a();
                w81 w81Var = this.h;
                if (Build.VERSION.SDK_INT >= 26) {
                    Object obj = w81Var.d;
                    obj.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(o0.l(obj));
                } else {
                    iRequestAudioFocus = audioManager.requestAudioFocus(w81Var.a, 3, 1);
                }
                if (iRequestAudioFocus == 1) {
                    e(2);
                    return 1;
                }
                e(1);
                return -1;
            }
        } else {
            if (i2 == 1) {
                return -1;
            }
            if (i2 == 3) {
                return 0;
            }
        }
        return 1;
    }

    public final void c() {
        this.c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.a();
        w81 w81Var = this.h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(w81Var.a);
            return;
        }
        Object obj = w81Var.d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(o0.l(obj));
    }

    public final void e(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g != f) {
            this.g = f;
            b83 b83Var = this.c;
            if (b83Var != null) {
                b83Var.m.b(34);
            }
        }
    }
}
