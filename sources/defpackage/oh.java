package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class oh implements Runnable {
    public final b90 f;
    public final fv g = new fv();

    static {
        yp.f("EnqueueRunnable");
    }

    public oh(b90 b90Var) {
        this.f = b90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b90 b90Var = this.f;
        try {
            if (!b90.a(b90Var, new HashSet())) {
                b90Var.a.c.b();
                throw null;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + b90Var + ")");
        } catch (Throwable th) {
            this.g.a(new cv(th));
        }
    }
}
