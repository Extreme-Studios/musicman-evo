package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements ee0 {
    public final ih0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public tl0(ih0 ih0Var, int i, long j, long j2) {
        this.a = ih0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) ih0Var.h);
        this.d = j3;
        this.e = b(j3);
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.e;
    }

    public final long b(long j) {
        return qz1.t(j * ((long) this.b), 1000000L, this.a.g, RoundingMode.DOWN);
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        long j2 = this.b;
        ih0 ih0Var = this.a;
        long j3 = (((long) ih0Var.g) * j) / (j2 * 1000000);
        String str = qz1.a;
        long j4 = this.d - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = ih0Var.h;
        long jB = b(jMax);
        long j6 = this.c;
        fe0 fe0Var = new fe0(jB, (jMax * j5) + j6);
        if (jB >= j || jMax == j4) {
            return new de0(fe0Var, fe0Var);
        }
        long j7 = jMax + 1;
        return new de0(fe0Var, new fe0(b(j7), (j5 * j7) + j6));
    }
}
