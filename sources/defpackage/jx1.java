package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class jx1 extends jt0 implements i51 {
    public final ww1 f;
    public final /* synthetic */ kx1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx1(kx1 kx1Var, ww1 ww1Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.g = kx1Var;
        this.f = ww1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        r41 r41Var;
        kx1 kx1Var = this.g;
        ww1 ww1Var = this.f;
        if (i == 1) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            kx1Var.d = (View) ju.Z0(rmVarO0);
            ((nx1) ww1Var.c).g();
        } else if (i == 2) {
            String string = parcel.readString();
            kt0.f(parcel);
            ((nx1) ww1Var.c).x0(string, 0);
        } else if (i == 3) {
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            a(fu1Var);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                r41Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                r41Var = iInterfaceQueryLocalInterface instanceof r41 ? (r41) iInterfaceQueryLocalInterface : new r41(strongBinder);
            }
            kt0.f(parcel);
            kx1Var.e = r41Var;
            ((nx1) ww1Var.c).g();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.i51
    public final void a(fu1 fu1Var) {
        ((nx1) this.f.c).M0(fu1Var);
    }
}
