package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class xh extends lc implements se {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(xh.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(xh.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(xh.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public long h;
    public boolean i;
    public f7 j;

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        j(runnable);
    }

    public final void g() {
        long j = this.h - 4294967296L;
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }

    public void j(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m.get(this) == 0) {
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof wp) {
                    wp wpVar = (wp) obj;
                    int iA = wpVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        wp wpVarC = wpVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, wpVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != na1.g) {
                    wp wpVar2 = new wp(8, true);
                    wpVar2.a((Runnable) obj);
                    wpVar2.a(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, wpVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            de.n.j(runnable);
            return;
        }
        Thread threadK = k();
        if (Thread.currentThread() != threadK) {
            LockSupport.unpark(threadK);
        }
    }

    public abstract Thread k();

    public final void l(boolean z) {
        this.h = (z ? 4294967296L : 1L) + this.h;
        if (z) {
            return;
        }
        this.i = true;
    }

    public final boolean m() {
        f7 f7Var = this.j;
        if (f7Var != null ? f7Var.isEmpty() : true) {
            Object obj = k.get(this);
            if (obj != null) {
                if (obj instanceof wp) {
                    long j = wp.f.get((wp) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == na1.g) {
                }
            }
            return true;
        }
        return false;
    }

    public final long n() {
        Runnable runnable;
        if (!o()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof wp) {
                    wp wpVar = (wp) obj;
                    Object objD = wpVar.d();
                    if (objD != wp.g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    wp wpVarC = wpVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, wpVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == na1.g) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            f7 f7Var = this.j;
            if (((f7Var == null || f7Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = k.get(this);
                if (obj2 == null) {
                } else if (obj2 instanceof wp) {
                    long j = wp.f.get((wp) obj2);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (obj2 == na1.g) {
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final boolean o() {
        f7 f7Var = this.j;
        if (f7Var == null) {
            return false;
        }
        hf hfVar = (hf) (f7Var.isEmpty() ? null : f7Var.removeFirst());
        if (hfVar == null) {
            return false;
        }
        hfVar.run();
        return true;
    }

    public void shutdown() {
        ThreadLocal threadLocal = u30.a;
        u30.a.set(null);
        m.set(this, 1);
        xo2 xo2Var = na1.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, xo2Var)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof wp) {
                ((wp) obj).b();
                break;
            } else {
                if (obj == xo2Var) {
                    break;
                }
                wp wpVar = new wp(8, true);
                wpVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, wpVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (n() <= 0) {
        }
        System.nanoTime();
    }
}
