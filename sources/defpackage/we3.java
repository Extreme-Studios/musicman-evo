package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class we3 extends dd3 {
    public final de2 h;
    public final bz1 i;
    public final ig j;
    public final int k;
    public boolean l;
    public long m;
    public boolean n;
    public boolean o;
    public qp2 p;
    public li0 q;

    public /* synthetic */ we3(li0 li0Var, de2 de2Var, bz1 bz1Var, lg3 lg3Var, int i) {
        ig igVar = ig.m;
        this.q = li0Var;
        this.h = de2Var;
        this.i = bz1Var;
        this.j = igVar;
        this.k = i;
        this.l = true;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.dd3
    public final synchronized void a(li0 li0Var) {
        this.q = li0Var;
    }

    @Override // defpackage.dd3
    public final void b(xd3 xd3Var) {
        qe3 qe3Var = (qe3) xd3Var;
        if (qe3Var.z) {
            for (ze3 ze3Var : qe3Var.w) {
                ze3Var.l();
                if (ze3Var.g != null) {
                    ze3Var.g = null;
                    ze3Var.f = null;
                }
            }
        }
        p83 p83Var = qe3Var.o;
        mg3 mg3Var = (mg3) p83Var.h;
        if (mg3Var != null) {
            mg3Var.a(true);
        }
        h90 h90Var = (h90) p83Var.g;
        h90Var.execute(new ne3(qe3Var, 3));
        ((ExecutorService) ((Executor) h90Var.g)).shutdown();
        qe3Var.t.removeCallbacksAndMessages(null);
        qe3Var.u = null;
        qe3Var.R = true;
    }

    @Override // defpackage.dd3
    public final xd3 c(yd3 yd3Var, fg3 fg3Var, long j) {
        oe2 oe2VarMo12a = this.h.mo12a();
        qp2 qp2Var = this.p;
        if (qp2Var != null) {
            oe2VarMo12a.c(qp2Var);
        }
        of0 of0Var = f().b;
        of0Var.getClass();
        Uri uri = of0Var.a;
        this.g.getClass();
        return new qe3(uri, oe2VarMo12a, new hb3((qd0) this.i.f), this.j, new xb3(this.d.b, yd3Var), new xb3(this.c.b, yd3Var), this, fg3Var, this.k, qz1.r(-9223372036854775807L));
    }

    @Override // defpackage.dd3
    public final synchronized li0 f() {
        return this.q;
    }

    @Override // defpackage.dd3
    public final void h(qp2 qp2Var) {
        this.p = qp2Var;
        Looper.myLooper().getClass();
        this.g.getClass();
        t();
    }

    public final void s(long j, ee0 ee0Var, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.m;
        }
        boolean zC = ee0Var.c();
        if (!this.l && this.m == j && this.n == zC && this.o == z) {
            return;
        }
        this.m = j;
        this.n = zC;
        this.o = z;
        this.l = false;
        t();
    }

    public final void t() {
        long j = this.m;
        boolean z = this.n;
        boolean z2 = this.o;
        li0 li0VarF = f();
        ox0 df3Var = new df3(j, j, z, li0VarF, z2 ? li0VarF.c : null);
        if (this.l) {
            df3Var = new re3(df3Var);
        }
        k(df3Var);
    }

    @Override // defpackage.dd3
    public final void j() {
    }

    @Override // defpackage.dd3
    public final void r() {
    }
}
