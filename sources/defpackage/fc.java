package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends zn implements cl {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc(Object obj, int i, Object obj2) {
        super(1);
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e A[LOOP:4: B:35:0x0093->B:85:0x015e, LOOP_END] */
    @Override // defpackage.cl
    public final Object h(Object obj) throws Throwable {
        boolean z;
        long j;
        long j2;
        long j3;
        h9 h9Var;
        t00 t00Var;
        k50 k50Var;
        Throwable cancellationException;
        int i = this.g;
        Object obj2 = this.i;
        Object obj3 = this.h;
        k50 k50Var2 = k50.a;
        Object objR = null;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                q8 q8Var = (q8) obj3;
                if (th == null) {
                    Object obj4 = wn.f.get((re) obj2);
                    if (obj4 instanceof wm) {
                        j7.e("This job has not completed yet");
                    } else {
                        if (obj4 instanceof ma) {
                            throw ((ma) obj4).a;
                        }
                        objR = dq.r(obj4);
                    }
                    q8Var.a(objR);
                } else if (th instanceof CancellationException) {
                    q8Var.d = true;
                    s8 s8Var = q8Var.b;
                    if (s8Var != null && s8Var.g.cancel(true)) {
                        q8Var.a = null;
                        q8Var.b = null;
                        q8Var.c = null;
                    }
                } else {
                    q8Var.b(th);
                }
                return k50Var2;
            default:
                Throwable th2 = (Throwable) obj;
                ((mu) obj3).h(th2);
                k8 k8Var = (k8) ((u40) obj2).i;
                k8Var.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = k8.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k8.i;
                xo2 xo2Var = m8.r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(k8Var, xo2Var, th2)) {
                        z = true;
                    } else if (atomicReferenceFieldUpdater.get(k8Var) != xo2Var) {
                        z = false;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(k8Var);
                    int i2 = (int) (j4 >> 60);
                    j = 1152921504606846975L;
                    if (i2 == 0) {
                        j2 = j4 & 1152921504606846975L;
                        j3 = 2305843009213693952L;
                    } else if (i2 == 1) {
                        j2 = j4 & 1152921504606846975L;
                        j3 = 3458764513820540928L;
                    }
                    k8 k8Var2 = k8Var;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(k8Var2, j4, j3 + j2);
                    k8Var = k8Var2;
                    if (!zCompareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                k8Var.c();
                if (z) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k8.j;
                    while (true) {
                        Object obj5 = atomicReferenceFieldUpdater2.get(k8Var);
                        xo2 xo2Var2 = obj5 == null ? m8.p : m8.q;
                        while (true) {
                            if (atomicReferenceFieldUpdater2.compareAndSet(k8Var, obj5, xo2Var2)) {
                                if (obj5 != null) {
                                    w40.b(1, obj5);
                                    ((cl) obj5).h((Throwable) k8.i.get(k8Var));
                                }
                            } else if (atomicReferenceFieldUpdater2.get(k8Var) != obj5) {
                            }
                        }
                    }
                }
                while (true) {
                    k8Var.getClass();
                    Object obj6 = ar.f;
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = k8.c;
                    long j5 = atomicLongFieldUpdater3.get(k8Var);
                    long j6 = k8.b.get(k8Var);
                    if (k8Var.i(j6, true)) {
                        h9Var = new h9((Throwable) k8.i.get(k8Var));
                    } else {
                        if (j5 < (j6 & j)) {
                            Object obj7 = m8.k;
                            j9 j9Var = (j9) k8.g.get(k8Var);
                            while (true) {
                                if (k8Var.i(k8.b.get(k8Var), true)) {
                                    h9Var = new h9((Throwable) k8.i.get(k8Var));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(k8Var);
                                    long j7 = m8.b;
                                    long j8 = andIncrement / j7;
                                    int i3 = (int) (andIncrement % j7);
                                    if (j9Var.c != j8) {
                                        j9 j9VarE = k8Var.e(j8, j9Var);
                                        if (j9VarE == null) {
                                            continue;
                                        } else {
                                            j9Var = j9VarE;
                                        }
                                    }
                                    Object objO = k8Var.o(j9Var, i3, andIncrement, obj7);
                                    if (objO == m8.m) {
                                        p70 p70Var = obj7 instanceof p70 ? (p70) obj7 : null;
                                        if (p70Var != null) {
                                            p70Var.a(j9Var, i3);
                                        }
                                        k8Var.q(andIncrement);
                                        j9Var.h();
                                    } else if (objO == m8.o) {
                                        if (andIncrement < k8Var.g()) {
                                            j9Var.a();
                                        }
                                    } else {
                                        if (objO == m8.n) {
                                            j7.e("unexpected");
                                            return null;
                                        }
                                        j9Var.a();
                                        obj6 = objO;
                                    }
                                }
                            }
                        }
                        if (obj6 instanceof i9) {
                            obj6 = null;
                        }
                        if (obj6 == null) {
                            k50Var = null;
                        } else {
                            t00Var = (t00) obj6;
                            if (t00Var instanceof s00) {
                                ja jaVar = ((s00) t00Var).b;
                                if (th2 == null) {
                                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                                } else {
                                    cancellationException = th2;
                                }
                                jaVar.O(cancellationException);
                            }
                            k50Var = k50Var2;
                        }
                        if (k50Var == null) {
                            return k50Var2;
                        }
                        j = 1152921504606846975L;
                    }
                    obj6 = h9Var;
                    if (obj6 instanceof i9) {
                        obj6 = null;
                    }
                    if (obj6 == null) {
                        k50Var = null;
                    } else {
                        t00Var = (t00) obj6;
                        if (t00Var instanceof s00) {
                            ja jaVar2 = ((s00) t00Var).b;
                            if (th2 == null) {
                                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                cancellationException = th2;
                            }
                            jaVar2.O(cancellationException);
                        }
                        k50Var = k50Var2;
                    }
                    if (k50Var == null) {
                        return k50Var2;
                    }
                    j = 1152921504606846975L;
                }
                break;
        }
    }
}
