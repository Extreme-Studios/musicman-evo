package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 implements sc0 {
    public vj2 a;
    public de3 b;
    public long c;
    public long d;
    public int e;
    public final /* synthetic */ cc0 f;

    public yb0(cc0 cc0Var, Context context) {
        this.f = cc0Var;
        qz1.j(context);
        tj2 tj2Var = vj2.g;
        this.a = qk2.j;
        this.d = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0044 A[Catch: ln1 -> 0x0036, TryCatch #0 {ln1 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0053 A[Catch: ln1 -> 0x0036, TryCatch #0 {ln1 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086 A[Catch: ln1 -> 0x0036, TRY_LEAVE, TryCatch #0 {ln1 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    @Override // defpackage.sc0
    public final boolean A0(de3 de3Var) throws rc0 {
        cc0 cc0Var = this.f;
        boolean z = false;
        boolean zG = true;
        hn.M(cc0Var.n == 0);
        c43 c43Var = de3Var.C;
        if (c43Var == null || !c43Var.d()) {
            c43Var = c43.h;
        }
        try {
            int i = c43Var.c;
            if (i != 7) {
                if (i == 6) {
                    if (Build.VERSION.SDK_INT >= 33 && yd.G("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z = true;
                    }
                    zG = z;
                } else if (i == 7) {
                    zG = yd.G("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zG && Build.VERSION.SDK_INT >= 29) {
                    String str = qz1.a;
                    Locale locale = Locale.US;
                    s90.Q("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                    c43 c43Var2 = c43.h;
                } else if (i != 2 || i == 10) {
                    c43 c43Var3 = c43.h;
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (!(i2 >= 33 && yd.G("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                    }
                }
                i = 7;
                if (i == 6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        z = true;
                    }
                    zG = z;
                } else if (i == 7) {
                    zG = yd.G("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zG) {
                    if (i != 2) {
                        c43 c43Var4 = c43.h;
                    } else {
                        c43 c43Var5 = c43.h;
                    }
                } else if (i != 2) {
                    c43 c43Var6 = c43.h;
                } else {
                    c43 c43Var7 = c43.h;
                }
            }
            ig igVar = cc0Var.f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            cc0Var.k = igVar.i(looperMyLooper, null);
            cc0Var.b.a();
            throw null;
        } catch (ln1 e) {
            throw new rc0(e, de3Var);
        }
    }

    @Override // defpackage.sc0
    public final void J() {
        cc0 cc0Var = this.f;
        if (cc0Var.n == 2) {
            return;
        }
        wx1 wx1Var = cc0Var.k;
        if (wx1Var != null) {
            wx1Var.a.removeCallbacksAndMessages(null);
        }
        cc0Var.l = null;
        cc0Var.n = 2;
    }

    @Override // defpackage.sc0
    public final void M() {
        cc0 cc0Var = this.f;
        if (cc0Var.j.e() == 0) {
            cc0Var.e.M();
            return;
        }
        d6 d6Var = new d6();
        if (cc0Var.j.e() <= 0) {
            cc0Var.j = d6Var;
        } else {
            ((bc0) cc0Var.j.f()).getClass();
            throw null;
        }
    }

    @Override // defpackage.sc0
    public final boolean P(boolean z) {
        return this.f.e.a.f(false);
    }

    @Override // defpackage.sc0
    public final void a() {
        cc0 cc0Var = this.f;
        if (cc0Var.d) {
            cc0Var.e.a();
        }
    }

    @Override // defpackage.sc0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.sc0
    public final void c() {
        cc0 cc0Var = this.f;
        if (cc0Var.d) {
            cc0Var.e.c();
        }
    }

    @Override // defpackage.sc0
    public final boolean g() {
        return false;
    }

    @Override // defpackage.sc0
    public final void j() {
        long j = this.d;
        cc0 cc0Var = this.f;
        cc0Var.getClass();
        if (cc0Var.o >= j) {
            cc0Var.e.j();
        }
    }

    @Override // defpackage.sc0
    public final Surface k() {
        hn.M(false);
        throw null;
    }

    @Override // defpackage.sc0
    public final void n() {
        cc0 cc0Var = this.f;
        cc0Var.getClass();
        nw1.c.getClass();
        cc0Var.l = null;
    }

    @Override // defpackage.sc0
    public final void o0(boolean z) {
        d6 d6Var;
        this.d = -9223372036854775807L;
        cc0 cc0Var = this.f;
        if (cc0Var.n == 1) {
            cc0Var.m++;
            cc0Var.e.o0(z);
            while (true) {
                int iE = cc0Var.j.e();
                d6Var = cc0Var.j;
                if (iE <= 1) {
                    break;
                } else {
                    d6Var.f();
                }
            }
            if (d6Var.e() == 1) {
                ((bc0) cc0Var.j.f()).getClass();
                throw null;
            }
            cc0Var.o = -9223372036854775807L;
            wx1 wx1Var = cc0Var.k;
            wx1Var.getClass();
            wx1Var.d(new q7(16, cc0Var));
        }
    }

    @Override // defpackage.sc0
    public final void p0(float f) {
        cc0 cc0Var = this.f;
        hc0 hc0Var = cc0Var.i;
        hc0Var.getClass();
        hn.v(f > 0.0f);
        hc0Var.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        hc0Var.a();
        cc0Var.e.p0(f);
    }

    @Override // defpackage.sc0
    public final void q0(dc0 dc0Var) {
        this.f.e.j = dc0Var;
    }

    @Override // defpackage.sc0
    public final boolean r0(long j, tb0 tb0Var) {
        int i;
        hn.M(false);
        long j2 = j + this.c;
        cc0 cc0Var = this.f;
        hc0 hc0Var = cc0Var.i;
        long j3 = hc0Var.a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * hc0Var.c) + hc0Var.b);
        if (j4 != -9223372036854775807L) {
            long j5 = cc0Var.h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.e) < 2) {
                this.e = i + 1;
                tb0Var.a();
                return true;
            }
        }
        int i2 = cc0Var.p;
        if (i2 == -1 || i2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.sc0
    public final void s0(long j, long j2) throws rc0 {
        this.f.e.s0(j + this.c, j2);
    }

    @Override // defpackage.sc0
    public final void t0(int i) {
        this.f.e.t0(i);
    }

    @Override // defpackage.sc0
    public final void u0(de3 de3Var, long j, int i, List list) {
        hn.M(false);
        this.a = vj2.m(list);
        this.b = de3Var;
        this.f.getClass();
        uc3 uc3Var = new uc3(de3Var);
        c43 c43Var = de3Var.C;
        if (c43Var == null || !c43Var.d()) {
            c43Var = c43.h;
        }
        uc3Var.B = c43Var;
        uc3Var.b();
        throw null;
    }

    @Override // defpackage.sc0
    public final void v0(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = vj2.m(list);
        de3 de3Var = this.b;
        if (de3Var == null) {
            return;
        }
        uc3 uc3Var = new uc3(de3Var);
        c43 c43Var = de3Var.C;
        if (c43Var == null || !c43Var.d()) {
            c43Var = c43.h;
        }
        uc3Var.B = c43Var;
        uc3Var.b();
        throw null;
    }

    @Override // defpackage.sc0
    public final void x0(boolean z) {
        cc0 cc0Var = this.f;
        if (cc0Var.d) {
            cc0Var.e.x0(z);
        }
    }

    @Override // defpackage.sc0
    public final void y0(long j) {
        this.c = j;
    }

    @Override // defpackage.sc0
    public final void z0(Surface surface, nw1 nw1Var) {
        cc0 cc0Var = this.f;
        Pair pair = cc0Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((nw1) cc0Var.l.second).equals(nw1Var)) {
            return;
        }
        cc0Var.l = Pair.create(surface, nw1Var);
        nw1Var.getClass();
    }

    @Override // defpackage.sc0
    public final void d() {
    }

    @Override // defpackage.sc0
    public final void w0(sb0 sb0Var) {
    }
}
