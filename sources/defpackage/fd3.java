package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd3 implements xd3, wd3 {
    public final rd3 f;
    public wd3 g;
    public ed3[] h = new ed3[0];
    public long i = 0;
    public long j;

    public fd3(rd3 rd3Var, long j) {
        this.f = rd3Var;
        this.j = j;
    }

    @Override // defpackage.xd3
    public final void a(wd3 wd3Var, long j) {
        this.g = wd3Var;
        this.f.a(this, j);
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        return this.f.b(f83Var);
    }

    @Override // defpackage.wd3
    public final /* bridge */ /* synthetic */ void c(bf3 bf3Var) {
        wd3 wd3Var = this.g;
        wd3Var.getClass();
        wd3Var.c(this);
    }

    @Override // defpackage.xd3
    public final long d(long j) {
        this.i = -9223372036854775807L;
        for (ed3 ed3Var : this.h) {
            if (ed3Var != null) {
                ed3Var.b = false;
            }
        }
        long jD = this.f.d(j);
        long j2 = this.j;
        long jMax = Math.max(jD, 0L);
        return j2 != Long.MIN_VALUE ? Math.min(jMax, j2) : jMax;
    }

    @Override // defpackage.xd3
    public final void e(long j) {
        this.f.e(j);
    }

    @Override // defpackage.xd3
    public final long f() {
        if (n()) {
            long j = this.i;
            this.i = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j;
        }
        long jF2 = this.f.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.j;
        long jMax = Math.max(jF2, 0L);
        return j2 != Long.MIN_VALUE ? Math.min(jMax, j2) : jMax;
    }

    @Override // defpackage.wd3
    public final void g(xd3 xd3Var) {
        wd3 wd3Var = this.g;
        wd3Var.getClass();
        wd3Var.g(this);
    }

    @Override // defpackage.xd3
    public final long h(long j, c93 c93Var) {
        if (j == 0) {
            return 0L;
        }
        long j2 = c93Var.a;
        String str = qz1.a;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = c93Var.b;
        long j4 = this.j;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            c93Var = new c93(jMax, jMax2);
        }
        return this.f.h(j, c93Var);
    }

    @Override // defpackage.bf3
    public final long i() {
        long jI = this.f.i();
        if (jI != Long.MIN_VALUE) {
            long j = this.j;
            if (j == Long.MIN_VALUE || jI < j) {
                return jI;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bf3
    public final long j() {
        long j = this.f.j();
        if (j != Long.MIN_VALUE) {
            long j2 = this.j;
            if (j2 == Long.MIN_VALUE || j < j2) {
                return j;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bf3
    public final void k(long j) {
        this.f.k(j);
    }

    @Override // defpackage.xd3
    public final gf3 l() {
        return this.f.l();
    }

    @Override // defpackage.xd3
    public final long m(bg3[] bg3VarArr, boolean[] zArr, af3[] af3VarArr, boolean[] zArr2, long j) {
        int length = af3VarArr.length;
        this.h = new ed3[length];
        af3[] af3VarArr2 = new af3[length];
        for (int i = 0; i < af3VarArr.length; i++) {
            ed3[] ed3VarArr = this.h;
            ed3 ed3Var = (ed3) af3VarArr[i];
            ed3VarArr[i] = ed3Var;
            af3VarArr2[i] = ed3Var != null ? ed3Var.a : null;
        }
        long jM = this.f.m(bg3VarArr, zArr, af3VarArr2, zArr2, j);
        long j2 = this.j;
        long jMax = Math.max(jM, j);
        if (j2 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j2);
        }
        long j3 = -9223372036854775807L;
        if (n()) {
            if (jM < j) {
                j3 = jMax;
                break;
            }
            if (jM != 0) {
                for (bg3 bg3Var : bg3VarArr) {
                    if (bg3Var != null) {
                        de3 de3VarH = bg3Var.h();
                        if (!rn0.d(de3VarH.m, de3VarH.j)) {
                            j3 = jMax;
                            break;
                        }
                    }
                }
            }
        }
        this.i = j3;
        for (int i2 = 0; i2 < af3VarArr.length; i2++) {
            af3 af3Var = af3VarArr2[i2];
            ed3[] ed3VarArr2 = this.h;
            if (af3Var == null) {
                ed3VarArr2[i2] = null;
            } else {
                ed3 ed3Var2 = ed3VarArr2[i2];
                if (ed3Var2 == null || ed3Var2.a != af3Var) {
                    ed3VarArr2[i2] = new ed3(this, af3Var);
                }
            }
            af3VarArr[i2] = ed3VarArr2[i2];
        }
        return jMax;
    }

    public final boolean n() {
        return this.i != -9223372036854775807L;
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
