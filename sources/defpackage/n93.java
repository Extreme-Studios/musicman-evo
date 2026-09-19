package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class n93 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ o93 e;

    public n93(o93 o93Var, int i) {
        this.e = o93Var;
        this.a = i;
    }

    public final void a() {
        o93 o93Var = this.e;
        p73 p73Var = o93Var.f;
        wx1 wx1Var = o93Var.i;
        int iZ1 = p73Var.z1();
        p73 p73Var2 = o93Var.f;
        if (!p73Var2.B1() || p73Var2.y1() == 1 || p73Var2.y1() == 4 || iZ1 == 0 || iZ1 == 1) {
            if (this.c) {
                wx1Var.c(4);
            }
            this.c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iZ1) {
            if (jElapsedRealtime - this.d >= i) {
                o93Var.g.f.V1(new q43(2, new p93(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iZ1;
        wx1Var.c(4);
        wx1Var.a.sendEmptyMessageDelayed(4, i);
    }
}
