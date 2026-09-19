package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j83 {
    public final z93 c;
    public final wx1 d;
    public long e;
    public int f;
    public boolean g;
    public h83 h;
    public h83 i;
    public h83 j;
    public h83 k;
    public h83 l;
    public int m;
    public Object n;
    public long o;
    public final j52 q;
    public final su0 a = new su0();
    public final ex0 b = new ex0();
    public ArrayList p = new ArrayList();

    public j83(z93 z93Var, wx1 wx1Var, j52 j52Var, a73 a73Var) {
        this.c = z93Var;
        this.d = wx1Var;
        this.q = j52Var;
    }

    public static yd3 a(ox0 ox0Var, Object obj, long j, ex0 ex0Var, su0 su0Var) {
        ox0Var.o(obj, su0Var);
        ox0Var.b(su0Var.c, ex0Var, 0L);
        ox0Var.e(obj);
        su0Var.f.getClass();
        ox0Var.o(obj, su0Var);
        su0Var.f.a(-1);
        return new yd3(obj, j, -1);
    }

    public final h83 A(xd3 xd3Var) {
        for (int i = 0; i < this.p.size(); i++) {
            h83 h83Var = (h83) this.p.get(i);
            if (h83Var.a == xd3Var) {
                return h83Var;
            }
        }
        return null;
    }

    public final void B() {
        if (this.m == 0) {
            return;
        }
        h83 h83Var = this.h;
        h83Var.getClass();
        this.n = h83Var.b;
        this.o = h83Var.g.a.d;
        while (h83Var != null) {
            h83Var.h();
            h83Var = h83Var.m;
        }
        this.h = null;
        this.k = null;
        this.i = null;
        this.j = null;
        this.m = 0;
        b();
    }

    public final int C(ox0 ox0Var, long j, long j2, long j3) {
        i83 i83VarD;
        h83 h83Var = this.h;
        h83 h83Var2 = null;
        while (true) {
            int i = 0;
            if (h83Var == null) {
                return 0;
            }
            i83 i83Var = h83Var.g;
            if (h83Var2 == null) {
                i83VarD = D(ox0Var, i83Var);
            } else {
                i83 i83VarE = e(ox0Var, h83Var2, j);
                if (i83VarE == null || i83Var.b != i83VarE.b || !i83Var.a.equals(i83VarE.a)) {
                    return y(h83Var2);
                }
                i83VarD = i83VarE;
            }
            i83 i83VarB = i83VarD.b(i83Var.c);
            h83Var.g = i83VarB;
            long j4 = i83Var.e;
            long j5 = i83VarD.e;
            if (j4 != j5) {
                xd3 xd3Var = h83Var.a;
                if (xd3Var instanceof fd3) {
                    long j6 = i83VarB.d;
                    if (j6 == -9223372036854775807L) {
                        j6 = Long.MIN_VALUE;
                    }
                    ((fd3) xd3Var).j = j6;
                }
                long j7 = j5 == -9223372036854775807L ? Long.MAX_VALUE : h83Var.p + j5;
                boolean z = h83Var == this.i && (j2 == Long.MIN_VALUE || j2 >= j7);
                boolean z2 = h83Var == this.j && (j3 == Long.MIN_VALUE || j3 >= j7);
                int iY = y(h83Var);
                if (iY != 0) {
                    return iY;
                }
                if (j4 == -9223372036854775807L) {
                    j4 = -9223372036854775807L;
                }
                if (z && j4 != -9223372036854775807L) {
                    i = 1;
                }
                return z2 ? i | 2 : i;
            }
            h83Var2 = h83Var;
            h83Var = h83Var.m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public final i83 D(ox0 ox0Var, i83 i83Var) {
        long j;
        long jB;
        long j2;
        long j3;
        yd3 yd3Var = i83Var.a;
        boolean zB = yd3Var.b();
        int i = yd3Var.e;
        boolean z = !zB && i == -1;
        int i2 = yd3Var.b;
        boolean zI = i(ox0Var, yd3Var);
        boolean zJ = j(ox0Var, yd3Var, z);
        Object obj = yd3Var.a;
        su0 su0Var = this.a;
        ox0Var.o(obj, su0Var);
        if (yd3Var.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            su0Var.f.a(i).getClass();
            j = 0;
        }
        if (!yd3Var.b()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jB = su0Var.d;
            }
            if (yd3Var.b()) {
                su0Var.c(i2);
            } else if (i != -1) {
                su0Var.c(i);
            }
            return new i83(yd3Var, i83Var.b, i83Var.c, j2, j3, z, zI, zJ);
        }
        jB = su0Var.b(i2, yd3Var.c);
        j2 = j;
        j3 = jB;
        if (yd3Var.b()) {
            su0Var.c(i2);
        } else if (i != -1) {
            su0Var.c(i);
        }
        return new i83(yd3Var, i83Var.b, i83Var.c, j2, j3, z, zI, zJ);
    }

    public final yd3 E(ox0 ox0Var, Object obj) {
        long jC;
        int iE;
        su0 su0Var = this.a;
        int i = ox0Var.o(obj, su0Var).c;
        Object obj2 = this.n;
        if (obj2 == null || (iE = ox0Var.e(obj2)) == -1 || ox0Var.d(iE, su0Var, false).c != i) {
            h83 h83Var = this.h;
            while (true) {
                if (h83Var == null) {
                    h83 h83Var2 = this.h;
                    while (true) {
                        if (h83Var2 == null) {
                            jC = c(obj);
                            if (jC != -1) {
                                break;
                            }
                            jC = this.e;
                            this.e = 1 + jC;
                            if (this.h != null) {
                                break;
                            }
                            this.n = obj;
                            this.o = jC;
                            break;
                        }
                        int iE2 = ox0Var.e(h83Var2.b);
                        if (iE2 != -1 && ox0Var.d(iE2, su0Var, false).c == i) {
                            jC = h83Var2.g.a.d;
                            break;
                        }
                        h83Var2 = h83Var2.m;
                    }
                } else {
                    if (h83Var.b.equals(obj)) {
                        jC = h83Var.g.a.d;
                        break;
                    }
                    h83Var = h83Var.m;
                }
            }
        } else {
            jC = this.o;
        }
        long j = jC;
        ox0Var.o(obj, su0Var);
        int i2 = su0Var.c;
        ex0 ex0Var = this.b;
        ox0Var.b(i2, ex0Var, 0L);
        for (int iE3 = ox0Var.e(obj); iE3 >= ex0Var.k; iE3--) {
            ox0Var.d(iE3, su0Var, true);
            su0Var.f.getClass();
            su0Var.f.a(-1);
        }
        return a(ox0Var, obj, j, ex0Var, su0Var);
    }

    public final void b() {
        tj2 tj2Var = vj2.g;
        sj2 sj2Var = new sj2(4);
        for (h83 h83Var = this.h; h83Var != null; h83Var = h83Var.m) {
            sj2Var.a(h83Var.g.a);
        }
        h83 h83Var2 = this.i;
        this.d.d(new ib(this, sj2Var, h83Var2 == null ? null : h83Var2.g.a, 20));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.p.size(); i++) {
            h83 h83Var = (h83) this.p.get(i);
            if (h83Var.b.equals(obj)) {
                return h83Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int d(ox0 ox0Var) {
        ox0 ox0Var2;
        h83 h83Var;
        h83 h83Var2 = this.h;
        if (h83Var2 == null) {
            return 0;
        }
        int iE = ox0Var.e(h83Var2.b);
        while (true) {
            ox0Var2 = ox0Var;
            iE = ox0Var2.l(iE, this.a, this.b, this.f, this.g);
            while (true) {
                h83Var = h83Var2.m;
                if (h83Var == null || h83Var2.g.f) {
                    break;
                }
                h83Var2 = h83Var;
            }
            if (iE == -1 || h83Var == null || ox0Var2.e(h83Var.b) != iE) {
                break;
            }
            h83Var2 = h83Var;
            ox0Var = ox0Var2;
        }
        int iY = y(h83Var2);
        h83Var2.g = D(ox0Var2, h83Var2.g);
        return iY;
    }

    public final i83 e(ox0 ox0Var, h83 h83Var, long j) {
        int i;
        ox0 ox0Var2;
        su0 su0Var;
        long jLongValue;
        int i2;
        ex0 ex0Var;
        Object obj;
        long j2;
        i83 i83Var = h83Var.g;
        long j3 = h83Var.p;
        long j4 = i83Var.e;
        boolean z = i83Var.f;
        long j5 = (j3 + j4) - j;
        yd3 yd3Var = i83Var.a;
        if (z) {
            Object obj2 = yd3Var.a;
            int iE = ox0Var.e(obj2);
            int i3 = this.f;
            boolean z2 = this.g;
            su0 su0Var2 = this.a;
            ex0 ex0Var2 = this.b;
            long j6 = 0;
            int iL = ox0Var.l(iE, su0Var2, ex0Var2, i3, z2);
            if (iL == -1) {
                return null;
            }
            int i4 = ox0Var.d(iL, su0Var2, true).c;
            Object obj3 = su0Var2.b;
            obj3.getClass();
            long j7 = yd3Var.d;
            if (ox0Var.b(i4, ex0Var2, 0L).k == iL) {
                Pair pairN = ox0Var.n(ex0Var2, su0Var2, i4, -9223372036854775807L, Math.max(0L, j5));
                if (pairN == null) {
                    return null;
                }
                Object obj4 = pairN.first;
                long jLongValue2 = ((Long) pairN.second).longValue();
                h83 h83Var2 = h83Var.m;
                if (h83Var2 == null || !h83Var2.b.equals(obj4)) {
                    long jC = c(obj4);
                    if (jC == -1) {
                        jC = this.e;
                        this.e = 1 + jC;
                    }
                    j7 = jC;
                } else {
                    j7 = h83Var2.g.a.d;
                }
                j2 = -9223372036854775807L;
                j6 = jLongValue2;
                ex0Var = ex0Var2;
                obj = obj4;
            } else {
                ex0Var = ex0Var2;
                obj = obj3;
                j2 = 0;
            }
            yd3 yd3VarA = a(ox0Var, obj, j7, ex0Var, su0Var2);
            if (j2 != -9223372036854775807L && i83Var.c != -9223372036854775807L) {
                ox0Var.o(obj2, su0Var2).f.getClass();
                su0Var2.f.getClass();
            }
            return f(ox0Var, yd3VarA, j2, j6);
        }
        Object obj5 = yd3Var.a;
        su0 su0Var3 = this.a;
        ox0Var.o(obj5, su0Var3);
        if (!yd3Var.b()) {
            int i5 = yd3Var.e;
            if (i5 != -1) {
                su0Var3.f.getClass();
                if (i5 == -1) {
                    su0Var3.f.a(-1);
                }
            }
            fb0 fb0VarA = su0Var3.f.a(i5);
            int i6 = 0;
            while (true) {
                int[] iArr = fb0VarA.d;
                if (i6 >= iArr.length || (i = iArr[i6]) == 0 || i == 1) {
                    break;
                }
                i6++;
            }
            su0Var3.c(i5);
            if (i6 != su0Var3.f.a(i5).a) {
                return g(ox0Var, obj5, i5, i6, j4, yd3Var.d);
            }
            ox0Var.o(obj5, su0Var3);
            su0Var3.f.a(i5).getClass();
            su0Var3.f.a(i5).getClass();
            return h(ox0Var, obj5, 0L, j4, yd3Var.d);
        }
        int i7 = yd3Var.b;
        if (su0Var3.f.a(i7).a == -1) {
            return null;
        }
        int i8 = yd3Var.c;
        fb0 fb0VarA2 = su0Var3.f.a(i7);
        int i9 = i8 + 1;
        while (true) {
            int[] iArr2 = fb0VarA2.d;
            if (i9 >= iArr2.length || (i2 = iArr2[i9]) == 0 || i2 == 1) {
                break;
            }
            i9++;
        }
        long j8 = i83Var.c;
        if (i9 < 0) {
            return g(ox0Var, obj5, i7, i9, j8, yd3Var.d);
        }
        long j9 = j8;
        if (j9 == -9223372036854775807L) {
            su0Var = su0Var3;
            ox0Var2 = ox0Var;
            Pair pairN2 = ox0Var2.n(this.b, su0Var, su0Var.c, -9223372036854775807L, Math.max(0L, j5));
            if (pairN2 == null) {
                return null;
            }
            jLongValue = ((Long) pairN2.second).longValue();
            j9 = -9223372036854775807L;
        } else {
            ox0Var2 = ox0Var;
            su0Var = su0Var3;
            jLongValue = j9;
        }
        ox0Var2.o(obj5, su0Var);
        su0Var.f.a(i7).getClass();
        su0Var.f.a(i7).getClass();
        return h(ox0Var2, obj5, Math.max(0L, jLongValue), j9, yd3Var.d);
    }

    public final i83 f(ox0 ox0Var, yd3 yd3Var, long j, long j2) {
        Object obj = yd3Var.a;
        ox0Var.o(obj, this.a);
        return yd3Var.b() ? g(ox0Var, obj, yd3Var.b, yd3Var.c, j, yd3Var.d) : h(ox0Var, obj, j2, j, yd3Var.d);
    }

    public final i83 g(ox0 ox0Var, Object obj, int i, int i2, long j, long j2) {
        int i3;
        yd3 yd3Var = new yd3(obj, i, i2, j2, -1);
        su0 su0Var = this.a;
        long jB = ox0Var.o(obj, su0Var).b(i, i2);
        fb0 fb0VarA = su0Var.f.a(i);
        int i4 = 0;
        while (true) {
            int[] iArr = fb0VarA.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        if (i2 == i4) {
            su0Var.f.getClass();
        }
        su0Var.c(i);
        long jMax = 0;
        if (jB != -9223372036854775807L && jB <= 0) {
            jMax = Math.max(0L, (-1) + jB);
        }
        return new i83(yd3Var, jMax, j, -9223372036854775807L, jB, false, false, false);
    }

    public final i83 h(ox0 ox0Var, Object obj, long j, long j2, long j3) {
        su0 su0Var = this.a;
        ox0Var.o(obj, su0Var);
        su0Var.getClass();
        su0Var.f.getClass();
        yd3 yd3Var = new yd3(obj, j3, -1);
        boolean z = !yd3Var.b();
        boolean zI = i(ox0Var, yd3Var);
        boolean zJ = j(ox0Var, yd3Var, z);
        long j4 = su0Var.d;
        return new i83(yd3Var, (j4 == -9223372036854775807L || j < j4) ? j : Math.max(0L, (-1) + j4), j2, -9223372036854775807L, j4, z, zI, zJ);
    }

    public final boolean i(ox0 ox0Var, yd3 yd3Var) {
        if (!yd3Var.b() && yd3Var.e == -1) {
            Object obj = yd3Var.a;
            int i = ox0Var.o(obj, this.a).c;
            if (ox0Var.b(i, this.b, 0L).l == ox0Var.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(ox0 ox0Var, yd3 yd3Var, boolean z) {
        int iE = ox0Var.e(yd3Var.a);
        su0 su0Var = this.a;
        int i = ox0Var.d(iE, su0Var, false).c;
        ex0 ex0Var = this.b;
        return !ox0Var.b(i, ex0Var, 0L).g && ox0Var.l(iE, su0Var, ex0Var, this.f, this.g) == -1 && z;
    }

    public final int k(ox0 ox0Var, int i) {
        this.f = i;
        return d(ox0Var);
    }

    public final int l(ox0 ox0Var, boolean z) {
        this.g = z;
        return d(ox0Var);
    }

    public final void m(a73 a73Var) {
        a73Var.getClass();
        r();
    }

    public final void n(long j) {
        h83 h83Var = this.k;
        if (h83Var != null) {
            hn.M(h83Var.m == null);
            if (h83Var.e) {
                h83Var.a.k(j - h83Var.p);
            }
        }
    }

    public final boolean o() {
        h83 h83Var = this.k;
        if (h83Var != null) {
            return !h83Var.g.h && h83Var.b() && this.k.g.e != -9223372036854775807L && this.m < 100;
        }
        return true;
    }

    public final i83 p(long j, u83 u83Var) {
        h83 h83Var = this.k;
        return h83Var == null ? f(u83Var.a, u83Var.b, u83Var.c, u83Var.r) : e(u83Var.a, h83Var, j);
    }

    public final h83 q(i83 i83Var) {
        h83 h83Var;
        long j = i83Var.b;
        h83 h83Var2 = this.k;
        long j2 = h83Var2 == null ? 1000000000000L : (h83Var2.p + h83Var2.g.e) - j;
        int i = 0;
        while (true) {
            if (i >= this.p.size()) {
                h83Var = null;
                break;
            }
            i83 i83Var2 = ((h83) this.p.get(i)).g;
            long j3 = i83Var2.e;
            long j4 = i83Var.e;
            if ((j3 == -9223372036854775807L || j3 == j4) && i83Var2.b == j && i83Var2.a.equals(i83Var.a)) {
                h83Var = (h83) this.p.remove(i);
                break;
            }
            i++;
        }
        if (h83Var == null) {
            b83 b83Var = (b83) this.q.f;
            fg3 fg3VarI = b83Var.k.i(b83Var.z);
            b83Var.d0.getClass();
            h83Var = new h83(b83Var.g, j2, b83Var.i, fg3VarI, b83Var.x, i83Var, b83Var.j);
        } else {
            h83Var.g = i83Var;
            h83Var.p = j2;
        }
        h83 h83Var3 = this.k;
        if (h83Var3 == null) {
            this.h = h83Var;
            this.i = h83Var;
            this.j = h83Var;
        } else if (h83Var != h83Var3.m) {
            h83Var3.l();
            h83Var3.m = h83Var;
        }
        this.n = null;
        this.k = h83Var;
        this.m++;
        b();
        return h83Var;
    }

    public final void r() {
        if (this.p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.p.size(); i++) {
            ((h83) this.p.get(i)).h();
        }
        this.p = arrayList;
        this.l = null;
        z();
    }

    public final h83 s() {
        return this.h;
    }

    public final h83 t() {
        return this.i;
    }

    public final h83 u() {
        return this.j;
    }

    public final h83 v() {
        h83 h83Var = this.j;
        h83 h83Var2 = this.i;
        if (h83Var == h83Var2) {
            h83Var2.getClass();
            this.j = h83Var2.m;
        }
        h83Var2.getClass();
        this.i = h83Var2.m;
        b();
        h83 h83Var3 = this.i;
        h83Var3.getClass();
        return h83Var3;
    }

    public final void w() {
        h83 h83Var = this.j;
        h83Var.getClass();
        this.j = h83Var.m;
        b();
        this.j.getClass();
    }

    public final h83 x() {
        h83 h83Var = this.h;
        if (h83Var == null) {
            return null;
        }
        if (h83Var == this.i) {
            this.i = h83Var.m;
        }
        if (h83Var == this.j) {
            this.j = h83Var.m;
        }
        h83Var.h();
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            this.k = null;
            h83 h83Var2 = this.h;
            this.n = h83Var2.b;
            this.o = h83Var2.g.a.d;
        }
        this.h = this.h.m;
        b();
        return this.h;
    }

    public final int y(h83 h83Var) {
        h83Var.getClass();
        int i = 0;
        if (h83Var == this.k) {
            return 0;
        }
        this.k = h83Var;
        int i2 = 0;
        while (true) {
            h83Var = h83Var.m;
            if (h83Var == null) {
                break;
            }
            if (h83Var == this.i) {
                h83 h83Var2 = this.h;
                this.i = h83Var2;
                this.j = h83Var2;
                i2 = 3;
            }
            if (h83Var == this.j) {
                this.j = this.i;
                i2 |= 2;
            }
            h83Var.h();
            this.m--;
        }
        h83 h83Var3 = this.k;
        h83Var3.getClass();
        if (h83Var3.m != null) {
            h83Var3.l();
            h83Var3.m = null;
            while (true) {
                dg3 dg3Var = h83Var3.o;
                if (i >= dg3Var.f) {
                    break;
                }
                dg3Var.a(i);
                bg3 bg3Var = ((bg3[]) h83Var3.o.h)[i];
                i++;
            }
        }
        b();
        return i2;
    }

    public final void z() {
        h83 h83Var = this.l;
        if (h83Var == null || h83Var.c()) {
            this.l = null;
            for (int i = 0; i < this.p.size(); i++) {
                h83 h83Var2 = (h83) this.p.get(i);
                if (!h83Var2.c()) {
                    this.l = h83Var2;
                    return;
                }
            }
        }
    }
}
