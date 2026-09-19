package defpackage;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class hk0 implements jk0 {
    public final cw1 a;
    public final String c;
    public final int d;
    public String f;
    public me0 g;
    public int i;
    public int j;
    public long k;
    public de3 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public hk0(String str, int i, int i2) {
        this.a = new cw1(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) throws no0 {
        long jT;
        int i;
        int i2;
        int i3;
        int i4;
        int iR;
        int iR2;
        long jT2;
        int i5;
        int i6;
        byte b;
        int i7;
        byte b2;
        this.g.getClass();
        while (cw1Var.B() > 0) {
            int i8 = this.h;
            cw1 cw1Var2 = this.a;
            if (i8 == 0) {
                while (cw1Var.B() > 0) {
                    int i9 = this.j << 8;
                    this.j = i9;
                    int iK = i9 | cw1Var.K();
                    this.j = iK;
                    int iU = w40.U(iK);
                    this.n = iU;
                    if (iU != 0) {
                        byte[] bArr = cw1Var2.a;
                        int i10 = this.j;
                        bArr[0] = (byte) ((i10 >> 24) & 255);
                        bArr[1] = (byte) ((i10 >> 16) & 255);
                        bArr[2] = (byte) ((i10 >> 8) & 255);
                        bArr[3] = (byte) (i10 & 255);
                        this.i = 4;
                        this.j = 0;
                        if (iU != 3 && iU != 4) {
                            if (iU == 1) {
                                this.h = 1;
                                break;
                            } else {
                                this.h = 2;
                                break;
                            }
                        }
                        this.h = 4;
                        break;
                    }
                }
            } else if (i8 != 1) {
                if (i8 != 2) {
                    int iR3 = -2147483647;
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                int iMin = Math.min(cw1Var.B(), this.m - this.i);
                                this.g.a(cw1Var, iMin, 0);
                                int i11 = this.i + iMin;
                                this.i = i11;
                                if (i11 == this.m) {
                                    hn.M(this.q != -9223372036854775807L);
                                    this.g.c(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                                    this.q += this.k;
                                    this.h = 0;
                                }
                            } else if (f(cw1Var, cw1Var2.a, this.p)) {
                                byte[] bArr2 = cw1Var2.a;
                                oe0 oe0VarI0 = w40.I0(bArr2);
                                int iR4 = oe0VarI0.r(32);
                                int iE0 = w40.E0(oe0VarI0, w40.m);
                                int i12 = iE0 + 1;
                                char c = iR4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c == 0) {
                                    jT = -9223372036854775807L;
                                } else {
                                    if (!oe0VarI0.q()) {
                                        throw no0.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i13 = iE0 - 1;
                                    int i14 = bArr2[i13] << 8;
                                    int i15 = bArr2[iE0] & 255;
                                    String str = qz1.a;
                                    char c2 = 65535;
                                    for (int i16 = 0; i16 < i13; i16++) {
                                        byte b3 = bArr2[i16];
                                        int[] iArr = qz1.h;
                                        char c3 = (char) (iArr[((c2 >> '\f') ^ ((b3 & 255) >> 4)) & 255] ^ ((char) (c2 << 4)));
                                        c2 = (char) (((char) (c3 << 4)) ^ iArr[((b3 & 15) ^ (c3 >> '\f')) & 255]);
                                    }
                                    if ((((char) i14) | i15) != c2) {
                                        throw no0.a(null, "CRC check failed");
                                    }
                                    int iR5 = oe0VarI0.r(2);
                                    if (iR5 != 0) {
                                        if (iR5 == 1) {
                                            i2 = 480;
                                        } else {
                                            if (iR5 != 2) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(iR5).length() + 51);
                                                sb.append("Unsupported base duration index in DTS UHD header: ");
                                                sb.append(iR5);
                                                throw no0.a(null, sb.toString());
                                            }
                                            i2 = 384;
                                        }
                                        i = 3;
                                    } else {
                                        i = 3;
                                        i2 = 512;
                                    }
                                    int iR6 = oe0VarI0.r(i) + 1;
                                    int iR7 = oe0VarI0.r(2);
                                    if (iR7 == 0) {
                                        i3 = 32000;
                                    } else if (iR7 == 1) {
                                        i3 = 44100;
                                    } else {
                                        if (iR7 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iR7).length() + 48);
                                            sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb2.append(iR7);
                                            throw no0.a(null, sb2.toString());
                                        }
                                        i3 = 48000;
                                    }
                                    if (oe0VarI0.q()) {
                                        oe0VarI0.o(36);
                                    }
                                    iR3 = i3 * (1 << oe0VarI0.r(2));
                                    jT = qz1.t(i2 * iR6, 1000000L, i3, RoundingMode.DOWN);
                                }
                                int iE1 = 0;
                                for (char c4 = 0; c4 < c; c4 = 1) {
                                    iE1 += w40.E0(oe0VarI0, w40.n);
                                }
                                for (int i17 = 0; i17 <= 0; i17++) {
                                    AtomicInteger atomicInteger = this.b;
                                    if (c != 0) {
                                        atomicInteger.set(w40.E0(oe0VarI0, w40.o));
                                    }
                                    iE1 += atomicInteger.get() != 0 ? w40.E0(oe0VarI0, w40.p) : 0;
                                }
                                int i18 = i12 + iE1;
                                long j = jT;
                                tc0 tc0Var = new tc0("audio/vnd.dts.uhd;profile=p2", 2, iR3, i18, j);
                                if (this.n == 3) {
                                    g(tc0Var);
                                }
                                this.m = i18;
                                if (j == -9223372036854775807L) {
                                    j = 0;
                                }
                                this.k = j;
                                cw1Var2.E(0);
                                this.g.a(cw1Var2, this.p, 0);
                                this.h = 6;
                            } else {
                                continue;
                            }
                        } else if (f(cw1Var, cw1Var2.a, 6)) {
                            oe0 oe0VarI1 = w40.I0(cw1Var2.a);
                            oe0VarI1.o(32);
                            int iE2 = w40.E0(oe0VarI1, w40.q) + 1;
                            this.p = iE2;
                            int i19 = this.i;
                            if (i19 > iE2) {
                                int i20 = i19 - iE2;
                                this.i = i19 - i20;
                                cw1Var.E(cw1Var.b - i20);
                            }
                            this.h = 5;
                        }
                    } else if (f(cw1Var, cw1Var2.a, this.o)) {
                        oe0 oe0VarI2 = w40.I0(cw1Var2.a);
                        oe0VarI2.o(40);
                        int iR8 = oe0VarI2.r(2);
                        boolean zQ = oe0VarI2.q();
                        int i21 = true != zQ ? 16 : 20;
                        oe0VarI2.o(true != zQ ? 8 : 12);
                        int iR9 = oe0VarI2.r(i21) + 1;
                        boolean zQ2 = oe0VarI2.q();
                        if (zQ2) {
                            iR = oe0VarI2.r(2);
                            int iR10 = oe0VarI2.r(3) + 1;
                            if (oe0VarI2.q()) {
                                oe0VarI2.o(36);
                            }
                            int iR11 = oe0VarI2.r(3) + 1;
                            int iR12 = oe0VarI2.r(3) + 1;
                            if (iR11 != 1 || iR12 != 1) {
                                throw no0.b("Multiple audio presentations or assets not supported");
                            }
                            int i22 = iR8 + 1;
                            int iR13 = oe0VarI2.r(i22);
                            for (int i23 = 0; i23 < i22; i23++) {
                                if (((iR13 >> i23) & 1) == 1) {
                                    oe0VarI2.o(8);
                                }
                            }
                            i4 = iR10 * 512;
                            if (oe0VarI2.q()) {
                                oe0VarI2.o(2);
                                int iR14 = (oe0VarI2.r(2) + 1) << 2;
                                int iR15 = oe0VarI2.r(2) + 1;
                                for (int i24 = 0; i24 < iR15; i24++) {
                                    oe0VarI2.o(iR14);
                                }
                            }
                        } else {
                            i4 = 0;
                            iR = -1;
                        }
                        oe0VarI2.o(i21);
                        oe0VarI2.o(12);
                        if (zQ2) {
                            if (oe0VarI2.q()) {
                                oe0VarI2.o(4);
                            }
                            if (oe0VarI2.q()) {
                                oe0VarI2.o(24);
                            }
                            if (oe0VarI2.q()) {
                                oe0VarI2.x(oe0VarI2.r(10) + 1);
                            }
                            oe0VarI2.o(5);
                            iR3 = w40.l[oe0VarI2.r(4)];
                            iR2 = oe0VarI2.r(8) + 1;
                        } else {
                            iR2 = -1;
                        }
                        int i25 = iR3;
                        if (zQ2) {
                            if (iR == 0) {
                                i5 = 32000;
                            } else if (iR == 1) {
                                i5 = 44100;
                            } else {
                                if (iR != 2) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iR).length() + 51);
                                    sb3.append("Unsupported reference clock code in DTS HD header: ");
                                    sb3.append(iR);
                                    throw no0.a(null, sb3.toString());
                                }
                                i5 = 48000;
                            }
                            jT2 = qz1.t(i4, 1000000L, i5, RoundingMode.DOWN);
                        } else {
                            jT2 = -9223372036854775807L;
                        }
                        g(new tc0("audio/vnd.dts.hd;profile=lbr", iR2, i25, iR9, jT2));
                        this.m = iR9;
                        this.k = jT2 == -9223372036854775807L ? 0L : jT2;
                        cw1Var2.E(0);
                        this.g.a(cw1Var2, this.o, 0);
                        this.h = 6;
                    } else {
                        continue;
                    }
                } else if (f(cw1Var, cw1Var2.a, 7)) {
                    oe0 oe0VarI3 = w40.I0(cw1Var2.a);
                    oe0VarI3.o(42);
                    this.o = oe0VarI3.r(true == oe0VarI3.q() ? 12 : 8) + 1;
                    this.h = 3;
                }
            } else if (f(cw1Var, cw1Var2.a, 18)) {
                byte[] bArr3 = cw1Var2.a;
                if (this.l == null) {
                    String str2 = this.f;
                    oe0 oe0VarI4 = w40.I0(bArr3);
                    oe0VarI4.o(60);
                    int i26 = w40.i[oe0VarI4.r(6)];
                    int i27 = w40.j[oe0VarI4.r(4)];
                    int iR16 = oe0VarI4.r(5);
                    int i28 = iR16 >= 29 ? -1 : (w40.k[iR16] * 1000) / 2;
                    oe0VarI4.o(10);
                    int i29 = i26 + (oe0VarI4.r(2) > 0 ? 1 : 0);
                    uc3 uc3Var = new uc3();
                    uc3Var.a = str2;
                    uc3Var.d("video/mp2t");
                    uc3Var.e("audio/vnd.dts");
                    uc3Var.g = i28;
                    uc3Var.D = i29;
                    uc3Var.E = i27;
                    uc3Var.p = null;
                    uc3Var.d = this.c;
                    uc3Var.f = this.d;
                    de3 de3Var = new de3(uc3Var);
                    this.l = de3Var;
                    this.g.d(de3Var);
                }
                this.m = w40.n0(bArr3);
                byte b4 = bArr3[0];
                if (b4 != -2) {
                    if (b4 == -1) {
                        i6 = (bArr3[4] & 7) << 4;
                        b2 = bArr3[7];
                    } else if (b4 != 31) {
                        i6 = (bArr3[4] & 1) << 6;
                        b = bArr3[5];
                    } else {
                        i6 = (bArr3[5] & 7) << 4;
                        b2 = bArr3[6];
                    }
                    i7 = b2 & 60;
                    this.k = w40.V(qz1.s(this.l.F, (((i7 >> 2) | i6) + 1) * 32));
                    cw1Var2.E(0);
                    this.g.a(cw1Var2, 18, 0);
                    this.h = 6;
                } else {
                    i6 = (bArr3[5] & 1) << 6;
                    b = bArr3[4];
                }
                i7 = b & 252;
                this.k = w40.V(qz1.s(this.l.F, (((i7 >> 2) | i6) + 1) * 32));
                cw1Var2.E(0);
                this.g.a(cw1Var2, 18, 0);
                this.h = 6;
            }
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.f = ml0Var.e;
        ml0Var.b();
        this.g = pd0Var.z(ml0Var.d, 1);
    }

    public final boolean f(cw1 cw1Var, byte[] bArr, int i) {
        int iMin = Math.min(cw1Var.B(), i - this.i);
        cw1Var.H(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    public final void g(tc0 tc0Var) {
        int i;
        int i2 = tc0Var.b;
        String str = tc0Var.a;
        if (i2 == -2147483647 || (i = tc0Var.c) == -1) {
            return;
        }
        de3 de3Var = this.l;
        if (de3Var != null && i == de3Var.E && i2 == de3Var.F && str.equals(de3Var.m)) {
            return;
        }
        de3 de3Var2 = this.l;
        uc3 uc3Var = de3Var2 == null ? new uc3() : new uc3(de3Var2);
        uc3Var.a = this.f;
        uc3Var.d(this.e);
        uc3Var.e(str);
        uc3Var.D = i;
        uc3Var.E = i2;
        uc3Var.d = this.c;
        uc3Var.f = this.d;
        de3 de3Var3 = new de3(uc3Var);
        this.l = de3Var3;
        this.g.d(de3Var3);
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
    }
}
