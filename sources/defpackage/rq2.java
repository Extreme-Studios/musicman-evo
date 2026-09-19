package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class rq2 implements yn2 {
    public static final byte[] c = dq.z("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] d = dq.z("070000004041424344454647");
    public static final byte[] e = dq.z("a0784d7a4716f3feb4f64e7f4b39bf04");
    public static final bi f = new bi(4);
    public final SecretKeySpec a;
    public final byte[] b;

    public rq2(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!jn.r(1)) {
            j7.r("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (f.get() == null) {
            j7.r("JCE does not support algorithm: ChaCha20-Poly1305");
            throw null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = new SecretKeySpec(bArr, "ChaCha20");
        this.b = bArr2;
    }

    public static boolean b(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(d);
            byte[] bArr = c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            j7.l("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            j7.r("ciphertext too short");
            return null;
        }
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f.get();
        cipher.init(2, this.a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
