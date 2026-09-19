package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn extends tp implements lf, wm {
    public wn d;

    @Override // defpackage.lf
    public final void a() {
        wn wnVarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wn.f;
            Object obj = atomicReferenceFieldUpdater.get(wnVarJ);
            if (obj instanceof sn) {
                if (obj != this) {
                    return;
                }
                hh hhVar = dq.l;
                while (!atomicReferenceFieldUpdater.compareAndSet(wnVarJ, obj, hhVar)) {
                    if (atomicReferenceFieldUpdater.get(wnVarJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof wm) || ((wm) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = tp.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof yw) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                tp tpVar = (tp) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = tp.c;
                yw ywVar = (yw) atomicReferenceFieldUpdater3.get(tpVar);
                if (ywVar == null) {
                    ywVar = new yw(tpVar);
                    atomicReferenceFieldUpdater3.set(tpVar, ywVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, ywVar)) {
                        tpVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // defpackage.wm
    public final boolean b() {
        return true;
    }

    @Override // defpackage.wm
    public final vt d() {
        return null;
    }

    public wn getParent() {
        return j();
    }

    public final wn j() {
        wn wnVar = this.d;
        if (wnVar != null) {
            return wnVar;
        }
        jn.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.tp
    public final String toString() {
        return getClass().getSimpleName() + '@' + yd.g(this) + "[job@" + yd.g(j()) + ']';
    }
}
