package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m41 extends v90 implements n41 {
    @Override // defpackage.n41
    public final hv1 B() {
        Parcel parcelY = Y(U(), 26);
        hv1 hv1VarB3 = yu1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return hv1VarB3;
    }

    @Override // defpackage.n41
    public final void B0(rm rmVar, f93 f93Var, String str, String str2, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 7);
    }

    @Override // defpackage.n41
    public final v41 E() {
        v41 u41Var;
        Parcel parcelY = Y(U(), 27);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            u41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            u41Var = iInterfaceQueryLocalInterface instanceof v41 ? (v41) iInterfaceQueryLocalInterface : new u41(strongBinder);
        }
        parcelY.recycle();
        return u41Var;
    }

    @Override // defpackage.n41
    public final x51 G() {
        Parcel parcelY = Y(U(), 33);
        x51 x51Var = (x51) kt0.b(parcelY, x51.CREATOR);
        parcelY.recycle();
        return x51Var;
    }

    @Override // defpackage.n41
    public final boolean J() {
        Parcel parcelY = Y(U(), 22);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.n41
    public final void L0(rm rmVar, w21 w21Var, ArrayList arrayList) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, w21Var);
        parcelU.writeTypedList(arrayList);
        K0(parcelU, 31);
    }

    @Override // defpackage.n41
    public final void R0(rm rmVar, kb3 kb3Var, f93 f93Var, String str, String str2, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 6);
    }

    @Override // defpackage.n41
    public final void S() {
        K0(U(), 12);
    }

    @Override // defpackage.n41
    public final void U0(rm rmVar, f93 f93Var, String str, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 38);
    }

    @Override // defpackage.n41
    public final s41 V() {
        s41 s41Var;
        Parcel parcelY = Y(U(), 15);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            s41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            s41Var = iInterfaceQueryLocalInterface instanceof s41 ? (s41) iInterfaceQueryLocalInterface : new s41(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 2);
        }
        parcelY.recycle();
        return s41Var;
    }

    @Override // defpackage.n41
    public final void V1(String str, f93 f93Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        K0(parcelU, 11);
    }

    @Override // defpackage.n41
    public final void W2(rm rmVar, f81 f81Var, List list) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, f81Var);
        parcelU.writeStringList(list);
        K0(parcelU, 23);
    }

    @Override // defpackage.n41
    public final r41 a0() {
        r41 r41Var;
        Parcel parcelY = Y(U(), 36);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            r41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            r41Var = iInterfaceQueryLocalInterface instanceof r41 ? (r41) iInterfaceQueryLocalInterface : new r41(strongBinder);
        }
        parcelY.recycle();
        return r41Var;
    }

    @Override // defpackage.n41
    public final x51 a3() {
        Parcel parcelY = Y(U(), 34);
        x51 x51Var = (x51) kt0.b(parcelY, x51.CREATOR);
        parcelY.recycle();
        return x51Var;
    }

    @Override // defpackage.n41
    public final void c3(rm rmVar, f93 f93Var, String str, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 32);
    }

    @Override // defpackage.n41
    public final rm d() {
        return ec.g(Y(U(), 2));
    }

    @Override // defpackage.n41
    public final t41 e0() {
        t41 t41Var;
        Parcel parcelY = Y(U(), 16);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            t41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            t41Var = iInterfaceQueryLocalInterface instanceof t41 ? (t41) iInterfaceQueryLocalInterface : new t41(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 2);
        }
        parcelY.recycle();
        return t41Var;
    }

    @Override // defpackage.n41
    public final void f() {
        K0(U(), 4);
    }

    @Override // defpackage.n41
    public final void f3(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 39);
    }

    @Override // defpackage.n41
    public final void g1(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 37);
    }

    @Override // defpackage.n41
    public final void i() {
        K0(U(), 8);
    }

    @Override // defpackage.n41
    public final void j() {
        K0(U(), 5);
    }

    @Override // defpackage.n41
    public final void j3(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = kt0.a;
        parcelU.writeInt(z ? 1 : 0);
        K0(parcelU, 25);
    }

    @Override // defpackage.n41
    public final void l0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 21);
    }

    @Override // defpackage.n41
    public final void l3(rm rmVar, f93 f93Var, String str, String str2, q41 q41Var, qz0 qz0Var, ArrayList arrayList) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.e(parcelU, q41Var);
        kt0.c(parcelU, qz0Var);
        parcelU.writeStringList(arrayList);
        K0(parcelU, 14);
    }

    @Override // defpackage.n41
    public final void m() {
        K0(U(), 9);
    }

    @Override // defpackage.n41
    public final boolean n() {
        Parcel parcelY = Y(U(), 13);
        ClassLoader classLoader = kt0.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.n41
    public final void s2(rm rmVar, kb3 kb3Var, f93 f93Var, String str, String str2, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 35);
    }

    @Override // defpackage.n41
    public final void v1(rm rmVar, f93 f93Var, f81 f81Var, String str) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(null);
        kt0.e(parcelU, f81Var);
        parcelU.writeString(str);
        K0(parcelU, 10);
    }

    @Override // defpackage.n41
    public final void z0(rm rmVar, f93 f93Var, String str, q41 q41Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, f93Var);
        parcelU.writeString(str);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 28);
    }

    @Override // defpackage.n41
    public final void z3(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 30);
    }
}
