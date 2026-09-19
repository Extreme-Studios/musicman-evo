package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ kb1 g;

    public /* synthetic */ ib1(kb1 kb1Var, int i) {
        this.f = i;
        this.g = kb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        kb1 kb1Var = this.g;
        switch (i) {
            case 0:
                pb1 pb1Var = kb1Var.v;
                if (pb1Var != null) {
                    pb1Var.h();
                }
                break;
            case 1:
                pb1 pb1Var2 = kb1Var.v;
                if (pb1Var2 != null) {
                    ob1 ob1Var = pb1Var2.j;
                    ob1Var.h = false;
                    e32 e32Var = zb3.l;
                    e32Var.removeCallbacks(ob1Var);
                    e32Var.postDelayed(ob1Var, 250L);
                    e32Var.post(new mb1(pb1Var2, 0));
                }
                break;
            case 2:
                pb1 pb1Var3 = kb1Var.v;
                if (pb1Var3 != null) {
                    pb1Var3.g();
                    kb1Var.v.i();
                }
                break;
            case 3:
                pb1 pb1Var4 = kb1Var.v;
                if (pb1Var4 != null) {
                    if (!kb1Var.w) {
                        pb1Var4.k();
                        kb1Var.w = true;
                    }
                    kb1Var.v.f();
                }
                break;
            default:
                pb1 pb1Var5 = kb1Var.v;
                if (pb1Var5 != null) {
                    pb1Var5.g();
                }
                break;
        }
    }
}
