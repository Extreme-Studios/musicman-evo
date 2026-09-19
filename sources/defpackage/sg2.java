package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg2 implements qg2 {
    public final dh2 a;
    public final long b;

    public sg2(dh2 dh2Var, long j) {
        this.a = dh2Var;
        this.b = j;
    }

    @Override // defpackage.qg2
    public final boolean a(fe2 fe2Var) {
        if (fe2Var != null && !fe2Var.equals(fe2.D())) {
            return true;
        }
        this.a.b(20204);
        return false;
    }

    @Override // defpackage.qg2
    public final boolean b(fe2 fe2Var) {
        dh2 dh2Var = this.a;
        if (fe2Var == null || fe2Var.equals(fe2.D())) {
            dh2Var.b(20202);
            return true;
        }
        boolean z = fe2Var.A().A() - System.currentTimeMillis() <= this.b;
        if (z) {
            dh2Var.b(20203);
        }
        return z;
    }
}
