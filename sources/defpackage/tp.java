package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class tp {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(tp.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tp.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(tp.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(tp tpVar, int i) {
        while (true) {
            tp tpVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (tpVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    tpVarF = (tp) obj;
                    if (!tpVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(tpVarF);
                }
            }
            if (tpVarF instanceof vo) {
                return (((vo) tpVarF).d & i) == 0 && tpVarF.e(tpVar, i);
            }
            atomicReferenceFieldUpdater.set(tpVar, tpVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(tpVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(tpVarF, this, tpVar)) {
                    tpVar.g(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(tpVarF) == this);
        }
    }

    public final tp f() {
        tp tpVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            tp tpVar2 = (tp) atomicReferenceFieldUpdater2.get(this);
            tpVar = tpVar2;
            while (true) {
                tp tpVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = a;
                    obj = atomicReferenceFieldUpdater.get(tpVar);
                    if (obj == this) {
                        if (tpVar2 != tpVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, tpVar2, tpVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != tpVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof yw)) {
                        obj.getClass();
                        tpVar3 = tpVar;
                        tpVar = (tp) obj;
                    } else {
                        if (tpVar3 != null) {
                            break;
                        }
                        tpVar = (tp) atomicReferenceFieldUpdater2.get(tpVar);
                    }
                }
                tp tpVar4 = ((yw) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(tpVar3, tpVar, tpVar4)) {
                    if (atomicReferenceFieldUpdater.get(tpVar3) != tpVar) {
                        break;
                    }
                }
                tpVar = tpVar3;
            }
        }
        return tpVar;
    }

    public final void g(tp tpVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            tp tpVar2 = (tp) atomicReferenceFieldUpdater.get(tpVar);
            if (a.get(this) != tpVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(tpVar, tpVar2, this)) {
                    if (i()) {
                        tpVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(tpVar) == tpVar2);
        }
    }

    public final tp h() {
        Object obj = a.get(this);
        yw ywVar = obj instanceof yw ? (yw) obj : null;
        if (ywVar != null) {
            return ywVar.a;
        }
        obj.getClass();
        return (tp) obj;
    }

    public boolean i() {
        return a.get(this) instanceof yw;
    }

    public String toString() {
        return new sp(this) + '@' + yd.g(this);
    }
}
