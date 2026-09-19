package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ez1 g;

    public /* synthetic */ dz1(ez1 ez1Var, int i) {
        this.f = i;
        this.g = ez1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        ez1 ez1Var = this.g;
        switch (i) {
            case 0:
                ez1Var.c();
                break;
            case 1:
                ez1Var.c();
                break;
            default:
                ez1Var.getClass();
                ez1Var.f.execute(new dz1(ez1Var, 1));
                break;
        }
    }
}
