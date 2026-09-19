package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements pl0 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final pd0 a;
    public final me0 b;
    public final ih0 c;
    public final int d;
    public final byte[] e;
    public final cw1 f;
    public final int g;
    public final de3 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public ol0(pd0 pd0Var, me0 me0Var, ih0 ih0Var) throws no0 {
        this.a = pd0Var;
        this.b = me0Var;
        this.c = ih0Var;
        int i = ih0Var.g;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        cw1 cw1Var = new cw1((byte[]) ih0Var.j);
        cw1Var.M();
        int iM = cw1Var.M();
        this.d = iM;
        int i2 = ih0Var.f;
        int i3 = ih0Var.h;
        int i4 = (((i3 - (i2 * 4)) * 8) / (ih0Var.i * i2)) + 1;
        if (iM != i4) {
            throw no0.a(null, ec.l(new StringBuilder(String.valueOf(i4).length() + 34 + String.valueOf(iM).length()), "Expected frames per block: ", i4, "; got: ", iM));
        }
        String str = qz1.a;
        int i5 = ((iMax + iM) - 1) / iM;
        this.e = new byte[i5 * i3];
        this.f = new cw1((iM + iM) * i2 * i5);
        int i6 = ((i3 * i) * 8) / iM;
        uc3 uc3Var = new uc3();
        uc3Var.e("audio/raw");
        uc3Var.g = i6;
        uc3Var.h = i6;
        uc3Var.m = (iMax + iMax) * i2;
        uc3Var.D = i2;
        uc3Var.E = i;
        uc3Var.F = 2;
        this.h = new de3(uc3Var);
    }

    @Override // defpackage.pl0
    public final void a(int i, long j) {
        this.a.v(new tl0(this.c, this.d, i, j));
        this.b.d(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010d A[EDGE_INSN: B:47:0x010d->B:35:0x010d BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0105], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.pl0
    public final boolean b(od0 od0Var, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        cw1 cw1Var;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        int iMin;
        int[] iArr;
        int i10;
        int iMax;
        int i11;
        int i12;
        byte b;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iD;
        int i18 = this.k;
        ih0 ih0Var = this.c;
        int i19 = ih0Var.f;
        int i20 = i18 / (i19 + i19);
        int i21 = this.g;
        String str = qz1.a;
        int i22 = this.d;
        int i23 = ih0Var.h;
        int i24 = ((((i21 - i20) + i22) - 1) / i22) * i23;
        boolean z = j == 0;
        while (true) {
            bArr = this.e;
            if (z && (i17 = this.i) < i24) {
                iD = od0Var.d(bArr, this.i, (int) Math.min(i24 - i17, j));
                if (iD == -1) {
                    break;
                }
                this.i += iD;
                bArr = this.e;
                if (z) {
                }
            }
            i = this.i / i23;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    cw1Var = this.f;
                    if (i3 < i) {
                        break;
                    }
                    i6 = 0;
                    while (true) {
                        i7 = ih0Var.f;
                        if (i6 < i7) {
                            bArr2 = cw1Var.a;
                            i8 = (i23 / i7) - 4;
                            i9 = (i6 * 4) + (i3 * i23);
                            int i25 = bArr[i9 + 1] & 255;
                            int i26 = bArr[i9] & 255;
                            int i27 = i;
                            iMin = Math.min(bArr[i9 + 2] & 255, 88);
                            iArr = n;
                            i10 = iArr[iMin];
                            int i28 = (i3 * i22 * i7) + i6;
                            iMax = (short) (i26 | (i25 << 8));
                            i11 = i28 + i28;
                            bArr2[i11] = (byte) (iMax & 255);
                            bArr2[i11 + 1] = (byte) (iMax >> 8);
                            i12 = 0;
                            while (i12 < i8 + i8) {
                                b = bArr[((i12 / 8) * i7 * 4) + (i7 * 4) + i9 + ((i12 / 2) % 4)];
                                i13 = i12;
                                i14 = b & 255;
                                if (i13 % 2 == 0) {
                                    i15 = b & 15;
                                } else {
                                    i15 = i14 >> 4;
                                }
                                int i29 = i15 & 7;
                                i16 = (((i29 + i29) + 1) * i10) >> 3;
                                if ((i15 & 8) != 0) {
                                    i16 = -i16;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i16, 32767));
                                i11 = i7 + i7 + i11;
                                bArr2[i11] = (byte) (iMax & 255);
                                bArr2[i11 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + m[i15], 88));
                                i10 = iArr[iMin];
                                i12 = i13 + 1;
                            }
                            i6++;
                            i = i27;
                        }
                    }
                    i3++;
                }
                int i30 = i;
                int i31 = i22 * i30;
                int i32 = (i31 + i31) * ih0Var.f;
                cw1Var.E(0);
                cw1Var.C(i32);
                this.i -= i30 * i23;
                int i33 = cw1Var.c;
                this.b.a(cw1Var, i33, 0);
                i4 = this.k + i33;
                this.k = i4;
                i5 = ih0Var.f;
                if (i4 / (i5 + i5) >= i21) {
                    c(i21);
                }
            }
            if (z) {
                int i34 = this.k;
                int i35 = ih0Var.f;
                i2 = i34 / (i35 + i35);
                if (i2 > 0) {
                    c(i2);
                }
            }
            return z;
        }
        while (true) {
            bArr = this.e;
            if (z) {
            }
            i = this.i / i23;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    cw1Var = this.f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i6 = 0;
                    while (true) {
                        i7 = ih0Var.f;
                        if (i6 < i7) {
                            bArr2 = cw1Var.a;
                            i8 = (i23 / i7) - 4;
                            i9 = (i6 * 4) + (i3 * i23);
                            int i210 = bArr[i9 + 1] & 255;
                            int i211 = bArr[i9] & 255;
                            int i212 = i;
                            iMin = Math.min(bArr[i9 + 2] & 255, 88);
                            iArr = n;
                            i10 = iArr[iMin];
                            int i213 = (i3 * i22 * i7) + i6;
                            iMax = (short) (i211 | (i210 << 8));
                            i11 = i213 + i213;
                            bArr2[i11] = (byte) (iMax & 255);
                            bArr2[i11 + 1] = (byte) (iMax >> 8);
                            i12 = 0;
                            while (i12 < i8 + i8) {
                                b = bArr[((i12 / 8) * i7 * 4) + (i7 * 4) + i9 + ((i12 / 2) % 4)];
                                i13 = i12;
                                i14 = b & 255;
                                if (i13 % 2 == 0) {
                                    i15 = b & 15;
                                } else {
                                    i15 = i14 >> 4;
                                }
                                int i214 = i15 & 7;
                                i16 = (((i214 + i214) + 1) * i10) >> 3;
                                if ((i15 & 8) != 0) {
                                    i16 = -i16;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i16, 32767));
                                i11 = i7 + i7 + i11;
                                bArr2[i11] = (byte) (iMax & 255);
                                bArr2[i11 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + m[i15], 88));
                                i10 = iArr[iMin];
                                i12 = i13 + 1;
                            }
                            i6++;
                            i = i212;
                        }
                    }
                    i3++;
                }
                int i36 = i;
                int i37 = i22 * i36;
                int i38 = (i37 + i37) * ih0Var.f;
                cw1Var.E(0);
                cw1Var.C(i38);
                this.i -= i36 * i23;
                int i39 = cw1Var.c;
                this.b.a(cw1Var, i39, 0);
                i4 = this.k + i39;
                this.k = i4;
                i5 = ih0Var.f;
                if (i4 / (i5 + i5) >= i21) {
                    c(i21);
                }
            }
            if (z) {
                int i310 = this.k;
                int i311 = ih0Var.f;
                i2 = i310 / (i311 + i311);
                if (i2 > 0) {
                    c(i2);
                }
            }
            return z;
            this.i += iD;
        }
    }

    public final void c(int i) {
        ih0 ih0Var = this.c;
        long jT = this.j + qz1.t(this.l, 1000000L, ih0Var.g, RoundingMode.DOWN);
        int i2 = (i + i) * ih0Var.f;
        this.b.c(jT, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }

    @Override // defpackage.pl0
    public final void f(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }
}
