package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class t42 implements ku {
    public final /* synthetic */ int f;
    public final /* synthetic */ v90 g;
    public final /* synthetic */ jt0 h;

    public /* synthetic */ t42(jt0 jt0Var, v90 v90Var, int i) {
        this.f = i;
        this.g = v90Var;
        this.h = jt0Var;
    }

    @Override // defpackage.ku
    public final void l() {
        int i = this.f;
        v90 v90Var = this.g;
        jt0 jt0Var = this.h;
        switch (i) {
            case 0:
                if (((u42) jt0Var).o != null) {
                    try {
                        sp1 sp1Var = (sp1) v90Var;
                        sp1Var.K0(sp1Var.U(), 1);
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                        return;
                    }
                }
                break;
            default:
                if (((v42) jt0Var).i != null) {
                    try {
                        x81 x81Var = (x81) v90Var;
                        x81Var.K0(x81Var.U(), 1);
                    } catch (RemoteException e2) {
                        jn.Z("#007 Could not call remote method.", e2);
                    }
                }
                break;
        }
    }
}
