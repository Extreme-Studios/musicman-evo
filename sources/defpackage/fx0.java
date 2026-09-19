package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class fx0 extends jt0 implements xi1 {
    public final zs f;

    public fx0(zs zsVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f = zsVar;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            N2(fu1Var);
        } else if (i == 2) {
            r();
        } else if (i == 3) {
            l();
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.xi1
    public final void N2(fu1 fu1Var) {
        if (this.f != null) {
            fu1Var.a();
        }
    }

    @Override // defpackage.xi1
    public final void l() {
        zs zsVar = this.f;
        if (zsVar != null) {
            zsVar.H();
        }
    }

    @Override // defpackage.xi1
    public final void r() {
        zs zsVar = this.f;
        if (zsVar != null) {
            zsVar.I();
        }
    }

    @Override // defpackage.xi1
    public final void b() {
    }

    @Override // defpackage.xi1
    public final void d() {
    }
}
