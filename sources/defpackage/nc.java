package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class nc extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(nc.class, "workerCtl$volatile");
    public final i90 f;
    public final sw g;
    public oc h;
    public long i;
    private volatile int indexInArray;
    public long j;
    public int k;
    public boolean l;
    public final /* synthetic */ pc m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public nc(pc pcVar, int i) {
        this.m = pcVar;
        setDaemon(true);
        setContextClassLoader(pc.class.getClassLoader());
        this.f = new i90();
        this.g = new sw();
        this.h = oc.i;
        this.nextParkedWorker = pc.p;
        int iNanoTime = (int) System.nanoTime();
        this.k = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final i30 a(boolean z) {
        i30 i30VarE;
        i30 i30VarE2;
        long j;
        oc ocVar = this.h;
        pc pcVar = this.m;
        i30 i30Var = null;
        i90 i90Var = this.f;
        oc ocVar2 = oc.f;
        if (ocVar != ocVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = pc.n;
            do {
                j = atomicLongFieldUpdater.get(pcVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    i90Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i90.b;
                        i30 i30Var2 = (i30) atomicReferenceFieldUpdater.get(i90Var);
                        if (i30Var2 == null || !i30Var2.g) {
                            int i = i90.d.get(i90Var);
                            int i2 = i90.c.get(i90Var);
                            while (i != i2 && i90.e.get(i90Var) != 0) {
                                i2--;
                                i30 i30VarB = i90Var.b(i2, true);
                                if (i30VarB != null) {
                                    i30Var = i30VarB;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(i90Var, i30Var2, null)) {
                                i30Var = i30Var2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(i90Var) == i30Var2);
                    }
                    if (i30Var != null) {
                        return i30Var;
                    }
                    i30 i30Var3 = (i30) pcVar.k.d();
                    return i30Var3 == null ? i(1) : i30Var3;
                }
            } while (!pc.n.compareAndSet(pcVar, j, j - 4398046511104L));
            this.h = ocVar2;
        }
        if (z) {
            boolean z2 = d(pcVar.f * 2) == 0;
            if (z2 && (i30VarE2 = e()) != null) {
                return i30VarE2;
            }
            i90Var.getClass();
            i30 i30VarA = (i30) i90.b.getAndSet(i90Var, null);
            if (i30VarA == null) {
                i30VarA = i90Var.a();
            }
            if (i30VarA != null) {
                return i30VarA;
            }
            if (!z2 && (i30VarE = e()) != null) {
                return i30VarE;
            }
        } else {
            i30 i30VarE3 = e();
            if (i30VarE3 != null) {
                return i30VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.k;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.k = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final i30 e() {
        int iD = d(2);
        pc pcVar = this.m;
        vl vlVar = pcVar.k;
        vl vlVar2 = pcVar.j;
        if (iD == 0) {
            i30 i30Var = (i30) vlVar2.d();
            return i30Var != null ? i30Var : (i30) vlVar.d();
        }
        i30 i30Var2 = (i30) vlVar.d();
        return i30Var2 != null ? i30Var2 : (i30) vlVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.i);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(oc ocVar) {
        oc ocVar2 = this.h;
        boolean z = ocVar2 == oc.f;
        if (z) {
            pc.n.addAndGet(this.m, 4398046511104L);
        }
        if (ocVar2 != ocVar) {
            this.h = ocVar;
        }
        return z;
    }

    public final i30 i(int i) {
        long j;
        i30 i30VarB;
        long j2;
        long j3;
        i30 i30Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = pc.n;
        pc pcVar = this.m;
        int i2 = (int) (atomicLongFieldUpdater.get(pcVar) & 2097151);
        i30 i30Var2 = null;
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            nc ncVar = (nc) pcVar.l.b(iD);
            if (ncVar != null && ncVar != this) {
                i90 i90Var = ncVar.f;
                if (i != 3) {
                    i90Var.getClass();
                    int i4 = i90.d.get(i90Var);
                    int i5 = i90.c.get(i90Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || i90.e.get(i90Var) != 0) {
                                int i6 = i4 + 1;
                                i30VarB = i90Var.b(i4, z);
                                if (i30VarB != null) {
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        i30VarB = i30Var2;
                        break;
                    }
                } else {
                    i30VarB = i90Var.a();
                    j = 0;
                }
                sw swVar = this.g;
                if (i30VarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i90.b;
                        i30 i30Var3 = (i30) atomicReferenceFieldUpdater.get(i90Var);
                        if (i30Var3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((i30Var3.g ? 1 : 2) & i) != 0) {
                                o30.f.getClass();
                                i90 i90Var2 = i90Var;
                                long jNanoTime = System.nanoTime() - i30Var3.f;
                                long j4 = o30.b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    i30Var = null;
                                    break;
                                }
                                do {
                                    i30Var = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(i90Var2, i30Var3, null)) {
                                        swVar.f = i30Var3;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(i90Var2) == i30Var3);
                                i90Var = i90Var2;
                                i30Var2 = null;
                            }
                        }
                        j3 = -2;
                        i30Var = i30Var2;
                        break;
                    }
                } else {
                    swVar.f = i30VarB;
                    i30Var = i30Var2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    i30 i30Var4 = (i30) swVar.f;
                    swVar.f = i30Var;
                    return i30Var4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            i30Var2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.j = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (pc.o.get(this.m) == 0) {
                    oc ocVar = this.h;
                    oc ocVar2 = oc.j;
                    if (ocVar == ocVar2) {
                        break loop0;
                    }
                    i30 i30VarA = a(this.l);
                    if (i30VarA != null) {
                        this.j = 0L;
                        pc pcVar = this.m;
                        this.i = 0L;
                        if (this.h == oc.h) {
                            this.h = oc.g;
                        }
                        if (!i30VarA.g) {
                            try {
                                i30VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(oc.g) && !pcVar.e() && !pcVar.d(pc.n.get(pcVar))) {
                            pcVar.e();
                        }
                        try {
                            i30VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        pc.n.addAndGet(pcVar, -2097152L);
                        if (this.h == ocVar2) {
                            break;
                        }
                        this.h = oc.i;
                        break;
                    }
                    this.l = false;
                    if (this.j == 0) {
                        Object obj = this.nextParkedWorker;
                        xo2 xo2Var = pc.p;
                        if (obj != xo2Var) {
                            n.set(this, -1);
                            while (this.nextParkedWorker != pc.p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                pc pcVar2 = this.m;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = pc.o;
                                if (atomicIntegerFieldUpdater2.get(pcVar2) != 0) {
                                    break;
                                }
                                oc ocVar3 = this.h;
                                oc ocVar4 = oc.j;
                                if (ocVar3 == ocVar4) {
                                    break;
                                }
                                h(oc.h);
                                Thread.interrupted();
                                if (this.i == 0) {
                                    j = 2097151;
                                    this.i = System.nanoTime() + this.m.h;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.m.h);
                                if (System.nanoTime() - this.i >= 0) {
                                    this.i = 0L;
                                    pc pcVar3 = this.m;
                                    synchronized (pcVar3.l) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(pcVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = pc.n;
                                                if (((int) (atomicLongFieldUpdater.get(pcVar3) & j)) > pcVar3.f) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        pcVar3.c(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(pcVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = pcVar3.l.b(andDecrement);
                                                            objB.getClass();
                                                            nc ncVar = (nc) objB;
                                                            pcVar3.l.c(i, ncVar);
                                                            ncVar.f(i);
                                                            pcVar3.c(ncVar, andDecrement, i);
                                                        }
                                                        pcVar3.l.c(andDecrement, null);
                                                        this.h = ocVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            pc pcVar4 = this.m;
                            if (this.nextParkedWorker == xo2Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = pc.m;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(pcVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = pcVar4.l.b((int) (j2 & 2097151));
                                    pc pcVar5 = pcVar4;
                                    if (pc.m.compareAndSet(pcVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        pcVar4 = pcVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(oc.h);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.j);
                            this.j = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(oc.j);
    }
}
