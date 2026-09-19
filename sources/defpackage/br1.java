package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class br1 implements i21 {
    public final ok1 f;
    public final g81 g;
    public final String h;
    public final String i;

    public br1(ok1 ok1Var, x42 x42Var) {
        this.f = ok1Var;
        this.g = x42Var.l;
        this.h = x42Var.j;
        this.i = x42Var.k;
    }

    @Override // defpackage.i21
    public final void U(g81 g81Var) {
        int i;
        String str;
        g81 g81Var2 = this.g;
        if (g81Var2 != null) {
            g81Var = g81Var2;
        }
        if (g81Var != null) {
            str = g81Var.f;
            i = g81Var.g;
        } else {
            i = 1;
            str = "";
        }
        w71 w71Var = new w71(str, i);
        ok1 ok1Var = this.f;
        ok1Var.getClass();
        ok1Var.L1(new p83(w71Var, this.h, this.i, 14));
    }

    @Override // defpackage.i21
    public final void a() {
        this.f.L1(zf0.n);
    }

    @Override // defpackage.i21
    public final void r() {
        this.f.L1(ue0.k);
    }
}
