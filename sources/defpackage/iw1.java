package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ x82 g;

    public /* synthetic */ iw1(x82 x82Var, int i) {
        this.f = i;
        this.g = x82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        x82 x82Var = this.g;
        switch (i) {
            case 0:
                x82Var.a();
                break;
            default:
                if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g) {
                    x82Var.c();
                    break;
                }
                break;
        }
    }
}
