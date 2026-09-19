package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements ee0 {
    public final /* synthetic */ bi0 a;

    @Override // defpackage.ee0
    public final long a() {
        bi0 bi0Var = this.a;
        ii0 ii0Var = bi0Var.i;
        return (bi0Var.k * 1000000) / ((long) ii0Var.i);
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        bi0 bi0Var = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) bi0Var.i.i) * j) / 1000000);
        long j2 = bi0Var.h;
        long j3 = bi0Var.g;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(bi0Var.k)).longValue() + j3;
        String str = qz1.a;
        fe0 fe0Var = new fe0(j, Math.max(j3, Math.min(jLongValue - 30000, j2 - 1)));
        return new de0(fe0Var, fe0Var);
    }
}
