package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class is1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ hs1 g;
    public final /* synthetic */ String h;

    public /* synthetic */ is1(hs1 hs1Var, String str, int i) {
        this.f = i;
        this.g = hs1Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        String str = this.h;
        hs1 hs1Var = this.g;
        switch (i) {
            case 0:
                hs1Var.d.a(str, null);
                break;
            default:
                hs1Var.d.a(str, null);
                break;
        }
    }
}
