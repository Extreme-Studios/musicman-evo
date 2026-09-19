package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ id1 g;

    public /* synthetic */ hd1(id1 id1Var, int i) {
        this.f = i;
        this.g = id1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        id1 id1Var = this.g;
        switch (i) {
            case 0:
                pb1 pb1Var = id1Var.j;
                if (pb1Var != null) {
                    if (!id1Var.k) {
                        pb1Var.k();
                        id1Var.k = true;
                    }
                    id1Var.j.f();
                }
                break;
            case 1:
                pb1 pb1Var2 = id1Var.j;
                if (pb1Var2 != null) {
                    pb1Var2.g();
                }
                break;
            default:
                pb1 pb1Var3 = id1Var.j;
                if (pb1Var3 != null) {
                    pb1Var3.e();
                }
                break;
        }
    }
}
