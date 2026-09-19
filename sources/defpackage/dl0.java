package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 implements nd0 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public df0 i;
    public pd0 j;
    public boolean k;
    public final ry1 a = new ry1();
    public final cw1 c = new cw1(4096);
    public final SparseArray b = new SparseArray();
    public final bl0 d = new bl0(0);

    static {
        int i = a23.G;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        fd0 fd0Var = (fd0) od0Var;
        fd0Var.B(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            fd0Var.e(bArr[13] & 7, false);
            fd0Var.B(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x022d  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException {
        long j;
        int i;
        long jC;
        jk0 lk0Var;
        long j2;
        long j3;
        pd0 pd0Var = this.j;
        pd0Var.getClass();
        long j4 = ((fd0) od0Var).h;
        bl0 bl0Var = this.d;
        if (j4 != -1) {
            boolean z = bl0Var.c;
            j = -9223372036854775807L;
            cw1 cw1Var = bl0Var.b;
            if (!z) {
                if (!bl0Var.e) {
                    fd0 fd0Var = (fd0) od0Var;
                    long j5 = fd0Var.h;
                    int iMin = (int) Math.min(20000L, j5);
                    long j6 = j5 - ((long) iMin);
                    if (fd0Var.i != j6) {
                        rd0Var.a = j6;
                        return 1;
                    }
                    cw1Var.y(iMin);
                    fd0Var.k = 0;
                    fd0Var.B(cw1Var.a, 0, iMin, false);
                    int i2 = cw1Var.b;
                    for (int i3 = cw1Var.c - 4; i3 >= i2; i3--) {
                        if (bl0.c(i3, cw1Var.a) == 442) {
                            cw1Var.E(i3 + 4);
                            long jA = bl0.a(cw1Var);
                            if (jA != -9223372036854775807L) {
                                j3 = jA;
                                bl0Var.g = j3;
                                bl0Var.e = true;
                                return 0;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    bl0Var.g = j3;
                    bl0Var.e = true;
                    return 0;
                }
                if (bl0Var.g == -9223372036854775807L) {
                    byte[] bArr = qz1.b;
                    int length = bArr.length;
                    cw1Var.z(0, bArr);
                    bl0Var.c = true;
                    ((fd0) od0Var).i();
                    return 0;
                }
                if (bl0Var.d) {
                    long j7 = bl0Var.f;
                    if (j7 == -9223372036854775807L) {
                        byte[] bArr2 = qz1.b;
                        int length2 = bArr2.length;
                        cw1Var.z(0, bArr2);
                        bl0Var.c = true;
                        ((fd0) od0Var).i();
                        return 0;
                    }
                    ry1 ry1Var = bl0Var.a;
                    bl0Var.h = ry1Var.d(bl0Var.g) - ry1Var.c(j7);
                    byte[] bArr3 = qz1.b;
                    int length3 = bArr3.length;
                    cw1Var.z(0, bArr3);
                    bl0Var.c = true;
                    ((fd0) od0Var).i();
                    return 0;
                }
                fd0 fd0Var2 = (fd0) od0Var;
                int iMin2 = (int) Math.min(20000L, fd0Var2.h);
                if (fd0Var2.i != 0) {
                    rd0Var.a = 0L;
                    return 1;
                }
                cw1Var.y(iMin2);
                fd0Var2.k = 0;
                fd0Var2.B(cw1Var.a, 0, iMin2, false);
                int i4 = cw1Var.c;
                for (int i5 = cw1Var.b; i5 < i4 - 3; i5++) {
                    if (bl0.c(i5, cw1Var.a) == 442) {
                        cw1Var.E(i5 + 4);
                        long jA2 = bl0.a(cw1Var);
                        if (jA2 != -9223372036854775807L) {
                            j2 = jA2;
                            bl0Var.f = j2;
                            bl0Var.d = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                bl0Var.f = j2;
                bl0Var.d = true;
                return 0;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.k) {
            i = 442;
        } else {
            this.k = true;
            long j8 = bl0Var.h;
            if (j8 != j) {
                df0 df0Var = new df0(new ig(27), new vg2(bl0Var.a), j8, j8 + 1, 0L, j4, 188L, 1000);
                this.i = df0Var;
                this.j.v(df0Var.a);
                i = 442;
            } else {
                i = 442;
                pd0Var.v(new sd0(j8, 0L));
            }
        }
        df0 df0Var2 = this.i;
        if (df0Var2 != null && df0Var2.c != null) {
            return df0Var2.b(od0Var, rd0Var);
        }
        fd0 fd0Var3 = (fd0) od0Var;
        fd0Var3.k = 0;
        long jM = j4 != -1 ? j4 - fd0Var3.m() : -1L;
        if (jM != -1 && jM < 4) {
            return -1;
        }
        cw1 cw1Var2 = this.c;
        if (!fd0Var3.B(cw1Var2.a, 0, 4, true)) {
            return -1;
        }
        cw1Var2.E(0);
        int iB = cw1Var2.b();
        if (iB == 441) {
            return -1;
        }
        if (iB == i) {
            fd0Var3.B(cw1Var2.a, 0, 10, false);
            cw1Var2.E(9);
            fd0Var3.b((cw1Var2.K() & 7) + 14, false);
            return 0;
        }
        if (iB == 443) {
            fd0Var3.B(cw1Var2.a, 0, 2, false);
            cw1Var2.E(0);
            fd0Var3.b(cw1Var2.L() + 6, false);
            return 0;
        }
        if ((iB >> 8) != 1) {
            fd0Var3.b(1, false);
            return 0;
        }
        int i6 = iB & 255;
        SparseArray sparseArray = this.b;
        cl0 cl0Var = (cl0) sparseArray.get(i6);
        if (!this.e) {
            if (cl0Var == null) {
                jk0 jk0Var = null;
                if (i6 == 189) {
                    lk0Var = new dk0(0, 0, null, "video/mp2p");
                    this.f = true;
                    this.h = fd0Var3.i;
                } else if ((iB & 224) == 192) {
                    lk0Var = new xk0(0, null, "video/mp2p");
                    this.f = true;
                    this.h = fd0Var3.i;
                } else if ((iB & 240) == 224) {
                    lk0Var = new lk0(null, "video/mp2p");
                    this.g = true;
                    this.h = fd0Var3.i;
                } else if (jk0Var != null) {
                    jk0Var.e(this.j, new ml0(Integer.MIN_VALUE, i6, 256));
                    cl0Var = new cl0(jk0Var, this.a);
                    sparseArray.put(i6, cl0Var);
                }
                jk0Var = lk0Var;
                if (jk0Var != null) {
                    jk0Var.e(this.j, new ml0(Integer.MIN_VALUE, i6, 256));
                    cl0Var = new cl0(jk0Var, this.a);
                    sparseArray.put(i6, cl0Var);
                }
            }
            long j9 = 1048576;
            if (this.f && this.g) {
                j9 = 8192 + this.h;
            }
            if (fd0Var3.i > j9) {
                this.e = true;
                this.j.s();
            }
        }
        fd0Var3.B(cw1Var2.a, 0, 2, false);
        cw1Var2.E(0);
        int iL = cw1Var2.L() + 6;
        if (cl0Var == null) {
            fd0Var3.b(iL, false);
            return 0;
        }
        cw1Var2.y(iL);
        fd0Var3.w(cw1Var2.a, 0, iL, false);
        cw1Var2.E(6);
        ry1 ry1Var2 = cl0Var.b;
        oe0 oe0Var = cl0Var.c;
        cw1Var2.H(oe0Var.a, 0, 3);
        oe0Var.l(0);
        oe0Var.o(8);
        cl0Var.d = oe0Var.q();
        cl0Var.e = oe0Var.q();
        oe0Var.o(6);
        cw1Var2.H(oe0Var.a, 0, oe0Var.r(8));
        oe0Var.l(0);
        if (cl0Var.d) {
            oe0Var.o(4);
            long jR = oe0Var.r(3);
            oe0Var.o(1);
            int iR = oe0Var.r(15) << 15;
            oe0Var.o(1);
            long jR2 = oe0Var.r(15);
            oe0Var.o(1);
            if (!cl0Var.f && cl0Var.e) {
                oe0Var.o(4);
                long jR3 = ((long) oe0Var.r(3)) << 30;
                oe0Var.o(1);
                int iR2 = oe0Var.r(15) << 15;
                oe0Var.o(1);
                long jR4 = oe0Var.r(15);
                oe0Var.o(1);
                ry1Var2.c(((long) iR2) | jR3 | jR4);
                cl0Var.f = true;
            }
            jC = ry1Var2.c((jR << 30) | ((long) iR) | jR2);
        } else {
            jC = 0;
        }
        jk0 jk0Var2 = cl0Var.a;
        jk0Var2.d(4, jC);
        jk0Var2.b(cw1Var2);
        jk0Var2.c(false);
        cw1Var2.C(cw1Var2.a.length);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        long j3;
        ry1 ry1Var = this.a;
        synchronized (ry1Var) {
            j3 = ry1Var.b;
        }
        if (j3 != -9223372036854775807L) {
            long jA = ry1Var.a();
            if (jA != -9223372036854775807L && jA != 0 && jA != j2) {
                ry1Var.b(j2);
            }
        } else {
            ry1Var.b(j2);
        }
        df0 df0Var = this.i;
        if (df0Var != null) {
            df0Var.a(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            cl0 cl0Var = (cl0) sparseArray.valueAt(i);
            cl0Var.f = false;
            cl0Var.a.a();
            i++;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.j = pd0Var;
    }
}
