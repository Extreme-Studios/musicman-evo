package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gr2 {
    public static final gr2 d;
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        d = new gr2(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public gr2(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
    }
}
