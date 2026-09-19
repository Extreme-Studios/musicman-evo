package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lz2 implements io2 {
    public static final byte[] a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static lz2 a(iy2 iy2Var) throws GeneralSecurityException {
        Provider providerS = ar.s();
        if (providerS == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        gv1 gv1Var = iy2Var.K;
        ky2 ky2Var = iy2Var.J;
        byte[] bArrB = ((j03) gv1Var.g).b();
        ky2Var.L.b();
        lz2 lz2Var = new lz2();
        if (!jn.r(1)) {
            j7.r("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (bArrB.length != 32) {
            j7.p("Given private key's length is not 32");
            return null;
        }
        KeyFactory.getInstance("Ed25519", providerS).generatePrivate(new PKCS8EncodedKeySpec(na1.x(a, bArrB)));
        return lz2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public static lz2 b(bz2 bz2Var) throws GeneralSecurityException {
        Provider providerS;
        int i = ct2.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            if ((!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() <= 23) {
                providerS = null;
            } else {
                providerS = ar.s();
            }
        } else {
            providerS = ar.s();
        }
        if (providerS == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerS);
        cz2 cz2Var = bz2Var.J;
        az2 az2Var = cz2Var.J;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(cz2Var.K, az2Var.b, (BigInteger) bz2Var.K.g, (BigInteger) bz2Var.L.g, (BigInteger) bz2Var.M.g, (BigInteger) bz2Var.N.g, (BigInteger) bz2Var.O.g, (BigInteger) bz2Var.P.g));
        yy2 yy2Var = az2Var.d;
        yy2 yy2Var2 = az2Var.e;
        int i2 = az2Var.f;
        cz2Var.L.b();
        lz2 lz2Var = new lz2();
        if (!jn.r(2)) {
            j7.r("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        yd.B(rSAPrivateCrtKey.getModulus().bitLength());
        yd.D(rSAPrivateCrtKey.getPublicExponent());
        sz2.b(yy2Var);
        sz2.c(yy2Var, yy2Var2, i2);
        return lz2Var;
    }
}
