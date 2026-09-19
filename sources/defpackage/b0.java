package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends na1 {
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;

    public b0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.q = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.s = atomicReferenceFieldUpdater3;
        this.t = atomicReferenceFieldUpdater4;
        this.u = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.na1
    public final boolean f(e0 e0Var, a0 a0Var, a0 a0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(e0Var, a0Var, a0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(e0Var) == a0Var);
        return false;
    }

    @Override // defpackage.na1
    public final boolean g(e0 e0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(e0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(e0Var) == obj);
        return false;
    }

    @Override // defpackage.na1
    public final boolean h(e0 e0Var, d0 d0Var, d0 d0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(e0Var, d0Var, d0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(e0Var) == d0Var);
        return false;
    }

    @Override // defpackage.na1
    public final void m(d0 d0Var, d0 d0Var2) {
        this.r.lazySet(d0Var, d0Var2);
    }

    @Override // defpackage.na1
    public final void n(d0 d0Var, Thread thread) {
        this.q.lazySet(d0Var, thread);
    }
}
