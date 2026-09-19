package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rd3 implements xd3, wd3 {
    public final yd3 f;
    public final long g;
    public final fg3 h;
    public dd3 i;
    public xd3 j;
    public wd3 k;
    public long l = -9223372036854775807L;

    public rd3(yd3 yd3Var, fg3 fg3Var, long j) {
        this.f = yd3Var;
        this.h = fg3Var;
        this.g = j;
    }

    @Override // defpackage.xd3
    public final void a(wd3 wd3Var, long j) {
        this.k = wd3Var;
        xd3 xd3Var = this.j;
        if (xd3Var != null) {
            long j2 = this.l;
            if (j2 == -9223372036854775807L) {
                j2 = this.g;
            }
            xd3Var.a(this, j2);
        }
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        xd3 xd3Var = this.j;
        return xd3Var != null && xd3Var.b(f83Var);
    }

    @Override // defpackage.wd3
    public final /* bridge */ /* synthetic */ void c(bf3 bf3Var) {
        wd3 wd3Var = this.k;
        String str = qz1.a;
        wd3Var.c(this);
    }

    @Override // defpackage.xd3
    public final long d(long j) {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.d(j);
    }

    @Override // defpackage.xd3
    public final void e(long j) {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        xd3Var.e(j);
    }

    @Override // defpackage.xd3
    public final long f() {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.f();
    }

    @Override // defpackage.wd3
    public final void g(xd3 xd3Var) {
        wd3 wd3Var = this.k;
        String str = qz1.a;
        wd3Var.g(this);
    }

    @Override // defpackage.xd3
    public final long h(long j, c93 c93Var) {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.h(j, c93Var);
    }

    @Override // defpackage.bf3
    public final long i() {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.i();
    }

    @Override // defpackage.bf3
    public final long j() {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.j();
    }

    @Override // defpackage.bf3
    public final void k(long j) {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        xd3Var.k(j);
    }

    @Override // defpackage.xd3
    public final gf3 l() {
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.l();
    }

    @Override // defpackage.xd3
    public final long m(bg3[] bg3VarArr, boolean[] zArr, af3[] af3VarArr, boolean[] zArr2, long j) {
        long j2 = this.l;
        if (j2 != -9223372036854775807L && j == this.g) {
            j = j2;
        }
        this.l = -9223372036854775807L;
        xd3 xd3Var = this.j;
        String str = qz1.a;
        return xd3Var.m(bg3VarArr, zArr, af3VarArr, zArr2, j);
    }

    public final void n(yd3 yd3Var) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            j = this.g;
        }
        dd3 dd3Var = this.i;
        dd3Var.getClass();
        xd3 xd3VarC = dd3Var.c(yd3Var, this.h, j);
        this.j = xd3VarC;
        if (this.k != null) {
            xd3VarC.a(this, j);
        }
    }

    @Override // defpackage.bf3
    public final boolean o() {
        xd3 xd3Var = this.j;
        return xd3Var != null && xd3Var.o();
    }

    @Override // defpackage.xd3
    public final void r() {
        xd3 xd3Var = this.j;
        if (xd3Var != null) {
            xd3Var.r();
            return;
        }
        dd3 dd3Var = this.i;
        if (dd3Var != null) {
            dd3Var.r();
        }
    }
}
