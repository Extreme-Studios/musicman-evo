package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i31 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ k31 g;
    public final /* synthetic */ String h;

    public /* synthetic */ i31(k31 k31Var, String str, int i) {
        this.f = i;
        this.g = k31Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        String str = this.h;
        k31 k31Var = this.g;
        switch (i) {
            case 0:
                k31Var.f.loadData(str, "text/html", "UTF-8");
                break;
            case 1:
                k31Var.f.loadData(str, "text/html", "UTF-8");
                break;
            case 2:
                k31Var.f.loadUrl(str);
                break;
            default:
                k31Var.f.l(str);
                break;
        }
    }
}
