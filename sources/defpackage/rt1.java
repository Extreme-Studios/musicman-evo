package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class rt1 implements lb3, ke1 {
    public final Context f;
    public final d60 g;
    public qt1 h;
    public md1 i;
    public boolean j;
    public boolean k;
    public long l;
    public ip1 m;
    public boolean n;

    public rt1(Context context, d60 d60Var) {
        this.f = context;
        this.g = d60Var;
    }

    @Override // defpackage.lb3
    public final synchronized void H1(int i) {
        this.i.destroy();
        if (!this.n) {
            jn.p("Inspector closed.");
            ip1 ip1Var = this.m;
            if (ip1Var != null) {
                try {
                    ip1Var.g0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.k = false;
        this.j = false;
        this.l = 0L;
        this.n = false;
        this.m = null;
    }

    public final synchronized void a(ip1 ip1Var, w11 w11Var, i11 i11Var, w11 w11Var2) {
        if (c(ip1Var)) {
            try {
                vc3 vc3Var = vc3.C;
                ue0 ue0Var = vc3Var.d;
                md1 md1VarP = ue0.p(this.f, new eg(0, 0, 0), "", false, false, null, null, this.g, null, null, new cv0(), null, null, null, null, null);
                this.i = md1VarP;
                he1 he1VarE0 = md1VarP.e0();
                if (he1VarE0 == null) {
                    jn.T("Failed to obtain a web view for the ad inspector");
                    try {
                        vc3Var.h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        ip1Var.g0(a23.E(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        vc3.C.h.d("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.m = ip1Var;
                Context context = this.f;
                he1VarE0.p(null, null, null, null, null, false, null, null, null, null, null, null, null, w11Var, null, new i11(6, context), i11Var, w11Var2, null, null, null);
                he1VarE0.l = this;
                this.i.loadUrl((String) tu0.e.c.a(lx0.J9));
                v33.a(context, new AdOverlayInfoParcel(this, this.i, this.g), true, null);
                vc3Var.k.getClass();
                this.l = System.currentTimeMillis();
            } catch (wd1 e2) {
                jn.V("Failed to obtain a web view for the ad inspector", e2);
                try {
                    vc3.C.h.d("InspectorUi.openInspector 0", e2);
                    ip1Var.g0(a23.E(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    vc3.C.h.d("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.j && this.k) {
            za1.f.execute(new va1(22, this));
        }
    }

    public final synchronized boolean c(ip1 ip1Var) {
        ix0 ix0Var = lx0.I9;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            jn.T("Ad inspector had an internal error.");
            try {
                ip1Var.g0(a23.E(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.h == null) {
            jn.T("Ad inspector had an internal error.");
            try {
                vc3.C.h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                ip1Var.g0(a23.E(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.j && !this.k) {
            vc3.C.k.getClass();
            if (System.currentTimeMillis() >= this.l + ((long) ((Integer) tu0Var.c.a(lx0.L9)).intValue())) {
                return true;
            }
        }
        jn.T("Ad inspector cannot be opened because it is already open.");
        try {
            ip1Var.g0(a23.E(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // defpackage.lb3
    public final synchronized void f() {
        this.k = true;
        b();
    }

    @Override // defpackage.ke1
    public final synchronized void q(String str, int i, String str2, boolean z) {
        if (z) {
            jn.p("Ad inspector loaded.");
            this.j = true;
            b();
            return;
        }
        jn.T("Ad inspector failed to load.");
        try {
            sa1 sa1Var = vc3.C.h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            sa1Var.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            ip1 ip1Var = this.m;
            if (ip1Var != null) {
                ip1Var.g0(a23.E(17, null, null));
            }
        } catch (RemoteException e) {
            vc3.C.h.d("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.n = true;
        this.i.destroy();
    }

    @Override // defpackage.lb3
    public final void C1() {
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.lb3
    public final void N1() {
    }

    @Override // defpackage.lb3
    public final void S2() {
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

    @Override // defpackage.lb3
    public final void n2() {
    }
}
