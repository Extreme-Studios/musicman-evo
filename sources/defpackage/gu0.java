package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gu0 extends mu0 {
    public final y6 f;
    public final String g;

    public gu0(y6 y6Var, String str) {
        this.f = y6Var;
        this.g = str;
    }

    @Override // defpackage.nu0
    public final void W(fu1 fu1Var) {
        y6 y6Var = this.f;
        if (y6Var != null) {
            y6Var.n(fu1Var.b());
        }
    }

    @Override // defpackage.nu0
    public final void e3(ku0 ku0Var) {
        y6 y6Var = this.f;
        if (y6Var != null) {
            y6Var.o(new hu0(ku0Var, this.g));
        }
    }

    @Override // defpackage.nu0
    public final void H(int i) {
    }
}
