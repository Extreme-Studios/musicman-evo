package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class xy2 {
    public static final BigInteger g;
    public static final BigInteger h;
    public Integer a = null;
    public BigInteger b = az2.g;
    public yy2 c = null;
    public yy2 d = null;
    public Integer e = null;
    public zy2 f = zy2.e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        g = bigIntegerValueOf;
        h = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public final az2 c() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            j7.r("key size is not set");
            return null;
        }
        if (this.b == null) {
            j7.r("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            j7.r("signature hash type is not set");
            return null;
        }
        if (this.d == null) {
            j7.r("mgf1 hash type is not set");
            return null;
        }
        if (this.f == null) {
            j7.r("variant is not set");
            return null;
        }
        if (this.e == null) {
            j7.r("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.a, 2048));
        }
        if (this.c != this.d) {
            j7.r("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(az2.g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new az2(this.a.intValue(), this.b, this.f, this.c, this.d, this.e.intValue());
    }
}
