package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements jk0 {
    public final /* synthetic */ int a;
    public final oe0 b;
    public final cw1 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public me0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public de3 m;
    public int n;
    public long o;

    public dk0(int i, int i2, String str, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                oe0 oe0Var = new oe0(16, new byte[16]);
                this.b = oe0Var;
                this.c = new cw1(oe0Var.a);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                oe0 oe0Var2 = new oe0(128, new byte[128]);
                this.b = oe0Var2;
                this.c = new cw1(oe0Var2.a);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    @Override // defpackage.jk0
    public final void a() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0355  */
    /* JADX WARN: Code duplicated, block: B:178:0x0363  */
    /* JADX WARN: Code duplicated, block: B:180:0x036b  */
    /* JADX WARN: Code duplicated, block: B:187:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0381  */
    /* JADX WARN: Code duplicated, block: B:190:0x0388  */
    /* JADX WARN: Code duplicated, block: B:193:0x038c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0392  */
    /* JADX WARN: Code duplicated, block: B:197:0x0398  */
    /* JADX WARN: Code duplicated, block: B:198:0x039b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        int i;
        int iL;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int iR;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j;
        cw1Var = cw1Var;
        int i20 = this.a;
        int i21 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        oe0 oe0Var = this.b;
        long j2 = -9223372036854775807L;
        int i22 = 0;
        int i23 = 1;
        int i24 = 2;
        int i25 = 16;
        cw1 cw1Var2 = this.c;
        switch (i20) {
            case 0:
                this.h.getClass();
                while (cw1Var.B() > 0) {
                    int i26 = this.i;
                    if (i26 == 0) {
                        while (true) {
                            if (cw1Var.B() <= 0) {
                                i22 = 0;
                                i23 = 1;
                                i24 = 2;
                            } else if (this.k) {
                                int iK = cw1Var.K();
                                if (iK == 119) {
                                    i22 = 0;
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = cw1Var2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    i24 = 2;
                                    i23 = 1;
                                } else {
                                    this.k = iK == 11;
                                }
                            } else {
                                this.k = cw1Var.K() == 11;
                            }
                        }
                    } else if (i26 != i23) {
                        int iMin = Math.min(cw1Var.B(), this.n - this.j);
                        this.h.a(cw1Var, iMin, i22);
                        int i27 = this.j + iMin;
                        this.j = i27;
                        if (i27 == this.n) {
                            hn.M(this.o != -9223372036854775807L ? i23 : i22);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i22;
                        }
                    } else {
                        byte[] bArr2 = cw1Var2.a;
                        int iMin2 = Math.min(cw1Var.B(), 128 - this.j);
                        cw1Var.H(bArr2, this.j, iMin2);
                        int i28 = this.j + iMin2;
                        this.j = i28;
                        if (i28 == 128) {
                            oe0Var.l(i22);
                            int[] iArr = jn.f;
                            int[] iArr2 = jn.d;
                            int i29 = (oe0Var.b * 8) + oe0Var.c;
                            oe0Var.o(40);
                            int iR2 = oe0Var.r(5);
                            oe0Var.l(i29);
                            if (iR2 > 10) {
                                oe0Var.o(i25);
                                int iR3 = oe0Var.r(i24);
                                if (iR3 == 0) {
                                    i6 = 0;
                                } else if (iR3 != i23) {
                                    i6 = iR3 != i24 ? -1 : i24;
                                } else {
                                    i6 = i23;
                                }
                                oe0Var.o(3);
                                int iR4 = oe0Var.r(11) + i23;
                                int iR5 = oe0Var.r(i24);
                                if (iR5 == 3) {
                                    i5 = jn.e[oe0Var.r(i24)];
                                    iR = 3;
                                    i7 = 6;
                                } else {
                                    iR = oe0Var.r(i24);
                                    int i30 = jn.c[iR];
                                    i5 = iArr2[iR5];
                                    i7 = i30;
                                }
                                iL = iR4 + iR4;
                                int i31 = (iL * i5) / (i7 * 32);
                                int iR6 = oe0Var.r(3);
                                boolean zQ = oe0Var.q();
                                i3 = iArr[iR6] + (zQ ? 1 : 0);
                                oe0Var.o(10);
                                if (oe0Var.q()) {
                                    i8 = 8;
                                    oe0Var.o(8);
                                } else {
                                    i8 = 8;
                                }
                                if (iR6 == 0) {
                                    oe0Var.o(5);
                                    if (oe0Var.q()) {
                                        oe0Var.o(i8);
                                    }
                                    i9 = 0;
                                    i10 = 1;
                                    iR6 = 0;
                                } else {
                                    i9 = iR6;
                                    i10 = 1;
                                }
                                if (i6 == i10) {
                                    if (oe0Var.q()) {
                                        oe0Var.o(16);
                                    }
                                    i6 = 1;
                                }
                                if (oe0Var.q()) {
                                    if (i9 > 2) {
                                        oe0Var.o(2);
                                    }
                                    if ((i9 & 1) == 0 || i9 <= 2) {
                                        i16 = 6;
                                    } else {
                                        i16 = 6;
                                        oe0Var.o(6);
                                    }
                                    if ((i9 & 4) != 0) {
                                        oe0Var.o(i16);
                                    }
                                    if (zQ && oe0Var.q()) {
                                        oe0Var.o(5);
                                    }
                                    if (i6 == 0) {
                                        if (oe0Var.q()) {
                                            oe0Var.o(6);
                                        }
                                        if (i9 == 0 && oe0Var.q()) {
                                            oe0Var.o(6);
                                        }
                                        if (oe0Var.q()) {
                                            oe0Var.o(6);
                                        }
                                        int iR7 = oe0Var.r(2);
                                        if (iR7 == 1) {
                                            oe0Var.o(5);
                                        } else if (iR7 == 2) {
                                            oe0Var.o(12);
                                        } else {
                                            if (iR7 == 3) {
                                                int iR8 = oe0Var.r(5);
                                                if (oe0Var.q()) {
                                                    oe0Var.o(5);
                                                    if (oe0Var.q()) {
                                                        i18 = 4;
                                                        oe0Var.o(4);
                                                    } else {
                                                        i18 = 4;
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(i18);
                                                    }
                                                    if (oe0Var.q()) {
                                                        if (oe0Var.q()) {
                                                            oe0Var.o(i18);
                                                        }
                                                        if (oe0Var.q()) {
                                                            oe0Var.o(i18);
                                                        }
                                                    }
                                                }
                                                if (oe0Var.q()) {
                                                    oe0Var.o(5);
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(7);
                                                        if (oe0Var.q()) {
                                                            oe0Var.o(8);
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 2;
                                                        }
                                                    } else {
                                                        i17 = 2;
                                                    }
                                                } else {
                                                    i17 = 2;
                                                }
                                                oe0Var.o((iR8 + i17) * 8);
                                                oe0Var.w();
                                            }
                                            if (i9 < i17) {
                                                if (oe0Var.q()) {
                                                    oe0Var.o(14);
                                                }
                                                if (iR6 == 0 && oe0Var.q()) {
                                                    oe0Var.o(14);
                                                }
                                            }
                                            if (!oe0Var.q()) {
                                                i12 = iR;
                                            } else if (iR == 0) {
                                                oe0Var.o(5);
                                                i12 = 0;
                                            } else {
                                                for (i19 = 0; i19 < i7; i19++) {
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(5);
                                                    }
                                                }
                                                i12 = iR;
                                            }
                                            i11 = 0;
                                        }
                                        i17 = 2;
                                        if (i9 < i17) {
                                            if (oe0Var.q()) {
                                                oe0Var.o(14);
                                            }
                                            if (iR6 == 0) {
                                                oe0Var.o(14);
                                            }
                                        }
                                        if (!oe0Var.q()) {
                                            i12 = iR;
                                        } else if (iR == 0) {
                                            oe0Var.o(5);
                                            i12 = 0;
                                        } else {
                                            while (i19 < i7) {
                                                if (oe0Var.q()) {
                                                    oe0Var.o(5);
                                                }
                                            }
                                            i12 = iR;
                                        }
                                        i11 = 0;
                                    } else {
                                        i11 = i6;
                                        i12 = iR;
                                    }
                                } else {
                                    i11 = i6;
                                    i12 = iR;
                                }
                                if (oe0Var.q()) {
                                    oe0Var.o(5);
                                    if (i9 == 2) {
                                        oe0Var.o(4);
                                        i9 = 2;
                                    }
                                    if (i9 >= 6) {
                                        oe0Var.o(2);
                                    }
                                    if (oe0Var.q()) {
                                        i15 = 8;
                                        oe0Var.o(8);
                                    } else {
                                        i15 = 8;
                                    }
                                    if (i9 == 0 && oe0Var.q()) {
                                        oe0Var.o(i15);
                                    }
                                    i13 = 3;
                                    if (iR5 < 3) {
                                        oe0Var.m();
                                    }
                                } else {
                                    i13 = 3;
                                }
                                if (i11 == 0 && i12 != i13) {
                                    oe0Var.m();
                                }
                                if (i11 == 2 && (i12 == i13 || oe0Var.q())) {
                                    i14 = 6;
                                    oe0Var.o(6);
                                } else {
                                    i14 = 6;
                                }
                                str = (oe0Var.q() && oe0Var.r(i14) == 1 && oe0Var.r(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i4 = i7 * 256;
                                i = i31;
                            } else {
                                oe0Var.o(32);
                                int iR9 = oe0Var.r(2);
                                String str4 = iR9 == 3 ? null : "audio/ac3";
                                int iR10 = oe0Var.r(6);
                                i = jn.g[iR10 / 2] * 1000;
                                iL = jn.L(iR9, iR10);
                                oe0Var.o(8);
                                int iR11 = oe0Var.r(3);
                                if ((iR11 & 1) == 0 || iR11 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    oe0Var.o(2);
                                }
                                if ((iR11 & 4) != 0) {
                                    oe0Var.o(i2);
                                }
                                if (iR11 == i2) {
                                    oe0Var.o(i2);
                                }
                                int i32 = iR9 < 3 ? iArr2[iR9] : -1;
                                i3 = iArr[iR11] + (oe0Var.q() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                i5 = i32;
                            }
                            de3 de3Var = this.m;
                            if (de3Var == null || i3 != de3Var.E || i5 != de3Var.F || !Objects.equals(str, de3Var.m)) {
                                uc3 uc3Var = new uc3();
                                uc3Var.a = this.g;
                                uc3Var.d(str3);
                                uc3Var.e(str);
                                uc3Var.D = i3;
                                uc3Var.E = i5;
                                uc3Var.d = str2;
                                uc3Var.f = i21;
                                uc3Var.h = i;
                                if ("audio/ac3".equals(str)) {
                                    uc3Var.g = i;
                                }
                                de3 de3Var2 = new de3(uc3Var);
                                this.m = de3Var2;
                                this.h.d(de3Var2);
                            }
                            this.n = iL;
                            this.l = (((long) i4) * 1000000) / ((long) this.m.F);
                            cw1Var2.E(0);
                            this.h.a(cw1Var2, 128, 0);
                            this.i = 2;
                            i24 = 2;
                            i22 = 0;
                            i23 = 1;
                        } else {
                            cw1Var = cw1Var;
                        }
                    }
                    i25 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (cw1Var.B() > 0) {
                    int i33 = this.i;
                    if (i33 == 0) {
                        j = j2;
                        while (true) {
                            if (cw1Var.B() > 0) {
                                if (this.k) {
                                    int iK2 = cw1Var.K();
                                    this.k = iK2 == 172;
                                    if (iK2 != 64) {
                                        if (iK2 == 65) {
                                            iK2 = 65;
                                        }
                                    }
                                    this.i = 1;
                                    byte[] bArr3 = cw1Var2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = iK2 == 65 ? (byte) 65 : (byte) 64;
                                    this.j = 2;
                                } else {
                                    this.k = cw1Var.K() == 172;
                                }
                            }
                        }
                    } else if (i33 != 1) {
                        int iMin3 = Math.min(cw1Var.B(), this.n - this.j);
                        this.h.a(cw1Var, iMin3, 0);
                        int i34 = this.j + iMin3;
                        this.j = i34;
                        if (i34 == this.n) {
                            hn.M(this.o != j2);
                            j = j2;
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    } else {
                        j = j2;
                        byte[] bArr4 = cw1Var2.a;
                        int iMin4 = Math.min(cw1Var.B(), 16 - this.j);
                        cw1Var.H(bArr4, this.j, iMin4);
                        int i35 = this.j + iMin4;
                        this.j = i35;
                        if (i35 == 16) {
                            oe0Var.l(0);
                            eg egVarY = ar.y(oe0Var);
                            int i36 = egVarY.a;
                            de3 de3Var3 = this.m;
                            if (de3Var3 == null || de3Var3.E != 2 || i36 != de3Var3.F || !"audio/ac4".equals(de3Var3.m)) {
                                uc3 uc3Var2 = new uc3();
                                uc3Var2.a = this.g;
                                uc3Var2.d(str3);
                                uc3Var2.e("audio/ac4");
                                uc3Var2.D = 2;
                                uc3Var2.E = i36;
                                uc3Var2.d = str2;
                                uc3Var2.f = i21;
                                de3 de3Var4 = new de3(uc3Var2);
                                this.m = de3Var4;
                                this.h.d(de3Var4);
                            }
                            this.n = egVarY.b;
                            this.l = (((long) egVarY.c) * 1000000) / ((long) this.m.F);
                            cw1Var2.E(0);
                            this.h.a(cw1Var2, 16, 0);
                            this.i = 2;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        switch (this.a) {
            case 0:
                ml0Var.a();
                ml0Var.b();
                this.g = ml0Var.e;
                ml0Var.b();
                this.h = pd0Var.z(ml0Var.d, 1);
                break;
            default:
                ml0Var.a();
                ml0Var.b();
                this.g = ml0Var.e;
                ml0Var.b();
                this.h = pd0Var.z(ml0Var.d, 1);
                break;
        }
    }

    private final void f(boolean z) {
    }

    private final void g(boolean z) {
    }
}
