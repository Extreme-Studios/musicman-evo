package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qz2 implements jo2 {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public qz2(RSAPublicKey rSAPublicKey, ry2 ry2Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!jn.r(2)) {
            j7.r("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        yd.B(rSAPublicKey.getModulus().bitLength());
        yd.D(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = b(ry2Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static String b(ry2 ry2Var) throws GeneralSecurityException {
        if (ry2Var == ry2.b) {
            return "SHA256withRSA";
        }
        if (ry2Var == ry2.c) {
            return "SHA384withRSA";
        }
        if (ry2Var == ry2.d) {
            return "SHA512withRSA";
        }
        j7.r("unknown hash type");
        return null;
    }

    public static qz2 c(vy2 vy2Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = vy2Var.K;
        ty2 ty2Var = vy2Var.J;
        return new qz2((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ty2Var.b)), ty2Var.d, vy2Var.L.b(), ty2Var.c.equals(sy2.d) ? g : f, provider);
    }

    @Override // defpackage.jo2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        j7.r("Invalid signature");
    }
}
