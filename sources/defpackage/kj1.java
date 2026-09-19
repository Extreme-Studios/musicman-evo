package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj1 extends jt0 implements vj1 {
    public static vj1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof vj1 ? (vj1) iInterfaceQueryLocalInterface : new fj1(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 2);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            s32 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            kt0.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        l41 adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        kt0.e(parcel2, adapterCreator);
        return true;
    }
}
