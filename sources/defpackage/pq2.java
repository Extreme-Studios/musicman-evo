package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class pq2 implements yn2 {
    public static final byte[] d = dq.z("7a806c");
    public static final byte[] e = dq.z("46bb91c3c5");
    public static final byte[] f = dq.z("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = dq.z("bae8e37fc83441b16034566b");
    public static final byte[] h = dq.z("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final ki2 a;
    public final SecretKeySpec b;
    public final byte[] c;

    public pq2(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        ki2 ki2Var = ki2.H;
        this.c = bArr2;
        yd.t(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        this.a = ki2Var;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            j7.r("ciphertext too short");
            return null;
        }
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        this.a.getClass();
        Cipher cipherD = ki2.d();
        cipherD.init(2, this.b, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        return cipherD.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
