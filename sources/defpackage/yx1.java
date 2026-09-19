package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class yx1 extends jt0 implements o51 {
    public final ww1 f;
    public final /* synthetic */ kx1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx1(kx1 kx1Var, ww1 ww1Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.g = kx1Var;
        this.f = ww1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        v41 u41Var;
        ww1 ww1Var = this.f;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                u41Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                u41Var = iInterfaceQueryLocalInterface instanceof v41 ? (v41) iInterfaceQueryLocalInterface : new u41(strongBinder);
            }
            kt0.f(parcel);
            this.g.d = u41Var;
            ((nx1) ww1Var.c).g();
        } else if (i == 2) {
            String string = parcel.readString();
            kt0.f(parcel);
            ((nx1) ww1Var.c).x0(string, 0);
        } else {
            if (i != 3) {
                return false;
            }
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            a(fu1Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.o51
    public final void a(fu1 fu1Var) {
        ((nx1) this.f.c).M0(fu1Var);
    }
}
