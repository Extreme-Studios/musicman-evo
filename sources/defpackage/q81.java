package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class q81 extends v90 implements s81 {
    public q81(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 2);
    }

    @Override // defpackage.s81
    public final void a(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 3);
    }

    @Override // defpackage.s81
    public final void b() {
        K0(U(), 1);
    }

    @Override // defpackage.s81
    public final void t(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 2);
    }
}
