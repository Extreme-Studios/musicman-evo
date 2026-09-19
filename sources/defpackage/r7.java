package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class r7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public r7(BackEvent backEvent) {
        u3 u3Var = u3.a;
        float fD = u3Var.d(backEvent);
        float fE = u3Var.e(backEvent);
        float fB = u3Var.b(backEvent);
        int iC = u3Var.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
