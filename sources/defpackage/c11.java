package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c11 extends v90 implements d11 {
    @Override // defpackage.d11
    public final lu1 G() {
        Parcel parcelY = Y(U(), 31);
        lu1 lu1VarB3 = zj1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return lu1VarB3;
    }

    @Override // defpackage.d11
    public final void Q0(Bundle bundle) {
        Parcel parcelU = U();
        kt0.c(parcelU, bundle);
        K0(parcelU, 33);
    }

    @Override // defpackage.d11
    public final List X() {
        Parcel parcelY = Y(U(), 23);
        ArrayList arrayList = parcelY.readArrayList(kt0.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.d11
    public final String b() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final List d() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(kt0.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.d11
    public final String e() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final a01 f() {
        a01 zz0Var;
        Parcel parcelY = Y(U(), 5);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            zz0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zz0Var = iInterfaceQueryLocalInterface instanceof a01 ? (a01) iInterfaceQueryLocalInterface : new zz0(strongBinder);
        }
        parcelY.recycle();
        return zz0Var;
    }

    @Override // defpackage.d11
    public final String g() {
        Parcel parcelY = Y(U(), 7);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final String i() {
        Parcel parcelY = Y(U(), 9);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final String j() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final double k() {
        Parcel parcelY = Y(U(), 8);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }

    @Override // defpackage.d11
    public final String m() {
        Parcel parcelY = Y(U(), 10);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.d11
    public final wz0 n() {
        wz0 rz0Var;
        Parcel parcelY = Y(U(), 14);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            rz0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            rz0Var = iInterfaceQueryLocalInterface instanceof wz0 ? (wz0) iInterfaceQueryLocalInterface : new rz0(strongBinder);
        }
        parcelY.recycle();
        return rz0Var;
    }

    @Override // defpackage.d11
    public final hv1 o() {
        Parcel parcelY = Y(U(), 11);
        hv1 hv1VarB3 = yu1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return hv1VarB3;
    }

    @Override // defpackage.d11
    public final rm s() {
        return ec.g(Y(U(), 19));
    }

    @Override // defpackage.d11
    public final rm v() {
        return ec.g(Y(U(), 18));
    }
}
