package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends v90 implements la1 {
    public final ia1 Z0(ju juVar, j41 j41Var) {
        ia1 ga1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        kt0.e(parcelU, j41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 2);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ga1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            ga1Var = iInterfaceQueryLocalInterface instanceof ia1 ? (ia1) iInterfaceQueryLocalInterface : new ga1(strongBinder);
        }
        parcelY.recycle();
        return ga1Var;
    }
}
