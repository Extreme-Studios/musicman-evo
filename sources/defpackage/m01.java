package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m01 extends v90 implements n01 {
    public m01(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 2);
    }

    @Override // defpackage.n01
    public final boolean C(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        Parcel parcelY = Y(parcelU, 10);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.n01
    public final rm T0() {
        return ec.g(Y(U(), 9));
    }

    @Override // defpackage.n01
    public final String f() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.n01
    public final boolean q0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        Parcel parcelY = Y(parcelU, 17);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
