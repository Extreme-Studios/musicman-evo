package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ss0 {
    @Override // defpackage.ss0
    public final boolean e(s sVar, n nVar, n nVar2) {
        synchronized (sVar) {
            try {
                if (sVar.g != nVar) {
                    return false;
                }
                sVar.g = nVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final boolean f(s sVar, Object obj, Object obj2) {
        synchronized (sVar) {
            try {
                if (sVar.f != obj) {
                    return false;
                }
                sVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final boolean g(s sVar, r rVar, r rVar2) {
        synchronized (sVar) {
            try {
                if (sVar.h != rVar) {
                    return false;
                }
                sVar.h = rVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final void r(r rVar, r rVar2) {
        rVar.b = rVar2;
    }

    @Override // defpackage.ss0
    public final void s(r rVar, Thread thread) {
        rVar.a = thread;
    }
}
