package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o extends ss0 {
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;

    public o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.q = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.s = atomicReferenceFieldUpdater3;
        this.t = atomicReferenceFieldUpdater4;
        this.u = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ss0
    public final boolean e(s sVar, n nVar, n nVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(sVar, nVar, nVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sVar) == nVar);
        return false;
    }

    @Override // defpackage.ss0
    public final boolean f(s sVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(sVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sVar) == obj);
        return false;
    }

    @Override // defpackage.ss0
    public final boolean g(s sVar, r rVar, r rVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(sVar, rVar, rVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sVar) == rVar);
        return false;
    }

    @Override // defpackage.ss0
    public final void r(r rVar, r rVar2) {
        this.r.lazySet(rVar, rVar2);
    }

    @Override // defpackage.ss0
    public final void s(r rVar, Thread thread) {
        this.q.lazySet(rVar, thread);
    }
}
