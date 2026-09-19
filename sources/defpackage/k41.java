package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k41 extends v90 implements l41 {
    @Override // defpackage.l41
    public final s51 F(String str) {
        s51 r51Var;
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 3);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = w51.g;
        if (strongBinder == null) {
            r51Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            r51Var = iInterfaceQueryLocalInterface instanceof s51 ? (s51) iInterfaceQueryLocalInterface : new r51(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 2);
        }
        parcelY.recycle();
        return r51Var;
    }

    @Override // defpackage.l41
    public final boolean I(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 4);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.l41
    public final boolean O(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 2);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.l41
    public final n41 w(String str) {
        n41 m41Var;
        Parcel parcelU = U();
        parcelU.writeString(str);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            m41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            m41Var = iInterfaceQueryLocalInterface instanceof n41 ? (n41) iInterfaceQueryLocalInterface : new m41(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 2);
        }
        parcelY.recycle();
        return m41Var;
    }
}
