package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bc1 g;
    public final /* synthetic */ String h;

    public /* synthetic */ yb1(bc1 bc1Var, String str, int i) {
        this.f = i;
        this.g = bc1Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        String str = this.h;
        bc1 bc1Var = this.g;
        switch (i) {
            case 0:
                pb1 pb1Var = bc1Var.l;
                if (pb1Var != null) {
                    pb1Var.c("exception", "what", "ExoPlayerAdapter exception", "extra", str);
                }
                break;
            default:
                pb1 pb1Var2 = bc1Var.l;
                if (pb1Var2 != null) {
                    pb1Var2.c("error", "what", "ExoPlayerAdapter error", "extra", str);
                }
                break;
        }
    }
}
