package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class z8 extends hf implements x8, sc, p70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(z8.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(z8.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(z8.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final yb i;
    public final ic j;

    public z8(int i, yb ybVar) {
        super(i);
        this.i = ybVar;
        this.j = ybVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = w1.a;
    }

    public static Object C(yt ytVar, Object obj, int i, hl hlVar) {
        if (obj instanceof ma) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (hlVar != null || (ytVar instanceof mf)) {
            return new ka(obj, ytVar instanceof mf ? (mf) ytVar : null, hlVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(yt ytVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ytVar + ", already has " + obj).toString());
    }

    public final void A(Object obj, hl hlVar) {
        B(obj, this.h, hlVar);
    }

    public final void B(Object obj, int i, hl hlVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof yt)) {
                if (obj2 instanceof a9) {
                    a9 a9Var = (a9) obj2;
                    if (a9.c.compareAndSet(a9Var, 0, 1)) {
                        if (hlVar != null) {
                            m(hlVar, a9Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                j7.k(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objC = C((yt) obj2, obj, i, hlVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        p();
                    }
                    q(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // defpackage.p70
    public final void a(lz lzVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                j7.e("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(lzVar);
    }

    @Override // defpackage.hf
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof yt) {
                j7.e("Not completed");
                return;
            }
            if (obj instanceof ma) {
                return;
            }
            if (!(obj instanceof ka)) {
                cancellationException2 = cancellationException;
                ka kaVar = new ka(obj, (mf) null, (hl) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kaVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            ka kaVar2 = (ka) obj;
            if (kaVar2.e != null) {
                j7.e("Must be called at most once");
                return;
            }
            ka kaVarA = ka.a(kaVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kaVarA)) {
                    mf mfVar = kaVar2.b;
                    if (mfVar != null) {
                        l(mfVar);
                    }
                    hl hlVar = kaVar2.c;
                    if (hlVar != null) {
                        m(hlVar, cancellationException, kaVar2.a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.sc
    public final sc c() {
        yb ybVar = this.i;
        if (ybVar instanceof sc) {
            return (sc) ybVar;
        }
        return null;
    }

    @Override // defpackage.yb
    public final void d(Object obj) {
        Throwable thA = sx.a(obj);
        if (thA != null) {
            obj = new ma(thA, false);
        }
        B(obj, this.h, null);
    }

    @Override // defpackage.hf
    public final yb e() {
        return this.i;
    }

    @Override // defpackage.hf
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.x8
    public final xo2 g(Object obj, hl hlVar) {
        xo2 xo2Var = jn.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof yt)) {
                return null;
            }
            Object objC = C((yt) obj2, obj, this.h, hlVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        p();
                    }
                    return xo2Var;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // defpackage.yb
    public final ic getContext() {
        return this.j;
    }

    @Override // defpackage.hf
    public final Object h(Object obj) {
        return obj instanceof ka ? ((ka) obj).a : obj;
    }

    @Override // defpackage.x8
    public final void j(Object obj) {
        q(this.h);
    }

    @Override // defpackage.hf
    public final Object k() {
        return l.get(this);
    }

    public final void l(mf mfVar) {
        try {
            mfVar.a.a();
        } catch (Throwable th) {
            ss0.o(this.j, new na("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void m(hl hlVar, Throwable th, Object obj) {
        ic icVar = this.j;
        try {
            hlVar.e(th, obj, icVar);
        } catch (Throwable th2) {
            ss0.o(icVar, new na("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(lz lzVar, Throwable th) {
        ic icVar = this.j;
        int i = k.get(this) & 536870911;
        if (i == 536870911) {
            j7.e("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lzVar.g(i, icVar);
        } catch (Throwable th2) {
            ss0.o(icVar, new na("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof yt)) {
                return;
            }
            a9 a9Var = new a9(this, th, (obj instanceof mf) || (obj instanceof lz));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a9Var)) {
                    yt ytVar = (yt) obj;
                    if (ytVar instanceof mf) {
                        l((mf) obj);
                    } else if (ytVar instanceof lz) {
                        n((lz) obj, th);
                    }
                    if (!w()) {
                        p();
                    }
                    q(this.h);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        lf lfVar = (lf) atomicReferenceFieldUpdater.get(this);
        if (lfVar == null) {
            return;
        }
        lfVar.a();
        atomicReferenceFieldUpdater.set(this, wt.a);
    }

    public final void q(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    j7.e("Already resumed");
                    return;
                }
                boolean z = i == 4;
                yb ybVar = this.i;
                if (!z && (ybVar instanceof ff)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.h;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        ff ffVar = (ff) ybVar;
                        lc lcVar = ffVar.i;
                        ic context = ffVar.j.getContext();
                        if (lcVar.c(context)) {
                            lcVar.a(context, this);
                            return;
                        }
                        xh xhVarA = u30.a();
                        if (xhVarA.h >= 4294967296L) {
                            f7 f7Var = xhVarA.j;
                            if (f7Var == null) {
                                f7Var = new f7();
                                xhVarA.j = f7Var;
                            }
                            f7Var.addLast(this);
                            return;
                        }
                        xhVarA.l(true);
                        try {
                            ar.m(this, ybVar, true);
                            do {
                            } while (xhVarA.o());
                        } catch (Throwable th) {
                            try {
                                i(th);
                            } finally {
                                xhVarA.g();
                            }
                        }
                        return;
                    }
                }
                ar.m(this, ybVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable r(wn wnVar) {
        return wnVar.s();
    }

    public final Object s() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        wn wnVar;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = k;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    j7.e("Already suspended");
                    return null;
                }
                if (zW) {
                    z();
                }
                Object obj = l.get(this);
                if (obj instanceof ma) {
                    throw ((ma) obj).a;
                }
                int i3 = this.h;
                if ((i3 != 1 && i3 != 2) || (wnVar = (wn) this.j.f(gm.h)) == null || wnVar.A()) {
                    return h(obj);
                }
                CancellationException cancellationExceptionS = wnVar.s();
                b(cancellationExceptionS);
                throw cancellationExceptionS;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((lf) m.get(this)) == null) {
            u();
        }
        if (zW) {
            z();
        }
        return rc.f;
    }

    public final void t() {
        lf lfVarU = u();
        if (lfVarU == null || (l.get(this) instanceof yt)) {
            return;
        }
        lfVarU.a();
        m.set(this, wt.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(yd.p(this.i));
        sb.append("){");
        Object obj = l.get(this);
        if (obj instanceof yt) {
            str = "Active";
        } else {
            str = obj instanceof a9 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(yd.g(this));
        return sb.toString();
    }

    public final lf u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        wn wnVar = (wn) this.j.f(gm.h);
        if (wnVar == null) {
            return null;
        }
        lf lfVarI = rs0.i(wnVar, true, new k9(0, this));
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lfVarI)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return lfVarI;
    }

    public final void v(yt ytVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof w1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ytVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof mf) || (obj instanceof lz)) {
                x(ytVar, obj);
                throw null;
            }
            if (obj instanceof ma) {
                ma maVar = (ma) obj;
                if (!ma.b.compareAndSet(maVar, 0, 1)) {
                    x(ytVar, obj);
                    throw null;
                }
                if (obj instanceof a9) {
                    Throwable th = maVar.a;
                    if (ytVar instanceof mf) {
                        l((mf) ytVar);
                        return;
                    } else {
                        n((lz) ytVar, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof ka)) {
                if (ytVar instanceof lz) {
                    return;
                }
                ka kaVar = new ka(obj, (mf) ytVar, (hl) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kaVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            ka kaVar2 = (ka) obj;
            if (kaVar2.b != null) {
                x(ytVar, obj);
                throw null;
            }
            if (ytVar instanceof lz) {
                return;
            }
            mf mfVar = (mf) ytVar;
            if (kaVar2.e != null) {
                l(mfVar);
                return;
            }
            ka kaVarA = ka.a(kaVar2, mfVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kaVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.h != 2) {
            return false;
        }
        yb ybVar = this.i;
        ybVar.getClass();
        return ff.m.get((ff) ybVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        yb ybVar = this.i;
        Throwable th = null;
        ff ffVar = ybVar instanceof ff ? (ff) ybVar : null;
        if (ffVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ff.m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(ffVar);
                xo2 xo2Var = ss0.c;
                if (obj != xo2Var) {
                    if (!(obj instanceof Throwable)) {
                        j7.k(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(ffVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(ffVar) != obj) {
                            j7.p("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(ffVar, xo2Var, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(ffVar) == xo2Var);
            }
            if (th == null) {
                return;
            }
            p();
            o(th);
        }
    }
}
