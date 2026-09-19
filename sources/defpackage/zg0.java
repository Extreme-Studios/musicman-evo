package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 implements yg0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public zg0(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yg0
    public final long d() {
        return this.d;
    }

    @Override // defpackage.yg0
    public final int e() {
        return this.e;
    }

    @Override // defpackage.yg0
    public final long f(long j) {
        return this.a[qz1.p(this.b, j, true)];
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        long[] jArr = this.a;
        int iP = qz1.p(jArr, j, true);
        long j2 = jArr[iP];
        long[] jArr2 = this.b;
        fe0 fe0Var = new fe0(j2, jArr2[iP]);
        if (j2 >= j || iP == jArr.length - 1) {
            return new de0(fe0Var, fe0Var);
        }
        int i = iP + 1;
        return new de0(fe0Var, new fe0(jArr[i], jArr2[i]));
    }
}
