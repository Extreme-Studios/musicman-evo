package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 implements yg0, ee0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;
    public final long j;

    public ug0(int i, int i2, long j, long j2) {
        long jMax;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            jMax = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.f = jMax;
        this.g = j2;
        this.h = i;
        this.i = i2;
        this.j = j == -1 ? -1L : j;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return this.d != -1;
    }

    @Override // defpackage.yg0
    public final long d() {
        return this.j;
    }

    @Override // defpackage.yg0
    public final int e() {
        return this.h;
    }

    @Override // defpackage.yg0
    public final long f(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1) {
            fe0 fe0Var = new fe0(0L, j3);
            return new de0(fe0Var, fe0Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        fe0 fe0Var2 = new fe0(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new de0(fe0Var2, new fe0((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new de0(fe0Var2, fe0Var2);
    }
}
