package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k21 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ zx0 g;
    public final /* synthetic */ String h;

    public /* synthetic */ k21(zx0 zx0Var, String str, int i) {
        this.f = i;
        this.g = zx0Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        String str = this.h;
        zx0 zx0Var = this.g;
        switch (i) {
            case 0:
                ((h30) zx0Var.c).b.evaluateJavascript(str, null);
                break;
            default:
                ((h30) zx0Var.c).b.evaluateJavascript(str, null);
                break;
        }
    }
}
