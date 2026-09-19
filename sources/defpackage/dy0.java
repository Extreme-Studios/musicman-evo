package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;

    public dy0(xe1 xe1Var, ef1 ef1Var, q63 q63Var, q63 q63Var2) {
        this.a = 14;
        this.d = xe1Var;
        this.e = ef1Var;
        this.b = q63Var;
        this.c = q63Var2;
    }

    public ay0 a() {
        return new ay0((ScheduledExecutorService) ((q63) this.b).c(), (x93) ((q63) this.c).c(), (g32) ((q63) this.d).c(), (hs1) ((q63) this.e).c());
    }

    public vy1 b() {
        return new vy1((u62) ((q63) this.b).c(), (ya1) this.c.c(), (vw1) this.d.c(), (zw1) ((r63) this.e).c(), 0);
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.b;
        v63 v63Var2 = this.c;
        v63 v63Var3 = this.d;
        v63 v63Var4 = this.e;
        switch (i) {
            case 0:
                return a();
            case 1:
                j91 j91Var = (j91) v63Var3;
                return new vy1((u62) ((q63) v63Var).c(), (ya1) v63Var2.c(), ((eh1) v63Var4).a(), new gx1((Context) j91Var.b.c(), (nf1) j91Var.c.a, 0), 0);
            case 2:
                j91 j91Var2 = (j91) v63Var3;
                return new vy1((u62) ((q63) v63Var).c(), (ya1) v63Var2.c(), ((eh1) v63Var4).a(), new kx1((Context) j91Var2.b.c(), (pf1) j91Var2.c.a), 0);
            case 3:
                return new gi1(((ti1) v63Var4).a(), (kk1) ((q63) v63Var).c(), (cl1) ((q63) v63Var2).c(), (kl1) ((q63) v63Var3).c());
            case 4:
                return new bj1((ae) v63Var2.c(), (cj1) v63Var3.c(), ((yj1) v63Var4).a(), (String) ((q63) v63Var).c());
            case 5:
                j91 j91Var3 = (j91) v63Var3;
                return new vy1((u62) ((q63) v63Var).c(), (ya1) v63Var2.c(), ((eh1) v63Var4).a(), new gx1((Context) j91Var3.b.c(), (sf1) j91Var3.c.a, 1), 0);
            case 6:
                jr1 jr1Var = (jr1) v63Var2.c();
                uq1 uq1Var = (uq1) ((do1) v63Var3).b.h;
                dq.D(uq1Var);
                kh1 kh1Var = (kh1) ((q63) v63Var).c();
                bo1 bo1Var = (bo1) ((eo1) v63Var4).b.c();
                dq.D(bo1Var);
                return new jp1(jr1Var, uq1Var, kh1Var, bo1Var);
            case 7:
                return new oq1(((xe1) v63Var).a(), ((tz0) v63Var2).a(), ((bp1) v63Var3).a(), (no1) ((q12) v63Var4).c());
            case 8:
                return new pq1((String) ((ti1) v63Var).b.i, (no1) ((q12) v63Var2).c(), ((tz0) v63Var3).a(), (es1) v63Var4.c());
            case 9:
                j91 j91Var4 = (j91) v63Var3;
                return new vy1((u62) ((q63) v63Var).c(), (ya1) v63Var2.c(), ((eh1) v63Var4).a(), new gx1((Context) j91Var4.b.c(), (wf1) j91Var4.c.a, 2), 0);
            case 10:
                return new hw1(((xe1) v63Var3).a(), (bw1) ((q63) v63Var).c(), (id3) v63Var4.c(), (es1) ((q63) v63Var2).c());
            case 11:
                return b();
            case 12:
                return new vy1((u62) ((q63) v63Var).c(), (ya1) v63Var2.c(), (ux0) ((az1) v63Var3).b.g, new bz1((sf1) ((rs1) v63Var4).b.a), 1);
            case 13:
                return d();
            case 14:
                return new e72(((xe1) v63Var3).a(), ((ef1) v63Var4).a(), (qr1) ((q63) v63Var).c(), new zf0(15), (se1) ((q63) v63Var2).c());
            case 15:
                return new nd2(q63.b((w63) v63Var2), q63.b((w63) v63Var3), (ExecutorService) ((s63) v63Var4).a, q63.b((q63) v63Var));
            default:
                o63 o63VarB = q63.b((q63) v63Var);
                o63 o63VarB2 = q63.b((q63) v63Var2);
                o63 o63VarB3 = q63.b(v63Var3);
                vc2 vc2Var = (vc2) v63Var4.c();
                return new tf2(o63VarB, o63VarB2, o63VarB3, vc2Var.J().z(), vc2Var.J().C());
        }
    }

    public o22 d() {
        Context contextA = ((xe1) this.c).a();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new o22(contextA, ya1Var, ((w63) this.d).c(), (d72) ((q63) this.b).c(), (es1) this.e.c());
    }

    public dy0(xe1 xe1Var, q63 q63Var, v63 v63Var, q63 q63Var2) {
        this.a = 10;
        this.d = xe1Var;
        this.b = q63Var;
        this.e = v63Var;
        this.c = q63Var2;
    }

    public dy0(ti1 ti1Var, q63 q63Var, q63 q63Var2, q63 q63Var3) {
        this.a = 3;
        this.e = ti1Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
    }

    public /* synthetic */ dy0(v63 v63Var, r63 r63Var, q63 q63Var, v63 v63Var2, int i) {
        this.a = i;
        this.c = v63Var;
        this.d = r63Var;
        this.b = q63Var;
        this.e = v63Var2;
    }

    public /* synthetic */ dy0(v63 v63Var, v63 v63Var2, r63 r63Var, q63 q63Var, int i) {
        this.a = i;
        this.c = v63Var;
        this.d = v63Var2;
        this.e = r63Var;
        this.b = q63Var;
    }

    public /* synthetic */ dy0(v63 v63Var, v63 v63Var2, v63 v63Var3, v63 v63Var4, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = v63Var2;
        this.d = v63Var3;
        this.e = v63Var4;
    }
}
