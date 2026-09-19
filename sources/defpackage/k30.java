package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k30 {
    public final ve3 a = new ve3();

    public final void a(Exception exc) {
        ve3 ve3Var = this.a;
        ve3Var.getClass();
        dq.g(exc, "Exception must not be null");
        synchronized (ve3Var.a) {
            try {
                if (ve3Var.c) {
                    return;
                }
                ve3Var.c = true;
                ve3Var.f = exc;
                ve3Var.b.g(ve3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
