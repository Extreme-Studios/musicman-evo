package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends f0 {
    public static final Parcelable.Creator<ow1> CREATOR = new os0(27);
    public final int f;

    public ow1(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.f);
        s90.J(parcel, iW);
    }
}
