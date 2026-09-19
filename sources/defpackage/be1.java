package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class be1 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public be1(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void f(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i7])) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final short[] a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final void b(short[] sArr, int i, int i2) {
        short[] sArrA = a(this.l, this.m, i2);
        this.l = sArrA;
        int i3 = this.m;
        int i4 = this.b;
        System.arraycopy(sArr, i * i4, sArrA, i3 * i4, i2 * i4);
        this.m += i2;
    }

    public final void c(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i3 * i4) + (i7 * i) + i5];
                    i5++;
                }
            }
            this.i[i4] = (short) (i6 / i3);
        }
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.b * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.u = i4 / i6;
        this.v = i7 / i5;
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    public final void e() {
        int i;
        float f;
        double d;
        int iD;
        int i2;
        int i3;
        int i4;
        double d2;
        short[] sArr;
        double d3;
        double d4;
        int i5;
        int iRound;
        double d5;
        int iRound2;
        float f2;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        float f3 = this.c;
        float f4 = this.d;
        double d6 = f3 / f4;
        int i9 = this.m;
        int i10 = this.a;
        int i11 = this.b;
        int i12 = 0;
        int i13 = 1;
        if (d6 > 1.0000100135803223d || d6 < 0.9999899864196777d) {
            int i14 = this.k;
            int i15 = this.h;
            if (i14 >= i15) {
                int i16 = 0;
                while (true) {
                    int i17 = this.r;
                    if (i17 > 0) {
                        int iMin = Math.min(i15, i17);
                        b(this.j, i16, iMin);
                        this.r -= iMin;
                        i16 += iMin;
                        f = f4;
                        d = d6;
                    } else {
                        short[] sArr2 = this.j;
                        int i18 = i10 > 4000 ? i10 / 4000 : i13;
                        int i19 = this.g;
                        int i20 = this.f;
                        if (i11 == i13) {
                            if (i18 == i13) {
                                iD = d(sArr2, i16, i20, i19);
                                f = f4;
                                d = d6;
                            } else {
                                i = i13;
                            }
                            i = i13;
                            i2 = this.u;
                            int i21 = this.v;
                            if (i2 != 0 || (i3 = this.s) == 0 || i21 > i2 * 3 || i2 + i2 <= this.t * 3) {
                                i3 = iD;
                            }
                            i4 = i16 + i3;
                            this.t = i2;
                            this.s = iD;
                            d2 = i3;
                            sArr = this.j;
                            d3 = this.w;
                            if (d > 1.0d) {
                                d5 = d - 1.0d;
                                if (d >= 2.0d) {
                                    double d7 = (d2 / d5) + d3;
                                    iRound2 = (int) Math.round(d7);
                                    this.w = d7 - ((double) iRound2);
                                } else {
                                    double d8 = (((2.0d - d) * d2) / d5) + d3;
                                    int iRound3 = (int) Math.round(d8);
                                    this.r = iRound3;
                                    this.w = d8 - ((double) iRound3);
                                    iRound2 = i3;
                                }
                                short[] sArrA = a(this.l, this.m, iRound2);
                                this.l = sArrA;
                                int i22 = i16;
                                int i23 = iRound2;
                                f(i23, i, sArrA, this.m, sArr, i22, sArr, i4);
                                this.m += i23;
                                i16 = i3 + i23 + i22;
                            } else {
                                int i24 = i16;
                                int i25 = i;
                                d4 = 1.0d - d;
                                if (d < 0.5d) {
                                    double d9 = ((d2 * d) / d4) + d3;
                                    iRound = (int) Math.round(d9);
                                    i5 = i3;
                                    this.w = d9 - ((double) iRound);
                                } else {
                                    i5 = i3;
                                    double d10 = ((((d + d) - 1.0d) * d2) / d4) + d3;
                                    int iRound4 = (int) Math.round(d10);
                                    this.r = iRound4;
                                    this.w = d10 - ((double) iRound4);
                                    iRound = i5;
                                }
                                int i26 = i5 + iRound;
                                short[] sArrA2 = a(this.l, this.m, i26);
                                this.l = sArrA2;
                                System.arraycopy(sArr, i24 * i25, sArrA2, this.m * i25, i5 * i25);
                                int i27 = iRound;
                                f(i27, i25, this.l, this.m + i5, sArr, i4, sArr, i24);
                                this.m += i26;
                                i16 = i24 + i27;
                            }
                        } else {
                            i = i11;
                        }
                        c(sArr2, i16, i18);
                        f = f4;
                        d = d6;
                        short[] sArr3 = this.i;
                        int iD2 = d(sArr3, i12, i20 / i18, i19 / i18);
                        if (i18 != 1) {
                            int i28 = iD2 * i18;
                            int i29 = i18 * 4;
                            int i30 = i28 - i29;
                            if (i30 >= i20) {
                                i20 = i30;
                            }
                            int i31 = i28 + i29;
                            if (i31 <= i19) {
                                i19 = i31;
                            }
                            i13 = i;
                            if (i13 == 1) {
                                iD = d(sArr2, i16, i20, i19);
                            } else {
                                c(sArr2, i16, 1);
                                iD = d(sArr3, i12, i20, i19);
                            }
                            i = i13;
                        } else {
                            iD = iD2;
                        }
                        i2 = this.u;
                        int i210 = this.v;
                        if (i2 != 0) {
                            i3 = iD;
                        } else {
                            i3 = iD;
                        }
                        i4 = i16 + i3;
                        this.t = i2;
                        this.s = iD;
                        d2 = i3;
                        sArr = this.j;
                        d3 = this.w;
                        if (d > 1.0d) {
                            d5 = d - 1.0d;
                            if (d >= 2.0d) {
                                double d11 = (d2 / d5) + d3;
                                iRound2 = (int) Math.round(d11);
                                this.w = d11 - ((double) iRound2);
                            } else {
                                double d12 = (((2.0d - d) * d2) / d5) + d3;
                                int iRound5 = (int) Math.round(d12);
                                this.r = iRound5;
                                this.w = d12 - ((double) iRound5);
                                iRound2 = i3;
                            }
                            short[] sArrA3 = a(this.l, this.m, iRound2);
                            this.l = sArrA3;
                            int i211 = i16;
                            int i212 = iRound2;
                            f(i212, i, sArrA3, this.m, sArr, i211, sArr, i4);
                            this.m += i212;
                            i16 = i3 + i212 + i211;
                        } else {
                            int i213 = i16;
                            int i214 = i;
                            d4 = 1.0d - d;
                            if (d < 0.5d) {
                                double d13 = ((d2 * d) / d4) + d3;
                                iRound = (int) Math.round(d13);
                                i5 = i3;
                                this.w = d13 - ((double) iRound);
                            } else {
                                i5 = i3;
                                double d14 = ((((d + d) - 1.0d) * d2) / d4) + d3;
                                int iRound6 = (int) Math.round(d14);
                                this.r = iRound6;
                                this.w = d14 - ((double) iRound6);
                                iRound = i5;
                            }
                            int i215 = i5 + iRound;
                            short[] sArrA4 = a(this.l, this.m, i215);
                            this.l = sArrA4;
                            System.arraycopy(sArr, i213 * i214, sArrA4, this.m * i214, i5 * i214);
                            int i216 = iRound;
                            f(i216, i214, this.l, this.m + i5, sArr, i4, sArr, i213);
                            this.m += i215;
                            i16 = i213 + i216;
                        }
                    }
                    if (i16 + i15 > i14) {
                        break;
                    }
                    i13 = 1;
                    f4 = f;
                    d6 = d;
                    i12 = 0;
                }
                int i32 = this.k - i16;
                short[] sArr4 = this.j;
                System.arraycopy(sArr4, i16 * i11, sArr4, 0, i32 * i11);
                this.k = i32;
            }
            f2 = this.e * f;
            if (f2 != 1.0f || this.m == i9) {
            }
            long j3 = i10;
            long j4 = (long) (i10 / f2);
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i33 = this.m - i9;
            short[] sArrA5 = a(this.n, this.o, i33);
            this.n = sArrA5;
            System.arraycopy(this.l, i9 * i11, sArrA5, this.o * i11, i33 * i11);
            this.m = i9;
            this.o += i33;
            int i34 = 0;
            while (true) {
                i6 = this.o;
                i7 = i6 - 1;
                if (i34 >= i7) {
                    break;
                }
                while (true) {
                    i8 = this.p + 1;
                    j = i8;
                    long j5 = j * j4;
                    j2 = this.q;
                    if (j5 <= j2 * j3) {
                        break;
                    }
                    this.l = a(this.l, this.m, 1);
                    int i35 = 0;
                    while (i35 < i11) {
                        short[] sArr5 = this.l;
                        int i36 = this.m * i11;
                        short[] sArr6 = this.n;
                        int i37 = (i34 * i11) + i35;
                        short s = sArr6[i37];
                        short s2 = sArr6[i37 + i11];
                        long j6 = ((long) this.q) * j3;
                        int i38 = this.p;
                        long j7 = j4;
                        long j8 = ((long) (i38 + 1)) * j7;
                        long j9 = j8 - (((long) i38) * j7);
                        long j10 = j8 - j6;
                        sArr5[i36 + i35] = (short) ((((j9 - j10) * ((long) s2)) + (j10 * ((long) s))) / j9);
                        i35++;
                        j4 = j7;
                    }
                    this.q++;
                    this.m++;
                    j4 = j4;
                }
                long j11 = j4;
                this.p = i8;
                if (j == j3) {
                    this.p = 0;
                    hn.M(j2 == j11);
                    this.q = 0;
                }
                i34++;
                j4 = j11;
            }
            if (i7 != 0) {
                short[] sArr7 = this.n;
                System.arraycopy(sArr7, i7 * i11, sArr7, 0, (i6 - i7) * i11);
                this.o -= i7;
                return;
            }
            return;
        }
        b(this.j, 0, this.k);
        this.k = 0;
        f = f4;
        f2 = this.e * f;
        if (f2 != 1.0f) {
        }
    }
}
