package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j61 extends v90 implements n71 {
    public j61(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 2);
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, zy0Var);
        K0(parcelU, 20);
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, ig1Var);
        K0(parcelU, 8);
    }

    @Override // defpackage.n71
    public final void K2(ee2 ee2Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, ee2Var);
        K0(parcelU, 29);
    }

    @Override // defpackage.n71
    public final void L2(nu0 nu0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, nu0Var);
        K0(parcelU, 40);
    }

    @Override // defpackage.n71
    public final lu1 M() {
        lu1 ft1Var;
        Parcel parcelY = Y(U(), 41);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ft1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            ft1Var = iInterfaceQueryLocalInterface instanceof lu1 ? (lu1) iInterfaceQueryLocalInterface : new ft1(strongBinder);
        }
        parcelY.recycle();
        return ft1Var;
    }

    @Override // defpackage.n71
    public final void P0(kb3 kb3Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, kb3Var);
        K0(parcelU, 13);
    }

    @Override // defpackage.n71
    public final hv1 Q() {
        hv1 pu1Var;
        Parcel parcelY = Y(U(), 26);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            pu1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            pu1Var = iInterfaceQueryLocalInterface instanceof hv1 ? (hv1) iInterfaceQueryLocalInterface : new pu1(strongBinder);
        }
        parcelY.recycle();
        return pu1Var;
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, b11Var);
        K0(parcelU, 7);
    }

    @Override // defpackage.n71
    public final boolean Z(f93 f93Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, f93Var);
        Parcel parcelY = Y(parcelU, 4);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, sr1Var);
        K0(parcelU, 42);
    }

    @Override // defpackage.n71
    public final rm c() {
        return ec.g(Y(U(), 1));
    }

    @Override // defpackage.n71
    public final void c1(f93 f93Var, m21 m21Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, m21Var);
        K0(parcelU, 43);
    }

    @Override // defpackage.n71
    public final void d() {
        K0(U(), 5);
    }

    @Override // defpackage.n71
    public final void e() {
        K0(U(), 6);
    }

    @Override // defpackage.n71
    public final void i1(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = kt0.a;
        parcelU.writeInt(z ? 1 : 0);
        K0(parcelU, 22);
    }

    @Override // defpackage.n71
    public final long k0() {
        Parcel parcelY = Y(U(), 47);
        long j = parcelY.readLong();
        parcelY.recycle();
        return j;
    }

    @Override // defpackage.n71
    public final void k3(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 44);
    }

    @Override // defpackage.n71
    public final kb3 o() {
        Parcel parcelY = Y(U(), 12);
        kb3 kb3Var = (kb3) kt0.b(parcelY, kb3.CREATOR);
        parcelY.recycle();
        return kb3Var;
    }

    @Override // defpackage.n71
    public final void p2(xi1 xi1Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, xi1Var);
        K0(parcelU, 45);
    }

    @Override // defpackage.n71
    public final void r() {
        K0(U(), 2);
    }

    @Override // defpackage.n71
    public final void t1(long j) {
        Parcel parcelU = U();
        parcelU.writeLong(j);
        K0(parcelU, 48);
    }

    @Override // defpackage.n71
    public final void u1(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = kt0.a;
        parcelU.writeInt(z ? 1 : 0);
        K0(parcelU, 34);
    }

    @Override // defpackage.n71
    public final String v() {
        Parcel parcelY = Y(U(), 31);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }
}
