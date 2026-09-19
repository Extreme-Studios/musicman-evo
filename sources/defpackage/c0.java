package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends na1 {
    @Override // defpackage.na1
    public final boolean f(e0 e0Var, a0 a0Var, a0 a0Var2) {
        synchronized (e0Var) {
            try {
                if (e0Var.g != a0Var) {
                    return false;
                }
                e0Var.g = a0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.na1
    public final boolean g(e0 e0Var, Object obj, Object obj2) {
        synchronized (e0Var) {
            try {
                if (e0Var.f != obj) {
                    return false;
                }
                e0Var.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.na1
    public final boolean h(e0 e0Var, d0 d0Var, d0 d0Var2) {
        synchronized (e0Var) {
            try {
                if (e0Var.h != d0Var) {
                    return false;
                }
                e0Var.h = d0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.na1
    public final void m(d0 d0Var, d0 d0Var2) {
        d0Var.b = d0Var2;
    }

    @Override // defpackage.na1
    public final void n(d0 d0Var, Thread thread) {
        d0Var.a = thread;
    }
}
