package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ zg1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ yg1(zg1 zg1Var, int i, int i2, int i3) {
        this.f = i3;
        this.g = zg1Var;
        this.h = i;
        this.i = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        int i2 = this.i;
        int i3 = this.h;
        zg1 zg1Var = this.g;
        switch (i) {
            case 0:
                zg1Var.g.execute(new yg1(zg1Var, i3, i2, 1));
                break;
            default:
                zg1Var.h(i3 - 1, i2);
                break;
        }
    }
}
