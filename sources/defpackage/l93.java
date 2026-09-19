package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l93 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ o93 h;

    public l93(o93 o93Var, int i) {
        this.h = o93Var;
        this.a = i;
    }

    public final void a() {
        o93 o93Var = this.h;
        p73 p73Var = o93Var.f;
        wx1 wx1Var = o93Var.i;
        if (p73Var.y1() != 3 || !p73Var.B1() || p73Var.z1() != 0) {
            if (this.f) {
                wx1Var.c(2);
            }
            this.f = false;
            return;
        }
        ox0 ox0VarG1 = p73Var.G1();
        Object objF = ox0VarG1.g() ? null : ox0VarG1.f(p73Var.J1());
        int iC = p73Var.c();
        int iQ1 = p73Var.Q1();
        long jM1 = p73Var.M1();
        if (objF != null && iC == -1) {
            ox0VarG1.o(objF, o93Var.h);
            jM1 -= qz1.q(0L);
            iC = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iC == this.c && iQ1 == this.d && jM1 == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                o93Var.g.f.V1(new q43(2, new p93(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objF;
        this.c = iC;
        this.d = iQ1;
        this.e = jM1;
        wx1Var.c(2);
        wx1Var.a.sendEmptyMessageDelayed(2, i);
    }
}
