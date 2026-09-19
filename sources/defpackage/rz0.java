package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rz0 extends v90 implements wz0 {
    public rz0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 2);
    }

    @Override // defpackage.wz0
    public final String c() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.wz0
    public final ArrayList h() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(kt0.a);
        parcelY.recycle();
        return arrayList;
    }
}
