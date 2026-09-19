package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class ju1 extends i2 {
    public final AbstractAdViewAdapter f;
    public final mr g;

    public ju1(AbstractAdViewAdapter abstractAdViewAdapter, mr mrVar) {
        this.f = abstractAdViewAdapter;
        this.g = mrVar;
    }

    @Override // defpackage.i2
    public final void B() {
        r52 r52Var = (r52) this.g;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        kb0 kb0Var = (kb0) r52Var.h;
        if (((s70) r52Var.i) == null) {
            if (kb0Var == null) {
                jn.Z("#007 Could not call remote method.", null);
                return;
            } else if (!kb0Var.n) {
                jn.F("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        jn.F("Adapter called onAdClicked.");
        try {
            ((q41) r52Var.g).b();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void a() {
        r52 r52Var = (r52) this.g;
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
        ((r52) this.g).v(npVar);
    }

    @Override // defpackage.i2
    public final void d() {
        r52 r52Var = (r52) this.g;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        kb0 kb0Var = (kb0) r52Var.h;
        if (((s70) r52Var.i) == null) {
            if (kb0Var == null) {
                jn.Z("#007 Could not call remote method.", null);
                return;
            } else if (!kb0Var.m) {
                jn.F("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        jn.F("Adapter called onAdImpression.");
        try {
            ((q41) r52Var.g).k();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void h() {
        r52 r52Var = (r52) this.g;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdOpened.");
        try {
            ((q41) r52Var.g).j();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.i2
    public final void e() {
    }
}
