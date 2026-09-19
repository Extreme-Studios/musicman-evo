package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 implements sc0 {
    public final gc0 a;
    public final hc0 b;
    public final lc0 c;
    public final ArrayDeque d;
    public Surface e;
    public de3 f;
    public long g;
    public qc0 h;
    public Executor i;
    public dc0 j;

    public ob0(gc0 gc0Var, hc0 hc0Var, ig igVar) {
        this.a = gc0Var;
        this.b = hc0Var;
        gc0Var.k = igVar;
        this.c = new lc0(new us2(6, this), gc0Var, hc0Var);
        this.d = new ArrayDeque();
        this.f = new de3(new uc3());
        this.g = -9223372036854775807L;
        this.h = qc0.a;
        this.i = o4.g;
        this.j = n73.g;
    }

    @Override // defpackage.sc0
    public final boolean A0(de3 de3Var) {
        return true;
    }

    @Override // defpackage.sc0
    public final void M() {
        gc0 gc0Var = this.a;
        if (gc0Var.d == 0) {
            gc0Var.d = 1;
        }
    }

    @Override // defpackage.sc0
    public final boolean P(boolean z) {
        return this.a.f(z);
    }

    @Override // defpackage.sc0
    public final void a() {
        this.b.a();
        this.a.b();
    }

    @Override // defpackage.sc0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.sc0
    public final void c() {
        this.b.a();
        this.a.c();
    }

    @Override // defpackage.sc0
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sc0
    public final boolean g() {
        lc0 lc0Var = this.c;
        long j = lc0Var.i;
        return j != -9223372036854775807L && lc0Var.h == j;
    }

    @Override // defpackage.sc0
    public final void j() {
        lc0 lc0Var = this.c;
        long j = lc0Var.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            lc0Var.g = Long.MIN_VALUE;
            lc0Var.h = Long.MIN_VALUE;
        }
        lc0Var.i = j;
    }

    @Override // defpackage.sc0
    public final Surface k() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.sc0
    public final void n() {
        this.e = null;
        this.a.d(null);
    }

    @Override // defpackage.sc0
    public final void o0(boolean z) {
        if (z) {
            gc0 gc0Var = this.a;
            kc0 kc0Var = gc0Var.b;
            kc0Var.m = 0L;
            kc0Var.p = -1L;
            kc0Var.n = -1L;
            gc0Var.g = -9223372036854775807L;
            gc0Var.e = -9223372036854775807L;
            gc0Var.d = Math.min(gc0Var.d, 1);
            gc0Var.h = -9223372036854775807L;
        }
        this.b.a();
        lc0 lc0Var = this.c;
        ih0 ih0Var = lc0Var.e;
        ih0Var.f = 0;
        ih0Var.g = -1;
        ih0Var.h = 0;
        lc0Var.g = -9223372036854775807L;
        lc0Var.h = -9223372036854775807L;
        lc0Var.i = -9223372036854775807L;
        d6 d6Var = lc0Var.d;
        if (d6Var.e() > 0) {
            hn.v(d6Var.e() > 0);
            while (d6Var.e() > 1) {
                d6Var.f();
            }
            Object objF = d6Var.f();
            objF.getClass();
            lc0Var.k = ((Long) objF).longValue();
        }
        d6 d6Var2 = lc0Var.c;
        if (d6Var2.e() > 0) {
            hn.v(d6Var2.e() > 0);
            while (d6Var2.e() > 1) {
                d6Var2.f();
            }
            Object objF2 = d6Var2.f();
            objF2.getClass();
            d6Var2.d(0L, (i61) objF2);
        }
        this.d.clear();
    }

    @Override // defpackage.sc0
    public final void p0(float f) {
        this.a.h(f);
    }

    @Override // defpackage.sc0
    public final void q0(dc0 dc0Var) {
        this.j = dc0Var;
    }

    @Override // defpackage.sc0
    public final boolean r0(long j, tb0 tb0Var) {
        this.d.add(tb0Var);
        lc0 lc0Var = this.c;
        ih0 ih0Var = lc0Var.e;
        int i = ih0Var.h;
        long[] jArr = (long[]) ih0Var.j;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                j7.a();
                return false;
            }
            long[] jArr2 = new long[i2];
            int i3 = ih0Var.f;
            int i4 = length - i3;
            System.arraycopy(jArr, i3, jArr2, 0, i4);
            System.arraycopy((long[]) ih0Var.j, 0, jArr2, i4, i3);
            ih0Var.f = 0;
            ih0Var.g = ih0Var.h - 1;
            ih0Var.j = jArr2;
            ih0Var.i = i2 - 1;
            jArr = jArr2;
        }
        int i5 = (ih0Var.g + 1) & ih0Var.i;
        ih0Var.g = i5;
        jArr[i5] = j;
        ih0Var.h++;
        lc0Var.g = j;
        lc0Var.i = -9223372036854775807L;
        this.i.execute(new s73(4, this));
        return true;
    }

    @Override // defpackage.sc0
    public final void s0(long j, long j2) throws rc0 {
        try {
            this.c.a(j, j2);
        } catch (q43 e) {
            throw new rc0(e, this.f);
        }
    }

    @Override // defpackage.sc0
    public final void t0(int i) {
        kc0 kc0Var = this.a.b;
        if (kc0Var.j == i) {
            return;
        }
        kc0Var.j = i;
        kc0Var.c(true);
    }

    @Override // defpackage.sc0
    public final void u0(de3 de3Var, long j, int i, List list) {
        hn.M(list.isEmpty());
        int i2 = de3Var.t;
        int i3 = de3Var.u;
        de3 de3Var2 = this.f;
        int i4 = de3Var2.t;
        lc0 lc0Var = this.c;
        if (i2 != i4 || i3 != de3Var2.u) {
            long j2 = lc0Var.g;
            lc0Var.c.d(j2 == -9223372036854775807L ? 0L : j2 + 1, new i61(1.0f, i2, i3));
        }
        float f = de3Var.x;
        if (f != this.f.x) {
            this.a.e(f);
        }
        this.f = de3Var;
        if (j != this.g) {
            if (lc0Var.e.h == 0) {
                lc0Var.a.a(i);
                lc0Var.k = j;
            } else {
                d6 d6Var = lc0Var.d;
                long j3 = lc0Var.g;
                d6Var.d(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.sc0
    public final void v0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sc0
    public final void w0(sb0 sb0Var) {
        this.h = sb0Var;
        this.i = cn2.f;
    }

    @Override // defpackage.sc0
    public final void x0(boolean z) {
        gc0 gc0Var = this.a;
        gc0Var.i = z;
        gc0Var.h = -9223372036854775807L;
    }

    @Override // defpackage.sc0
    public final void y0(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sc0
    public final void z0(Surface surface, nw1 nw1Var) {
        this.e = surface;
        this.a.d(surface);
    }

    @Override // defpackage.sc0
    public final void J() {
    }
}
