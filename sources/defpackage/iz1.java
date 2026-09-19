package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends b71 {
    public final Context f;
    public final b11 g;
    public final i52 h;
    public final sh1 i;
    public final FrameLayout j;
    public final es1 k;

    public iz1(Context context, b11 b11Var, i52 i52Var, sh1 sh1Var, es1 es1Var) {
        this.f = context;
        this.g = b11Var;
        this.h = i52Var;
        this.i = sh1Var;
        this.k = es1Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = sh1Var.m;
        zb3 zb3Var = vc3.C.c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(o().h);
        frameLayout.setMinimumWidth(o().k);
        this.j = frameLayout;
    }

    @Override // defpackage.n71
    public final boolean B() {
        return false;
    }

    @Override // defpackage.n71
    public final String D() {
        return this.i.f.f;
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
        jn.R("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
        nz1 nz1Var = this.h.c;
        if (nz1Var != null) {
            nz1Var.p(ig1Var);
        }
    }

    @Override // defpackage.n71
    public final boolean K() {
        sh1 sh1Var = this.i;
        return sh1Var != null && sh1Var.b.q0;
    }

    @Override // defpackage.n71
    public final void K2(ee2 ee2Var) {
        jn.R("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final lu1 M() {
        return this.i.f;
    }

    @Override // defpackage.n71
    public final void O1(yh1 yh1Var) {
        jn.R("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final void P0(kb3 kb3Var) {
        FrameLayout frameLayout;
        md1 md1Var;
        dq.d("setAdSize must be called on the main UI thread.");
        sh1 sh1Var = this.i;
        if (sh1Var == null || (frameLayout = this.j) == null || (md1Var = sh1Var.n) == null) {
            return;
        }
        md1Var.W(eg.a(kb3Var));
        frameLayout.setMinimumHeight(kb3Var.h);
        frameLayout.setMinimumWidth(kb3Var.k);
        sh1Var.u = kb3Var;
    }

    @Override // defpackage.n71
    public final hv1 Q() {
        sh1 sh1Var = this.i;
        sh1Var.getClass();
        try {
            return sh1Var.p.mo1a();
        } catch (l52 unused) {
            return null;
        }
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
        jn.R("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final boolean Z(f93 f93Var) {
        jn.R("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
        if (!((Boolean) tu0.e.c.a(lx0.pc)).booleanValue()) {
            jn.R("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        nz1 nz1Var = this.h.c;
        if (nz1Var != null) {
            try {
                if (!sr1Var.d()) {
                    this.k.b();
                }
            } catch (RemoteException e) {
                jn.H("Error in making CSI ping for reporting paid event callback", e);
            }
            nz1Var.h.set(sr1Var);
        }
    }

    @Override // defpackage.n71
    public final rm c() {
        return new ju(this.j);
    }

    @Override // defpackage.n71
    public final void d() {
        dq.d("destroy must be called on the main UI thread.");
        nk1 nk1Var = this.i.c;
        nk1Var.getClass();
        nk1Var.L1(new kz0(null));
    }

    @Override // defpackage.n71
    public final void e() {
        dq.d("destroy must be called on the main UI thread.");
        nk1 nk1Var = this.i.c;
        nk1Var.getClass();
        nk1Var.L1(new n92(null, 3));
    }

    @Override // defpackage.n71
    public final void i1(boolean z) {
        jn.R("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final void j2() {
        jn.R("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final Bundle k() {
        jn.R("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // defpackage.n71
    public final long k0() {
        oj1 oj1Var;
        sh1 sh1Var = this.i;
        if (sh1Var == null || (oj1Var = sh1Var.j) == null) {
            return 0L;
        }
        return oj1Var.a.get();
    }

    @Override // defpackage.n71
    public final boolean l() {
        return false;
    }

    @Override // defpackage.n71
    public final void m() {
        an1 an1Var = this.i.r;
        synchronized (an1Var) {
            an1Var.L1(fl1.r);
        }
    }

    @Override // defpackage.n71
    public final kb3 o() {
        dq.d("getAdSize must be called on the main UI thread.");
        return na1.u(this.f, Collections.singletonList(this.i.c()));
    }

    @Override // defpackage.n71
    public final void o3(ux0 ux0Var) {
        jn.R("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.n71
    public final b11 q2() {
        return this.g;
    }

    @Override // defpackage.n71
    public final void r() {
        dq.d("destroy must be called on the main UI thread.");
        nk1 nk1Var = this.i.c;
        nk1Var.getClass();
        nk1Var.L1(new iv(null));
    }

    @Override // defpackage.n71
    public final ig1 s() {
        return this.h.o;
    }

    @Override // defpackage.n71
    public final void t1(long j) {
        oj1 oj1Var = this.i.j;
        if (oj1Var != null) {
            oj1Var.a(j);
        }
    }

    @Override // defpackage.n71
    public final String u() {
        return this.i.f.f;
    }

    @Override // defpackage.n71
    public final String v() {
        return this.h.g;
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
