package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m81 extends v90 implements o81 {
    @Override // defpackage.o81
    public final void W0(i81 i81Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, i81Var);
        K0(parcelU, 3);
    }

    @Override // defpackage.o81
    public final void b() {
        K0(U(), 1);
    }

    @Override // defpackage.o81
    public final void d() {
        K0(U(), 2);
    }

    @Override // defpackage.o81
    public final void g() {
        K0(U(), 6);
    }

    @Override // defpackage.o81
    public final void k() {
        K0(U(), 7);
    }

    @Override // defpackage.o81
    public final void u2(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 5);
    }

    @Override // defpackage.o81
    public final void z(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 4);
    }
}
