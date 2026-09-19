package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class up {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(up.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new wp(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            wp wpVar = (wp) atomicReferenceFieldUpdater.get(this);
            int iA = wpVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                wp wpVarC = wpVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, wpVar, wpVarC) && atomicReferenceFieldUpdater.get(this) == wpVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            wp wpVar = (wp) atomicReferenceFieldUpdater.get(this);
            if (wpVar.b()) {
                return;
            }
            wp wpVarC = wpVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wpVar, wpVarC) && atomicReferenceFieldUpdater.get(this) == wpVar) {
            }
        }
    }

    public final int c() {
        wp wpVar = (wp) a.get(this);
        wpVar.getClass();
        long j = wp.f.get(wpVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            wp wpVar = (wp) atomicReferenceFieldUpdater.get(this);
            Object objD = wpVar.d();
            if (objD != wp.g) {
                return objD;
            }
            wp wpVarC = wpVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wpVar, wpVarC) && atomicReferenceFieldUpdater.get(this) == wpVar) {
            }
        }
    }
}
