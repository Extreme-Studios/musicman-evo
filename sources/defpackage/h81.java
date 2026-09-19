package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h81 extends v90 implements i81 {
    public h81(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 2);
    }

    @Override // defpackage.i81
    public final String b() {
        Parcel parcelY = Y(U(), 1);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.i81
    public final int d() {
        Parcel parcelY = Y(U(), 2);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }
}
