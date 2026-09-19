package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c01 extends v90 implements e01 {
    public c01(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 2);
    }

    @Override // defpackage.e01
    public final void A1(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 9);
    }

    @Override // defpackage.e01
    public final void F0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 7);
    }

    @Override // defpackage.e01
    public final void L(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 6);
    }

    @Override // defpackage.e01
    public final void N0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 3);
    }

    @Override // defpackage.e01
    public final rm O(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        return ec.g(Y(parcelU, 2));
    }

    @Override // defpackage.e01
    public final void U2(yz0 yz0Var) {
        Parcel parcelU = U();
        ClassLoader classLoader = kt0.a;
        parcelU.writeStrongBinder(null);
        K0(parcelU, 8);
    }

    @Override // defpackage.e01
    public final void X0(rm rmVar, String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        kt0.e(parcelU, rmVar);
        K0(parcelU, 1);
    }

    @Override // defpackage.e01
    public final void d0(rm rmVar, int i) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeInt(i);
        K0(parcelU, 5);
    }
}
