package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class du0 extends t33 {
    public MessageDigest h;

    public final byte[] R1(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iT = dq.t(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iT);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iT2 = dq.t(strArrSplit[i2]);
                    int i3 = (iT2 >> 16) ^ ((char) iT2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iT3 = dq.t(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iT3 >> 24) ^ (((iT3 & 255) ^ ((iT3 >> 8) & 255)) ^ ((iT3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.h = p1();
        synchronized (this.f) {
            try {
                MessageDigest messageDigest = this.h;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.h.update(bArrArray);
                byte[] bArrDigest = this.h.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
