package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class wn implements gc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(wn.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(wn.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public wn(boolean z) {
        this._state$volatile = z ? dq.l : dq.k;
    }

    public static m9 E(tp tpVar) {
        while (tpVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tp.b;
            tp tpVarF = tpVar.f();
            if (tpVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(tpVar);
                while (true) {
                    tpVar = (tp) obj;
                    if (!tpVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(tpVar);
                }
            } else {
                tpVar = tpVarF;
            }
        }
        while (true) {
            tpVar = tpVar.h();
            if (!tpVar.i()) {
                if (tpVar instanceof m9) {
                    return (m9) tpVar;
                }
                if (tpVar instanceof vt) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof vn)) {
            if (obj instanceof wm) {
                return ((wm) obj).b() ? "Active" : "New";
            }
            return obj instanceof ma ? "Cancelled" : "Completed";
        }
        vn vnVar = (vn) obj;
        if (vnVar.e()) {
            return "Cancelling";
        }
        return vn.b.get(vnVar) != 0 ? "Completing" : "Active";
    }

    public boolean A() {
        Object obj = f.get(this);
        return (obj instanceof wm) && ((wm) obj).b();
    }

    public boolean B() {
        return false;
    }

    public final boolean C(Object obj) {
        Object objM;
        do {
            objM = M(f.get(this), obj);
            if (objM == dq.f) {
                return false;
            }
            if (objM == dq.g) {
                return true;
            }
        } while (objM == dq.h);
        i(objM);
        return true;
    }

    public final Object D(Object obj) {
        Object objM;
        do {
            objM = M(f.get(this), obj);
            if (objM == dq.f) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ma maVar = obj instanceof ma ? (ma) obj : null;
                throw new IllegalStateException(str, maVar != null ? maVar.a : null);
            }
        } while (objM == dq.h);
        return objM;
    }

    public final void F(vt vtVar, Throwable th) {
        vtVar.e(new vo(4), 4);
        Object obj = tp.a.get(vtVar);
        obj.getClass();
        na naVar = null;
        for (tp tpVarH = (tp) obj; !tpVarH.equals(vtVar); tpVarH = tpVarH.h()) {
            if ((tpVarH instanceof sn) && ((sn) tpVarH).k()) {
                try {
                    ((sn) tpVarH).l(th);
                } catch (Throwable th2) {
                    if (naVar != null) {
                        na1.d(naVar, th2);
                    } else {
                        naVar = new na("Exception in completion handler " + tpVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (naVar != null) {
            x(naVar);
        }
        m(th);
    }

    public final void I(hh hhVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        vt vtVar = new vt();
        Object vmVar = vtVar;
        if (!hhVar.a) {
            vmVar = new vm(vtVar);
        }
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, hhVar, vmVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == hhVar);
    }

    public final void J(sn snVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        vt vtVar = new vt();
        snVar.getClass();
        tp.b.set(vtVar, snVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = tp.a;
        atomicReferenceFieldUpdater2.set(vtVar, snVar);
        loop0: while (atomicReferenceFieldUpdater2.get(snVar) == snVar) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(snVar, snVar, vtVar)) {
                    vtVar.g(snVar);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(snVar) == snVar);
        }
        tp tpVarH = snVar.h();
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, snVar, tpVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == snVar);
    }

    public final int K(Object obj) {
        boolean z = obj instanceof hh;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z) {
            if (((hh) obj).a) {
                return 0;
            }
            hh hhVar = dq.l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hhVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof vm)) {
            return 0;
        }
        vt vtVar = ((vm) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vtVar)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object M(Object obj, Object obj2) {
        if (!(obj instanceof wm)) {
            return dq.f;
        }
        if (((obj instanceof hh) || (obj instanceof sn)) && !(obj instanceof m9) && !(obj2 instanceof ma)) {
            wm wmVar = (wm) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object xmVar = obj2 instanceof wm ? new xm((wm) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wmVar, xmVar)) {
                if (atomicReferenceFieldUpdater.get(this) != wmVar) {
                    return dq.h;
                }
            }
            G(obj2);
            p(wmVar, obj2);
            return obj2;
        }
        wm wmVar2 = (wm) obj;
        vt vtVarV = v(wmVar2);
        if (vtVarV == null) {
            return dq.h;
        }
        vn vnVar = wmVar2 instanceof vn ? (vn) wmVar2 : null;
        if (vnVar == null) {
            vnVar = new vn(vtVarV, null);
        }
        synchronized (vnVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vn.b;
            if (atomicIntegerFieldUpdater.get(vnVar) != 0) {
                return dq.f;
            }
            atomicIntegerFieldUpdater.set(vnVar, 1);
            if (vnVar != wmVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, wmVar2, vnVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != wmVar2) {
                        return dq.h;
                    }
                }
            }
            boolean zE = vnVar.e();
            ma maVar = obj2 instanceof ma ? (ma) obj2 : null;
            if (maVar != null) {
                vnVar.a(maVar.a);
            }
            Throwable thC = zE ? null : vnVar.c();
            if (thC != null) {
                F(vtVarV, thC);
            }
            m9 m9VarE = E(vtVarV);
            if (m9VarE != null && N(vnVar, m9VarE, obj2)) {
                return dq.g;
            }
            vtVarV.e(new vo(2), 2);
            m9 m9VarE2 = E(vtVarV);
            return (m9VarE2 == null || !N(vnVar, m9VarE2, obj2)) ? r(vnVar, obj2) : dq.g;
        }
    }

    public final boolean N(vn vnVar, m9 m9Var, Object obj) {
        while (rs0.i(m9Var.e, false, new un(this, vnVar, m9Var, obj)) == wt.a) {
            m9Var = E(m9Var);
            if (m9Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ic
    public final Object b(Object obj, gl glVar) {
        return glVar.f(obj, this);
    }

    @Override // defpackage.ic
    public final ic e(ic icVar) {
        return w40.y(this, icVar);
    }

    @Override // defpackage.ic
    public final gc f(hc hcVar) {
        hcVar.getClass();
        if (jn.b(gm.h, hcVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.gc
    public final hc getKey() {
        return gm.h;
    }

    @Override // defpackage.ic
    public final ic h(hc hcVar) {
        hcVar.getClass();
        return jn.b(gm.h, hcVar) ? jh.f : this;
    }

    public void k(Object obj) {
        i(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006d A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:53:0x00af->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean l(Object obj) {
        Throwable thQ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        Throwable thC;
        xo2 xo2Var;
        wm wmVar;
        vt vtVarV;
        vn vnVar;
        Object objM;
        Object objM2 = dq.f;
        if (u()) {
            do {
                Object obj3 = f.get(this);
                if (obj3 instanceof wm) {
                    if (obj3 instanceof vn) {
                        if (vn.b.get((vn) obj3) != 0) {
                        }
                    }
                    objM2 = M(obj3, new ma(q(obj), false));
                }
                objM2 = dq.f;
                break;
            } while (objM2 == dq.h);
            if (objM2 != dq.g) {
                if (objM2 == dq.f) {
                    thQ = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof vn) {
                            synchronized (obj2) {
                                if (vn.d.get((vn) obj2) == dq.j) {
                                    xo2Var = dq.i;
                                } else {
                                    boolean zE = ((vn) obj2).e();
                                    if (thQ == null) {
                                        thQ = q(obj);
                                    }
                                    ((vn) obj2).a(thQ);
                                    thC = zE ? null : ((vn) obj2).c();
                                    if (thC != null) {
                                        F(((vn) obj2).a, thC);
                                    }
                                    xo2Var = dq.f;
                                }
                            }
                        } else if (obj2 instanceof wm) {
                            if (thQ == null) {
                                thQ = q(obj);
                            }
                            wmVar = (wm) obj2;
                            if (wmVar.b()) {
                                vtVarV = v(wmVar);
                                if (vtVarV == null) {
                                    continue;
                                } else {
                                    vnVar = new vn(vtVarV, thQ);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, wmVar, vnVar)) {
                                            F(vtVarV, thQ);
                                            xo2Var = dq.f;
                                        } else if (atomicReferenceFieldUpdater.get(this) != wmVar) {
                                        }
                                    }
                                }
                            } else {
                                objM = M(obj2, new ma(thQ, false));
                                if (objM != dq.f) {
                                    j7.k(obj2, "Cannot happen in ");
                                    return false;
                                }
                                if (objM != dq.h) {
                                    objM2 = objM;
                                    break;
                                }
                            }
                        } else {
                            xo2Var = dq.i;
                        }
                        objM2 = xo2Var;
                        break;
                    }
                }
                if (objM2 != dq.f && objM2 != dq.g) {
                    if (objM2 == dq.i) {
                        return false;
                    }
                    i(objM2);
                    return true;
                }
            }
        } else {
            if (objM2 == dq.f) {
                thQ = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof vn) {
                        synchronized (obj2) {
                            if (vn.d.get((vn) obj2) == dq.j) {
                                xo2Var = dq.i;
                            } else {
                                boolean zE2 = ((vn) obj2).e();
                                if (thQ == null) {
                                    thQ = q(obj);
                                }
                                ((vn) obj2).a(thQ);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    F(((vn) obj2).a, thC);
                                }
                                xo2Var = dq.f;
                            }
                        }
                    } else if (obj2 instanceof wm) {
                        if (thQ == null) {
                            thQ = q(obj);
                        }
                        wmVar = (wm) obj2;
                        if (wmVar.b()) {
                            vtVarV = v(wmVar);
                            if (vtVarV == null) {
                                continue;
                            } else {
                                vnVar = new vn(vtVarV, thQ);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, wmVar, vnVar)) {
                                        F(vtVarV, thQ);
                                        xo2Var = dq.f;
                                    } else if (atomicReferenceFieldUpdater.get(this) != wmVar) {
                                    }
                                }
                            }
                        } else {
                            objM = M(obj2, new ma(thQ, false));
                            if (objM != dq.f) {
                                j7.k(obj2, "Cannot happen in ");
                                return false;
                            }
                            if (objM != dq.h) {
                                objM2 = objM;
                                break;
                            }
                        }
                    } else {
                        xo2Var = dq.i;
                    }
                    objM2 = xo2Var;
                    break;
                }
            }
            if (objM2 != dq.f) {
                if (objM2 == dq.i) {
                    return false;
                }
                i(objM2);
                return true;
            }
        }
        return true;
    }

    public final boolean m(Throwable th) {
        if (B()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        l9 l9Var = (l9) g.get(this);
        if (l9Var == null || l9Var == wt.a) {
            return z;
        }
        return l9Var.c(th) || z;
    }

    public String n() {
        return "Job was cancelled";
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && t();
    }

    public final void p(wm wmVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        l9 l9Var = (l9) atomicReferenceFieldUpdater.get(this);
        if (l9Var != null) {
            l9Var.a();
            atomicReferenceFieldUpdater.set(this, wt.a);
        }
        na naVar = null;
        ma maVar = obj instanceof ma ? (ma) obj : null;
        Throwable th = maVar != null ? maVar.a : null;
        if (wmVar instanceof sn) {
            try {
                ((sn) wmVar).l(th);
                return;
            } catch (Throwable th2) {
                x(new na("Exception in completion handler " + wmVar + " for " + this, th2));
                return;
            }
        }
        vt vtVarD = wmVar.d();
        if (vtVarD != null) {
            vtVarD.e(new vo(1), 1);
            Object obj2 = tp.a.get(vtVarD);
            obj2.getClass();
            for (tp tpVarH = (tp) obj2; !tpVarH.equals(vtVarD); tpVarH = tpVarH.h()) {
                if (tpVarH instanceof sn) {
                    try {
                        ((sn) tpVarH).l(th);
                    } catch (Throwable th3) {
                        if (naVar != null) {
                            na1.d(naVar, th3);
                        } else {
                            naVar = new na("Exception in completion handler " + tpVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (naVar != null) {
                x(naVar);
            }
        }
    }

    public final Throwable q(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        wn wnVar = (wn) obj;
        Object obj2 = f.get(wnVar);
        if (obj2 instanceof vn) {
            thC = ((vn) obj2).c();
        } else if (obj2 instanceof ma) {
            thC = ((ma) obj2).a;
        } else {
            if (obj2 instanceof wm) {
                j7.k(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new pn("Parent job is ".concat(L(obj2)), thC, wnVar) : cancellationException;
    }

    public final Object r(vn vnVar, Object obj) {
        Object obj2 = null;
        Throwable pnVar = null;
        ma maVar = obj instanceof ma ? (ma) obj : null;
        Throwable th = maVar != null ? maVar.a : null;
        synchronized (vnVar) {
            vnVar.e();
            ArrayList arrayListF = vnVar.f(th);
            if (!arrayListF.isEmpty()) {
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayListF.get(i);
                    i++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                pnVar = (Throwable) obj2;
                if (pnVar == null) {
                    pnVar = (Throwable) arrayListF.get(0);
                }
            } else if (vnVar.e()) {
                pnVar = new pn(n(), null, this);
            }
            if (pnVar != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size2 = arrayListF.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayListF.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != pnVar && th2 != pnVar && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        na1.d(pnVar, th2);
                    }
                }
            }
        }
        if (pnVar != null && pnVar != th) {
            obj = new ma(pnVar, false);
        }
        if (pnVar != null && (m(pnVar) || w(pnVar))) {
            obj.getClass();
            ma.b.compareAndSet((ma) obj, 0, 1);
        }
        G(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object xmVar = obj instanceof wm ? new xm((wm) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, vnVar, xmVar) && atomicReferenceFieldUpdater.get(this) == vnVar) {
        }
        p(vnVar, obj);
        return obj;
    }

    public final CancellationException s() {
        CancellationException cancellationException;
        Object obj = f.get(this);
        if (obj instanceof vn) {
            Throwable thC = ((vn) obj).c();
            if (thC == null) {
                j7.k(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new pn(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof wm) {
            j7.k(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof ma)) {
            return new pn(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ma) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new pn(n(), th, this) : cancellationException;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + L(f.get(this)) + '}');
        sb.append('@');
        sb.append(yd.g(this));
        return sb.toString();
    }

    public boolean u() {
        return this instanceof ja;
    }

    public final vt v(wm wmVar) {
        vt vtVarD = wmVar.d();
        if (vtVarD != null) {
            return vtVarD;
        }
        if (wmVar instanceof hh) {
            return new vt();
        }
        if (wmVar instanceof sn) {
            J((sn) wmVar);
            return null;
        }
        j7.k(wmVar, "State should have list: ");
        return null;
    }

    public boolean w(Throwable th) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, m9, sn, tp] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lf] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [tp, vt] */
    public final void y(wn wnVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int iK;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
        wt wtVar = wt.a;
        if (wnVar == null) {
            atomicReferenceFieldUpdater2.set(this, wtVar);
            return;
        }
        do {
            atomicReferenceFieldUpdater = f;
            iK = wnVar.K(atomicReferenceFieldUpdater.get(wnVar));
            if (iK == 0) {
                break;
            }
        } while (iK != 1);
        ?? m9Var = new m9(this);
        m9Var.d = wnVar;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(wnVar);
            if (!(obj instanceof hh)) {
                Throwable thC = null;
                if (obj instanceof wm) {
                    ?? D = ((wm) obj).d();
                    if (D != 0) {
                        if (!D.e(m9Var, 7)) {
                            boolean zE = D.e(m9Var, 3);
                            Object obj2 = atomicReferenceFieldUpdater.get(wnVar);
                            if (obj2 instanceof vn) {
                                thC = ((vn) obj2).c();
                            } else {
                                ma maVar = obj2 instanceof ma ? (ma) obj2 : null;
                                if (maVar != null) {
                                    thC = maVar.a;
                                }
                            }
                            m9Var.l(thC);
                            if (!zE) {
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                    wnVar.J((sn) obj);
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(wnVar);
                    ma maVar2 = obj3 instanceof ma ? (ma) obj3 : null;
                    m9Var.l(maVar2 != null ? maVar2.a : null);
                }
                m9Var = wtVar;
                break;
            }
            hh hhVar = (hh) obj;
            if (hhVar.a) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(wnVar, obj, m9Var)) {
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater.get(wnVar) == obj);
            } else {
                wnVar.I(hhVar);
            }
        }
        atomicReferenceFieldUpdater2.set(this, m9Var);
        if (atomicReferenceFieldUpdater.get(this) instanceof wm) {
            return;
        }
        m9Var.a();
        atomicReferenceFieldUpdater2.set(this, wtVar);
    }

    public final lf z(boolean z, sn snVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zE;
        snVar.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof hh;
            wt wtVar = wt.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof wm)) {
                    z2 = false;
                    break;
                }
                wm wmVar = (wm) obj;
                vt vtVarD = wmVar.d();
                if (vtVarD == null) {
                    J((sn) obj);
                } else {
                    if (snVar.k()) {
                        vn vnVar = wmVar instanceof vn ? (vn) wmVar : null;
                        Throwable thC = vnVar != null ? vnVar.c() : null;
                        if (thC == null) {
                            zE = vtVarD.e(snVar, 5);
                        } else if (z) {
                            snVar.l(thC);
                            return wtVar;
                        }
                    } else {
                        zE = vtVarD.e(snVar, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                hh hhVar = (hh) obj;
                if (hhVar.a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, snVar)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    I(hhVar);
                }
            }
            return wtVar;
        }
        if (z2) {
            return snVar;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ma maVar = obj2 instanceof ma ? (ma) obj2 : null;
            snVar.l(maVar != null ? maVar.a : null);
        }
        return wtVar;
    }

    public void H() {
    }

    public void G(Object obj) {
    }

    public void i(Object obj) {
    }

    public void x(na naVar) {
        throw naVar;
    }
}
