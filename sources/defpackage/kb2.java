package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class kb2 extends jt0 implements jb2 {
    public kb2() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                ju.O0(parcel.readStrongBinder());
                parcel.readString();
                kt0.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                kt0.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                kt0.f(parcel);
                break;
            case 6:
                parcel.readInt();
                kt0.f(parcel);
                break;
            case 7:
                parcel.readInt();
                kt0.f(parcel);
                break;
            case 8:
                ju.O0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                kt0.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.jb2
    public final void H2() {
    }

    @Override // defpackage.jb2
    public final void b() {
    }

    @Override // defpackage.jb2
    public final void A(int i) {
    }

    @Override // defpackage.jb2
    public final void u0(byte[] bArr) {
    }

    @Override // defpackage.jb2
    public final void z(int i) {
    }

    @Override // defpackage.jb2
    public final void K1(ju juVar, String str) {
    }
}
