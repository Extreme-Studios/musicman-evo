package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ud3 extends ld3 {
    public final dd3 k;
    public final boolean l;
    public final ex0 m;
    public final su0 n;
    public sd3 o;
    public rd3 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public ud3(dd3 dd3Var, boolean z) {
        boolean z2;
        this.k = dd3Var;
        if (z) {
            dd3Var.e();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new ex0();
        this.n = new su0();
        dd3Var.d();
        this.o = new sd3(new td3(dd3Var.f()), ex0.m, sd3.e);
    }

    @Override // defpackage.dd3
    public final void a(li0 li0Var) {
        if (this.s) {
            sd3 sd3Var = this.o;
            this.o = new sd3(new x83(this.o.b, li0Var), sd3Var.c, sd3Var.d);
        } else {
            this.o = new sd3(new td3(li0Var), ex0.m, sd3.e);
        }
        this.k.a(li0Var);
    }

    @Override // defpackage.dd3
    public final void b(xd3 xd3Var) {
        rd3 rd3Var = (rd3) xd3Var;
        xd3 xd3Var2 = rd3Var.j;
        if (xd3Var2 != null) {
            dd3 dd3Var = rd3Var.i;
            dd3Var.getClass();
            dd3Var.b(xd3Var2);
        }
        if (xd3Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.dd3
    public final void d() {
        this.k.d();
    }

    @Override // defpackage.dd3
    public final void e() {
        this.k.e();
    }

    @Override // defpackage.dd3
    public final li0 f() {
        return this.k.f();
    }

    @Override // defpackage.dd3
    public final void h(qp2 qp2Var) {
        this.j = qp2Var;
        String str = qz1.a;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.i = new Handler(looperMyLooper, null);
        if (this.l) {
            return;
        }
        this.q = true;
        t(null, this.k);
    }

    @Override // defpackage.ld3, defpackage.dd3
    public final void j() {
        this.r = false;
        this.q = false;
        super.j();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    @Override // defpackage.ld3
    public final void s(Object obj, dd3 dd3Var, ox0 ox0Var) {
        long j;
        sd3 sd3Var;
        sd3 sd3Var2;
        yd3 yd3VarA = null;
        if (this.r) {
            sd3 sd3Var3 = this.o;
            this.o = new sd3(ox0Var, sd3Var3.c, sd3Var3.d);
            rd3 rd3Var = this.p;
            if (rd3Var != null) {
                y(rd3Var.l);
            }
        } else if (ox0Var.g()) {
            if (this.s) {
                sd3 sd3Var4 = this.o;
                sd3Var2 = new sd3(ox0Var, sd3Var4.c, sd3Var4.d);
            } else {
                sd3Var2 = new sd3(ox0Var, ex0.m, sd3.e);
            }
            this.o = sd3Var2;
        } else {
            ex0 ex0Var = this.m;
            ox0Var.b(0, ex0Var, 0L);
            Object obj2 = ex0Var.a;
            rd3 rd3Var2 = this.p;
            if (rd3Var2 != null) {
                j = rd3Var2.g;
                this.o.o(rd3Var2.f.a, this.n);
                this.o.b(0, ex0Var, 0L);
                if (j == 0) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairM = ox0Var.m(ex0Var, this.n, 0, j);
            Object obj3 = pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            if (this.s) {
                sd3 sd3Var5 = this.o;
                sd3Var = new sd3(ox0Var, sd3Var5.c, sd3Var5.d);
            } else {
                sd3Var = new sd3(ox0Var, obj2, obj3);
            }
            this.o = sd3Var;
            rd3 rd3Var3 = this.p;
            if (rd3Var3 != null && y(jLongValue)) {
                yd3 yd3Var = rd3Var3.f;
                Object obj4 = yd3Var.a;
                if (this.o.d != null && obj4.equals(sd3.e)) {
                    obj4 = this.o.d;
                }
                yd3VarA = yd3Var.a(obj4);
            }
        }
        this.s = true;
        this.r = true;
        k(this.o);
        if (yd3VarA != null) {
            rd3 rd3Var4 = this.p;
            rd3Var4.getClass();
            rd3Var4.n(yd3VarA);
        }
    }

    @Override // defpackage.ld3
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // defpackage.ld3
    public final yd3 v(Object obj, yd3 yd3Var) {
        Object obj2 = this.o.d;
        Object obj3 = yd3Var.a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = sd3.e;
        }
        return yd3Var.a(obj3);
    }

    @Override // defpackage.ld3
    public final /* synthetic */ void w(long j, Object obj) {
    }

    @Override // defpackage.dd3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final rd3 c(yd3 yd3Var, fg3 fg3Var, long j) {
        rd3 rd3Var = new rd3(yd3Var, fg3Var, j);
        hn.M(rd3Var.i == null);
        dd3 dd3Var = this.k;
        rd3Var.i = dd3Var;
        if (!this.r) {
            this.p = rd3Var;
            if (!this.q) {
                this.q = true;
                t(null, dd3Var);
            }
            return rd3Var;
        }
        Object obj = yd3Var.a;
        if (this.o.d != null && obj.equals(sd3.e)) {
            obj = this.o.d;
        }
        rd3Var.n(yd3Var.a(obj));
        return rd3Var;
    }

    public final boolean y(long j) {
        rd3 rd3Var = this.p;
        int iE = this.o.e(rd3Var.f.a);
        if (iE == -1) {
            return false;
        }
        sd3 sd3Var = this.o;
        su0 su0Var = this.n;
        sd3Var.d(iE, su0Var, false);
        long j2 = su0Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        rd3Var.l = j;
        return true;
    }
}
