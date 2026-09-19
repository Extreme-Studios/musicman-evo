package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ kd0 g;

    public /* synthetic */ ri1(kd0 kd0Var, int i) {
        this.f = i;
        this.g = kd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        kd0 kd0Var = this.g;
        switch (i) {
            case 0:
                kd0Var.w(new au1(3));
                break;
            default:
                ((nz1) ((r52) ((es0) kd0Var.k).i).h).e();
                break;
        }
    }
}
