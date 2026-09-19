package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nj1 implements ck1, qm1, xl1, jk1, qt0 {
    public final kk1 f;
    public final kl1 g;
    public final x42 h;
    public final ScheduledExecutorService i;
    public final Executor j;
    public ScheduledFuture l;
    public final String n;
    public final tn2 k = new tn2();
    public final AtomicBoolean m = new AtomicBoolean();

    public nj1(kk1 kk1Var, x42 x42Var, ScheduledExecutorService scheduledExecutorService, ya1 ya1Var, String str, kl1 kl1Var) {
        this.f = kk1Var;
        this.h = x42Var;
        this.i = scheduledExecutorService;
        this.j = ya1Var;
        this.n = str;
        this.g = kl1Var;
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        if (((Boolean) tu0.e.c.a(lx0.lc)).booleanValue() && this.n.equals("com.google.ads.mediation.admob.AdMobAdapter") && pt0Var.j && this.m.compareAndSet(false, true) && this.h.e != 3) {
            jn.p("Full screen 1px impression occurred");
            this.f.a();
        }
    }

    @Override // defpackage.qm1
    public final void e() {
        x42 x42Var = this.h;
        int i = x42Var.e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.g.a();
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.E1)).booleanValue() && x42Var.Y == 2) {
            int i2 = x42Var.q;
            if (i2 == 0) {
                this.f.a();
                return;
            }
            dr0 dr0Var = new dr0(20, this);
            tn2 tn2Var = this.k;
            tn2Var.a(new in2(tn2Var, 0, dr0Var), this.j);
            this.l = this.i.schedule(new va1(15, this), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.xl1
    public final synchronized void p() {
        if (this.h.e == 4) {
            this.f.a();
            return;
        }
        tn2 tn2Var = this.k;
        if (tn2Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        tn2Var.d(Boolean.TRUE);
    }

    @Override // defpackage.ck1
    public final void r() {
        x42 x42Var = this.h;
        if (x42Var.e == 3) {
            return;
        }
        int i = x42Var.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) tu0.e.c.a(lx0.lc)).booleanValue() && this.n.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f.a();
        }
    }

    @Override // defpackage.jk1
    public final synchronized void s(fu1 fu1Var) {
        try {
            tn2 tn2Var = this.k;
            if (tn2Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            tn2Var.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ck1
    public final void U() {
    }

    @Override // defpackage.ck1
    public final void a() {
    }

    @Override // defpackage.ck1
    public final void b() {
    }

    @Override // defpackage.ck1
    public final void d() {
    }

    @Override // defpackage.qm1
    public final void f() {
    }

    @Override // defpackage.xl1
    public final void w() {
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
    }
}
