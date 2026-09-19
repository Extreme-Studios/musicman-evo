package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m93 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ o93 g;

    public m93(o93 o93Var, int i) {
        this.g = o93Var;
        this.a = i;
    }

    public final void a() {
        long jJ2;
        o93 o93Var = this.g;
        p73 p73Var = o93Var.f;
        su0 su0Var = o93Var.h;
        wx1 wx1Var = o93Var.i;
        ox0 ox0VarG1 = p73Var.G1();
        Object objF = ox0VarG1.g() ? null : ox0VarG1.f(p73Var.J1());
        int iC = p73Var.c();
        int iQ1 = p73Var.Q1();
        long jM1 = p73Var.M1();
        if (objF == null || iC != -1) {
            jJ2 = iC != -1 ? p73Var.j2() : -9223372036854775807L;
        } else {
            ox0VarG1.o(objF, su0Var);
            jM1 -= qz1.q(0L);
            jJ2 = qz1.q(su0Var.d);
            iC = -1;
        }
        boolean z = p73Var.y1() == 3 && p73Var.B1() && p73Var.z1() == 0;
        if (!z || jJ2 == -9223372036854775807L || jM1 < jJ2) {
            wx1Var.c(3);
            if (z && jJ2 != -9223372036854775807L) {
                p73Var.g2();
                wx1Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((jJ2 - jM1) / p73Var.b0.o.a));
            }
            this.e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.e;
        int i = this.a;
        if (z2 && Objects.equals(objF, this.b) && iC == this.c && iQ1 == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                o93Var.g.f.V1(new q43(2, new p93(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objF;
        this.c = iC;
        this.d = iQ1;
        wx1Var.c(3);
        wx1Var.a.sendEmptyMessageDelayed(3, i);
    }
}
