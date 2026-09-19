package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k93 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ o93 i;

    public k93(o93 o93Var, int i) {
        this.i = o93Var;
        this.a = i;
    }

    public final void a() {
        Object obj;
        o93 o93Var = this.i;
        p73 p73Var = o93Var.f;
        wx1 wx1Var = o93Var.i;
        if (p73Var.y1() != 2 || !p73Var.B1() || p73Var.z1() != 0) {
            if (this.g) {
                wx1Var.c(1);
            }
            this.g = false;
            return;
        }
        ox0 ox0VarG1 = p73Var.G1();
        Object objF = ox0VarG1.g() ? null : ox0VarG1.f(p73Var.J1());
        int iC = p73Var.c();
        int iQ1 = p73Var.Q1();
        long jK2 = p73Var.k2();
        long jMax = Math.max(0L, p73Var.O1() - Math.max(0L, jK2 - p73Var.M1()));
        if (objF != null && iC == -1) {
            ox0VarG1.o(objF, o93Var.h);
            jK2 -= qz1.q(0L);
            iC = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iC == this.c && iQ1 == this.d) {
            obj = objF;
            if (jK2 == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i) {
                    o93Var.g.f.V1(new q43(2, new p93(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = obj;
        this.c = iC;
        this.d = iQ1;
        this.e = jK2;
        this.f = jMax;
        wx1Var.c(1);
        wx1Var.a.sendEmptyMessageDelayed(1, i);
    }
}
