package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class ar1 {
    public final ro1 a;

    public ar1(ro1 ro1Var) {
        this.a = ro1Var;
    }

    public final void a() {
        hv1 hv1VarR = this.a.r();
        ov1 ov1VarP = null;
        if (hv1VarR != null) {
            try {
                ov1VarP = hv1VarR.p();
            } catch (RemoteException unused) {
            }
        }
        if (ov1VarP == null) {
            return;
        }
        try {
            ov1VarP.b();
        } catch (RemoteException e) {
            jn.V("Unable to call onVideoEnd()", e);
        }
    }
}
