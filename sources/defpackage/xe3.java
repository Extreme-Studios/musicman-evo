package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 {
    public final fg3 a;
    public final cw1 b = new cw1(32);
    public gh0 c;
    public gh0 d;
    public gh0 e;
    public long f;

    public xe3(fg3 fg3Var) {
        this.a = fg3Var;
        gh0 gh0Var = new gh0(0L);
        this.c = gh0Var;
        this.d = gh0Var;
        this.e = gh0Var;
    }

    public static gh0 c(gh0 gh0Var, lt2 lt2Var, ri0 ri0Var, cw1 cw1Var) {
        if (lt2Var.c(1073741824)) {
            long j = ri0Var.h;
            int iL = 1;
            cw1Var.y(1);
            gh0 gh0VarE = e(gh0Var, j, cw1Var.a, 1);
            long j2 = j + 1;
            byte b = cw1Var.a[0];
            int i = b & 128;
            int i2 = b & 127;
            or2 or2Var = lt2Var.c;
            byte[] bArr = or2Var.a;
            if (bArr == null) {
                or2Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            gh0Var = e(gh0VarE, j2, or2Var.a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                cw1Var.y(2);
                gh0Var = e(gh0Var, j3, cw1Var.a, 2);
                j3 += 2;
                iL = cw1Var.L();
            }
            int[] iArr = or2Var.d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = or2Var.e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z) {
                int i3 = iL * 6;
                cw1Var.y(i3);
                gh0Var = e(gh0Var, j3, cw1Var.a, i3);
                j3 += (long) i3;
                cw1Var.E(0);
                for (int i4 = 0; i4 < iL; i4++) {
                    iArr[i4] = cw1Var.L();
                    iArr2[i4] = cw1Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = ri0Var.g - ((int) (j3 - ri0Var.h));
            }
            le0 le0Var = (le0) ri0Var.i;
            String str = qz1.a;
            byte[] bArr2 = le0Var.b;
            byte[] bArr3 = or2Var.a;
            int i5 = le0Var.a;
            int i6 = le0Var.c;
            int i7 = le0Var.d;
            or2Var.f = iL;
            or2Var.d = iArr;
            or2Var.e = iArr2;
            or2Var.b = bArr2;
            or2Var.a = bArr3;
            or2Var.c = i5;
            or2Var.g = i6;
            or2Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = or2Var.i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            z61 z61Var = or2Var.j;
            z61Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) z61Var.h;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) z61Var.g).setPattern(pattern);
            long j4 = ri0Var.h;
            int i8 = (int) (j3 - j4);
            ri0Var.h = j4 + ((long) i8);
            ri0Var.g -= i8;
        }
        if (!lt2Var.c(268435456)) {
            lt2Var.d(ri0Var.g);
            return d(gh0Var, ri0Var.h, lt2Var.d, ri0Var.g);
        }
        cw1Var.y(4);
        gh0 gh0VarE2 = e(gh0Var, ri0Var.h, cw1Var.a, 4);
        int iH = cw1Var.h();
        ri0Var.h += 4;
        ri0Var.g -= 4;
        lt2Var.d(iH);
        gh0 gh0VarD = d(gh0VarE2, ri0Var.h, lt2Var.d, iH);
        ri0Var.h += (long) iH;
        int i9 = ri0Var.g - iH;
        ri0Var.g = i9;
        ByteBuffer byteBuffer = lt2Var.g;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            lt2Var.g = ByteBuffer.allocate(i9);
        } else {
            lt2Var.g.clear();
        }
        return d(gh0VarD, ri0Var.h, lt2Var.g, ri0Var.g);
    }

    public static gh0 d(gh0 gh0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= gh0Var.g) {
            gh0Var = (gh0) gh0Var.i;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (gh0Var.g - j));
            eg3 eg3Var = (eg3) gh0Var.h;
            byte[] bArr = eg3Var.a;
            long j2 = j - gh0Var.f;
            eg3Var.getClass();
            byteBuffer.put(bArr, (int) j2, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == gh0Var.g) {
                gh0Var = (gh0) gh0Var.i;
            }
        }
        return gh0Var;
    }

    public static gh0 e(gh0 gh0Var, long j, byte[] bArr, int i) {
        while (j >= gh0Var.g) {
            gh0Var = (gh0) gh0Var.i;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (gh0Var.g - j));
            eg3 eg3Var = (eg3) gh0Var.h;
            byte[] bArr2 = eg3Var.a;
            long j2 = j - gh0Var.f;
            eg3Var.getClass();
            System.arraycopy(bArr2, (int) j2, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == gh0Var.g) {
                gh0Var = (gh0) gh0Var.i;
            }
        }
        return gh0Var;
    }

    public final void a(long j) {
        gh0 gh0Var;
        if (j != -1) {
            while (true) {
                gh0Var = this.c;
                if (j < gh0Var.g) {
                    break;
                }
                this.a.m((eg3) gh0Var.h);
                gh0 gh0Var2 = this.c;
                gh0Var2.h = null;
                gh0 gh0Var3 = (gh0) gh0Var2.i;
                gh0Var2.i = null;
                this.c = gh0Var3;
            }
            if (this.d.f < gh0Var.f) {
                this.d = gh0Var;
            }
        }
    }

    public final int b(int i) {
        gh0 gh0Var = this.e;
        if (((eg3) gh0Var.h) == null) {
            eg3 eg3VarMo8a = this.a.mo8a();
            gh0 gh0Var2 = new gh0(this.e.g);
            gh0Var.h = eg3VarMo8a;
            gh0Var.i = gh0Var2;
        }
        return Math.min(i, (int) (this.e.g - this.f));
    }
}
