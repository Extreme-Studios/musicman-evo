package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class k8 {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(k8.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(k8.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(k8.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(k8.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(k8.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(k8.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(k8.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(k8.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(k8.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public k8(int i2) {
        this.a = i2;
        if (i2 < 0) {
            j7.f("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        j9 j9Var = m8.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        j9 j9Var2 = new j9(0L, null, this, 3);
        this.sendSegment$volatile = j9Var2;
        this.receiveSegment$volatile = j9Var2;
        if (j()) {
            j9Var2 = m8.a;
            j9Var2.getClass();
        }
        this.bufferEndSegment$volatile = j9Var2;
        this._closeCause$volatile = m8.r;
    }

    public static void h(k8 k8Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(k8Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(k8Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof x8)) {
            j7.k(obj, "Unexpected waiter: ");
            return false;
        }
        x8 x8Var = (x8) obj;
        j9 j9Var = m8.a;
        xo2 xo2VarG = x8Var.g(k50.a, null);
        if (xo2VarG == null) {
            return false;
        }
        x8Var.j(xo2VarG);
        return true;
    }

    public final boolean a(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    public final j9 b(long j2) {
        Object objZ;
        Object obj = h.get(this);
        j9 j9Var = (j9) f.get(this);
        if (j9Var.c > ((j9) obj).c) {
            obj = j9Var;
        }
        j9 j9Var2 = (j9) g.get(this);
        if (j9Var2.c > ((j9) obj).c) {
            obj = j9Var2;
        }
        bb bbVar = (bb) obj;
        loop0: while (true) {
            bbVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bb.a;
            Object obj2 = atomicReferenceFieldUpdater.get(bbVar);
            xo2 xo2Var = s90.a;
            objZ = null;
            if (obj2 == xo2Var) {
                break;
            }
            bb bbVar2 = (bb) obj2;
            if (bbVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(bbVar, null, xo2Var)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bbVar) == null);
            } else {
                bbVar = bbVar2;
            }
        }
        j9 j9Var3 = (j9) bbVar;
        loop2: for (j9 j9Var4 = j9Var3; j9Var4 != null; j9Var4 = (j9) ((bb) bb.b.get(j9Var4))) {
            for (int i2 = m8.b - 1; -1 < i2; i2--) {
                if ((j9Var4.c * ((long) m8.b)) + ((long) i2) < j2) {
                    break loop2;
                }
                while (true) {
                    Object objK = j9Var4.k(i2);
                    if (objK != null && objK != m8.e) {
                        if (!(objK instanceof q70)) {
                            if (!(objK instanceof p70)) {
                                break;
                            }
                            if (j9Var4.j(objK, i2, m8.l)) {
                                objZ = w40.z(objZ, objK);
                                j9Var4.l(i2, true);
                                break;
                            }
                        } else {
                            if (j9Var4.j(objK, i2, m8.l)) {
                                objZ = w40.z(objZ, ((q70) objK).a);
                                j9Var4.l(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (j9Var4.j(objK, i2, m8.l)) {
                            j9Var4.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objZ != null) {
            if (!(objZ instanceof ArrayList)) {
                l((p70) objZ, true);
                return j9Var3;
            }
            ArrayList arrayList = (ArrayList) objZ;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((p70) arrayList.get(size), true);
            }
        }
        return j9Var3;
    }

    public final void c() {
        i(b.get(this), false);
    }

    public final void d() {
        Object objE;
        if (j()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        j9 j9Var = (j9) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / ((long) m8.b);
            if (g() <= andIncrement) {
                if (j9Var.c < j2 && j9Var.b() != null) {
                    k(j2, j9Var);
                }
                h(this);
                return;
            }
            if (j9Var.c != j2) {
                l8 l8Var = l8.n;
                while (true) {
                    objE = s90.e(j9Var, j2, l8Var);
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
                j9 j9Var2 = null;
                if (ss0.p(objE)) {
                    c();
                    k(j2, j9Var);
                    h(this);
                } else {
                    j9 j9Var3 = (j9) ss0.n(objE);
                    long j3 = j9Var3.c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) m8.b);
                        if (d.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            h(this);
                        }
                    } else {
                        j9Var2 = j9Var3;
                    }
                }
                if (j9Var2 == null) {
                    continue;
                } else {
                    j9Var = j9Var2;
                }
            }
            int i2 = (int) (andIncrement % ((long) m8.b));
            Object objK = j9Var.k(i2);
            boolean z = objK instanceof p70;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !j9Var.j(objK, i2, m8.g)) {
                while (true) {
                    Object objK2 = j9Var.k(i2);
                    if (objK2 instanceof p70) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (j9Var.j(objK2, i2, new q70((p70) objK2))) {
                                h(this);
                                return;
                            }
                        } else if (j9Var.j(objK2, i2, m8.g)) {
                            if (!n(objK2)) {
                                j9Var.n(i2, m8.j);
                                j9Var.h();
                                break;
                            } else {
                                j9Var.n(i2, m8.d);
                                h(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == m8.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (j9Var.j(objK2, i2, m8.e)) {
                                h(this);
                                return;
                            }
                        } else if (objK2 == m8.d || objK2 == m8.h || objK2 == m8.i || objK2 == m8.k || objK2 == m8.l) {
                            h(this);
                            return;
                        } else if (objK2 != m8.f) {
                            j7.k(objK2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                h(this);
            } else if (n(objK)) {
                j9Var.n(i2, m8.d);
                h(this);
                return;
            } else {
                j9Var.n(i2, m8.j);
                j9Var.h();
                h(this);
            }
        }
    }

    public final j9 e(long j2, j9 j9Var) {
        Object objE;
        k8 k8Var;
        j9 j9Var2 = m8.a;
        l8 l8Var = l8.n;
        loop0: while (true) {
            objE = s90.e(j9Var, j2, l8Var);
            if (!ss0.p(objE)) {
                lz lzVarN = ss0.n(objE);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    lz lzVar = (lz) atomicReferenceFieldUpdater.get(this);
                    if (lzVar.c >= lzVarN.c) {
                        break loop0;
                    }
                    if (!lzVarN.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, lzVar, lzVarN)) {
                            if (!lzVar.e()) {
                                break loop0;
                            }
                            lzVar.d();
                            break loop0;
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
        if (ss0.p(objE)) {
            c();
            if (j9Var.c * ((long) m8.b) < g()) {
                j9Var.a();
                return null;
            }
        } else {
            j9 j9Var3 = (j9) ss0.n(objE);
            long j3 = j9Var3.c;
            if (!j() && j2 <= d.get(this) / ((long) m8.b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    lz lzVar2 = (lz) atomicReferenceFieldUpdater2.get(this);
                    if (lzVar2.c >= j3 || !j9Var3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, lzVar2, j9Var3)) {
                            if (!lzVar2.e()) {
                                break loop3;
                            }
                            lzVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == lzVar2);
                    if (j9Var3.e()) {
                        j9Var3.d();
                    }
                }
            }
            if (j3 <= j2) {
                return j9Var3;
            }
            long j4 = j3 * ((long) m8.b);
            while (true) {
                long j5 = c.get(this);
                if (j5 >= j4) {
                    k8Var = this;
                    break;
                }
                k8Var = this;
                if (c.compareAndSet(k8Var, j5, j4)) {
                    break;
                }
                this = k8Var;
            }
            if (j3 * ((long) m8.b) < k8Var.g()) {
                j9Var3.a();
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th = (Throwable) i.get(this);
        return th == null ? new v9("Channel was closed") : th;
    }

    public final long g() {
        return b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i2 == 2) {
                b(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                        j9 j9VarE = (j9) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (g() <= j3) {
                            break;
                        }
                        long j4 = m8.b;
                        long j5 = j3 / j4;
                        if (j9VarE.c != j5 && (j9VarE = e(j5, j9VarE)) == null) {
                            if (((j9) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            j9VarE.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objK = j9VarE.k(i3);
                                if (objK != null && objK != m8.e) {
                                    if (objK != m8.d && (objK == m8.j || objK == m8.l || objK == m8.i || objK == m8.h || (objK != m8.g && (objK == m8.f || j3 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (j9VarE.j(objK, i3, m8.h)) {
                                    d();
                                    break;
                                }
                            }
                            c.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(ec.h("unexpected close status: ", i2).toString());
                }
                j9 j9VarB = b(1152921504606846975L & j2);
                Object objZ = null;
                loop0: do {
                    for (int i4 = m8.b - 1; -1 < i4; i4--) {
                        long j6 = (j9VarB.c * ((long) m8.b)) + ((long) i4);
                        while (true) {
                            Object objK2 = j9VarB.k(i4);
                            if (objK2 == m8.i) {
                                break loop0;
                            }
                            if (objK2 != m8.d) {
                                if (objK2 != m8.e && objK2 != null) {
                                    if (!(objK2 instanceof p70) && !(objK2 instanceof q70)) {
                                        xo2 xo2Var = m8.g;
                                        if (objK2 == xo2Var || objK2 == m8.f) {
                                            break loop0;
                                        }
                                        if (objK2 != xo2Var) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        p70 p70Var = objK2 instanceof q70 ? ((q70) objK2).a : (p70) objK2;
                                        if (j9VarB.j(objK2, i4, m8.l)) {
                                            objZ = w40.z(objZ, p70Var);
                                            j9VarB.m(i4, null);
                                            j9VarB.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (j9VarB.j(objK2, i4, m8.l)) {
                                        j9VarB.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j9VarB.j(objK2, i4, m8.l)) {
                                    j9VarB.m(i4, null);
                                    j9VarB.h();
                                    break;
                                }
                            }
                        }
                    }
                    j9VarB = (j9) ((bb) bb.b.get(j9VarB));
                } while (j9VarB != null);
                if (objZ != null) {
                    if (objZ instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objZ;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            l((p70) arrayList.get(size), false);
                        }
                    } else {
                        l((p70) objZ, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void k(long j2, j9 j9Var) {
        j9 j9Var2;
        j9 j9Var3;
        while (j9Var.c < j2 && (j9Var3 = (j9) j9Var.b()) != null) {
            j9Var = j9Var3;
        }
        while (true) {
            if (!j9Var.c() || (j9Var2 = (j9) j9Var.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    lz lzVar = (lz) atomicReferenceFieldUpdater.get(this);
                    if (lzVar.c >= j9Var.c) {
                        return;
                    }
                    if (!j9Var.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, lzVar, j9Var)) {
                            if (lzVar.e()) {
                                lzVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == lzVar);
                    if (j9Var.e()) {
                        j9Var.d();
                    }
                }
            } else {
                j9Var = j9Var2;
            }
        }
    }

    public final void l(p70 p70Var, boolean z) {
        Throwable thF;
        if (!(p70Var instanceof x8)) {
            j7.k(p70Var, "Unexpected waiter: ");
            return;
        }
        yb ybVar = (yb) p70Var;
        if (z) {
            thF = (Throwable) i.get(this);
            if (thF == null) {
                thF = new u9("Channel was closed");
            }
        } else {
            thF = f();
        }
        ybVar.d(new rx(thF));
    }

    public final boolean m(Object obj, t00 t00Var) {
        if (!(obj instanceof x8)) {
            j7.k(obj, "Unexpected receiver type: ");
            return false;
        }
        x8 x8Var = (x8) obj;
        j9 j9Var = m8.a;
        xo2 xo2VarG = x8Var.g(t00Var, null);
        if (xo2VarG == null) {
            return false;
        }
        x8Var.j(xo2VarG);
        return true;
    }

    public final Object o(j9 j9Var, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = j9Var.f;
        Object objK = j9Var.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return m8.n;
                }
                if (j9Var.j(objK, i2, obj)) {
                    d();
                    return m8.m;
                }
            }
        } else if (objK == m8.d && j9Var.j(objK, i2, m8.i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            j9Var.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = j9Var.k(i2);
            if (objK2 == null || objK2 == m8.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (j9Var.j(objK2, i2, m8.h)) {
                        d();
                        return m8.o;
                    }
                } else {
                    if (obj == null) {
                        return m8.n;
                    }
                    if (j9Var.j(objK2, i2, obj)) {
                        d();
                        return m8.m;
                    }
                }
            } else if (objK2 != m8.d) {
                xo2 xo2Var = m8.j;
                if (objK2 == xo2Var) {
                    return m8.o;
                }
                if (objK2 == m8.h) {
                    return m8.o;
                }
                if (objK2 == m8.l) {
                    d();
                    return m8.o;
                }
                if (objK2 != m8.g && j9Var.j(objK2, i2, m8.f)) {
                    boolean z = objK2 instanceof q70;
                    if (z) {
                        objK2 = ((q70) objK2).a;
                    }
                    if (n(objK2)) {
                        j9Var.n(i2, m8.i);
                        d();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        j9Var.m(i2, null);
                        return obj3;
                    }
                    j9Var.n(i2, xo2Var);
                    j9Var.h();
                    if (z) {
                        d();
                    }
                    return m8.o;
                }
            } else if (j9Var.j(objK2, i2, m8.i)) {
                d();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                j9Var.m(i2, null);
                return obj4;
            }
        }
    }

    public final int p(j9 j9Var, int i2, t00 t00Var, long j2, Object obj, boolean z) {
        while (true) {
            Object objK = j9Var.k(i2);
            if (objK == null) {
                if (!a(j2) || z) {
                    if (z) {
                        if (j9Var.j(null, i2, m8.j)) {
                            j9Var.h();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (j9Var.j(null, i2, obj)) {
                            return 2;
                        }
                    }
                } else if (j9Var.j(null, i2, m8.d)) {
                    break;
                }
            } else {
                if (objK != m8.e) {
                    xo2 xo2Var = m8.k;
                    if (objK == xo2Var) {
                        j9Var.m(i2, null);
                        return 5;
                    }
                    if (objK == m8.h) {
                        j9Var.m(i2, null);
                        return 5;
                    }
                    if (objK == m8.l) {
                        j9Var.m(i2, null);
                        c();
                        return 4;
                    }
                    j9Var.m(i2, null);
                    if (objK instanceof q70) {
                        objK = ((q70) objK).a;
                    }
                    if (m(objK, t00Var)) {
                        j9Var.n(i2, m8.i);
                        return 0;
                    }
                    if (j9Var.f.getAndSet((i2 * 2) + 1, xo2Var) != xo2Var) {
                        j9Var.l(i2, true);
                    }
                    return 5;
                }
                if (j9Var.j(objK, i2, m8.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void q(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        k8 k8Var = this;
        if (k8Var.j()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(k8Var) > j2) {
                break;
            } else {
                k8Var = this;
            }
        }
        int i2 = m8.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(k8Var);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(k8Var)) && j3 == atomicLongFieldUpdater.get(k8Var)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(k8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(k8Var, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        k8Var = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(k8Var);
                    long j6 = atomicLongFieldUpdater2.get(k8Var);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(k8Var)) {
                        break;
                    }
                    if (z) {
                        k8Var = this;
                    } else {
                        k8Var = this;
                        atomicLongFieldUpdater2.compareAndSet(k8Var, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(k8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(k8Var, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        k8Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (b.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i3 = 0;
        List listAsList = Arrays.asList(g.get(this), f.get(this), h.get(this));
        listAsList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsList) {
            if (((j9) obj) != m8.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j9) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((j9) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j9 j9Var = (j9) next;
        long j4 = c.get(this);
        long jG = g();
        loop2: while (true) {
            int i4 = m8.b;
            for (int i5 = i3; i5 < i4; i5++) {
                long j5 = (j9Var.c * ((long) m8.b)) + ((long) i5);
                if (j5 >= jG && j5 >= j4) {
                    break loop2;
                }
                Object objK = j9Var.k(i5);
                Object obj2 = j9Var.f.get(i5 * 2);
                if (objK instanceof x8) {
                    string = (j5 >= j4 || j5 < jG) ? (j5 >= jG || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objK instanceof q70) {
                    string = "EB(" + objK + ')';
                } else if (jn.b(objK, m8.f) || jn.b(objK, m8.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(m8.e) && !objK.equals(m8.i) && !objK.equals(m8.h) && !objK.equals(m8.k) && !objK.equals(m8.j) && !objK.equals(m8.l)) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            j9Var = (j9) j9Var.b();
            if (j9Var == null) {
                break;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }
}
