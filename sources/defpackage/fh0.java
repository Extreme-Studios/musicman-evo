package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final cw1 f;
    public final cw1 g;
    public int h;
    public int i;

    public fh0(cw1 cw1Var, cw1 cw1Var2, boolean z) throws no0 {
        this.g = cw1Var;
        this.f = cw1Var2;
        this.e = z;
        cw1Var2.E(12);
        this.a = cw1Var2.h();
        cw1Var.E(12);
        this.i = cw1Var.h();
        rs0.q("first_chunk must be 1", cw1Var.b() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        cw1 cw1Var = this.f;
        this.d = z ? cw1Var.j() : cw1Var.P();
        if (this.b == this.h) {
            cw1 cw1Var2 = this.g;
            this.c = cw1Var2.h();
            cw1Var2.G(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + cw1Var2.h() : -1;
        }
        return true;
    }
}
