package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends v90 implements ze1 {
    public ce1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 2);
    }

    @Override // defpackage.ze1
    public final void h1(j41 j41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, j41Var);
        K0(parcelU, 8);
    }
}
