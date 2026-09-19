package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class p51 extends v90 implements q51 {
    public p51(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback", 2);
    }

    @Override // defpackage.q51
    public final void a(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 4);
    }
}
