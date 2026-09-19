package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u32 extends b71 implements lb3 {
    public final if1 f;
    public final Context g;
    public final String i;
    public final p32 j;
    public final o32 k;
    public final d60 l;
    public final es1 m;
    public mh1 o;
    public ph1 p;
    public AtomicBoolean h = new AtomicBoolean();
    public long n = -1;

    public u32(if1 if1Var, Context context, String str, p32 p32Var, o32 o32Var, d60 d60Var, es1 es1Var) {
        this.f = if1Var;
        this.g = context;
        this.i = str;
        this.j = p32Var;
        this.k = o32Var;
        this.l = d60Var;
        this.m = es1Var;
        o32Var.k.set(this);
    }

    @Override // defpackage.n71
    public final synchronized boolean B() {
        hp hpVar;
        hpVar = this.j.j;
        return (hpVar == null || hpVar.isDone()) ? false : true;
    }

    @Override // defpackage.n71
    public final void B1(kf3 kf3Var) {
        this.j.i.i = kf3Var;
    }

    public final synchronized void B3(int i) {
        try {
            if (this.h.compareAndSet(false, true)) {
                this.k.b();
                mh1 mh1Var = this.o;
                if (mh1Var != null) {
                    vc3.C.g.h(mh1Var);
                }
                if (this.p != null) {
                    long jElapsedRealtime = -1;
                    if (this.n != -1) {
                        vc3.C.k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.n;
                    }
                    this.p.e(i, jElapsedRealtime);
                }
                r();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final synchronized String D() {
        return null;
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            B3(2);
            return;
        }
        if (i2 == 1) {
            B3(4);
        } else if (i2 != 2) {
            B3(6);
        } else {
            B3(3);
        }
    }

    @Override // defpackage.n71
    public final synchronized boolean K() {
        return false;
    }

    @Override // defpackage.n71
    public final synchronized void K2(ee2 ee2Var) {
    }

    @Override // defpackage.n71
    public final void L2(nu0 nu0Var) {
        this.k.g.set(nu0Var);
    }

    @Override // defpackage.n71
    public final synchronized lu1 M() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized void O1(yh1 yh1Var) {
    }

    @Override // defpackage.n71
    public final synchronized void P0(kb3 kb3Var) {
        dq.d("setAdSize must be called on the main UI thread.");
    }

    @Override // defpackage.n71
    public final synchronized hv1 Q() {
        return null;
    }

    @Override // defpackage.lb3
    public final synchronized void S2() {
        ph1 ph1Var = this.p;
        if (ph1Var != null) {
            vc3.C.k.getClass();
            ph1Var.e(1, SystemClock.elapsedRealtime() - this.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // defpackage.n71
    public final synchronized boolean Z(f93 f93Var) {
        boolean z;
        try {
            int i = 1;
            if (!f93Var.b()) {
                if (((Boolean) py0.d.u()).booleanValue()) {
                    if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (this.l.h < ((Integer) tu0.e.c.a(lx0.Xb)).intValue() || !z) {
                    dq.d("loadAd must be called on the main UI thread.");
                }
            }
            zb3 zb3Var = vc3.C.c;
            if (zb3.h(this.g) && f93Var.x == null) {
                jn.M("Failed to load the ad because app ID is missing.");
                this.k.Z(a23.E(4, null, null));
                return false;
            }
            if (B()) {
                return false;
            }
            this.h = new AtomicBoolean();
            return this.j.a(f93Var, this.i, new q32(20), new rz1(i, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final rm c() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized void d() {
        dq.d("pause must be called on the main UI thread.");
    }

    @Override // defpackage.n71
    public final synchronized void e() {
        dq.d("resume must be called on the main UI thread.");
    }

    @Override // defpackage.lb3
    public final synchronized void f() {
        if (this.p != null) {
            vc3 vc3Var = vc3.C;
            vc3Var.k.getClass();
            this.n = SystemClock.elapsedRealtime();
            int i = this.p.m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f.d.c();
                ae aeVar = vc3Var.k;
                mh1 mh1Var = new mh1(scheduledExecutorService, aeVar);
                this.o = mh1Var;
                t32 t32Var = new t32(this, 0);
                synchronized (mh1Var) {
                    mh1Var.k = t32Var;
                    aeVar.getClass();
                    long j = i;
                    mh1Var.i = SystemClock.elapsedRealtime() + j;
                    mh1Var.h = scheduledExecutorService.schedule(t32Var, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // defpackage.n71
    public final synchronized void i() {
    }

    @Override // defpackage.n71
    public final synchronized void i1(boolean z) {
    }

    @Override // defpackage.n71
    public final Bundle k() {
        return new Bundle();
    }

    @Override // defpackage.n71
    public final long k0() {
        return 0L;
    }

    @Override // defpackage.n71
    public final boolean l() {
        return false;
    }

    @Override // defpackage.n71
    public final synchronized void m() {
    }

    @Override // defpackage.n71
    public final synchronized kb3 o() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized void o3(ux0 ux0Var) {
    }

    @Override // defpackage.n71
    public final b11 q2() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized void r() {
        dq.d("destroy must be called on the main UI thread.");
        ph1 ph1Var = this.p;
        if (ph1Var != null) {
            ph1Var.d();
        }
    }

    @Override // defpackage.n71
    public final ig1 s() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized String u() {
        return null;
    }

    @Override // defpackage.n71
    public final synchronized String v() {
        return this.i;
    }

    @Override // defpackage.lb3
    public final void C1() {
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.n71
    public final void G() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.lb3
    public final void N1() {
    }

    @Override // defpackage.lb3
    public final void Y() {
    }

    @Override // defpackage.lb3
    public final void g3() {
    }

    @Override // defpackage.lb3
    public final void i3() {
    }

    @Override // defpackage.n71
    public final void j2() {
    }

    @Override // defpackage.n71
    public final void n() {
    }

    @Override // defpackage.lb3
    public final void n2() {
    }

    @Override // defpackage.n71
    public final void p0() {
    }

    @Override // defpackage.n71
    public final void q() {
    }

    @Override // defpackage.n71
    public final void E1(String str) {
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
    }

    @Override // defpackage.n71
    public final void k3(rm rmVar) {
    }

    @Override // defpackage.n71
    public final void o2(y71 y71Var) {
    }

    @Override // defpackage.n71
    public final void p2(xi1 xi1Var) {
    }

    @Override // defpackage.n71
    public final void t1(long j) {
    }

    @Override // defpackage.n71
    public final void u1(boolean z) {
    }

    @Override // defpackage.n71
    public final void c1(f93 f93Var, m21 m21Var) {
    }
}
