package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class n81 extends jt0 implements o81 {
    public n81() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        i81 h81Var;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                d();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    h81Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    h81Var = iInterfaceQueryLocalInterface instanceof i81 ? (i81) iInterfaceQueryLocalInterface : new h81(strongBinder);
                }
                kt0.f(parcel);
                W0(h81Var);
                break;
            case 4:
                int i2 = parcel.readInt();
                kt0.f(parcel);
                z(i2);
                break;
            case 5:
                fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
                kt0.f(parcel);
                u2(fu1Var);
                break;
            case 6:
                g();
                break;
            case 7:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
