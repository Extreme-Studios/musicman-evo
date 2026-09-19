package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class m71 extends v90 implements p71 {
    public m71(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 2);
    }

    @Override // defpackage.p71
    public final void P2(zs0 zs0Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, zs0Var);
        K0(parcelU, 2);
    }

    @Override // defpackage.p71
    public final void q1(ParcelFileDescriptor parcelFileDescriptor, r71 r71Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, parcelFileDescriptor);
        kt0.c(parcelU, r71Var);
        K0(parcelU, 3);
    }

    @Override // defpackage.p71
    public final void w1(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelU = U();
        kt0.c(parcelU, parcelFileDescriptor);
        K0(parcelU, 1);
    }
}
