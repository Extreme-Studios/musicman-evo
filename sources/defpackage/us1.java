package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class us1 extends v90 {
    public final ls1 Z0(ju juVar, j41 j41Var) {
        ls1 wr1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        kt0.e(parcelU, j41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            wr1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            wr1Var = iInterfaceQueryLocalInterface instanceof ls1 ? (ls1) iInterfaceQueryLocalInterface : new wr1(strongBinder);
        }
        parcelY.recycle();
        return wr1Var;
    }
}
