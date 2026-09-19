package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class tm2 extends v51 {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(vm2.class, Set.class, "m");
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(vm2.class, "n");

    @Override // defpackage.v51
    public final void w(sm2 sm2Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(sm2Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(sm2Var) == null);
    }

    @Override // defpackage.v51
    public final int y(sm2 sm2Var) {
        return t.decrementAndGet(sm2Var);
    }
}
