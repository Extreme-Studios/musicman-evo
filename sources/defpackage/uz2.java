package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class uz2 implements yn2 {
    public static final bi e = new bi(9);
    public final byte[] a;
    public final au2 b;
    public final SecretKeySpec c;
    public final int d;

    public uz2(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!jn.r(1)) {
            j7.r("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            j7.p("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        int length = bArr.length;
        yd.t(length);
        this.c = new SecretKeySpec(bArr, "AES");
        this.b = a23.x(yt2.I(zt2.b(length), new gv1(12, j03.a(bArr))));
        this.a = bArr2;
    }

    public static uz2 b(zo2 zo2Var) throws GeneralSecurityException {
        if (!jn.r(1)) {
            j7.r("Can not use AES-EAX in FIPS-mode.");
            return null;
        }
        zo2Var.getClass();
        return new uz2(zo2Var.J.b, ((j03) zo2Var.K.g).b(), zo2Var.L.b());
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.d;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            j7.r("ciphertext too short");
            return null;
        }
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrC = c(0, length2, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, 0, bArr2.length, bArr2);
        byte[] bArrC3 = c(2, length2 + i, i2, bArr);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ bArrC2[i4]) ^ bArrC[i4]) ^ bArrC3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }

    public final byte[] c(int i, int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.i(16, bArr2);
    }
}
