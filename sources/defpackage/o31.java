package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ k31 g;

    public /* synthetic */ o31(k31 k31Var, int i) {
        this.f = i;
        this.g = k31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        k31 k31Var = this.g;
        switch (i) {
            case 0:
                k31Var.f.destroy();
                break;
            case 1:
                k31Var.f.destroy();
                break;
            default:
                k31Var.h("/result", u11.j);
                k31Var.f.destroy();
                break;
        }
    }
}
