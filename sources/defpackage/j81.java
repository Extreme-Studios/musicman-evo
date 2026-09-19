package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j81 extends v90 implements l81 {
    public j81(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 2);
    }

    @Override // defpackage.l81
    public final void L1(f93 f93Var, s81 s81Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, s81Var);
        K0(parcelU, 14);
    }

    @Override // defpackage.l81
    public final void e1(o81 o81Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, o81Var);
        K0(parcelU, 2);
    }

    @Override // defpackage.l81
    public final lu1 m() {
        Parcel parcelY = Y(U(), 12);
        lu1 lu1VarB3 = zj1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return lu1VarB3;
    }

    @Override // defpackage.l81
    public final void r2(f93 f93Var, s81 s81Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, s81Var);
        K0(parcelU, 1);
    }

    @Override // defpackage.l81
    public final void x2(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 5);
    }
}
