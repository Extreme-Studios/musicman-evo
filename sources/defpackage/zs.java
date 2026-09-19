package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class zs extends yd {
    public final /* synthetic */ int r = 1;
    public final Object s;

    public zs(AbstractAdViewAdapter abstractAdViewAdapter, kr krVar) {
        this.s = krVar;
    }

    public final void H() {
        int i = this.r;
        Object obj = this.s;
        switch (i) {
            case 0:
                g92 g92Var = (g92) obj;
                g92Var.c = null;
                g92Var.b = false;
                g92Var.a();
                break;
            default:
                r52 r52Var = (r52) ((kr) obj);
                r52Var.getClass();
                dq.d("#008 Must be called on the main UI thread.");
                jn.F("Adapter called onAdClosed.");
                try {
                    ((q41) r52Var.g).d();
                } catch (RemoteException e) {
                    jn.Z("#007 Could not call remote method.", e);
                }
                break;
        }
    }

    public final void I() {
        int i = this.r;
        Object obj = this.s;
        switch (i) {
            case 0:
                ((g92) obj).b = true;
                break;
            default:
                r52 r52Var = (r52) ((kr) obj);
                r52Var.getClass();
                dq.d("#008 Must be called on the main UI thread.");
                jn.F("Adapter called onAdOpened.");
                try {
                    ((q41) r52Var.g).j();
                } catch (RemoteException e) {
                    jn.Z("#007 Could not call remote method.", e);
                }
                break;
        }
    }

    public zs(g92 g92Var) {
        this.s = g92Var;
    }
}
