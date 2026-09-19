package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class xq2 implements yn2 {
    public final byte[] a;
    public final int b;
    public final au2 c;

    public xq2(byte[] bArr, j03 j03Var, int i) {
        this.c = a23.x(yt2.I(zt2.b(bArr.length), new gv1(12, j03.a(bArr))));
        this.a = j03Var.b();
        this.b = i;
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            j7.l("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.b + length2;
        int i2 = i + 28;
        if (length < i2) {
            j7.r("ciphertext too short");
            return null;
        }
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            j7.r("invalid salt size");
            return null;
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        au2 au2Var = this.c;
        System.arraycopy(au2Var.i(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(au2Var.i(16, bArr5), 0, bArr6, 16, 16);
        if (!jn.r(2)) {
            j7.r("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        bi biVar = nq2.a;
        yd.t(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i3 = i + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, i3);
        if (bArrCopyOfRange2.length != 12) {
            j7.r("iv is wrong size");
            return null;
        }
        if (length < i2) {
            j7.r("ciphertext too short");
            return null;
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) nq2.a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i3, length - i3);
    }
}
