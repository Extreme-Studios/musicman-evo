package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zd1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ de1 g;

    public /* synthetic */ zd1(de1 de1Var, int i) {
        this.f = i;
        this.g = de1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        de1 de1Var = this.g;
        switch (i) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                de1Var.U();
                break;
        }
    }
}
