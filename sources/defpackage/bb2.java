package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bb2 extends f0 {
    public static final Parcelable.Creator<bb2> CREATOR = new b42(5);
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;

    public bb2(int i, int i2, int i3, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.q(parcel, 3, this.h);
        s90.q(parcel, 4, this.i);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j);
        s90.J(parcel, iW);
    }
}
