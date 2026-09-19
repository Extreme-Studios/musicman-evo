package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i50 extends fz {
    public final ThreadLocal j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public i50(ic icVar, g10 g10Var) {
        j50 j50Var = j50.f;
        super(icVar.f(j50Var) == null ? icVar.e(j50Var) : icVar, g10Var);
        this.j = new ThreadLocal();
        ic icVar2 = g10Var.g;
        icVar2.getClass();
        if (icVar2.f(ig.g) instanceof lc) {
            return;
        }
        Object objS = dq.s(icVar, null);
        dq.o(icVar, objS);
        Q(icVar, objS);
    }

    public final boolean P() {
        boolean z = this.threadLocalIsSet && this.j.get() == null;
        this.j.remove();
        return !z;
    }

    public final void Q(ic icVar, Object obj) {
        this.threadLocalIsSet = true;
        this.j.set(new lv(icVar, obj));
    }

    @Override // defpackage.fz, defpackage.wn
    public final void k(Object obj) {
        if (this.threadLocalIsSet) {
            lv lvVar = (lv) this.j.get();
            if (lvVar != null) {
                dq.o((ic) lvVar.f, lvVar.g);
            }
            this.j.remove();
        }
        Object objR = i8.r(obj);
        g10 g10Var = this.i;
        ic icVar = g10Var.g;
        icVar.getClass();
        Object objS = dq.s(icVar, null);
        i50 i50VarL = objS != dq.m ? s90.l(g10Var, icVar, objS) : null;
        try {
            this.i.d(objR);
        } finally {
            if (i50VarL == null || i50VarL.P()) {
                dq.o(icVar, objS);
            }
        }
    }
}
