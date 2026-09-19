package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class o61 extends v90 implements q61 {
    public o61(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 2);
    }

    @Override // defpackage.q61
    public final void C(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 13);
    }

    @Override // defpackage.q61
    public final void P1(int i, String[] strArr, int[] iArr) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeStringArray(strArr);
        parcelU.writeIntArray(iArr);
        K0(parcelU, 15);
    }

    @Override // defpackage.q61
    public final void S() {
        K0(U(), 7);
    }

    @Override // defpackage.q61
    public final void W1(int i, int i2, Intent intent) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeInt(i2);
        kt0.c(parcelU, intent);
        K0(parcelU, 12);
    }

    @Override // defpackage.q61
    public final void Y2(Bundle bundle) {
        Parcel parcelU = U();
        kt0.c(parcelU, bundle);
        K0(parcelU, 1);
    }

    @Override // defpackage.q61
    public final void b() {
        K0(U(), 10);
    }

    @Override // defpackage.q61
    public final void c0(Bundle bundle) {
        Parcel parcelU = U();
        kt0.c(parcelU, bundle);
        Parcel parcelY = Y(parcelU, 6);
        if (parcelY.readInt() != 0) {
            bundle.readFromParcel(parcelY);
        }
        parcelY.recycle();
    }

    @Override // defpackage.q61
    public final void d() {
        K0(U(), 14);
    }

    @Override // defpackage.q61
    public final boolean e() {
        Parcel parcelY = Y(U(), 11);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.q61
    public final void g() {
        K0(U(), 3);
    }

    @Override // defpackage.q61
    public final void i() {
        K0(U(), 5);
    }

    @Override // defpackage.q61
    public final void j() {
        K0(U(), 2);
    }

    @Override // defpackage.q61
    public final void k() {
        K0(U(), 4);
    }

    @Override // defpackage.q61
    public final void u() {
        K0(U(), 9);
    }

    @Override // defpackage.q61
    public final void x() {
        K0(U(), 8);
    }
}
