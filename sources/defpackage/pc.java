package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class pc implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(pc.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(pc.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(pc.class, "_isTerminated$volatile");
    public static final xo2 p = new xo2("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final vl j;
    public final vl k;
    public final gx l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public pc(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (i < 1) {
            j7.f("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            j7.f("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.j = new vl();
        this.k = new vl();
        this.l = new gx((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.l) {
            try {
                if (o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = n;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f) {
                    return 0;
                }
                if (i >= this.g) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.l.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                nc ncVar = new nc(this, i3);
                this.l.c(i3, ncVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                ncVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z) {
        i30 n30Var;
        oc ocVar;
        o30.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i30) {
            n30Var = (i30) runnable;
            n30Var.f = jNanoTime;
            n30Var.g = z;
        } else {
            n30Var = new n30(runnable, jNanoTime, z);
        }
        boolean z2 = n30Var.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        nc ncVar = threadCurrentThread instanceof nc ? (nc) threadCurrentThread : null;
        if (ncVar == null || ncVar.m != this) {
            ncVar = null;
        }
        if (ncVar != null && (ocVar = ncVar.h) != oc.j && (n30Var.g || ocVar != oc.g)) {
            ncVar.l = true;
            i90 i90Var = ncVar.f;
            i90Var.getClass();
            n30Var = (i30) i90.b.getAndSet(i90Var, n30Var);
            if (n30Var == null) {
                n30Var = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = i90Var.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i90.c;
                if (atomicIntegerFieldUpdater.get(i90Var) - i90.d.get(i90Var) != 127) {
                    if (n30Var.g) {
                        i90.e.incrementAndGet(i90Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(i90Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, n30Var);
                    atomicIntegerFieldUpdater.incrementAndGet(i90Var);
                    n30Var = null;
                }
            }
        }
        if (n30Var != null) {
            if (!(n30Var.g ? this.k.a(n30Var) : this.j.a(n30Var))) {
                throw new RejectedExecutionException(ec.m(new StringBuilder(), this.i, " was terminated"));
            }
        }
        if (z2) {
            if (e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(nc ncVar, int i, int i2) {
        while (true) {
            long j = m.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = ncVar.c();
                    while (true) {
                        if (objC == p) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        nc ncVar2 = (nc) objC;
                        int iB = ncVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = ncVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                pc pcVar = this;
                if (m.compareAndSet(pcVar, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = pcVar;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        i30 i30VarA;
        if (o.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            nc ncVar = threadCurrentThread instanceof nc ? (nc) threadCurrentThread : null;
            if (ncVar == null || ncVar.m != this) {
                ncVar = null;
            }
            synchronized (this.l) {
                i = (int) (n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.l.b(i2);
                    objB.getClass();
                    nc ncVar2 = (nc) objB;
                    if (ncVar2 != ncVar) {
                        while (ncVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(ncVar2);
                            ncVar2.join(10000L);
                        }
                        i90 i90Var = ncVar2.f;
                        vl vlVar = this.k;
                        i90Var.getClass();
                        i30 i30Var = (i30) i90.b.getAndSet(i90Var, null);
                        if (i30Var != null) {
                            vlVar.a(i30Var);
                        }
                        while (true) {
                            i30 i30VarA2 = i90Var.a();
                            if (i30VarA2 == null) {
                                break;
                            } else {
                                vlVar.a(i30VarA2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.k.b();
            this.j.b();
            while (true) {
                if (ncVar != null) {
                    i30VarA = ncVar.a(true);
                    if (i30VarA == null) {
                        i30VarA = (i30) this.j.d();
                        if (i30VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    i30VarA = (i30) this.j.d();
                    if (i30VarA == null && (i30VarA = (i30) this.k.d()) == null) {
                        break;
                    }
                }
                try {
                    i30VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (ncVar != null) {
                ncVar.h(oc.j);
            }
            m.set(this, 0L);
            n.set(this, 0L);
        }
    }

    public final boolean d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        pc pcVar;
        xo2 xo2Var;
        int iB;
        while (true) {
            long j = m.get(this);
            nc ncVar = (nc) this.l.b((int) (2097151 & j));
            if (ncVar == null) {
                ncVar = null;
                pcVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = ncVar.c();
                while (true) {
                    xo2Var = p;
                    if (objC == xo2Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    nc ncVar2 = (nc) objC;
                    iB = ncVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = ncVar2.c();
                    j = j;
                }
                if (iB >= 0) {
                    pc pcVar2 = this;
                    boolean zCompareAndSet = m.compareAndSet(pcVar2, j, ((long) iB) | j2);
                    pcVar = pcVar2;
                    if (zCompareAndSet) {
                        ncVar.g(xo2Var);
                    }
                    this = pcVar;
                } else {
                    continue;
                }
            }
            if (ncVar == null) {
                return false;
            }
            if (nc.n.compareAndSet(ncVar, -1, 0)) {
                LockSupport.unpark(ncVar);
                return true;
            }
            this = pcVar;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        gx gxVar = this.l;
        int iA = gxVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            nc ncVar = (nc) gxVar.b(i6);
            if (ncVar != null) {
                i90 i90Var = ncVar.f;
                i90Var.getClass();
                int i7 = i90.b.get(i90Var) != null ? (i90.c.get(i90Var) - i90.d.get(i90Var)) + 1 : i90.c.get(i90Var) - i90.d.get(i90Var);
                int iOrdinal = ncVar.h.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new na();
                    }
                    i5++;
                }
            }
        }
        long j = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(yd.g(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
