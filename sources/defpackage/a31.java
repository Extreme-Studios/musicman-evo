package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a31 extends f0 {
    public static final Parcelable.Creator<a31> CREATOR = new os0(12);
    public final int f;
    public final int g;
    public final String h;
    public final int i;

    public a31(int i, int i2, String str, int i3) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.g);
        s90.q(parcel, 2, this.h);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.i);
        s90.P(parcel, 1000, 4);
        parcel.writeInt(this.f);
        s90.J(parcel, iW);
    }
}
