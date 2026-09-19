package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px1 extends e81 implements pk1 {
    public sy1 f;
    public qk g;
    public u40 h;

    @Override // defpackage.f81
    public final synchronized void A0(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.i.a();
        }
    }

    @Override // defpackage.f81
    public final synchronized void C(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.h.R1();
        }
    }

    @Override // defpackage.f81
    public final synchronized void L(rm rmVar) {
        qk qkVar = this.g;
        if (qkVar != null) {
            synchronized (qkVar) {
                ((cb1) qkVar.h).b(null);
            }
        }
    }

    @Override // defpackage.f81
    public final synchronized void M2(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.g.B();
        }
    }

    @Override // defpackage.f81
    public final synchronized void R(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.f.f();
        }
    }

    @Override // defpackage.pk1
    public final synchronized void U(qk qkVar) {
        this.g = qkVar;
    }

    @Override // defpackage.f81
    public final synchronized void X1(rm rmVar) {
        u40 u40Var = this.h;
        if (u40Var != null) {
            ww1 ww1Var = (ww1) u40Var.i;
            ((ny1) u40Var.j).c.execute(new ib((e52) u40Var.g, (x42) u40Var.h, ww1Var, 15));
        }
    }

    @Override // defpackage.f81
    public final synchronized void b3(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.i.U(null);
        }
    }

    @Override // defpackage.f81
    public final synchronized void d0(rm rmVar, int i) {
        u40 u40Var = this.h;
        if (u40Var != null) {
            jn.T("Fail to initialize adapter ".concat(String.valueOf(((ww1) u40Var.i).a)));
        }
    }

    @Override // defpackage.f81
    public final synchronized void l2(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.h.L1(ue0.k);
        }
    }

    @Override // defpackage.f81
    public final synchronized void p1(rm rmVar) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.p1(rmVar);
        }
    }

    @Override // defpackage.f81
    public final synchronized void s0(rm rmVar, g81 g81Var) {
        sy1 sy1Var = this.f;
        if (sy1Var != null) {
            sy1Var.i.U(g81Var);
        }
    }

    @Override // defpackage.f81
    public final synchronized void s3(rm rmVar, int i) {
        qk qkVar = this.g;
        if (qkVar != null) {
            qkVar.d(i);
        }
    }
}
