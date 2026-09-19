package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz1 implements ek1 {
    public final /* synthetic */ nz1 f;
    public final /* synthetic */ d31 g;

    public /* synthetic */ tz1(nz1 nz1Var, d31 d31Var) {
        this.f = nz1Var;
        this.g = d31Var;
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        this.f.Z(fu1Var);
        d31 d31Var = this.g;
        if (d31Var != null) {
            try {
                Parcel parcelU = d31Var.U();
                kt0.c(parcelU, fu1Var);
                d31Var.K0(parcelU, 3);
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
        if (d31Var != null) {
            try {
                int i = fu1Var.f;
                Parcel parcelU2 = d31Var.U();
                parcelU2.writeInt(i);
                d31Var.K0(parcelU2, 2);
            } catch (RemoteException e2) {
                jn.Z("#007 Could not call remote method.", e2);
            }
        }
    }
}
