package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mz2 implements jo2 {
    public static final byte[] f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final /* synthetic */ int a = 1;
    public final byte[] b;
    public final byte[] c;
    public final PublicKey d;
    public final Serializable e;

    public mz2(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!jn.r(1)) {
            j7.r("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            j7.p("Given public key's length is not 32.");
            throw null;
        }
        this.d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(na1.x(f, bArr)));
        this.b = bArr2;
        this.c = bArr3;
        this.e = provider;
    }

    public static mz2 b(ky2 ky2Var) throws GeneralSecurityException {
        Provider providerS = ar.s();
        if (providerS == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (jn.r(1)) {
            return new mz2(ky2Var.K.b(), ky2Var.L.b(), ky2Var.J.a != gy2.d ? new byte[0] : new byte[]{0}, providerS);
        }
        j7.r("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // defpackage.jo2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        byte[] bArr3 = this.b;
        switch (i) {
            case 0:
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    j7.r("Invalid signature length: 64");
                } else if (!ct2.c(bArr3, bArr)) {
                    j7.r("Invalid signature (output prefix mismatch)");
                } else {
                    Signature signature = Signature.getInstance("Ed25519", (Provider) this.e);
                    signature.initVerify(this.d);
                    signature.update(bArr2);
                    signature.update(this.c);
                    try {
                        if (signature.verify(bArr, length, 64)) {
                        }
                    } catch (RuntimeException unused) {
                    }
                    j7.r("Signature check failed.");
                }
                break;
            default:
                int length2 = bArr3.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                } else if (!ct2.c(bArr3, bArr)) {
                    j7.r("Invalid signature (output prefix mismatch)");
                } else {
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                }
                break;
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZ;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            j7.r("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            j7.r("signature out of range");
            return;
        }
        byte[] bArrL0 = w40.l0(bigInteger.modPow(publicExponent, modulus), iBitLength);
        d03 d03Var = (d03) this.e;
        yd.y(d03Var);
        MessageDigest messageDigest = (MessageDigest) a03.e.a.l(i8.y(d03Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = d03Var.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrZ = dq.z("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZ = dq.z("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(d03Var.toString()));
            }
            bArrZ = dq.z("3051300d060960864801650304020305000440");
        }
        int length = bArrZ.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            j7.r("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length2 = bArrZ.length;
        System.arraycopy(bArrZ, 0, bArr4, i, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i + length2, bArrDigest.length);
        if (MessageDigest.isEqual(bArrL0, bArr4)) {
            return;
        }
        j7.r("invalid signature");
    }

    public /* synthetic */ mz2(RSAPublicKey rSAPublicKey, d03 d03Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!cr2.a()) {
            yd.y(d03Var);
            yd.B(rSAPublicKey.getModulus().bitLength());
            yd.D(rSAPublicKey.getPublicExponent());
            this.d = rSAPublicKey;
            this.e = d03Var;
            this.b = bArr;
            this.c = bArr2;
            return;
        }
        j7.r("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        throw null;
    }
}
