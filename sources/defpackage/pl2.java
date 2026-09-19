package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class pl2 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (d > 0.0d && yd.z(d)) {
            long jS = yd.s(d);
            if ((jS & ((-1) + jS)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int b(double d) {
        boolean zA;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        hn.B("x must be positive and finite", d > 0.0d && yd.z(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return b(d * 4.503599627370496E15d) - 52;
        }
        switch (ol2.a[roundingMode.ordinal()]) {
            case 1:
                ar.A(a(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !a(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zA = a(d);
                z &= !zA;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zA = a(d);
                z &= !zA;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(double d) {
        if (yd.z(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(yd.s(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
