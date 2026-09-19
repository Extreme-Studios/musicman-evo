package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends b71 {
    public final kb3 f;
    public final Context g;
    public final o42 h;
    public final String i;
    public final d60 j;
    public final nz1 k;
    public final p42 l;
    public final zq0 m;
    public final es1 n;
    public in1 o;
    public boolean p = ((Boolean) tu0.e.c.a(lx0.M0)).booleanValue();

    public sz1(Context context, kb3 kb3Var, String str, o42 o42Var, nz1 nz1Var, p42 p42Var, d60 d60Var, zq0 zq0Var, es1 es1Var) {
        this.f = kb3Var;
        this.i = str;
        this.g = context;
        this.h = o42Var;
        this.k = nz1Var;
        this.l = p42Var;
        this.j = d60Var;
        this.m = zq0Var;
        this.n = es1Var;
    }

    @Override // defpackage.n71
    public final synchronized boolean B() {
        return this.h.b();
    }

    public final synchronized boolean B3() {
        in1 in1Var = this.o;
        return (in1Var == null || in1Var.p.g.get()) ? false : true;
    }

    @Override // defpackage.n71
    public final synchronized String D() {
        in1 in1Var = this.o;
        if (in1Var == null) {
            return null;
        }
        return in1Var.f.f;
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
        dq.d("setAppEventListener must be called on the main UI thread.");
        this.k.p(ig1Var);
    }

    @Override // defpackage.n71
    public final synchronized boolean K() {
        return false;
    }

    @Override // defpackage.n71
    public final synchronized lu1 M() {
        in1 in1Var;
        if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue() && (in1Var = this.o) != null) {
            return in1Var.f;
        }
        return null;
    }

    @Override // defpackage.n71
    public final hv1 Q() {
        return null;
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
        dq.d("setAdListener must be called on the main UI thread.");
        this.k.f.set(b11Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // defpackage.n71
    public final synchronized boolean Z(f93 f93Var) {
        boolean z;
        try {
            if (!f93Var.b()) {
                if (((Boolean) py0.i.u()).booleanValue()) {
                    if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (this.j.h < ((Integer) tu0.e.c.a(lx0.Xb)).intValue() || !z) {
                    dq.d("loadAd must be called on the main UI thread.");
                }
            }
            zb3 zb3Var = vc3.C.c;
            Context context = this.g;
            if (zb3.h(context) && f93Var.x == null) {
                jn.M("Failed to load the ad because app ID is missing.");
                nz1 nz1Var = this.k;
                if (nz1Var != null) {
                    nz1Var.Z(a23.E(4, null, null));
                }
            } else if (!B3()) {
                dq.C(context, f93Var.k);
                this.o = null;
                return this.h.a(f93Var, this.i, new l42(this.f), new rz1(0, this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
        dq.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!sr1Var.d()) {
                this.n.b();
            }
        } catch (RemoteException e) {
            jn.H("Error in making CSI ping for reporting paid event callback", e);
        }
        this.k.h.set(sr1Var);
    }

    @Override // defpackage.n71
    public final rm c() {
        return null;
    }

    @Override // defpackage.n71
    public final void c1(f93 f93Var, m21 m21Var) {
        this.k.i.set(m21Var);
        Z(f93Var);
    }

    @Override // defpackage.n71
    public final synchronized void d() {
        dq.d("pause must be called on the main UI thread.");
        in1 in1Var = this.o;
        if (in1Var != null) {
            nk1 nk1Var = in1Var.c;
            nk1Var.getClass();
            nk1Var.L1(new kz0(null));
        }
    }

    @Override // defpackage.n71
    public final synchronized void e() {
        dq.d("resume must be called on the main UI thread.");
        in1 in1Var = this.o;
        if (in1Var != null) {
            nk1 nk1Var = in1Var.c;
            nk1Var.getClass();
            nk1Var.L1(new n92(null, 3));
        }
    }

    @Override // defpackage.n71
    public final synchronized void i() {
        dq.d("showInterstitial must be called on the main UI thread.");
        if (this.o == null) {
            jn.T("Interstitial can not be shown before loaded.");
            this.k.s(a23.E(9, null, null));
        } else {
            if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
                this.m.b.c(new Throwable().getStackTrace());
            }
            this.o.c(null, this.p);
        }
    }

    @Override // defpackage.n71
    public final void j2() {
        dq.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // defpackage.n71
    public final Bundle k() {
        dq.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.n71
    public final synchronized long k0() {
        oj1 oj1Var;
        in1 in1Var = this.o;
        if (in1Var == null || (oj1Var = in1Var.j) == null) {
            return 0L;
        }
        return oj1Var.a.get();
    }

    @Override // defpackage.n71
    public final synchronized void k3(rm rmVar) {
        if (this.o == null) {
            jn.T("Interstitial can not be shown before loaded.");
            this.k.s(a23.E(9, null, null));
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
            this.m.b.c(new Throwable().getStackTrace());
        }
        this.o.c((Activity) ju.Z0(rmVar), this.p);
    }

    @Override // defpackage.n71
    public final synchronized boolean l() {
        dq.d("isLoaded must be called on the main UI thread.");
        return B3();
    }

    @Override // defpackage.n71
    public final kb3 o() {
        return null;
    }

    @Override // defpackage.n71
    public final void o2(y71 y71Var) {
        this.l.j.set(y71Var);
    }

    @Override // defpackage.n71
    public final synchronized void o3(ux0 ux0Var) {
        dq.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.h.f = ux0Var;
    }

    @Override // defpackage.n71
    public final void p2(xi1 xi1Var) {
        this.k.j.set(xi1Var);
    }

    @Override // defpackage.n71
    public final b11 q2() {
        return this.k.l();
    }

    @Override // defpackage.n71
    public final synchronized void r() {
        dq.d("destroy must be called on the main UI thread.");
        in1 in1Var = this.o;
        if (in1Var != null) {
            nk1 nk1Var = in1Var.c;
            nk1Var.getClass();
            nk1Var.L1(new iv(null));
        }
    }

    @Override // defpackage.n71
    public final ig1 s() {
        ig1 ig1Var;
        nz1 nz1Var = this.k;
        synchronized (nz1Var) {
            ig1Var = (ig1) nz1Var.g.get();
        }
        return ig1Var;
    }

    @Override // defpackage.n71
    public final synchronized void t1(long j) {
        oj1 oj1Var;
        in1 in1Var = this.o;
        if (in1Var == null || (oj1Var = in1Var.j) == null) {
            return;
        }
        oj1Var.a(j);
    }

    @Override // defpackage.n71
    public final synchronized String u() {
        in1 in1Var = this.o;
        if (in1Var == null) {
            return null;
        }
        return in1Var.f.f;
    }

    @Override // defpackage.n71
    public final synchronized void u1(boolean z) {
        dq.d("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // defpackage.n71
    public final synchronized String v() {
        return this.i;
    }

    @Override // defpackage.n71
    public final void G() {
    }

    @Override // defpackage.n71
    public final void m() {
    }

    @Override // defpackage.n71
    public final void n() {
    }

    @Override // defpackage.n71
    public final void p0() {
    }

    @Override // defpackage.n71
    public final void q() {
    }

    @Override // defpackage.n71
    public final void B1(kf3 kf3Var) {
    }

    @Override // defpackage.n71
    public final void E1(String str) {
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
    }

    @Override // defpackage.n71
    public final void K2(ee2 ee2Var) {
    }

    @Override // defpackage.n71
    public final void L2(nu0 nu0Var) {
    }

    @Override // defpackage.n71
    public final void O1(yh1 yh1Var) {
    }

    @Override // defpackage.n71
    public final void P0(kb3 kb3Var) {
    }

    @Override // defpackage.n71
    public final void i1(boolean z) {
    }
}
