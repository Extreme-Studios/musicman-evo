package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ob1 implements Runnable {
    public final /* synthetic */ int f;
    public final pb1 g;
    public boolean h;

    public ob1(pb1 pb1Var) {
        this.f = 2;
        this.h = false;
        this.g = pb1Var;
    }

    public void a() {
        this.h = true;
        this.g.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        pb1 pb1Var = this.g;
        switch (i) {
            case 0:
                pb1Var.c("windowVisibilityChanged", "isVisible", String.valueOf(this.h));
                break;
            case 1:
                pb1Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.h));
                break;
            default:
                if (!this.h) {
                    pb1Var.b();
                    e32 e32Var = zb3.l;
                    e32Var.removeCallbacks(this);
                    e32Var.postDelayed(this, 250L);
                }
                break;
        }
    }

    public /* synthetic */ ob1(pb1 pb1Var, boolean z, int i) {
        this.f = i;
        this.h = z;
        this.g = pb1Var;
    }
}
