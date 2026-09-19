package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ zu1 g;

    public /* synthetic */ xu1(zu1 zu1Var, int i) {
        this.f = i;
        this.g = zu1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        zu1 zu1Var = this.g;
        switch (i) {
            case 0:
                zu1Var.a();
                break;
            default:
                zu1Var.a();
                break;
        }
    }
}
