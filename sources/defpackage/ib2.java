package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 extends v90 implements jb2 {
    @Override // defpackage.jb2
    public final void A(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 7);
    }

    @Override // defpackage.jb2
    public final void H2() {
        Parcel parcelU = U();
        parcelU.writeIntArray(null);
        K0(parcelU, 4);
    }

    @Override // defpackage.jb2
    public final void K1(ju juVar, String str) {
        Parcel parcelU = U();
        kt0.e(parcelU, juVar);
        parcelU.writeString(str);
        parcelU.writeString(null);
        K0(parcelU, 8);
    }

    @Override // defpackage.jb2
    public final void b() {
        K0(U(), 3);
    }

    @Override // defpackage.jb2
    public final void u0(byte[] bArr) {
        Parcel parcelU = U();
        parcelU.writeByteArray(bArr);
        K0(parcelU, 5);
    }

    @Override // defpackage.jb2
    public final void z(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 6);
    }
}
