package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class fr2 {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final dr2[][] d;
    public static final dr2[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        us2 us2Var = new us2(26, (boolean) (0 == true ? 1 : 0));
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        us2Var.h = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        us2Var.g = bigIntegerModPow2;
        a = s90.f0(b(bigIntegerMod));
        b = s90.f0(b(bigIntegerMod2));
        c = s90.f0(b(bigIntegerModPow));
        d = (dr2[][]) Array.newInstance((Class<?>) dr2.class, 32, 8);
        us2 us2VarA = us2Var;
        for (int i = 0; i < 32; i++) {
            us2 us2VarA2 = us2VarA;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = c(us2VarA2);
                us2VarA2 = a(us2VarA2, us2VarA);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                us2VarA = a(us2VarA, us2VarA);
            }
        }
        us2 us2VarA3 = a(us2Var, us2Var);
        e = new dr2[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = c(us2Var);
            us2Var = a(us2Var, us2VarA3);
        }
    }

    public static us2 a(us2 us2Var, us2 us2Var2) {
        us2 us2Var3 = new us2(26, false);
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) us2Var.g).multiply((BigInteger) us2Var2.g).multiply((BigInteger) us2Var.h).multiply((BigInteger) us2Var2.h));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) us2Var.g).multiply((BigInteger) us2Var2.h).add(((BigInteger) us2Var2.g).multiply((BigInteger) us2Var.h));
        BigInteger bigInteger2 = BigInteger.ONE;
        us2Var3.g = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        us2Var3.h = ((BigInteger) us2Var.h).multiply((BigInteger) us2Var2.h).add(((BigInteger) us2Var.g).multiply((BigInteger) us2Var2.g)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return us2Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static dr2 c(us2 us2Var) {
        BigInteger bigIntegerAdd = ((BigInteger) us2Var.h).add((BigInteger) us2Var.g);
        BigInteger bigInteger = f;
        return new dr2(s90.f0(b(bigIntegerAdd.mod(bigInteger))), s90.f0(b(((BigInteger) us2Var.h).subtract((BigInteger) us2Var.g).mod(bigInteger))), s90.f0(b(h.multiply((BigInteger) us2Var.g).multiply((BigInteger) us2Var.h).mod(bigInteger))));
    }
}
