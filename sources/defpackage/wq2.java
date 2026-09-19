package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class wq2 implements yn2 {
    public final /* synthetic */ int a;
    public final byte[] b;
    public final Object c;

    public wq2(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.a = i;
        switch (i) {
            case 3:
                this.c = new vq2(0, bArr);
                this.b = bArr2;
                return;
            case 4:
                this.c = new vq2(1, bArr);
                this.b = bArr2;
                return;
            default:
                if (!jn.r(1)) {
                    j7.r("Can not use ChaCha20Poly1305 in FIPS-mode.");
                    throw null;
                }
                if (((Cipher) rq2.f.get()) == null) {
                    j7.r("JCE does not support algorithm: ChaCha20-Poly1305");
                    throw null;
                }
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.b = bArr;
                this.c = bArr2;
                return;
        }
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.c;
        byte[] bArr3 = this.b;
        switch (i) {
            case 0:
                yn2 yn2Var = (yn2) obj;
                if (bArr3.length == 0) {
                    return yn2Var.a(bArr, bArr2);
                }
                if (ct2.c(bArr3, bArr)) {
                    return yn2Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                j7.r("wrong prefix");
                return null;
            case 1:
                if (bArr == null) {
                    j7.l("ciphertext is null");
                    return null;
                }
                byte[] bArr4 = (byte[]) obj;
                int length = bArr.length;
                int length2 = bArr4.length;
                if (length < length2 + 40) {
                    j7.r("ciphertext too short");
                    return null;
                }
                if (!ct2.c(bArr4, bArr)) {
                    j7.r("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                byte[] bArr5 = new byte[24];
                System.arraycopy(bArr, length2, bArr5, 0, 24);
                int[] iArrD = tq2.d(tq2.c(bArr3), tq2.c(bArr5));
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.asIntBuffer().put(iArrD);
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
                byte[] bArr6 = new byte[12];
                System.arraycopy(bArr5, 16, bArr6, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                Cipher cipher = (Cipher) rq2.f.get();
                cipher.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
            case 2:
                if (bArr == null) {
                    j7.l("ciphertext is null");
                    return null;
                }
                int length3 = bArr.length;
                int length4 = bArr3.length;
                if (length3 < length4 + 28) {
                    j7.r("ciphertext too short");
                    return null;
                }
                if (!ct2.c(bArr3, bArr)) {
                    j7.r("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                bi biVar = nq2.a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length4, 12);
                Cipher cipher2 = (Cipher) nq2.a.get();
                cipher2.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, length4 + 12, (length3 - length4) - 12);
            case 3:
                int length5 = bArr3.length;
                if (length5 == 0) {
                    return b(bArr, bArr2);
                }
                if (ct2.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length5, bArr.length), bArr2);
                }
                j7.r("Decryption failed (OutputPrefix mismatch).");
                return null;
            default:
                int length6 = bArr3.length;
                if (length6 == 0) {
                    return c(bArr, bArr2);
                }
                if (ct2.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length6, bArr.length), bArr2);
                }
                j7.r("Decryption failed (OutputPrefix mismatch).");
                return null;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            j7.r("ciphertext too short");
            return null;
        }
        return ((vq2) this.c).l(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            j7.r("ciphertext too short");
            return null;
        }
        return ((vq2) this.c).l(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public wq2(yn2 yn2Var, byte[] bArr) {
        this.a = 0;
        this.c = yn2Var;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.b = bArr;
        } else {
            j7.p("identifier has an invalid length");
            throw null;
        }
    }

    public wq2(byte[] bArr, j03 j03Var) throws GeneralSecurityException {
        this.a = 2;
        if (jn.r(2)) {
            bi biVar = nq2.a;
            yd.t(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            this.b = j03Var.b();
            return;
        }
        j7.r("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
