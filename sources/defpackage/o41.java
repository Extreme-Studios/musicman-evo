package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class o41 extends v90 implements q41 {
    public o41(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 2);
    }

    @Override // defpackage.q41
    public final void G1(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 24);
    }

    @Override // defpackage.q41
    public final void H0() {
        K0(U(), 18);
    }

    @Override // defpackage.q41
    public final void M0(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 23);
    }

    @Override // defpackage.q41
    public final void b() {
        K0(U(), 1);
    }

    @Override // defpackage.q41
    public final void b0() {
        K0(U(), 25);
    }

    @Override // defpackage.q41
    public final void d() {
        K0(U(), 2);
    }

    @Override // defpackage.q41
    public final void d3(n01 n01Var, String str) {
        Parcel parcelU = U();
        kt0.e(parcelU, n01Var);
        parcelU.writeString(str);
        K0(parcelU, 10);
    }

    @Override // defpackage.q41
    public final void f() {
        K0(U(), 4);
    }

    @Override // defpackage.q41
    public final void f0(int i) {
        throw null;
    }

    @Override // defpackage.q41
    public final void g() {
        K0(U(), 6);
    }

    @Override // defpackage.q41
    public final void h0() {
        K0(U(), 20);
    }

    @Override // defpackage.q41
    public final void i0(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        K0(parcelU, 21);
    }

    @Override // defpackage.q41
    public final void j() {
        K0(U(), 5);
    }

    @Override // defpackage.q41
    public final void j0() {
        K0(U(), 11);
    }

    @Override // defpackage.q41
    public final void k() {
        K0(U(), 8);
    }

    @Override // defpackage.q41
    public final void m0(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 3);
    }

    @Override // defpackage.q41
    public final void m2(i81 i81Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, i81Var);
        K0(parcelU, 16);
    }

    @Override // defpackage.q41
    public final void p() {
        K0(U(), 13);
    }

    @Override // defpackage.q41
    public final void r3(g81 g81Var) {
        throw null;
    }

    @Override // defpackage.q41
    public final void w2(String str, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        K0(parcelU, 9);
    }

    @Override // defpackage.q41
    public final void x() {
        K0(U(), 15);
    }

    @Override // defpackage.q41
    public final void x0(String str, int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeString(str);
        K0(parcelU, 22);
    }
}
