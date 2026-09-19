package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 implements ib0, zm1 {
    public zy0 f;

    @Override // defpackage.ib0
    public final synchronized void B() {
        zy0 zy0Var = this.f;
        if (zy0Var != null) {
            try {
                zy0Var.y();
            } catch (RemoteException e) {
                jn.V("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // defpackage.zm1
    public final synchronized void T0() {
    }

    @Override // defpackage.zm1
    public final synchronized void q0() {
        zy0 zy0Var = this.f;
        if (zy0Var != null) {
            try {
                zy0Var.y();
            } catch (RemoteException e) {
                jn.V("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
