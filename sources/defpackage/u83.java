package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u83 {
    public static final yd3 t = new yd3(new Object(), -1);
    public final ox0 a;
    public final yd3 b;
    public final long c;
    public final long d;
    public final int e;
    public final q43 f;
    public final boolean g;
    public final gf3 h;
    public final dg3 i;
    public final List j;
    public final yd3 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final up0 o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public u83(ox0 ox0Var, yd3 yd3Var, long j, long j2, int i, q43 q43Var, boolean z, gf3 gf3Var, dg3 dg3Var, List list, yd3 yd3Var2, boolean z2, int i2, int i3, up0 up0Var, long j3, long j4, long j5, long j6) {
        this.a = ox0Var;
        this.b = yd3Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = q43Var;
        this.g = z;
        this.h = gf3Var;
        this.i = dg3Var;
        this.j = list;
        this.k = yd3Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = up0Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
    }

    public static u83 a(dg3 dg3Var) {
        cu0 cu0Var = ox0.a;
        gf3 gf3Var = gf3.d;
        qk2 qk2Var = qk2.j;
        up0 up0Var = up0.d;
        yd3 yd3Var = t;
        return new u83(cu0Var, yd3Var, -9223372036854775807L, 0L, 1, null, false, gf3Var, dg3Var, qk2Var, yd3Var, false, 1, 0, up0Var, 0L, 0L, 0L, 0L);
    }

    public final u83 b(yd3 yd3Var, long j, long j2, long j3, long j4, gf3 gf3Var, dg3 dg3Var, List list) {
        yd3 yd3Var2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        up0 up0Var = this.o;
        long j5 = this.p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new u83(this.a, yd3Var, j2, j3, this.e, this.f, this.g, gf3Var, dg3Var, list, yd3Var2, z, i, i2, up0Var, j5, j4, j, jElapsedRealtime);
    }

    public final u83 c(ox0 ox0Var) {
        return new u83(ox0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final u83 d(int i) {
        return new u83(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final u83 e(q43 q43Var) {
        return new u83(this.a, this.b, this.c, this.d, this.e, q43Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final u83 f(boolean z) {
        return new u83(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final u83 g(yd3 yd3Var) {
        return new u83(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, yd3Var, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final u83 h(int i, int i2, boolean z) {
        return new u83(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.p, this.q, this.r, this.s);
    }

    public final boolean i() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
