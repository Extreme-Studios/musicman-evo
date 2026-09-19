package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(bb.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(bb.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public bb(lz lzVar) {
        this._prev$volatile = lzVar;
    }

    public final void a() {
        b.set(this, null);
    }

    public final bb b() {
        Object obj = a.get(this);
        if (obj == s90.a) {
            return null;
        }
        return (bb) obj;
    }

    public abstract boolean c();

    public final void d() {
        bb bbVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            bb bbVar = (bb) atomicReferenceFieldUpdater.get(this);
            while (bbVar != null && bbVar.c()) {
                bbVar = (bb) atomicReferenceFieldUpdater.get(bbVar);
            }
            bb bbVarB2 = b();
            bbVarB2.getClass();
            while (bbVarB2.c() && (bbVarB = bbVarB2.b()) != null) {
                bbVarB2 = bbVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bbVarB2);
                bb bbVar2 = ((bb) obj) == null ? null : bbVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bbVarB2, obj, bbVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bbVarB2) != obj) {
                    }
                }
            }
            if (bbVar != null) {
                a.set(bbVar, bbVarB2);
            }
            if (!bbVarB2.c() || bbVarB2.b() == null) {
                if (bbVar == null || !bbVar.c()) {
                    return;
                }
            }
        }
    }
}
