package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends t33 {
    public MessageDigest h;
    public final int i;
    public final int j;

    public fu0(int i) {
        super(5);
        int i2 = i >> 3;
        this.i = (i & 7) > 0 ? i2 + 1 : i2;
        this.j = i;
    }

    public final byte[] R1(String str) {
        synchronized (this.f) {
            try {
                MessageDigest messageDigestP1 = p1();
                this.h = messageDigestP1;
                if (messageDigestP1 == null) {
                    return new byte[0];
                }
                messageDigestP1.reset();
                this.h.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.h.digest();
                int length = bArrDigest.length;
                int i = this.i;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i2 = this.j & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i3] & 255);
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
