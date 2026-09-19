package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends v90 {
    public final rm C1(ju juVar, int i, ju juVar2) {
        Parcel parcelU = U();
        o91.c(parcelU, juVar);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(i);
        o91.c(parcelU, juVar2);
        return ec.g(T(parcelU, 3));
    }

    public final rm Z0(ju juVar, int i, ju juVar2) {
        Parcel parcelU = U();
        o91.c(parcelU, juVar);
        parcelU.writeString(ModuleDescriptor.MODULE_ID);
        parcelU.writeInt(i);
        o91.c(parcelU, juVar2);
        return ec.g(T(parcelU, 2));
    }
}
