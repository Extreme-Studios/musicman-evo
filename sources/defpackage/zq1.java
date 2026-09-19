package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zq1 extends v90 implements sr1 {
    public zq1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 2);
    }

    @Override // defpackage.sr1
    public final void S1(qc3 qc3Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, qc3Var);
        K0(parcelU, 1);
    }

    @Override // defpackage.sr1
    public final boolean d() {
        Parcel parcelY = Y(U(), 2);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
