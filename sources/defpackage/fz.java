package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class fz extends h implements sc {
    public final g10 i;

    public fz(ic icVar, g10 g10Var) {
        super(icVar, true);
        this.i = g10Var;
    }

    @Override // defpackage.wn
    public final boolean B() {
        return true;
    }

    @Override // defpackage.sc
    public final sc c() {
        g10 g10Var = this.i;
        if (g10Var != null) {
            return g10Var;
        }
        return null;
    }

    @Override // defpackage.wn
    public void i(Object obj) {
        ss0.t(s90.h(this.i), i8.r(obj));
    }

    @Override // defpackage.wn
    public void k(Object obj) {
        this.i.d(i8.r(obj));
    }
}
