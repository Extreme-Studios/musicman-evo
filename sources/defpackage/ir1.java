package defpackage;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ir1 {
    public final ak1 a;
    public final ym1 b;
    public final ok1 c;
    public final bl1 d;
    public final gl1 e;
    public final zl1 f;
    public final Executor g;
    public final xm1 h;
    public final ih1 i;
    public final vs0 j;
    public final d91 k;
    public final zq0 l;
    public final ul1 m;
    public final bw1 n;
    public final f82 o;
    public final es1 p;
    public final sg1 q;
    public final mr1 r;
    public final os1 s;
    public final qj1 t;

    public ir1(ak1 ak1Var, ok1 ok1Var, bl1 bl1Var, gl1 gl1Var, zl1 zl1Var, Executor executor, xm1 xm1Var, ih1 ih1Var, vs0 vs0Var, d91 d91Var, zq0 zq0Var, ul1 ul1Var, bw1 bw1Var, f82 f82Var, es1 es1Var, ym1 ym1Var, sg1 sg1Var, mr1 mr1Var, os1 os1Var, qj1 qj1Var) {
        this.a = ak1Var;
        this.c = ok1Var;
        this.d = bl1Var;
        this.e = gl1Var;
        this.f = zl1Var;
        this.g = executor;
        this.h = xm1Var;
        this.i = ih1Var;
        this.j = vs0Var;
        this.k = d91Var;
        this.l = zq0Var;
        this.m = ul1Var;
        this.n = bw1Var;
        this.o = f82Var;
        this.p = es1Var;
        this.b = ym1Var;
        this.q = sg1Var;
        this.r = mr1Var;
        this.s = os1Var;
        this.t = qj1Var;
    }

    public static final cb1 b(md1 md1Var, String str, String str2, Bundle bundle, d72 d72Var) {
        ix0 ix0Var = lx0.p2;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            ec.q(vc3.C.k, bundle, "rendering-webview-load-html-start");
        }
        cb1 cb1Var = new cb1();
        if (((Boolean) tu0Var.c.a(lx0.E9)).booleanValue()) {
            a72 a72VarJ = a72.j(md1Var.getContext(), 112);
            a72VarJ.a();
            i8.M(cb1Var, d72Var, a72VarJ, false);
        }
        md1Var.e0().l = new vg2(bundle, 15, cb1Var);
        md1Var.H0(str, str2);
        return cb1Var;
    }

    public final void a(md1 md1Var, boolean z, b21 b21Var, Bundle bundle) {
        vq0 vq0Var;
        ix0 ix0Var = lx0.p2;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            ec.q(vc3.C.k, bundle, "rendering-configure-webview-start");
        }
        md1Var.e0().p(new ib0() { // from class: hr1
            @Override // defpackage.ib0
            public final /* synthetic */ void B() {
                this.f.a.B();
            }
        }, this.d, this.e, new k11() { // from class: fr1
            @Override // defpackage.k11
            public final /* synthetic */ void n0(String str, String str2) {
                this.f.f.n0(str, str2);
            }
        }, new rq1(2, this), z, b21Var, this.j, new dr0(23, this), this.k, this.n, this.o, this.p, null, this.b, null, null, null, this.q, this.s, this.t);
        md1Var.setOnTouchListener(new ep(1, this));
        int i = 5;
        md1Var.setOnClickListener(new f1(i, this));
        if (((Boolean) kx0Var2.a(lx0.Q2)).booleanValue() && (vq0Var = this.l.b) != null) {
            vq0Var.e(md1Var.p0());
        }
        xm1 xm1Var = this.h;
        Executor executor = this.g;
        xm1Var.I1(md1Var, executor);
        xm1Var.I1(new eq1(md1Var, 2), executor);
        xm1Var.R1(md1Var.p0());
        md1Var.t0("/trackActiveViewUnit", new s11(this, i, md1Var));
        ih1 ih1Var = this.i;
        ih1Var.getClass();
        ih1Var.o = new WeakReference(md1Var);
        if (((Boolean) kx0Var2.a(ix0Var)).booleanValue()) {
            ec.q(vc3.C.k, bundle, "rendering-configure-webview-end");
        }
    }
}
