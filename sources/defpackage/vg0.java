package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class vg0 implements yg0 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public vg0(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? qz1.r(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int iP = qz1.p(jArr, j, true);
        long j2 = jArr[iP];
        long j3 = jArr2[iP];
        int i = iP + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
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
        return -1L;
    }

    @Override // defpackage.yg0
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.yg0
    public final long f(long j) {
        return qz1.r(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        String str = qz1.a;
        Pair pairB = b(qz1.q(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        fe0 fe0Var = new fe0(qz1.r(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new de0(fe0Var, fe0Var);
    }
}
