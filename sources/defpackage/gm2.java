package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class gm2 extends ss0 {
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(mm2.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(mm2.class, mm2.class, "b");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(nm2.class, mm2.class, "h");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(nm2.class, cm2.class, "g");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(nm2.class, Object.class, "f");

    @Override // defpackage.ss0
    public final void C(mm2 mm2Var, Thread thread) {
        q.lazySet(mm2Var, thread);
    }

    @Override // defpackage.ss0
    public final void L(mm2 mm2Var, mm2 mm2Var2) {
        r.lazySet(mm2Var, mm2Var2);
    }

    @Override // defpackage.ss0
    public final boolean R(nm2 nm2Var, mm2 mm2Var, mm2 mm2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(nm2Var, mm2Var, mm2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(nm2Var) == mm2Var);
        return false;
    }

    @Override // defpackage.ss0
    public final boolean W(fm2 fm2Var, cm2 cm2Var, cm2 cm2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = t;
            if (atomicReferenceFieldUpdater.compareAndSet(fm2Var, cm2Var, cm2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(fm2Var) == cm2Var);
        return false;
    }

    @Override // defpackage.ss0
    public final mm2 Y(fm2 fm2Var) {
        return (mm2) s.getAndSet(fm2Var, mm2.c);
    }

    @Override // defpackage.ss0
    public final cm2 c0(fm2 fm2Var) {
        return (cm2) t.getAndSet(fm2Var, cm2.d);
    }

    @Override // defpackage.ss0
    public final boolean f0(nm2 nm2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = u;
            if (atomicReferenceFieldUpdater.compareAndSet(nm2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(nm2Var) == obj);
        return false;
    }
}
