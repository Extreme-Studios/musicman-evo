package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class td0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final vg2 k;
    public final am0 l;

    public td0(int i, byte[] bArr) {
        oe0 oe0Var = new oe0(bArr.length, bArr);
        oe0Var.l(i * 8);
        this.a = oe0Var.r(16);
        this.b = oe0Var.r(16);
        this.c = oe0Var.r(24);
        this.d = oe0Var.r(24);
        int iR = oe0Var.r(20);
        this.e = iR;
        this.f = c(iR);
        this.g = oe0Var.r(3) + 1;
        int iR2 = oe0Var.r(5) + 1;
        this.h = iR2;
        this.i = d(iR2);
        this.j = oe0Var.t(36);
        this.k = null;
        this.l = null;
    }

    public static int c(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final de3 b(byte[] bArr, am0 am0Var) {
        bArr[4] = -128;
        am0 am0Var2 = this.l;
        if (am0Var2 != null) {
            am0Var = am0Var2.b(am0Var);
        }
        uc3 uc3Var = new uc3();
        uc3Var.e("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        uc3Var.m = i;
        uc3Var.D = this.g;
        uc3Var.E = this.e;
        uc3Var.F = qz1.y(this.h, ByteOrder.LITTLE_ENDIAN);
        uc3Var.o = Collections.singletonList(bArr);
        uc3Var.j = am0Var;
        return new de3(uc3Var);
    }

    public td0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, vg2 vg2Var, am0 am0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = c(i5);
        this.g = i6;
        this.h = i7;
        this.i = d(i7);
        this.j = j;
        this.k = vg2Var;
        this.l = am0Var;
    }
}
