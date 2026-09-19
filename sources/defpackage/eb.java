package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class eb extends f0 {
    public static final Parcelable.Creator<eb> CREATOR = new b42(12);
    public final ay f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int[] k;

    public eb(ay ayVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f = ayVar;
        this.g = z;
        this.h = z2;
        this.i = iArr;
        this.j = i;
        this.k = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.p(parcel, 1, this.f, i);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        int[] iArr = this.i;
        if (iArr != null) {
            int iW2 = s90.w(parcel, 4);
            parcel.writeIntArray(iArr);
            s90.J(parcel, iW2);
        }
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j);
        int[] iArr2 = this.k;
        if (iArr2 != null) {
            int iW3 = s90.w(parcel, 6);
            parcel.writeIntArray(iArr2);
            s90.J(parcel, iW3);
        }
        s90.J(parcel, iW);
    }
}
