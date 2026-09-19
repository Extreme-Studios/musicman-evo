package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 implements jk0 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final r52 a;
    public final cw1 b;
    public final boolean[] c = new boolean[4];
    public final mk0 d;
    public final zk0 e;
    public nk0 f;
    public long g;
    public String h;
    public me0 i;
    public boolean j;
    public long k;

    public ok0(r52 r52Var) {
        this.a = r52Var;
        mk0 mk0Var = new mk0();
        mk0Var.e = new byte[128];
        this.d = mk0Var;
        this.k = -9223372036854775807L;
        this.e = new zk0(178);
        this.b = new cw1();
    }

    @Override // defpackage.jk0
    public final void a() {
        ss0.h0(this.c);
        mk0 mk0Var = this.d;
        mk0Var.a = false;
        mk0Var.c = 0;
        mk0Var.b = 0;
        nk0 nk0Var = this.f;
        if (nk0Var != null) {
            nk0Var.b = false;
            nk0Var.c = false;
            nk0Var.d = false;
            nk0Var.e = -1;
        }
        this.e.a();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        zk0 zk0Var;
        mk0 mk0Var;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = cw1Var.b;
        int i6 = cw1Var.c;
        byte[] bArr = cw1Var.a;
        this.g += (long) cw1Var.B();
        int i7 = 0;
        this.i.a(cw1Var, cw1Var.B(), 0);
        while (true) {
            int iG0 = ss0.g0(bArr, i5, i6, this.c);
            zk0Var = this.e;
            mk0Var = this.d;
            if (iG0 == i6) {
                break;
            }
            int i8 = iG0 + 3;
            byte b = cw1Var.a[i8];
            int i9 = b & 255;
            int i10 = iG0 - i5;
            if (this.j) {
                i = i6;
            } else {
                if (i10 > 0) {
                    mk0Var.a(bArr, i5, iG0);
                }
                int i11 = i10 < 0 ? -i10 : i7;
                int i12 = mk0Var.b;
                if (i12 != 0) {
                    i = i6;
                    if (i12 == 1) {
                        i4 = 0;
                        if (i9 != 181) {
                            s90.Q("H263Reader", "Unexpected start code value");
                            mk0Var.a = false;
                            mk0Var.c = 0;
                            mk0Var.b = 0;
                        } else {
                            mk0Var.b = 2;
                        }
                    } else if (i12 == 2) {
                        i4 = 0;
                        if (i9 > 31) {
                            s90.Q("H263Reader", "Unexpected start code value");
                            mk0Var.a = false;
                            mk0Var.c = 0;
                            mk0Var.b = 0;
                        } else {
                            mk0Var.b = 3;
                        }
                    } else if (i12 != 3) {
                        if (i9 == 179 || i9 == 181) {
                            mk0Var.c -= i11;
                            mk0Var.a = false;
                            me0 me0Var = this.i;
                            int i13 = mk0Var.d;
                            String str = this.h;
                            str.getClass();
                            byte[] bArrCopyOf = Arrays.copyOf(mk0Var.e, mk0Var.c);
                            oe0 oe0Var = new oe0(bArrCopyOf.length, bArrCopyOf);
                            oe0Var.x(i13);
                            oe0Var.x(4);
                            oe0Var.m();
                            oe0Var.o(8);
                            if (oe0Var.q()) {
                                oe0Var.o(4);
                                oe0Var.o(3);
                            }
                            int iR = oe0Var.r(4);
                            if (iR == 15) {
                                int iR2 = oe0Var.r(8);
                                int iR3 = oe0Var.r(8);
                                if (iR3 == 0) {
                                    s90.Q("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                } else {
                                    f = iR2 / iR3;
                                }
                            } else if (iR < 7) {
                                f = l[iR];
                            } else {
                                s90.Q("H263Reader", "Invalid aspect ratio");
                                f = 1.0f;
                            }
                            if (oe0Var.q()) {
                                oe0Var.o(2);
                                oe0Var.o(1);
                                if (oe0Var.q()) {
                                    oe0Var.o(15);
                                    oe0Var.m();
                                    oe0Var.o(15);
                                    oe0Var.m();
                                    oe0Var.o(15);
                                    oe0Var.m();
                                    oe0Var.o(3);
                                    oe0Var.o(11);
                                    oe0Var.m();
                                    oe0Var.o(15);
                                    oe0Var.m();
                                }
                            }
                            if (oe0Var.r(2) != 0) {
                                s90.Q("H263Reader", "Unhandled video object layer shape");
                            }
                            oe0Var.m();
                            int iR4 = oe0Var.r(16);
                            oe0Var.m();
                            if (oe0Var.q()) {
                                if (iR4 == 0) {
                                    s90.Q("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i14 = iR4 - 1;
                                    int i15 = 0;
                                    while (i14 > 0) {
                                        i14 >>= 1;
                                        i15++;
                                    }
                                    oe0Var.o(i15);
                                }
                            }
                            oe0Var.m();
                            int iR5 = oe0Var.r(13);
                            oe0Var.m();
                            int iR6 = oe0Var.r(13);
                            oe0Var.m();
                            oe0Var.m();
                            uc3 uc3Var = new uc3();
                            uc3Var.a = str;
                            uc3Var.d("video/mp2t");
                            uc3Var.e("video/mp4v-es");
                            uc3Var.s = iR5;
                            uc3Var.t = iR6;
                            uc3Var.y = f;
                            uc3Var.o = Collections.singletonList(bArrCopyOf);
                            me0Var.d(new de3(uc3Var));
                            this.j = true;
                        } else {
                            i4 = 0;
                        }
                    } else if ((b & 240) != 32) {
                        s90.Q("H263Reader", "Unexpected start code value");
                        i4 = 0;
                        mk0Var.a = false;
                        mk0Var.c = 0;
                        mk0Var.b = 0;
                    } else {
                        i4 = 0;
                        mk0Var.d = mk0Var.c;
                        mk0Var.b = 4;
                    }
                } else {
                    i = i6;
                    i4 = 0;
                    if (i9 == 176) {
                        mk0Var.b = 1;
                        mk0Var.a = true;
                    }
                }
                mk0Var.a(mk0.f, i4, 3);
            }
            this.f.a(bArr, i5, iG0);
            if (i10 > 0) {
                zk0Var.d(bArr, i5, iG0);
                i2 = 0;
            } else {
                i2 = -i10;
            }
            if (zk0Var.e(i2)) {
                int iY = ss0.y(zk0Var.d, (byte[]) zk0Var.e);
                String str2 = qz1.a;
                byte[] bArr2 = (byte[]) zk0Var.e;
                cw1 cw1Var2 = this.b;
                cw1Var2.z(iY, bArr2);
                this.a.G(this.k, cw1Var2);
            }
            if (i9 == 178) {
                z = true;
                if (cw1Var.a[iG0 + 2] == 1) {
                    zk0Var.c(178);
                }
                i9 = 178;
            } else {
                z = true;
            }
            int i16 = i - iG0;
            this.f.b(i16, this.g - ((long) i16), this.j);
            nk0 nk0Var = this.f;
            long j = this.k;
            nk0Var.e = i9;
            nk0Var.d = false;
            if (i9 == 182) {
                z2 = z;
                i3 = i9;
            } else if (i9 == 179) {
                i3 = 179;
                z2 = z;
            } else {
                i3 = i9;
                z2 = false;
            }
            nk0Var.b = z2;
            nk0Var.c = i3 == 182 ? z : false;
            nk0Var.f = 0;
            nk0Var.h = j;
            i7 = 0;
            i5 = i8;
            i6 = i;
        }
        if (!this.j) {
            mk0Var.a(bArr, i5, i6);
        }
        this.f.a(bArr, i5, i6);
        zk0Var.d(bArr, i5, i6);
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
        nk0 nk0Var = this.f;
        nk0Var.getClass();
        if (z) {
            nk0Var.b(0, this.g, this.j);
            nk0 nk0Var2 = this.f;
            nk0Var2.b = false;
            nk0Var2.c = false;
            nk0Var2.d = false;
            nk0Var2.e = -1;
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.h = ml0Var.e;
        ml0Var.b();
        me0 me0VarZ = pd0Var.z(ml0Var.d, 2);
        this.i = me0VarZ;
        this.f = new nk0(me0VarZ);
        this.a.B(pd0Var, ml0Var);
    }
}
