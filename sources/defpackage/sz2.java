package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sz2 implements jo2 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public sz2(RSAPublicKey rSAPublicKey, yy2 yy2Var, yy2 yy2Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!jn.r(2)) {
            j7.r("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!yy2Var.equals(yy2Var2)) {
            j7.r("sigHash and mgf1Hash must be the same");
            throw null;
        }
        yd.B(rSAPublicKey.getModulus().bitLength());
        yd.D(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = b(yy2Var);
        this.c = c(yy2Var, yy2Var2, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    public static String b(yy2 yy2Var) {
        if (yy2Var == yy2.b) {
            return "SHA256withRSA/PSS";
        }
        if (yy2Var == yy2.c) {
            return "SHA384withRSA/PSS";
        }
        if (yy2Var == yy2.d) {
            return "SHA512withRSA/PSS";
        }
        j7.p("Unsupported hash: ".concat(String.valueOf(yy2Var)));
        return null;
    }

    public static PSSParameterSpec c(yy2 yy2Var, yy2 yy2Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        yy2 yy2Var3 = yy2.d;
        yy2 yy2Var4 = yy2.c;
        yy2 yy2Var5 = yy2.b;
        if (yy2Var == yy2Var5) {
            str = "SHA-256";
        } else if (yy2Var == yy2Var4) {
            str = "SHA-384";
        } else {
            if (yy2Var != yy2Var3) {
                j7.p("Unsupported MD hash: ".concat(String.valueOf(yy2Var)));
                return null;
            }
            str = "SHA-512";
        }
        if (yy2Var2 == yy2Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (yy2Var2 == yy2Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (yy2Var2 != yy2Var3) {
                j7.p("Unsupported MGF1 hash: ".concat(String.valueOf(yy2Var2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public static sz2 d(cz2 cz2Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerS;
        int i = ct2.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            providerS = (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() > 23 ? ar.s() : null;
        }
        Provider provider = providerS;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = cz2Var.K;
        az2 az2Var = cz2Var.J;
        return new sz2((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, az2Var.b)), az2Var.d, az2Var.e, az2Var.f, cz2Var.L.b(), az2Var.c.equals(zy2.d) ? h : g, provider);
    }

    @Override // defpackage.jo2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        j7.r("signature verification failed");
    }
}
