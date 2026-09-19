package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends v90 implements lu1 {
    public ft1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 2);
    }

    @Override // defpackage.lu1
    public final String b() {
        Parcel parcelY = Y(U(), 1);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.lu1
    public final String d() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.lu1
    public final List e() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelY.createTypedArrayList(ee3.CREATOR);
        parcelY.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.lu1
    public final ee3 f() {
        Parcel parcelY = Y(U(), 4);
        ee3 ee3Var = (ee3) kt0.b(parcelY, ee3.CREATOR);
        parcelY.recycle();
        return ee3Var;
    }

    @Override // defpackage.lu1
    public final String g() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.lu1
    public final Bundle j() {
        Parcel parcelY = Y(U(), 5);
        Bundle bundle = (Bundle) kt0.b(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }
}
