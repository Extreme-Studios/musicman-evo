package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements ee0 {
    public final bd0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zc0(bd0 bd0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = bd0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        fe0 fe0Var = new fe0(j, ad0.a(this.a.f(j), 0L, this.c, this.d, this.e, this.f));
        return new de0(fe0Var, fe0Var);
    }
}
