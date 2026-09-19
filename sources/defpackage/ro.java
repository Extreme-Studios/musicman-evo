package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ro extends lc implements se {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ro.class, "runningWorkers$volatile");
    public final lc h;
    public final int i;
    public final up j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public ro(lc lcVar, int i) {
        if ((lcVar instanceof se ? (se) lcVar : null) == null) {
            int i2 = ee.a;
        }
        this.h = lcVar;
        this.i = i;
        this.j = new up();
        this.k = new Object();
    }

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        this.j.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
        if (atomicIntegerFieldUpdater.get(this) < this.i) {
            synchronized (this.k) {
                if (atomicIntegerFieldUpdater.get(this) >= this.i) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableG = g();
                if (runnableG == null) {
                    return;
                }
                this.h.a(this, new in2(this, runnableG, 8, false));
            }
        }
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.lc
    public final String toString() {
        return this.h + ".limitedParallelism(" + this.i + ')';
    }
}
