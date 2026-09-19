package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class mu0 extends jt0 implements nu0 {
    public mu0() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        ku0 ju0Var;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ju0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                ju0Var = iInterfaceQueryLocalInterface instanceof ku0 ? (ku0) iInterfaceQueryLocalInterface : new ju0(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 2);
            }
            kt0.f(parcel);
            e3(ju0Var);
        } else if (i == 2) {
            parcel.readInt();
            kt0.f(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            W(fu1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
