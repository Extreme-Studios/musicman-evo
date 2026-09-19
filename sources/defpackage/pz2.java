package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 implements io2 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final jo2 e;
    public final Provider f;

    public pz2(RSAPrivateCrtKey rSAPrivateCrtKey, ry2 ry2Var, byte[] bArr, byte[] bArr2, jo2 jo2Var, Provider provider) throws GeneralSecurityException {
        if (!jn.r(2)) {
            j7.r("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (ry2Var != ry2.b && ry2Var != ry2.c && ry2Var != ry2.d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ry2Var)));
        }
        yd.B(rSAPrivateCrtKey.getModulus().bitLength());
        yd.D(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = qz2.b(ry2Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = jo2Var;
        this.f = provider;
    }
}
