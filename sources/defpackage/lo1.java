package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ no1 g;
    public final /* synthetic */ np1 h;

    public /* synthetic */ lo1(no1 no1Var, np1 np1Var, int i) {
        this.f = i;
        this.g = no1Var;
        this.h = np1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        np1 np1Var = this.h;
        no1 no1Var = this.g;
        switch (i) {
            case 0:
                no1Var.g(np1Var);
                break;
            default:
                no1Var.h(np1Var);
                break;
        }
    }
}
