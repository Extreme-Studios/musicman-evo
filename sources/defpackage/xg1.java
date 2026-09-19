package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ zg1 g;

    public /* synthetic */ xg1(zg1 zg1Var, int i) {
        this.f = i;
        this.g = zg1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        zg1 zg1Var = this.g;
        switch (i) {
            case 0:
                zg1Var.g.execute(new xg1(zg1Var, 1));
                break;
            default:
                zg1Var.l();
                break;
        }
    }
}
