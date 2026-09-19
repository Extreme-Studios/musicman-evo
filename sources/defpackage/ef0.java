package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements nd0 {
    public pd0 d;
    public me0 e;
    public am0 g;
    public td0 h;
    public int i;
    public int j;
    public df0 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final cw1 b = new cw1(0, new byte[32768]);
    public final rd0 c = new rd0();
    public int f = 0;

    static {
        int i = dq.v;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        am0 am0VarL = new kc2(10).l(od0Var, zf0.g, 0);
        if (am0VarL != null) {
            int length = am0VarL.a.length;
        }
        cw1 cw1Var = new cw1(4);
        ((fd0) od0Var).B(cw1Var.a, 0, 4, false);
        return cw1Var.P() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        td0 td0Var;
        ee0 sd0Var;
        long j;
        long j2;
        boolean zF;
        int i = this.f;
        am0 am0Var = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            ((fd0) od0Var).k = 0;
            fd0 fd0Var = (fd0) od0Var;
            long jM = fd0Var.m();
            am0 am0VarL = new kc2(10).l(od0Var, null, 0);
            if (am0VarL != null && am0VarL.a.length != 0) {
                am0Var = am0VarL;
            }
            fd0Var.b((int) (fd0Var.m() - jM), false);
            this.g = am0Var;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            ((fd0) od0Var).B(bArr, 0, 42, false);
            ((fd0) od0Var).k = 0;
            this.f = 2;
            return 0;
        }
        int i3 = 3;
        int i4 = 4;
        if (i == 2) {
            cw1 cw1Var = new cw1(4);
            ((fd0) od0Var).w(cw1Var.a, 0, 4, false);
            if (cw1Var.P() != 1716281667) {
                throw no0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f = 3;
            return 0;
        }
        int i5 = 7;
        if (i != 3) {
            long j3 = 0;
            if (i == 4) {
                ((fd0) od0Var).k = 0;
                cw1 cw1Var2 = new cw1(2);
                fd0 fd0Var2 = (fd0) od0Var;
                fd0Var2.B(cw1Var2.a, 0, 2, false);
                int iL = cw1Var2.L();
                if ((iL >> 2) != 16382) {
                    fd0Var2.k = 0;
                    throw no0.a(null, "First frame does not start with sync code.");
                }
                fd0Var2.k = 0;
                this.j = iL;
                pd0 pd0Var = this.d;
                String str = qz1.a;
                long j4 = fd0Var2.i;
                long j5 = fd0Var2.h;
                td0 td0Var2 = this.h;
                td0Var2.getClass();
                vg2 vg2Var = td0Var2.k;
                if (vg2Var != null && ((long[]) vg2Var.g).length > 0) {
                    sd0Var = new sd0(td0Var2, j4, 0);
                    i2 = 0;
                } else if (j5 == -1 || td0Var2.j <= 0) {
                    i2 = 0;
                    sd0Var = new sd0(td0Var2.a(), 0L);
                } else {
                    int i6 = this.j;
                    int i7 = td0Var2.c;
                    zx zxVar = new zx(10, td0Var2);
                    cf0 cf0Var = new cf0(td0Var2, i6);
                    long jA = td0Var2.a();
                    long j6 = td0Var2.j;
                    int i8 = td0Var2.d;
                    if (i8 > 0) {
                        j = ((((long) i8) + ((long) i7)) / 2) + 1;
                    } else {
                        int i9 = td0Var2.a;
                        long j7 = 4096;
                        if (i9 == td0Var2.b && i9 > 0) {
                            j7 = i9;
                        }
                        j = (((j7 * ((long) td0Var2.g)) * ((long) td0Var2.h)) / 8) + 64;
                    }
                    df0 df0Var = new df0(zxVar, cf0Var, jA, j6, j4, j5, j, Math.max(6, i7));
                    this.k = df0Var;
                    sd0Var = df0Var.a;
                }
                pd0Var.v(sd0Var);
                this.f = 5;
                return i2;
            }
            this.e.getClass();
            td0 td0Var3 = this.h;
            td0Var3.getClass();
            df0 df0Var2 = this.k;
            if (df0Var2 != null && df0Var2.c != null) {
                return df0Var2.b(od0Var, rd0Var);
            }
            if (this.m == -1) {
                ((fd0) od0Var).k = 0;
                fd0 fd0Var3 = (fd0) od0Var;
                fd0Var3.e(1, false);
                byte[] bArr2 = new byte[1];
                fd0Var3.B(bArr2, 0, 1, false);
                int i10 = bArr2[0] & 1;
                boolean z2 = 1 == i10;
                fd0Var3.e(2, false);
                i5 = 1 != i10 ? 6 : 7;
                cw1 cw1Var3 = new cw1(i5);
                byte[] bArr3 = cw1Var3.a;
                int i11 = 0;
                while (i11 < i5) {
                    int iY = fd0Var3.y(bArr3, i11, i5 - i11);
                    if (iY == -1) {
                        break;
                    }
                    i11 += iY;
                }
                cw1Var3.C(i11);
                fd0Var3.k = 0;
                try {
                    long jO = cw1Var3.o();
                    if (!z2) {
                        jO *= (long) td0Var3.b;
                    }
                    long j8 = td0Var3.j;
                    if (j8 == 0 || jO <= j8) {
                        j3 = jO;
                    } else {
                        z = false;
                    }
                } catch (NumberFormatException unused) {
                }
                if (!z) {
                    throw no0.a(null, null);
                }
                this.m = j3;
            } else {
                cw1 cw1Var4 = this.b;
                int i12 = cw1Var4.c;
                if (i12 < 32768) {
                    int iD = ((fd0) od0Var).d(cw1Var4.a, i12, 32768 - i12);
                    z = iD == -1;
                    if (!z) {
                        cw1Var4.C(i12 + iD);
                    } else if (cw1Var4.B() == 0) {
                        long j9 = this.m * 1000000;
                        td0 td0Var4 = this.h;
                        String str2 = qz1.a;
                        this.e.c(j9 / ((long) td0Var4.e), 1, this.l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i13 = cw1Var4.b;
                int i14 = this.l;
                int i15 = this.i;
                if (i14 < i15) {
                    cw1Var4.G(Math.min(i15 - i14, cw1Var4.B()));
                }
                this.h.getClass();
                int i16 = cw1Var4.b;
                while (true) {
                    int i17 = cw1Var4.c - 16;
                    rd0 rd0Var2 = this.c;
                    if (i16 > i17) {
                        if (z) {
                            while (true) {
                                int i18 = cw1Var4.c;
                                if (i16 <= i18 - this.i) {
                                    cw1Var4.E(i16);
                                    try {
                                        zF = ss0.F(cw1Var4, this.h, this.j, rd0Var2);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        zF = false;
                                    }
                                    if (cw1Var4.b <= cw1Var4.c && zF) {
                                        cw1Var4.E(i16);
                                        j2 = rd0Var2.a;
                                        break;
                                    }
                                    i16++;
                                } else {
                                    cw1Var4.E(i18);
                                }
                            }
                        } else {
                            cw1Var4.E(i16);
                        }
                        j2 = -1;
                        break;
                    }
                    cw1Var4.E(i16);
                    if (ss0.F(cw1Var4, this.h, this.j, rd0Var2)) {
                        cw1Var4.E(i16);
                        j2 = rd0Var2.a;
                        break;
                    }
                    i16++;
                }
                int i19 = cw1Var4.b - i13;
                cw1Var4.E(i13);
                this.e.a(cw1Var4, i19, 0);
                int i20 = this.l + i19;
                this.l = i20;
                if (j2 != -1) {
                    long j10 = this.m * 1000000;
                    td0 td0Var5 = this.h;
                    String str3 = qz1.a;
                    this.e.c(j10 / ((long) td0Var5.e), 1, i20, 0, null);
                    this.l = 0;
                    this.m = j2;
                }
                int length = cw1Var4.a.length - cw1Var4.c;
                if (cw1Var4.B() < 16 && length < 16) {
                    int iB = cw1Var4.B();
                    byte[] bArr4 = cw1Var4.a;
                    System.arraycopy(bArr4, cw1Var4.b, bArr4, 0, iB);
                    cw1Var4.E(0);
                    cw1Var4.C(iB);
                }
            }
            return 0;
        }
        ?? r15 = 0;
        td0 td0Var6 = this.h;
        while (true) {
            ((fd0) od0Var).k = r15;
            byte[] bArr5 = new byte[i4];
            oe0 oe0Var = new oe0(i4, bArr5);
            fd0 fd0Var4 = (fd0) od0Var;
            fd0Var4.B(bArr5, r15, i4, r15);
            boolean zQ = oe0Var.q();
            int iR = oe0Var.r(i5);
            int iR2 = oe0Var.r(24) + i4;
            if (iR == 0) {
                byte[] bArr6 = new byte[38];
                fd0Var4.w(bArr6, r15, 38, r15);
                td0Var6 = new td0(i4, bArr6);
            } else {
                if (td0Var6 == null) {
                    throw new IllegalArgumentException();
                }
                am0 am0Var2 = td0Var6.l;
                if (iR == i3) {
                    cw1 cw1Var5 = new cw1(iR2);
                    fd0Var4.w(cw1Var5.a, r15, iR2, r15);
                    td0Var = new td0(td0Var6.a, td0Var6.b, td0Var6.c, td0Var6.d, td0Var6.e, td0Var6.g, td0Var6.h, td0Var6.j, v51.D(cw1Var5), td0Var6.l);
                } else {
                    int i21 = i4;
                    if (iR == i21) {
                        cw1 cw1Var6 = new cw1(iR2);
                        fd0Var4.w(cw1Var6.a, 0, iR2, false);
                        cw1Var6.G(i21);
                        am0 am0VarY = ej1.y(Arrays.asList((String[]) ej1.u(cw1Var6, false, false).g));
                        if (am0Var2 != null) {
                            am0VarY = am0Var2.b(am0VarY);
                        }
                        td0Var = new td0(td0Var6.a, td0Var6.b, td0Var6.c, td0Var6.d, td0Var6.e, td0Var6.g, td0Var6.h, td0Var6.j, td0Var6.k, am0VarY);
                    } else if (iR == 6) {
                        cw1 cw1Var7 = new cw1(iR2);
                        fd0Var4.w(cw1Var7.a, 0, iR2, false);
                        cw1Var7.G(4);
                        am0 am0Var3 = new am0(vj2.i(rf0.b(cw1Var7)));
                        if (am0Var2 != null) {
                            am0Var3 = am0Var2.b(am0Var3);
                        }
                        td0Var = new td0(td0Var6.a, td0Var6.b, td0Var6.c, td0Var6.d, td0Var6.e, td0Var6.g, td0Var6.h, td0Var6.j, td0Var6.k, am0Var3);
                    } else {
                        fd0Var4.b(iR2, false);
                    }
                }
                td0Var6 = td0Var;
            }
            String str4 = qz1.a;
            this.h = td0Var6;
            if (zQ) {
                this.i = Math.max(td0Var6.c, 6);
                de3 de3VarB = this.h.b(bArr, this.g);
                me0 me0Var = this.e;
                uc3 uc3Var = new uc3(de3VarB);
                uc3Var.d("audio/flac");
                me0Var.d(new de3(uc3Var));
                this.h.a();
                this.f = 4;
                return 0;
            }
            r15 = 0;
            i3 = 3;
            i4 = 4;
            i5 = 7;
        }
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            df0 df0Var = this.k;
            if (df0Var != null) {
                df0Var.a(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.y(0);
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.d = pd0Var;
        this.e = pd0Var.z(0, 1);
        pd0Var.s();
    }
}
