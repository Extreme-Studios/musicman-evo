package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r51 extends v90 implements s51 {
    @Override // defpackage.s51
    public final void C0(String str, String str2, f93 f93Var, rm rmVar, k51 k51Var, q41 q41Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, k51Var);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 14);
    }

    @Override // defpackage.s51
    public final void G2(String str, String str2, f93 f93Var, rm rmVar, q51 q51Var, q41 q41Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, q51Var);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 20);
    }

    @Override // defpackage.s51
    public final boolean I0(ju juVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        Parcel parcelY = Y(parcelU, 17);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.s51
    public final void M1(String str, String str2, f93 f93Var, rm rmVar, o51 o51Var, q41 q41Var, qz0 qz0Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, o51Var);
        kt0.e(parcelU, q41Var);
        kt0.c(parcelU, qz0Var);
        K0(parcelU, 22);
    }

    @Override // defpackage.s51
    public final void Q1(String str, String str2, f93 f93Var, rm rmVar, i51 i51Var, q41 q41Var, kb3 kb3Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, i51Var);
        kt0.e(parcelU, q41Var);
        kt0.c(parcelU, kb3Var);
        K0(parcelU, 21);
    }

    @Override // defpackage.s51
    public final x51 d() {
        Parcel parcelY = Y(U(), 2);
        x51 x51Var = (x51) kt0.b(parcelY, x51.CREATOR);
        parcelY.recycle();
        return x51Var;
    }

    @Override // defpackage.s51
    public final x51 e() {
        Parcel parcelY = Y(U(), 3);
        x51 x51Var = (x51) kt0.b(parcelY, x51.CREATOR);
        parcelY.recycle();
        return x51Var;
    }

    @Override // defpackage.s51
    public final hv1 f() {
        Parcel parcelY = Y(U(), 5);
        hv1 hv1VarB3 = yu1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return hv1VarB3;
    }

    @Override // defpackage.s51
    public final void g2(String str, String str2, f93 f93Var, rm rmVar, g51 g51Var, q41 q41Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, g51Var);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 23);
    }

    @Override // defpackage.s51
    public final void h2(String str, String str2, f93 f93Var, rm rmVar, q51 q51Var, q41 q41Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, q51Var);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 16);
    }

    @Override // defpackage.s51
    public final boolean i2(ju juVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        Parcel parcelY = Y(parcelU, 15);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.s51
    public final void l1(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        K0(parcelU, 19);
    }

    @Override // defpackage.s51
    public final void p3(String str, String str2, f93 f93Var, ju juVar, yx1 yx1Var, q41 q41Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, juVar);
        kt0.e(parcelU, yx1Var);
        kt0.e(parcelU, q41Var);
        K0(parcelU, 18);
    }

    @Override // defpackage.s51
    public final boolean q0(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        Parcel parcelY = Y(parcelU, 24);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.s51
    public final void q3(rm rmVar, String str, Bundle bundle, Bundle bundle2, kb3 kb3Var, u51 u51Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeString(str);
        kt0.c(parcelU, bundle);
        kt0.c(parcelU, bundle2);
        kt0.c(parcelU, kb3Var);
        kt0.e(parcelU, u51Var);
        K0(parcelU, 1);
    }

    @Override // defpackage.s51
    public final void z1(String str, String str2, f93 f93Var, rm rmVar, i51 i51Var, q41 q41Var, kb3 kb3Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, f93Var);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, i51Var);
        kt0.e(parcelU, q41Var);
        kt0.c(parcelU, kb3Var);
        K0(parcelU, 13);
    }
}
