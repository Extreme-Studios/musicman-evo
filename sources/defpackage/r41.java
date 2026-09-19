package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r41 extends v90 implements IInterface {
    public r41(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd", 2);
    }

    public final rm Z0() {
        return ec.g(Y(U(), 1));
    }

    public final boolean d() {
        Parcel parcelY = Y(U(), 2);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
