package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class dt extends oz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(dt.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = hn.l;

    public final Object c(ac acVar) throws Throwable {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = oz.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                k50 k50Var = k50.a;
                if (i2 <= 0) {
                    z8 z8VarJ = na1.j(s90.h(acVar));
                    try {
                        a(new ct(this, z8VarJ));
                        Object objS = z8VarJ.s();
                        rc rcVar = rc.f;
                        if (objS != rcVar) {
                            objS = k50Var;
                        }
                        return objS == rcVar ? objS : k50Var;
                    } catch (Throwable th) {
                        z8VarJ.z();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    return k50Var;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(oz.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            xo2 xo2Var = hn.l;
            if (obj2 != xo2Var) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, xo2Var)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        j7.e("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(yd.g(this));
        sb.append("[isLocked=");
        sb.append(Math.max(oz.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
