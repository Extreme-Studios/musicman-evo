package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements jk0 {
    public final p83 a;
    public String b;
    public me0 c;
    public rk0 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final zk0 g = new zk0(32);
    public final zk0 h = new zk0(33);
    public final zk0 i = new zk0(34);
    public final zk0 j = new zk0(39);
    public final zk0 k = new zk0(40);
    public long m = -9223372036854775807L;
    public final cw1 n = new cw1();

    public sk0(p83 p83Var) {
        this.a = p83Var;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        ss0.h0(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        ((ts2) this.a.i).m(0);
        rk0 rk0Var = this.d;
        if (rk0Var != null) {
            rk0Var.f = false;
            rk0Var.g = false;
            rk0Var.h = false;
            rk0Var.i = false;
            rk0Var.j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        int i;
        int i2;
        this.c.getClass();
        String str = qz1.a;
        while (cw1Var.B() > 0) {
            int i3 = cw1Var.b;
            int i4 = cw1Var.c;
            byte[] bArr = cw1Var.a;
            this.l += (long) cw1Var.B();
            this.c.a(cw1Var, cw1Var.B(), 0);
            while (i3 < i4) {
                int iG0 = ss0.g0(bArr, i3, i4, this.f);
                if (iG0 == i4) {
                    g(bArr, i3, i4);
                    return;
                }
                int i5 = bArr[iG0 + 3] & 126;
                if (iG0 > 0) {
                    int i6 = iG0 - 1;
                    if (bArr[i6] == 0) {
                        i2 = 4;
                        i = i6;
                    } else {
                        i = iG0;
                        i2 = 3;
                    }
                } else {
                    i = iG0;
                    i2 = 3;
                }
                int i7 = i - i3;
                if (i7 > 0) {
                    g(bArr, i3, i);
                }
                int i8 = i4 - i;
                long j = this.l - ((long) i8);
                h(i8, i7 < 0 ? -i7 : 0, j, this.m);
                f(i8, i5 >> 1, j, this.m);
                i3 = i + i2;
            }
        }
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
        this.c.getClass();
        String str = qz1.a;
        if (z) {
            ((ts2) this.a.i).m(0);
            h(0, 0, this.l, this.m);
            f(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.b = ml0Var.e;
        ml0Var.b();
        me0 me0VarZ = pd0Var.z(ml0Var.d, 2);
        this.c = me0VarZ;
        this.d = new rk0(me0VarZ);
        this.a.t(pd0Var, ml0Var);
    }

    public final void f(int i, int i2, long j, long j2) {
        rk0 rk0Var = this.d;
        boolean z = this.e;
        rk0Var.g = false;
        rk0Var.h = false;
        rk0Var.e = j2;
        rk0Var.d = 0;
        rk0Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (rk0Var.i && !rk0Var.j) {
                if (z) {
                    rk0Var.a(i);
                }
                rk0Var.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                rk0Var.h = !rk0Var.j;
                rk0Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        rk0Var.c = z2;
        rk0Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.c(i2);
            this.h.c(i2);
            this.i.c(i2);
        }
        this.j.c(i2);
        this.k.c(i2);
    }

    public final void g(byte[] bArr, int i, int i2) {
        rk0 rk0Var = this.d;
        if (rk0Var.f) {
            int i3 = rk0Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                rk0Var.g = (bArr[i4] & 128) != 0;
                rk0Var.f = false;
            } else {
                rk0Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.d(bArr, i, i2);
            this.h.d(bArr, i, i2);
            this.i.d(bArr, i, i2);
        }
        this.j.d(bArr, i, i2);
        this.k.d(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        ts2 ts2Var = (ts2) this.a.i;
        rk0 rk0Var = this.d;
        boolean z = this.e;
        if (rk0Var.j && rk0Var.g) {
            rk0Var.m = rk0Var.c;
            rk0Var.j = false;
        } else if (rk0Var.h || rk0Var.g) {
            if (z && rk0Var.i) {
                rk0Var.a(i + ((int) (j - rk0Var.b)));
            }
            rk0Var.k = rk0Var.b;
            rk0Var.l = rk0Var.e;
            rk0Var.m = rk0Var.c;
            rk0Var.i = true;
        }
        if (!this.e) {
            zk0 zk0Var = this.g;
            zk0Var.e(i2);
            zk0 zk0Var2 = this.h;
            zk0Var2.e(i2);
            zk0 zk0Var3 = this.i;
            zk0Var3.e(i2);
            if (zk0Var.c && zk0Var2.c && zk0Var3.c) {
                String str = this.b;
                int i3 = zk0Var.d;
                byte[] bArr = new byte[zk0Var2.d + i3 + zk0Var3.d];
                System.arraycopy((byte[]) zk0Var.e, 0, bArr, 0, i3);
                System.arraycopy((byte[]) zk0Var2.e, 0, bArr, zk0Var.d, zk0Var2.d);
                System.arraycopy((byte[]) zk0Var3.e, 0, bArr, zk0Var.d + zk0Var2.d, zk0Var3.d);
                String strA = null;
                c52 c52VarB0 = ss0.b0((byte[]) zk0Var2.e, 3, zk0Var2.d, null);
                m32 m32Var = c52VarB0.b;
                if (m32Var != null) {
                    int i4 = m32Var.f;
                    int[] iArr = m32Var.e;
                    int i5 = m32Var.d;
                    strA = rl1.a(m32Var.a, m32Var.b, m32Var.c, i5, iArr, i4);
                }
                uc3 uc3Var = new uc3();
                uc3Var.a = str;
                uc3Var.d("video/mp2t");
                uc3Var.e("video/hevc");
                uc3Var.i = strA;
                uc3Var.s = c52VarB0.e;
                uc3Var.t = c52VarB0.f;
                uc3Var.u = c52VarB0.g;
                uc3Var.v = c52VarB0.h;
                uc3Var.B = new c43(c52VarB0.k, c52VarB0.l, c52VarB0.m, null, c52VarB0.c + 8, c52VarB0.d + 8);
                uc3Var.y = c52VarB0.i;
                uc3Var.n = c52VarB0.j;
                uc3Var.C = c52VarB0.a + 1;
                uc3Var.o = Collections.singletonList(bArr);
                de3 de3Var = new de3(uc3Var);
                this.c.d(de3Var);
                int i6 = de3Var.o;
                hn.M(i6 != -1);
                ts2Var.k(i6);
                this.e = true;
            }
        }
        zk0 zk0Var4 = this.j;
        boolean zE = zk0Var4.e(i2);
        cw1 cw1Var = this.n;
        if (zE) {
            cw1Var.z(ss0.y(zk0Var4.d, (byte[]) zk0Var4.e), (byte[]) zk0Var4.e);
            cw1Var.G(5);
            ts2Var.l(j2, cw1Var);
        }
        zk0 zk0Var5 = this.k;
        if (zk0Var5.e(i2)) {
            cw1Var.z(ss0.y(zk0Var5.d, (byte[]) zk0Var5.e), (byte[]) zk0Var5.e);
            cw1Var.G(5);
            ts2Var.l(j2, cw1Var);
        }
    }
}
