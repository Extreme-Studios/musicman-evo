package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ w7 g;

    public /* synthetic */ eu1(w7 w7Var, int i) {
        this.f = i;
        this.g = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        w7 w7Var = this.g;
        switch (i) {
            case 0:
                try {
                    yy1 yy1Var = w7Var.f;
                    yy1Var.getClass();
                    try {
                        n71 n71Var = yy1Var.i;
                        if (n71Var != null) {
                            n71Var.d();
                        }
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e2) {
                    e71.a(w7Var.getContext()).c("BaseAdView.pause", e2);
                    return;
                }
                e71.a(w7Var.getContext()).c("BaseAdView.pause", e2);
                break;
            case 1:
                try {
                    yy1 yy1Var2 = w7Var.f;
                    yy1Var2.getClass();
                    try {
                        n71 n71Var2 = yy1Var2.i;
                        if (n71Var2 != null) {
                            n71Var2.e();
                        }
                    } catch (RemoteException e3) {
                        jn.Z("#007 Could not call remote method.", e3);
                        return;
                    }
                } catch (IllegalStateException e4) {
                    e71.a(w7Var.getContext()).c("BaseAdView.resume", e4);
                    return;
                }
                e71.a(w7Var.getContext()).c("BaseAdView.resume", e4);
                break;
            default:
                try {
                    yy1 yy1Var3 = w7Var.f;
                    yy1Var3.getClass();
                    try {
                        n71 n71Var3 = yy1Var3.i;
                        if (n71Var3 != null) {
                            n71Var3.r();
                        }
                    } catch (RemoteException e5) {
                        jn.Z("#007 Could not call remote method.", e5);
                    }
                } catch (IllegalStateException e6) {
                    e71.a(w7Var.getContext()).c("BaseAdView.destroy", e6);
                    return;
                }
                break;
        }
    }
}
