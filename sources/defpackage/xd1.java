package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ md1 g;

    public /* synthetic */ xd1(md1 md1Var, int i) {
        this.f = i;
        this.g = md1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        md1 md1Var = this.g;
        switch (i) {
            case 0:
                md1Var.destroy();
                break;
            case 1:
                md1Var.destroy();
                break;
            case 2:
                md1Var.onPause();
                break;
            case 3:
                md1Var.onResume();
                break;
            case 4:
                md1Var.destroy();
                break;
            case 5:
                md1Var.a("onSdkImpression", new m7(0));
                break;
            case 6:
                md1Var.destroy();
                break;
            default:
                md1Var.F0();
                break;
        }
    }
}
