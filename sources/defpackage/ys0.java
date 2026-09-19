package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class ys0 extends i2 implements v6, ib0 {
    public final ir f;

    public ys0(AbstractAdViewAdapter abstractAdViewAdapter, ir irVar) {
        this.f = irVar;
    }

    @Override // defpackage.i2
    public final void B() {
        r52 r52Var = (r52) this.f;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdClicked.");
        try {
            ((q41) r52Var.g).b();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.v6
    public final void N(String str, String str2) {
        r52 r52Var = (r52) this.f;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAppEvent.");
        try {
            ((q41) r52Var.g).w2(str, str2);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void a() {
        r52 r52Var = (r52) this.f;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdClosed.");
        try {
            ((q41) r52Var.g).d();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void b(np npVar) {
        ((r52) this.f).t(npVar);
    }

    @Override // defpackage.i2
    public final void e() {
        r52 r52Var = (r52) this.f;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdLoaded.");
        try {
            ((q41) r52Var.g).g();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void h() {
        r52 r52Var = (r52) this.f;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdOpened.");
        try {
            ((q41) r52Var.g).j();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
