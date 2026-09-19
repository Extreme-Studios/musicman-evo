package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class wk0 implements jk0 {
    public final String a;
    public final int b;
    public final cw1 c;
    public final oe0 d;
    public me0 e;
    public String f;
    public de3 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public wk0(String str, int i) {
        this.a = str;
        this.b = i;
        cw1 cw1Var = new cw1(1024);
        this.c = cw1Var;
        byte[] bArr = cw1Var.a;
        this.d = new oe0(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) throws no0 {
        int iR;
        int i;
        int i2;
        int iR2;
        boolean zQ;
        int i3;
        this.e.getClass();
        while (cw1Var.B() > 0) {
            int i4 = this.h;
            if (i4 != 0) {
                int i5 = 2;
                if (i4 != 1) {
                    oe0 oe0Var = this.d;
                    cw1 cw1Var2 = this.c;
                    if (i4 != 2) {
                        int iMin = Math.min(cw1Var.B(), this.j - this.i);
                        cw1Var.H(oe0Var.a, this.i, iMin);
                        int i6 = this.i + iMin;
                        this.i = i6;
                        if (i6 == this.j) {
                            oe0Var.l(0);
                            if (oe0Var.q()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iR3 = oe0Var.r(1);
                                if (iR3 == 1) {
                                    iR2 = oe0Var.r(1);
                                    i2 = 1;
                                } else {
                                    i2 = iR3;
                                    iR2 = 0;
                                }
                                this.n = iR2;
                                if (iR2 != 0) {
                                    throw no0.a(null, null);
                                }
                                if (i2 == 1) {
                                    oe0Var.r((oe0Var.r(2) + 1) * 8);
                                    i2 = 1;
                                }
                                if (!oe0Var.q()) {
                                    throw no0.a(null, null);
                                }
                                this.o = oe0Var.r(6);
                                int iR4 = oe0Var.r(4);
                                int iR5 = oe0Var.r(3);
                                if (iR4 != 0 || iR5 != 0) {
                                    throw no0.a(null, null);
                                }
                                if (i2 == 0) {
                                    int i7 = (oe0Var.b * 8) + oe0Var.c;
                                    int iF = oe0Var.f();
                                    tc0 tc0VarA = hn.A(oe0Var, true);
                                    this.v = tc0VarA.a;
                                    this.s = tc0VarA.b;
                                    this.u = tc0VarA.c;
                                    int iF2 = iF - oe0Var.f();
                                    oe0Var.l(i7);
                                    byte[] bArr = new byte[(iF2 + 7) / 8];
                                    oe0Var.v(iF2, bArr);
                                    uc3 uc3Var = new uc3();
                                    uc3Var.a = this.f;
                                    uc3Var.d("video/mp2t");
                                    uc3Var.e("audio/mp4a-latm");
                                    uc3Var.i = this.v;
                                    uc3Var.D = this.u;
                                    uc3Var.E = this.s;
                                    uc3Var.o = Collections.singletonList(bArr);
                                    uc3Var.d = this.a;
                                    uc3Var.f = this.b;
                                    de3 de3Var = new de3(uc3Var);
                                    if (!de3Var.equals(this.g)) {
                                        this.g = de3Var;
                                        this.t = 1024000000 / ((long) de3Var.F);
                                        this.e.d(de3Var);
                                    }
                                } else {
                                    int iR6 = oe0Var.r((oe0Var.r(2) + 1) * 8);
                                    int iF3 = oe0Var.f();
                                    tc0 tc0VarA2 = hn.A(oe0Var, true);
                                    this.v = tc0VarA2.a;
                                    this.s = tc0VarA2.b;
                                    this.u = tc0VarA2.c;
                                    oe0Var.o(iR6 - (iF3 - oe0Var.f()));
                                }
                                int iR7 = oe0Var.r(3);
                                this.p = iR7;
                                if (iR7 == 0) {
                                    oe0Var.o(8);
                                } else if (iR7 == 1) {
                                    oe0Var.o(9);
                                } else if (iR7 == 3 || iR7 == 4 || iR7 == 5) {
                                    oe0Var.o(6);
                                } else {
                                    if (iR7 != 6 && iR7 != 7) {
                                        j7.a();
                                        return;
                                    }
                                    oe0Var.o(1);
                                }
                                boolean zQ2 = oe0Var.q();
                                this.q = zQ2;
                                this.r = 0L;
                                if (zQ2) {
                                    if (i2 != 1) {
                                        do {
                                            zQ = oe0Var.q();
                                            this.r = (this.r << 8) + ((long) oe0Var.r(8));
                                        } while (zQ);
                                    } else {
                                        this.r = oe0Var.r((oe0Var.r(2) + 1) * 8);
                                    }
                                }
                                if (oe0Var.q()) {
                                    oe0Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw no0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw no0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw no0.a(null, null);
                            }
                            int i8 = 0;
                            do {
                                iR = oe0Var.r(8);
                                i8 += iR;
                            } while (iR == 255);
                            int i9 = (oe0Var.b * 8) + oe0Var.c;
                            if ((i9 & 7) == 0) {
                                cw1Var2.E(i9 >> 3);
                                i = 0;
                            } else {
                                oe0Var.v(i8 * 8, cw1Var2.a);
                                i = 0;
                                cw1Var2.E(0);
                            }
                            this.e.a(cw1Var2, i8, i);
                            hn.M(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i8, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                oe0Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iK = ((this.k & (-225)) << 8) | cw1Var.K();
                        this.j = iK;
                        if (iK > cw1Var2.a.length) {
                            cw1Var2.y(iK);
                            byte[] bArr2 = cw1Var2.a;
                            int length = bArr2.length;
                            oe0Var.a = bArr2;
                            i3 = 0;
                            oe0Var.b = 0;
                            oe0Var.c = 0;
                            oe0Var.d = length;
                        } else {
                            i3 = 0;
                        }
                        this.i = i3;
                        this.h = 3;
                    }
                } else {
                    int iK2 = cw1Var.K();
                    if ((iK2 & 224) == 224) {
                        this.k = iK2;
                    } else if (iK2 != 86) {
                        i5 = 0;
                    }
                    this.h = i5;
                }
            } else if (cw1Var.K() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.e = pd0Var.z(ml0Var.d, 1);
        ml0Var.b();
        this.f = ml0Var.e;
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
    }
}
