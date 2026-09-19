package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class b81 extends v90 {
    public b81(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 2);
    }

    public final IBinder Z0(ju juVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        kt0.c(parcelU, kb3Var);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelU.writeInt(i);
        Parcel parcelY = Y(parcelU, 2);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
