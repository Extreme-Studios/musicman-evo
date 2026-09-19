package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class yz2 implements yn2 {
    public final tz2 a;
    public final f03 b;
    public final int c;
    public final byte[] d;

    public yz2(tz2 tz2Var, f03 f03Var, int i, byte[] bArr) {
        this.a = tz2Var;
        this.b = f03Var;
        this.c = i;
        this.d = bArr;
    }

    public static yz2 b(so2 so2Var) {
        byte[] bArrB = ((j03) so2Var.K.g).b();
        yo2 yo2Var = so2Var.J;
        tz2 tz2Var = new tz2(yo2Var.c, bArrB);
        String strValueOf = String.valueOf(yo2Var.f);
        g2 g2Var = new g2("HMAC".concat(strValueOf), new SecretKeySpec(((j03) so2Var.L.g).b(), "HMAC"));
        int i = yo2Var.d;
        return new yz2(tz2Var, new f03(g2Var, i), i, so2Var.M.b());
    }

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < i + length2) {
            j7.r("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!ct2.c(bArr3, bArr)) {
            j7.r("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrX = na1.x(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        f03 f03Var = this.b;
        int i3 = f03Var.b;
        au2 au2Var = f03Var.a;
        byte[] bArr4 = f03Var.d;
        int length3 = bArr4.length;
        byte[] bArr5 = f03Var.c;
        if (!MessageDigest.isEqual(length3 > 0 ? na1.x(bArr5, au2Var.i(i3, na1.x(bArrX, bArr4))) : na1.x(bArr5, au2Var.i(i3, bArrX)), bArrCopyOfRange2)) {
            j7.r("invalid MAC");
            return null;
        }
        int length4 = bArrCopyOfRange.length;
        tz2 tz2Var = this.a;
        int i4 = tz2Var.b;
        if (length4 < i4) {
            j7.r("ciphertext too short");
            return null;
        }
        byte[] bArr6 = new byte[i4];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i4);
        int i5 = length4 - i4;
        byte[] bArr7 = new byte[i5];
        Cipher cipher = (Cipher) tz2.d.get();
        byte[] bArr8 = new byte[tz2Var.c];
        System.arraycopy(bArr6, 0, bArr8, 0, i4);
        cipher.init(2, tz2Var.a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i4, i5, bArr7, 0) == i5) {
            return bArr7;
        }
        j7.r("stored output's length does not match input's length");
        return null;
    }
}
