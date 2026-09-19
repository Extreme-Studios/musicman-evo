package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wa2 extends f0 {
    public static final Parcelable.Creator<wa2> CREATOR = new b42(3);
    public final int f;
    public final String g;
    public final String h;

    public wa2(int i, String str, String str2) {
        this.f = i;
        this.g = str;
        this.h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.q(parcel, 2, this.g);
        s90.q(parcel, 3, this.h);
        s90.J(parcel, iW);
    }
}
