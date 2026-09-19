package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class uz0 extends v90 implements b11 {
    public uz0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 2);
    }

    @Override // defpackage.b11
    public final void H(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 2);
    }

    @Override // defpackage.b11
    public final void W(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 8);
    }

    @Override // defpackage.b11
    public final void b() {
        K0(U(), 3);
    }

    @Override // defpackage.b11
    public final void d() {
        K0(U(), 4);
    }

    @Override // defpackage.b11
    public final void e() {
        K0(U(), 5);
    }

    @Override // defpackage.b11
    public final void f() {
        K0(U(), 6);
    }

    @Override // defpackage.b11
    public final void g() {
        K0(U(), 7);
    }

    @Override // defpackage.b11
    public final void j() {
        K0(U(), 9);
    }

    @Override // defpackage.b11
    public final void y() {
        K0(U(), 1);
    }
}
