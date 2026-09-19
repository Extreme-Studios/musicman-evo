package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yp2 extends a21 {
    public final i8 f;
    public final e31 g;

    public yp2(i8 i8Var, e31 e31Var) {
        this.f = i8Var;
        this.g = e31Var;
    }

    @Override // defpackage.m21
    public final void N(fu1 fu1Var) {
        i8 i8Var = this.f;
        if (i8Var != null) {
            i8Var.n(fu1Var.b());
        }
    }

    @Override // defpackage.m21
    public final void y() {
        e31 e31Var;
        i8 i8Var = this.f;
        if (i8Var == null || (e31Var = this.g) == null) {
            return;
        }
        i8Var.o(e31Var);
    }
}
