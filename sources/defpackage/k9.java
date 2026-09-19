package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends sn {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ k9(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.sn
    public final boolean k() {
        switch (this.e) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.sn
    public final void l(Throwable th) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                z8 z8Var = (z8) obj;
                Throwable thR = z8Var.r(j());
                if (z8Var.w()) {
                    yb ybVar = z8Var.i;
                    ybVar.getClass();
                    ff ffVar = (ff) ybVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ff.m;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater.get(ffVar);
                        xo2 xo2Var = ss0.c;
                        if (jn.b(obj2, xo2Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(ffVar, xo2Var, thR)) {
                                if (atomicReferenceFieldUpdater.get(ffVar) != xo2Var) {
                                }
                            }
                            break;
                        } else if (obj2 instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(ffVar, obj2, null)) {
                                    if (atomicReferenceFieldUpdater.get(ffVar) != obj2) {
                                    }
                                }
                            }
                        }
                    }
                }
                z8Var.o(thR);
                if (!z8Var.w()) {
                    z8Var.p();
                }
                break;
            case 1:
                ((cl) obj).h(th);
                break;
            default:
                Object obj3 = wn.f.get(j());
                tn tnVar = (tn) obj;
                if (!(obj3 instanceof ma)) {
                    tnVar.d(dq.r(obj3));
                } else {
                    tnVar.d(ar.d(((ma) obj3).a));
                }
                break;
        }
    }
}
