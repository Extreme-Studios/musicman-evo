package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends b71 {
    public final Context f;
    public final v32 g;
    public final String h;
    public final nz1 i;
    public kb3 j;
    public final h52 k;
    public final d60 l;
    public final es1 m;
    public sh1 n;

    public lz1(Context context, kb3 kb3Var, String str, v32 v32Var, nz1 nz1Var, d60 d60Var, es1 es1Var) {
        this.f = context;
        this.g = v32Var;
        this.j = kb3Var;
        this.h = str;
        this.i = nz1Var;
        this.k = v32Var.k;
        this.l = d60Var;
        this.m = es1Var;
        v32Var.h.I1(this, v32Var.b);
    }

    @Override // defpackage.n71
    public final synchronized boolean B() {
        return this.g.b();
    }

    public final synchronized boolean B3(f93 f93Var) {
        try {
            if (C3()) {
                dq.d("loadAd must be called on the main UI thread.");
            }
            zb3 zb3Var = vc3.C.c;
            Context context = this.f;
            if (!zb3.h(context) || f93Var.x != null) {
                dq.C(context, f93Var.k);
                return this.g.a(f93Var, this.h, null, new kc2(27, this));
            }
            jn.M("Failed to load the ad because app ID is missing.");
            nz1 nz1Var = this.i;
            if (nz1Var != null) {
                nz1Var.Z(a23.E(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final boolean C3() {
        boolean z;
        if (((Boolean) py0.f.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.l.h < ((Integer) tu0.e.c.a(lx0.Xb)).intValue() || !z;
    }

    @Override // defpackage.n71
    public final synchronized String D() {
        sh1 sh1Var = this.n;
        if (sh1Var == null) {
            return null;
        }
        return sh1Var.f.f;
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
        if (C3()) {
            dq.d("setAdListener must be called on the main UI thread.");
        }
        pz1 pz1Var = this.g.e;
        synchronized (pz1Var) {
            pz1Var.f = zy0Var;
        }
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
        if (C3()) {
            dq.d("setAppEventListener must be called on the main UI thread.");
        }
        this.i.p(ig1Var);
    }

    @Override // defpackage.n71
    public final synchronized boolean K() {
        sh1 sh1Var = this.n;
        return sh1Var != null && sh1Var.b.q0;
    }

    @Override // defpackage.n71
    public final synchronized void K2(ee2 ee2Var) {
        try {
            if (C3()) {
                dq.d("setVideoOptions must be called on the main UI thread.");
            }
            this.k.d = ee2Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final synchronized lu1 M() {
        sh1 sh1Var;
        if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue() && (sh1Var = this.n) != null) {
            return sh1Var.f;
        }
        return null;
    }

    @Override // defpackage.n71
    public final synchronized void O1(yh1 yh1Var) {
        dq.d("setCorrelationIdProvider must be called on the main UI thread");
        this.k.v = yh1Var;
    }

    @Override // defpackage.n71
    public final synchronized void P0(kb3 kb3Var) {
        md1 md1Var;
        dq.d("setAdSize must be called on the main UI thread.");
        this.k.b = kb3Var;
        this.j = kb3Var;
        sh1 sh1Var = this.n;
        if (sh1Var != null) {
            FrameLayout frameLayout = this.g.f;
            if (frameLayout != null && (md1Var = sh1Var.n) != null) {
                md1Var.W(eg.a(kb3Var));
                frameLayout.setMinimumHeight(kb3Var.h);
                frameLayout.setMinimumWidth(kb3Var.k);
                sh1Var.u = kb3Var;
            }
        }
    }

    @Override // defpackage.n71
    public final synchronized hv1 Q() {
        dq.d("getVideoController must be called from the main thread.");
        sh1 sh1Var = this.n;
        hv1 hv1VarMo1a = null;
        if (sh1Var == null) {
            return null;
        }
        try {
            hv1VarMo1a = sh1Var.p.mo1a();
        } catch (l52 unused) {
        }
        return hv1VarMo1a;
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
        if (C3()) {
            dq.d("setAdListener must be called on the main UI thread.");
        }
        this.i.f.set(b11Var);
    }

    @Override // defpackage.n71
    public final synchronized boolean Z(f93 f93Var) {
        kb3 kb3Var = this.j;
        synchronized (this) {
            h52 h52Var = this.k;
            h52Var.b = kb3Var;
            h52Var.q = this.j.s;
        }
        return B3(f93Var);
        return B3(f93Var);
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
        if (C3()) {
            dq.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!sr1Var.d()) {
                this.m.b();
            }
        } catch (RemoteException e) {
            jn.H("Error in making CSI ping for reporting paid event callback", e);
        }
        this.i.h.set(sr1Var);
    }

    @Override // defpackage.n71
    public final rm c() {
        if (C3()) {
            dq.d("getAdFrame must be called on the main UI thread.");
        }
        return new ju(this.g.f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.n71
    public final synchronized void d() {
        try {
            if (((Boolean) py0.g.u()).booleanValue()) {
                ix0 ix0Var = lx0.Ub;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    if (this.l.h < ((Integer) tu0Var.c.a(lx0.Yb)).intValue()) {
                        dq.d("pause must be called on the main UI thread.");
                    }
                } else {
                    dq.d("pause must be called on the main UI thread.");
                }
            } else {
                dq.d("pause must be called on the main UI thread.");
            }
            sh1 sh1Var = this.n;
            if (sh1Var != null) {
                nk1 nk1Var = sh1Var.c;
                nk1Var.getClass();
                nk1Var.L1(new kz0(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.n71
    public final synchronized void e() {
        try {
            if (((Boolean) py0.h.u()).booleanValue()) {
                ix0 ix0Var = lx0.Sb;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    if (this.l.h < ((Integer) tu0Var.c.a(lx0.Yb)).intValue()) {
                        dq.d("resume must be called on the main UI thread.");
                    }
                } else {
                    dq.d("resume must be called on the main UI thread.");
                }
            } else {
                dq.d("resume must be called on the main UI thread.");
            }
            sh1 sh1Var = this.n;
            if (sh1Var != null) {
                nk1 nk1Var = sh1Var.c;
                nk1Var.getClass();
                nk1Var.L1(new n92(null, 3));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final synchronized void i1(boolean z) {
        try {
            if (C3()) {
                dq.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.k.e = z;
        } catch (Throwable th) {
            throw th;
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
        sh1 sh1Var = this.n;
        return (sh1Var == null || (oj1Var = sh1Var.j) == null) ? this.k.u.get() : oj1Var.a.get();
    }

    @Override // defpackage.n71
    public final boolean l() {
        return false;
    }

    @Override // defpackage.n71
    public final synchronized void m() {
        dq.d("recordManualImpression must be called on the main UI thread.");
        sh1 sh1Var = this.n;
        if (sh1Var != null) {
            an1 an1Var = sh1Var.r;
            synchronized (an1Var) {
                an1Var.L1(fl1.r);
            }
        }
    }

    @Override // defpackage.n71
    public final synchronized kb3 o() {
        dq.d("getAdSize must be called on the main UI thread.");
        sh1 sh1Var = this.n;
        if (sh1Var != null) {
            return na1.u(this.f, Collections.singletonList(sh1Var.c()));
        }
        return this.k.b;
    }

    @Override // defpackage.n71
    public final synchronized void o3(ux0 ux0Var) {
        dq.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.g.g = ux0Var;
    }

    @Override // defpackage.n71
    public final b11 q2() {
        return this.i.l();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // defpackage.n71
    public final synchronized void r() {
        try {
            if (((Boolean) py0.e.u()).booleanValue()) {
                ix0 ix0Var = lx0.Tb;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    if (this.l.h < ((Integer) tu0Var.c.a(lx0.Yb)).intValue()) {
                        dq.d("destroy must be called on the main UI thread.");
                    }
                } else {
                    dq.d("destroy must be called on the main UI thread.");
                }
            } else {
                dq.d("destroy must be called on the main UI thread.");
            }
            sh1 sh1Var = this.n;
            if (sh1Var != null) {
                nk1 nk1Var = sh1Var.c;
                nk1Var.getClass();
                nk1Var.L1(new iv(null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n71
    public final ig1 s() {
        ig1 ig1Var;
        nz1 nz1Var = this.i;
        synchronized (nz1Var) {
            ig1Var = (ig1) nz1Var.g.get();
        }
        return ig1Var;
    }

    @Override // defpackage.n71
    public final synchronized void t1(long j) {
        oj1 oj1Var;
        this.k.u.set(j);
        sh1 sh1Var = this.n;
        if (sh1Var == null || (oj1Var = sh1Var.j) == null) {
            return;
        }
        oj1Var.a(j);
    }

    @Override // defpackage.n71
    public final synchronized String u() {
        sh1 sh1Var = this.n;
        if (sh1Var == null) {
            return null;
        }
        return sh1Var.f.f;
    }

    @Override // defpackage.n71
    public final synchronized String v() {
        return this.h;
    }

    @Override // defpackage.n71
    public final void G() {
    }

    @Override // defpackage.n71
    public final void i() {
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
    public final void L2(nu0 nu0Var) {
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
    public final void u1(boolean z) {
    }

    @Override // defpackage.n71
    public final void c1(f93 f93Var, m21 m21Var) {
    }
}
