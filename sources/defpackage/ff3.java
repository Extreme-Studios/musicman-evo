package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ff3 implements xd3, wd3 {
    public final xd3 f;
    public final long g;
    public wd3 h;

    public ff3(xd3 xd3Var, long j) {
        this.f = xd3Var;
        this.g = j;
    }

    @Override // defpackage.xd3
    public final void a(wd3 wd3Var, long j) {
        this.h = wd3Var;
        this.f.a(this, j - this.g);
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        long j = f83Var.a;
        e83 e83Var = new e83();
        e83Var.b = f83Var.b;
        e83Var.c = f83Var.c;
        e83Var.a = j - this.g;
        return this.f.b(new f83(e83Var));
    }

    @Override // defpackage.wd3
    public final /* bridge */ /* synthetic */ void c(bf3 bf3Var) {
        wd3 wd3Var = this.h;
        wd3Var.getClass();
        wd3Var.c(this);
    }

    @Override // defpackage.xd3
    public final long d(long j) {
        xd3 xd3Var = this.f;
        long j2 = this.g;
        return xd3Var.d(j - j2) + j2;
    }

    @Override // defpackage.xd3
    public final void e(long j) {
        this.f.e(j - this.g);
    }

    @Override // defpackage.xd3
    public final long f() {
        long jF = this.f.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.g;
    }

    @Override // defpackage.wd3
    public final void g(xd3 xd3Var) {
        wd3 wd3Var = this.h;
        wd3Var.getClass();
        wd3Var.g(this);
    }

    @Override // defpackage.xd3
    public final long h(long j, c93 c93Var) {
        xd3 xd3Var = this.f;
        long j2 = this.g;
        return xd3Var.h(j - j2, c93Var) + j2;
    }

    @Override // defpackage.bf3
    public final long i() {
        long jI = this.f.i();
        if (jI == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jI + this.g;
    }

    @Override // defpackage.bf3
    public final long j() {
        long j = this.f.j();
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return j + this.g;
    }

    @Override // defpackage.bf3
    public final void k(long j) {
        this.f.k(j - this.g);
    }

    @Override // defpackage.xd3
    public final gf3 l() {
        return this.f.l();
    }

    @Override // defpackage.xd3
    public final long m(bg3[] bg3VarArr, boolean[] zArr, af3[] af3VarArr, boolean[] zArr2, long j) {
        af3[] af3VarArr2 = new af3[af3VarArr.length];
        int i = 0;
        while (true) {
            af3 af3Var = null;
            if (i >= af3VarArr.length) {
                break;
            }
            ef3 ef3Var = (ef3) af3VarArr[i];
            if (ef3Var != null) {
                af3Var = ef3Var.a;
            }
            af3VarArr2[i] = af3Var;
            i++;
        }
        long j2 = this.g;
        long jM = this.f.m(bg3VarArr, zArr, af3VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < af3VarArr.length; i2++) {
            af3 af3Var2 = af3VarArr2[i2];
            if (af3Var2 == null) {
                af3VarArr[i2] = null;
            } else {
                af3 af3Var3 = af3VarArr[i2];
                if (af3Var3 == null || ((ef3) af3Var3).a != af3Var2) {
                    af3VarArr[i2] = new ef3(af3Var2, j2);
                }
            }
        }
        return jM + j2;
    }

    @Override // defpackage.bf3
    public final boolean o() {
        return this.f.o();
    }

    @Override // defpackage.xd3
    public final void r() {
        this.f.r();
    }
}
