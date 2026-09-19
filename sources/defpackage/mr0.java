package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ nr0 g;

    public /* synthetic */ mr0(nr0 nr0Var, int i) {
        this.f = i;
        this.g = nr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                nr0 nr0Var = this.g;
                nr0Var.getClass();
                try {
                    if (nr0Var.f == null && nr0Var.g) {
                        x2 x2Var = new x2(nr0Var.a, 30000L, false);
                        x2Var.d(true);
                        nr0Var.f = x2Var;
                        break;
                    }
                } catch (em | IOException unused) {
                    nr0Var.f = null;
                    return;
                }
                break;
            default:
                lx0.a(this.g.a);
                break;
        }
    }
}
