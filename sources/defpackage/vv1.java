package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class vv1 implements yk1, ek1 {
    public static final Object h = new Object();
    public static int i;
    public final h73 f;
    public final yv1 g;

    public vv1(yv1 yv1Var, h73 h73Var) {
        this.g = yv1Var;
        this.f = h73Var;
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        a(false);
    }

    public final void a(boolean z) {
        int i2;
        int iIntValue;
        ix0 ix0Var = lx0.C6;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && !this.f.s()) {
            Object obj = h;
            synchronized (obj) {
                i2 = i;
                iIntValue = ((Integer) tu0Var.c.a(lx0.D6)).intValue();
            }
            if (i2 < iIntValue) {
                yv1 yv1Var = this.g;
                p62 p62VarA = yv1Var.d.a(new Bundle());
                p62VarA.a(new in2(p62VarA, 0, new mn0(yv1Var, z)), za1.g);
                synchronized (obj) {
                    i++;
                }
            }
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        a(true);
    }
}
