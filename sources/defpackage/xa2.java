package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xa2 extends f0 {
    public static final Parcelable.Creator<xa2> CREATOR = new b42(4);
    public final int f;
    public sp0 g = null;
    public byte[] h;

    public xa2(int i, byte[] bArr) {
        this.f = i;
        this.h = bArr;
        a();
    }

    public final void a() {
        sp0 sp0Var = this.g;
        if (sp0Var != null || this.h == null) {
            if (sp0Var == null || this.h != null) {
                if (sp0Var != null && this.h != null) {
                    j7.e("Invalid internal representation - full");
                } else if (sp0Var == null && this.h == null) {
                    j7.e("Invalid internal representation - empty");
                } else {
                    j7.e("Impossible");
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        byte[] bArrB = this.h;
        if (bArrB == null) {
            bArrB = this.g.b();
        }
        s90.n(parcel, 2, bArrB);
        s90.J(parcel, iW);
    }
}
