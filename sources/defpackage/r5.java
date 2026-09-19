package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r5 extends hj {
    public final /* synthetic */ y5 o;
    public final /* synthetic */ b6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(b6 b6Var, b6 b6Var2, y5 y5Var) {
        super(b6Var2);
        this.p = b6Var;
        this.o = y5Var;
    }

    @Override // defpackage.hj
    public final m00 b() {
        return this.o;
    }

    @Override // defpackage.hj
    public final boolean c() {
        b6 b6Var = this.p;
        if (b6Var.getInternalPopup().a()) {
            return true;
        }
        b6Var.k.m(b6Var.getTextDirection(), b6Var.getTextAlignment());
        return true;
    }
}
