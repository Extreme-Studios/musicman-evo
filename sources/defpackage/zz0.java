package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends v90 implements a01 {
    public zz0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 2);
    }

    @Override // defpackage.a01
    public final int b() {
        Parcel parcelY = Y(U(), 4);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }

    @Override // defpackage.a01
    public final rm c() {
        return ec.g(Y(U(), 1));
    }

    @Override // defpackage.a01
    public final int d() {
        Parcel parcelY = Y(U(), 5);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }

    @Override // defpackage.a01
    public final Map e() {
        Parcel parcelY = Y(U(), 6);
        HashMap hashMap = parcelY.readHashMap(kt0.a);
        parcelY.recycle();
        return hashMap;
    }

    @Override // defpackage.a01
    public final Uri h() {
        Parcel parcelY = Y(U(), 2);
        Uri uri = (Uri) kt0.b(parcelY, Uri.CREATOR);
        parcelY.recycle();
        return uri;
    }

    @Override // defpackage.a01
    public final double l() {
        Parcel parcelY = Y(U(), 3);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }
}
