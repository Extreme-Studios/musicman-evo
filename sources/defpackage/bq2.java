package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bq2 implements wa3 {
    public final /* synthetic */ int f;
    public final Executor g;
    public final Object h;
    public final tk1 i;

    public bq2(Executor executor, tk1 tk1Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.h = new Object();
                this.g = executor;
                this.i = tk1Var;
                break;
            default:
                this.h = new Object();
                this.g = executor;
                this.i = tk1Var;
                break;
        }
    }

    @Override // defpackage.wa3
    public final void a(ve3 ve3Var) {
        switch (this.f) {
            case 0:
                if (ve3Var.d) {
                    synchronized (this.h) {
                        break;
                    }
                    this.g.execute(new ly1(19, this));
                    return;
                }
                return;
            default:
                if (ve3Var.c()) {
                    synchronized (this.h) {
                        break;
                    }
                    this.g.execute(new u52(this, ve3Var, 15, false));
                    return;
                }
                return;
        }
    }
}
