package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hk1 extends v90 implements hl1 {
    public hk1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 2);
    }

    @Override // defpackage.hl1
    public final void T2(rm rmVar, String str) {
        Parcel parcelU = U();
        parcelU.writeString(null);
        kt0.e(parcelU, rmVar);
        K0(parcelU, 6);
    }

    @Override // defpackage.hl1
    public final void b() {
        K0(U(), 1);
    }

    @Override // defpackage.hl1
    public final void c2(nb2 nb2Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, nb2Var);
        K0(parcelU, 14);
    }

    @Override // defpackage.hl1
    public final void i0(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        K0(parcelU, 18);
    }

    @Override // defpackage.hl1
    public final List n() {
        Parcel parcelY = Y(U(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelY.createTypedArrayList(s21.CREATOR);
        parcelY.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.hl1
    public final void y2(l41 l41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, l41Var);
        K0(parcelU, 11);
    }

    @Override // defpackage.hl1
    public final void z2(y21 y21Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, y21Var);
        K0(parcelU, 12);
    }
}
