package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u41 extends v90 implements v41 {
    public u41(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 2);
    }

    @Override // defpackage.v41
    public final float B() {
        Parcel parcelY = Y(U(), 25);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.v41
    public final rm D() {
        return ec.g(Y(U(), 15));
    }

    @Override // defpackage.v41
    public final void E() {
        K0(U(), 26);
    }

    @Override // defpackage.v41
    public final float K() {
        Parcel parcelY = Y(U(), 24);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.v41
    public final boolean M() {
        Parcel parcelY = Y(U(), 17);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.v41
    public final float X() {
        Parcel parcelY = Y(U(), 23);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.v41
    public final void Y0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 22);
    }

    @Override // defpackage.v41
    public final String b() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final List d() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(kt0.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.v41
    public final String e() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final a01 f() {
        Parcel parcelY = Y(U(), 5);
        a01 a01VarB3 = oz0.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return a01VarB3;
    }

    @Override // defpackage.v41
    public final String g() {
        Parcel parcelY = Y(U(), 7);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final boolean h0() {
        Parcel parcelY = Y(U(), 18);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.v41
    public final String i() {
        Parcel parcelY = Y(U(), 9);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final String j() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final double k() {
        Parcel parcelY = Y(U(), 8);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }

    @Override // defpackage.v41
    public final void l0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 20);
    }

    @Override // defpackage.v41
    public final String m() {
        Parcel parcelY = Y(U(), 10);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.v41
    public final rm n() {
        return ec.g(Y(U(), 14));
    }

    @Override // defpackage.v41
    public final hv1 o() {
        Parcel parcelY = Y(U(), 11);
        hv1 hv1VarB3 = yu1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return hv1VarB3;
    }

    @Override // defpackage.v41
    public final void o1(rm rmVar, rm rmVar2, rm rmVar3) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, rmVar2);
        kt0.e(parcelU, rmVar3);
        K0(parcelU, 21);
    }

    @Override // defpackage.v41
    public final wz0 p() {
        Parcel parcelY = Y(U(), 12);
        wz0 wz0VarB3 = vz0.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return wz0VarB3;
    }

    @Override // defpackage.v41
    public final rm q() {
        return ec.g(Y(U(), 13));
    }

    @Override // defpackage.v41
    public final void s() {
        K0(U(), 19);
    }

    @Override // defpackage.v41
    public final Bundle v2() {
        Parcel parcelY = Y(U(), 16);
        Bundle bundle = (Bundle) kt0.b(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }
}
