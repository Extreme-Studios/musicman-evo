package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements yg0 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public ah0(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return this.g != null;
    }

    @Override // defpackage.yg0
    public final long d() {
        return this.f;
    }

    @Override // defpackage.yg0
    public final int e() {
        return this.d;
    }

    @Override // defpackage.yg0
    public final long f(long j) {
        if (!c()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iP = qz1.p(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iP) * j3) / 100;
        long j5 = jArr[iP];
        int i = iP + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iP == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        double d;
        double d2;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            fe0 fe0Var = new fe0(0L, j2 + ((long) i));
            return new de0(fe0Var, fe0Var);
        }
        String str = qz1.a;
        long j3 = this.c;
        long jMax = Math.max(0L, Math.min(j, j3));
        double d3 = (jMax * 100.0d) / j3;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j4 = this.e;
        fe0 fe0Var2 = new fe0(jMax, j2 + Math.max(i, Math.min(Math.round((d4 / d) * j4), j4 - 1)));
        return new de0(fe0Var2, fe0Var2);
    }
}
