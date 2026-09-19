package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class l61 extends v90 implements n61 {
    public final k61 Z0(ju juVar, j41 j41Var) {
        k61 h61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        kt0.e(parcelU, j41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            h61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            h61Var = iInterfaceQueryLocalInterface instanceof k61 ? (k61) iInterfaceQueryLocalInterface : new h61(strongBinder);
        }
        parcelY.recycle();
        return h61Var;
    }
}
