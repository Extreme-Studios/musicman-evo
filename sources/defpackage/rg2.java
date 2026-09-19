package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements qg2 {
    public final o63 a;
    public final dh2 b;
    public final long c;

    public rg2(o63 o63Var, dh2 dh2Var, long j) {
        this.a = o63Var;
        this.b = dh2Var;
        this.c = j;
    }

    @Override // defpackage.qg2
    public final boolean a(fe2 fe2Var) {
        dh2 dh2Var = this.b;
        if (fe2Var == null || fe2Var.equals(fe2.D())) {
            dh2Var.b(15102);
            return false;
        }
        if (fe2Var.B() == this.a.c()) {
            return true;
        }
        dh2Var.b(15103);
        return false;
    }

    @Override // defpackage.qg2
    public final boolean b(fe2 fe2Var) {
        dh2 dh2Var = this.b;
        if (fe2Var == null || fe2Var.equals(fe2.D())) {
            dh2Var.b(15104);
            return true;
        }
        if (fe2Var.B() != this.a.c()) {
            dh2Var.b(15105);
            return true;
        }
        boolean z = (fe2Var.z().B() * 1000) - System.currentTimeMillis() <= this.c;
        if (z) {
            dh2Var.b(15106);
        }
        return z;
    }
}
