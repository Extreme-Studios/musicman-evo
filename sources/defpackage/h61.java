package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h61 extends v90 implements k61 {
    public h61(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 2);
    }

    @Override // defpackage.k61
    public final void E2(rm rmVar, jb0 jb0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, jb0Var);
        K0(parcelU, 6);
    }

    @Override // defpackage.k61
    public final void R(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 4);
    }

    @Override // defpackage.k61
    public final void V2(String[] strArr, int[] iArr, rm rmVar) {
        Parcel parcelU = U();
        parcelU.writeStringArray(strArr);
        parcelU.writeIntArray(iArr);
        kt0.e(parcelU, rmVar);
        K0(parcelU, 5);
    }

    @Override // defpackage.k61
    public final void e() {
        K0(U(), 3);
    }

    @Override // defpackage.k61
    public final void t0(Intent intent) {
        Parcel parcelU = U();
        kt0.c(parcelU, intent);
        K0(parcelU, 1);
    }
}
