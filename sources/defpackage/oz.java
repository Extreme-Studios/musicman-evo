package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class oz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(oz.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(oz.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(oz.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(oz.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(oz.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final y8 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public oz() {
        qz qzVar = new qz(0L, null, 2);
        this.head$volatile = qzVar;
        this.tail$volatile = qzVar;
        this._availablePermits$volatile = 1;
        this.a = new y8(2, this);
    }

    public final void a(ct ctVar) {
        Object objE;
        qz qzVar;
        z8 z8Var = ctVar.f;
        dt dtVar = ctVar.g;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                int i = 0;
                k50 k50Var = k50.a;
                if (andDecrement > 0) {
                    dt.g.set(dtVar, null);
                    z8Var.B(k50Var, z8Var.h, new y8(i, new g(dtVar, ctVar)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                qz qzVar2 = (qz) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                mz mzVar = mz.n;
                long j = andIncrement / ((long) pz.f);
                while (true) {
                    objE = s90.e(qzVar2, j, mzVar);
                    if (ss0.p(objE)) {
                        break;
                    }
                    lz lzVarN = ss0.n(objE);
                    while (true) {
                        lz lzVar = (lz) atomicReferenceFieldUpdater.get(this);
                        qzVar = qzVar2;
                        if (lzVar.c >= lzVarN.c) {
                            break;
                        }
                        if (!lzVarN.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, lzVar, lzVarN)) {
                                if (!lzVar.e()) {
                                    break;
                                }
                                lzVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == lzVar);
                        if (lzVarN.e()) {
                            lzVarN.d();
                        }
                        qzVar2 = qzVar;
                    }
                    qzVar2 = qzVar;
                }
                qz qzVar3 = (qz) ss0.n(objE);
                AtomicReferenceArray atomicReferenceArray = qzVar3.e;
                int i2 = (int) (andIncrement % ((long) pz.f));
                do {
                    if (atomicReferenceArray.compareAndSet(i2, null, ctVar)) {
                        ctVar.a(qzVar3, i2);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == null);
                xo2 xo2Var = pz.b;
                xo2 xo2Var2 = pz.c;
                do {
                    if (atomicReferenceArray.compareAndSet(i2, xo2Var, xo2Var2)) {
                        dt.g.set(dtVar, null);
                        z8Var.B(k50Var, z8Var.h, new y8(0, new g(dtVar, ctVar)));
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == xo2Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    public final void b() {
        boolean z;
        int i;
        Object objE;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            qz qzVar = (qz) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / ((long) pz.f);
            nz nzVar = nz.n;
            while (true) {
                objE = s90.e(qzVar, j, nzVar);
                if (!ss0.p(objE)) {
                    lz lzVarN = ss0.n(objE);
                    while (true) {
                        lz lzVar = (lz) atomicReferenceFieldUpdater.get(this);
                        if (lzVar.c >= lzVarN.c) {
                            break;
                        }
                        if (!lzVarN.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, lzVar, lzVarN)) {
                                if (!lzVar.e()) {
                                    break;
                                }
                                lzVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == lzVar);
                        if (lzVarN.e()) {
                            lzVarN.d();
                        }
                    }
                } else {
                    break;
                }
            }
            qz qzVar2 = (qz) ss0.n(objE);
            AtomicReferenceArray atomicReferenceArray = qzVar2.e;
            qzVar2.a();
            boolean z2 = false;
            if (qzVar2.c <= j) {
                int i2 = (int) (andIncrement2 % ((long) pz.f));
                Object andSet = atomicReferenceArray.getAndSet(i2, pz.b);
                if (andSet == null) {
                    int i3 = pz.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            xo2 xo2Var = pz.b;
                            xo2 xo2Var2 = pz.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i2, xo2Var, xo2Var2)) {
                                    z2 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i2) == xo2Var);
                            z = true ^ z2;
                            break;
                        }
                        if (atomicReferenceArray.get(i2) == pz.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet == pz.e) {
                    z = false;
                } else {
                    if (!(andSet instanceof x8)) {
                        j7.k(andSet, "unexpected: ");
                        return;
                    }
                    x8 x8Var = (x8) andSet;
                    xo2 xo2VarG = x8Var.g(k50.a, this.a);
                    if (xo2VarG != null) {
                        x8Var.j(xo2VarG);
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
        } while (!z);
    }
}
