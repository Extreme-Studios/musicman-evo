package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne3 implements Runnable {
    public final /* synthetic */ int f;
    public final qe3 g;

    public /* synthetic */ ne3(qe3 qe3Var, int i) {
        this.f = i;
        this.g = qe3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        qe3 qe3Var = this.g;
        switch (i) {
            case 0:
                if (!qe3Var.R) {
                    wd3 wd3Var = qe3Var.u;
                    wd3Var.getClass();
                    wd3Var.c(qe3Var);
                }
                break;
            case 1:
                qe3Var.L = true;
                break;
            case 2:
                qe3Var.u();
                break;
            default:
                for (ze3 ze3Var : qe3Var.w) {
                    ze3Var.i(true);
                    if (ze3Var.g != null) {
                        ze3Var.g = null;
                        ze3Var.f = null;
                    }
                }
                hb3 hb3Var = qe3Var.p;
                if (((nd0) hb3Var.g) != null) {
                    hb3Var.g = null;
                }
                hb3Var.h = null;
                break;
        }
    }
}
