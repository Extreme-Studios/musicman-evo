package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ur1 g;

    public /* synthetic */ tr1(ur1 ur1Var, int i) {
        this.f = i;
        this.g = ur1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        ur1 ur1Var = this.g;
        switch (i) {
            case 0:
                ur1Var.c.execute(new tr1(ur1Var, 1));
                break;
            case 1:
                ur1Var.a();
                break;
            default:
                ur1Var.a();
                break;
        }
    }
}
