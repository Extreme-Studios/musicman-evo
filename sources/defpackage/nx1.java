package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends p41 implements pk1 {
    public q41 f;
    public qk g;

    public final synchronized void C3(wy1 wy1Var) {
        this.f = wy1Var;
    }

    @Override // defpackage.q41
    public final synchronized void G1(fu1 fu1Var) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.G1(fu1Var);
        }
    }

    @Override // defpackage.q41
    public final synchronized void H0() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.H0();
        }
    }

    @Override // defpackage.q41
    public final synchronized void M0(fu1 fu1Var) {
        qk qkVar = this.g;
        if (qkVar != null) {
            synchronized (qkVar) {
                if (!qkVar.f) {
                    qkVar.f = true;
                    qkVar.j(fu1Var);
                }
            }
        }
    }

    @Override // defpackage.pk1
    public final synchronized void U(qk qkVar) {
        this.g = qkVar;
    }

    @Override // defpackage.q41
    public final synchronized void b() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.b();
        }
    }

    @Override // defpackage.q41
    public final synchronized void b0() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.b0();
        }
    }

    @Override // defpackage.q41
    public final synchronized void d() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.d();
        }
    }

    @Override // defpackage.q41
    public final synchronized void d3(n01 n01Var, String str) {
    }

    @Override // defpackage.q41
    public final synchronized void f() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.f();
        }
    }

    @Override // defpackage.q41
    public final synchronized void f0(int i) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.f0(i);
        }
    }

    @Override // defpackage.q41
    public final synchronized void g() {
        try {
            q41 q41Var = this.f;
            if (q41Var != null) {
                q41Var.g();
            }
            qk qkVar = this.g;
            if (qkVar != null) {
                synchronized (qkVar) {
                    ((cb1) qkVar.h).b(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q41
    public final synchronized void h0() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.h0();
        }
    }

    @Override // defpackage.q41
    public final synchronized void i0(String str) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.i0(str);
        }
    }

    @Override // defpackage.q41
    public final synchronized void j() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.j();
        }
    }

    @Override // defpackage.q41
    public final synchronized void j0() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.j0();
        }
    }

    @Override // defpackage.q41
    public final synchronized void k() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.k();
        }
    }

    @Override // defpackage.q41
    public final synchronized void m0(int i) {
        qk qkVar = this.g;
        if (qkVar != null) {
            qkVar.d(i);
        }
    }

    @Override // defpackage.q41
    public final synchronized void m2(i81 i81Var) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.m2(i81Var);
        }
    }

    @Override // defpackage.q41
    public final synchronized void p() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.p();
        }
    }

    @Override // defpackage.q41
    public final synchronized void r3(g81 g81Var) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.r3(g81Var);
        }
    }

    @Override // defpackage.q41
    public final synchronized void w2(String str, String str2) {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.w2(str, str2);
        }
    }

    @Override // defpackage.q41
    public final synchronized void x() {
        q41 q41Var = this.f;
        if (q41Var != null) {
            q41Var.x();
        }
    }

    @Override // defpackage.q41
    public final synchronized void x0(String str, int i) {
        qk qkVar = this.g;
        if (qkVar != null) {
            synchronized (qkVar) {
                try {
                    if (!qkVar.f) {
                        qkVar.f = true;
                        if (str == null) {
                            str = vy1.c(((ww1) qkVar.g).a, i);
                        }
                        qkVar.j(new fu1(i, str, "undefined", null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
