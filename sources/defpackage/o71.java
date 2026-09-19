package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class o71 extends jt0 implements p71 {
    public o71() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) kt0.b(parcel, ParcelFileDescriptor.CREATOR);
            kt0.f(parcel);
            w1(parcelFileDescriptor);
        } else if (i == 2) {
            zs0 zs0Var = (zs0) kt0.b(parcel, zs0.CREATOR);
            kt0.f(parcel);
            P2(zs0Var);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) kt0.b(parcel, ParcelFileDescriptor.CREATOR);
            r71 r71Var = (r71) kt0.b(parcel, r71.CREATOR);
            kt0.f(parcel);
            q1(parcelFileDescriptor2, r71Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
