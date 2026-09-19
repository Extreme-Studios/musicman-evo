package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h51 extends v90 implements i51 {
    public h51(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback", 2);
    }

    @Override // defpackage.i51
    public final void a(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 3);
    }
}
