package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbub;

/* JADX INFO: loaded from: classes.dex */
public final class y51 implements lb3 {
    public final /* synthetic */ zzbub f;

    public y51(zzbub zzbubVar) {
        this.f = zzbubVar;
    }

    @Override // defpackage.lb3
    public final void C1() {
        jn.F("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // defpackage.lb3
    public final void F1() {
        jn.F("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        jn.F("AdMobCustomTabsAdapter overlay is closed.");
        r52 r52Var = (r52) this.f.b;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdClosed.");
        try {
            ((q41) r52Var.g).d();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.lb3
    public final void K0() {
        jn.F("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // defpackage.lb3
    public final void N1() {
        jn.F("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // defpackage.lb3
    public final void Y() {
        jn.F("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // defpackage.lb3
    public final void f() {
        jn.F("Opening AdMobCustomTabsAdapter overlay.");
        r52 r52Var = (r52) this.f.b;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdOpened.");
        try {
            ((q41) r52Var.g).j();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.lb3
    public final void g3() {
        jn.F("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // defpackage.lb3
    public final void i3() {
        jn.F("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // defpackage.lb3
    public final void n2() {
        jn.F("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // defpackage.lb3
    public final void S2() {
    }
}
