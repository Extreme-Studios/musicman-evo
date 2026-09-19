package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ge0 implements nd0 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public pd0 f;
    public me0 g;

    public ge0(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        int i = this.b;
        int i2 = this.a;
        hn.M((i2 == -1 || i == -1) ? false : true);
        cw1 cw1Var = new cw1(i);
        ((fd0) od0Var).B(cw1Var.a, 0, i, false);
        return cw1Var.L() == i2;
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            j7.a();
            return 0;
        }
        me0 me0Var = this.g;
        me0Var.getClass();
        int iB = me0Var.b(od0Var, 1024, true);
        if (iB != -1) {
            this.d += iB;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.f = pd0Var;
        me0 me0VarZ = pd0Var.z(1024, 4);
        this.g = me0VarZ;
        uc3 uc3Var = new uc3();
        String str = this.c;
        uc3Var.d(str);
        uc3Var.e(str);
        me0VarZ.d(new de3(uc3Var));
        this.f.s();
        this.f.v(new he0());
        this.e = 1;
    }
}
