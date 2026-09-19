package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class p81 extends v90 {
    public final IBinder Z0(ju juVar, String str, j41 j41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        parcelU.writeString(str);
        kt0.e(parcelU, j41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
