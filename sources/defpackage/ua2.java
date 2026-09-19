package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ua2 extends f0 {
    public static final Parcelable.Creator<ua2> CREATOR = new b42(2);
    public final int f;
    public final byte[] g;

    public ua2(int i, byte[] bArr) {
        this.f = i;
        this.g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.n(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
