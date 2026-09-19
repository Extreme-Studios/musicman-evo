package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr1 implements pl1, yk1, ek1, lk1, ib0, dm1 {
    public final cv0 f;
    public boolean g = false;

    public vr1(cv0 cv0Var, k42 k42Var) {
        this.f = cv0Var;
        cv0Var.b(2);
        if (k42Var != null) {
            cv0Var.b(1101);
        }
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        this.f.a(new zy1(25, e52Var));
    }

    @Override // defpackage.ib0
    public final synchronized void B() {
        boolean z = this.g;
        cv0 cv0Var = this.f;
        if (z) {
            cv0Var.b(8);
        } else {
            cv0Var.b(7);
            this.g = true;
        }
    }

    @Override // defpackage.lk1
    public final synchronized void B0() {
        this.f.b(6);
    }

    @Override // defpackage.dm1
    public final void F(gw0 gw0Var) {
        cv0 cv0Var = this.f;
        synchronized (cv0Var) {
            if (cv0Var.c) {
                try {
                    cv0Var.b.f(gw0Var);
                } catch (NullPointerException e) {
                    vc3.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cv0Var.b(1103);
    }

    @Override // defpackage.dm1
    public final void R(boolean z) {
        this.f.b(true != z ? 1106 : 1105);
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        int i = fu1Var.f;
        cv0 cv0Var = this.f;
        switch (i) {
            case 1:
                cv0Var.b(101);
                break;
            case 2:
                cv0Var.b(102);
                break;
            case 3:
                cv0Var.b(5);
                break;
            case 4:
                cv0Var.b(103);
                break;
            case 5:
                cv0Var.b(104);
                break;
            case 6:
                cv0Var.b(105);
                break;
            case 7:
                cv0Var.b(106);
                break;
            default:
                cv0Var.b(4);
                break;
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        this.f.b(3);
    }

    @Override // defpackage.dm1
    public final void f0(gw0 gw0Var) {
        cv0 cv0Var = this.f;
        synchronized (cv0Var) {
            if (cv0Var.c) {
                try {
                    cv0Var.b.f(gw0Var);
                } catch (NullPointerException e) {
                    vc3.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cv0Var.b(1102);
    }

    @Override // defpackage.dm1
    public final void o0(boolean z) {
        this.f.b(true != z ? 1108 : 1107);
    }

    @Override // defpackage.dm1
    public final void p() {
        this.f.b(1109);
    }

    @Override // defpackage.dm1
    public final void y0(gw0 gw0Var) {
        cv0 cv0Var = this.f;
        synchronized (cv0Var) {
            if (cv0Var.c) {
                try {
                    cv0Var.b.f(gw0Var);
                } catch (NullPointerException e) {
                    vc3.C.h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        cv0Var.b(1104);
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
    }
}
