package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class z93 implements ds0, ge3, yb3 {
    public final ig f;
    public final su0 g;
    public final ex0 h;
    public final es0 i;
    public final SparseArray j;
    public gr1 k;
    public t33 l;
    public wx1 m;
    public boolean n;

    public z93(ig igVar) {
        igVar.getClass();
        this.f = igVar;
        String str = qz1.a;
        Looper looperMyLooper = Looper.myLooper();
        this.k = new gr1(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, igVar, v33.h);
        su0 su0Var = new su0();
        this.g = su0Var;
        this.h = new ex0();
        es0 es0Var = new es0();
        es0Var.f = su0Var;
        tj2 tj2Var = vj2.g;
        es0Var.g = qk2.j;
        es0Var.h = vk2.l;
        this.i = es0Var;
        this.j = new SparseArray();
    }

    @Override // defpackage.ds0
    public final void A(int i) {
        q93 q93VarT = t();
        s(q93VarT, 4, new yp(q93VarT, i));
    }

    public final void B(d93 d93Var, Looper looper) {
        boolean z = true;
        if (this.l != null && !((vj2) this.i.g).isEmpty()) {
            z = false;
        }
        hn.M(z);
        d93Var.getClass();
        this.l = d93Var;
        this.m = this.f.i(looper, null);
        gr1 gr1Var = this.k;
        this.k = new gr1((CopyOnWriteArraySet) gr1Var.f, looper, (ig) gr1Var.c, new vg2(this, 26, d93Var), gr1Var.b);
    }

    @Override // defpackage.ds0
    public final void D() {
        s(y(), 22, new v33(9));
    }

    @Override // defpackage.ds0
    public final void E(i61 i61Var) {
        q93 q93VarY = y();
        s(q93VarY, 25, new bz1(q93VarY, i61Var));
    }

    @Override // defpackage.ds0
    public final void F(q43 q43Var) {
        yd3 yd3Var;
        q93 q93VarT = (q43Var == null || (yd3Var = q43Var.m) == null) ? t() : x(yd3Var);
        s(q93VarT, 10, new j52(q93VarT, q43Var));
    }

    @Override // defpackage.ds0
    public final void G(q43 q43Var) {
        yd3 yd3Var;
        s((q43Var == null || (yd3Var = q43Var.m) == null) ? t() : x(yd3Var), 10, new r53(20, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void H(at0 at0Var, at0 at0Var2, int i) {
        if (i == 1) {
            this.n = false;
            i = 1;
        }
        t33 t33Var = this.l;
        t33Var.getClass();
        es0 es0Var = this.i;
        es0Var.i = es0.B(t33Var, (vj2) es0Var.g, (yd3) es0Var.j, (su0) es0Var.f);
        q93 q93VarT = t();
        s(q93VarT, 11, new yp(q93VarT, i, at0Var, at0Var2));
    }

    @Override // defpackage.ds0
    public final void b() {
        s(t(), 14, new r53(21, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void c() {
        t33 t33Var = this.l;
        t33Var.getClass();
        es0 es0Var = this.i;
        es0Var.i = es0.B(t33Var, (vj2) es0Var.g, (yd3) es0Var.j, (su0) es0Var.f);
        es0Var.z(t33Var.G1());
        s(t(), 0, new r53(15, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void d() {
        s(t(), 3, new v33(17));
    }

    @Override // defpackage.ds0
    public final void e() {
        s(t(), 13, new r53(17, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void f() {
        s(t(), -1, new v33(18));
    }

    @Override // defpackage.ds0
    public final void g() {
        s(t(), 5, new r53(18, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void h() {
        s(t(), 1, new v33(16));
    }

    @Override // defpackage.ds0
    public final void i() {
        s(t(), 7, new v33(20));
    }

    @Override // defpackage.ge3
    public final void j(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        s(z(i, yd3Var), 1002, new r53(14, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void k() {
        s(t(), 6, new r53(19, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void l() {
        s(t(), 2, new r53(16, (byte) 0));
    }

    @Override // defpackage.ge3
    public final void m(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var, int i2) {
        s(z(i, yd3Var), 1000, new r53(13, (byte) 0));
    }

    @Override // defpackage.ds0
    public final void n() {
        s(y(), 21, new r53(22, (byte) 0));
    }

    @Override // defpackage.ge3
    public final void o(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var, IOException iOException, boolean z) {
        q93 q93VarZ = z(i, yd3Var);
        s(q93VarZ, 1003, new gv1(q93VarZ, qd3Var, vd3Var, iOException, z));
    }

    @Override // defpackage.ge3
    public final void p(int i, yd3 yd3Var, vd3 vd3Var) {
        q93 q93VarZ = z(i, yd3Var);
        s(q93VarZ, 1004, new us2(q93VarZ, vd3Var, 29, false));
    }

    @Override // defpackage.ds0
    public final void q() {
        s(t(), 12, new v33(21));
    }

    @Override // defpackage.ge3
    public final void r(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        s(z(i, yd3Var), 1001, new v33(14));
    }

    public final void s(q93 q93Var, int i, hp1 hp1Var) {
        this.j.put(i, q93Var);
        gr1 gr1Var = this.k;
        gr1Var.c(i, hp1Var);
        gr1Var.d();
    }

    public final q93 t() {
        return x((yd3) this.i.i);
    }

    @Override // defpackage.ds0
    public final void u() {
        s(y(), 23, new v33(22));
    }

    @Override // defpackage.ds0
    public final void v() {
        s(y(), 24, new v33(13));
    }

    public final q93 w(ox0 ox0Var, int i, yd3 yd3Var) {
        yd3 yd3Var2 = true == ox0Var.g() ? null : yd3Var;
        this.f.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (ox0Var.equals(this.l.G1()) && i == this.l.K1()) {
            z = true;
        }
        long jQ = 0;
        if (yd3Var2 == null || !yd3Var2.b()) {
            if (z) {
                jQ = this.l.l1();
            } else if (!ox0Var.g()) {
                ox0Var.b(i, this.h, 0L).getClass();
                jQ = qz1.q(0L);
            }
        } else if (z && this.l.c() == yd3Var2.b && this.l.Q1() == yd3Var2.c) {
            jQ = this.l.M1();
        }
        return new q93(jElapsedRealtime, ox0Var, i, yd3Var2, jQ, this.l.G1(), this.l.K1(), (yd3) this.i.i, this.l.M1(), this.l.O1());
    }

    public final q93 x(yd3 yd3Var) {
        this.l.getClass();
        ox0 ox0Var = yd3Var == null ? null : (ox0) ((vk2) this.i.h).get(yd3Var);
        if (yd3Var != null && ox0Var != null) {
            return w(ox0Var, ox0Var.o(yd3Var.a, this.g).c, yd3Var);
        }
        int iK1 = this.l.K1();
        ox0 ox0VarG1 = this.l.G1();
        if (iK1 >= ox0VarG1.a()) {
            ox0VarG1 = ox0.a;
        }
        return w(ox0VarG1, iK1, null);
    }

    public final q93 y() {
        return x((yd3) this.i.k);
    }

    public final q93 z(int i, yd3 yd3Var) {
        t33 t33Var = this.l;
        t33Var.getClass();
        if (yd3Var != null) {
            return ((ox0) ((vk2) this.i.h).get(yd3Var)) != null ? x(yd3Var) : w(ox0.a, i, yd3Var);
        }
        ox0 ox0VarG1 = t33Var.G1();
        if (i >= ox0VarG1.a()) {
            ox0VarG1 = ox0.a;
        }
        return w(ox0VarG1, i, null);
    }

    @Override // defpackage.ds0
    public final void a() {
    }
}
