package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ff extends hf implements sc, yb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ff.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final lc i;
    public final ac j;
    public Object k;
    public final Object l;

    public ff(lc lcVar, ac acVar) {
        super(-1);
        this.i = lcVar;
        this.j = acVar;
        this.k = ss0.b;
        this.l = dq.p(acVar.getContext());
    }

    @Override // defpackage.sc
    public final sc c() {
        return this.j;
    }

    @Override // defpackage.yb
    public final void d(Object obj) {
        Throwable thA = sx.a(obj);
        Object maVar = thA == null ? obj : new ma(thA, false);
        ac acVar = this.j;
        ic context = acVar.getContext();
        lc lcVar = this.i;
        if (lcVar.c(context)) {
            this.k = maVar;
            this.h = 0;
            lcVar.a(acVar.getContext(), this);
            return;
        }
        xh xhVarA = u30.a();
        if (xhVarA.h >= 4294967296L) {
            this.k = maVar;
            this.h = 0;
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
            ic context2 = acVar.getContext();
            Object objS = dq.s(context2, this.l);
            try {
                acVar.d(obj);
                dq.o(context2, objS);
                while (xhVarA.o()) {
                }
            } catch (Throwable th) {
                dq.o(context2, objS);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                xhVarA.g();
            }
        }
    }

    @Override // defpackage.yb
    public final ic getContext() {
        return this.j.getContext();
    }

    @Override // defpackage.hf
    public final Object k() {
        Object obj = this.k;
        this.k = ss0.b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + yd.p(this.j) + ']';
    }

    @Override // defpackage.hf
    public final yb e() {
        return this;
    }
}
