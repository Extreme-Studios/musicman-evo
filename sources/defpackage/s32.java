package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s32 extends f0 {
    public static final Parcelable.Creator<s32> CREATOR = new b42(0);
    public final int f;
    public final int g;
    public final String h;

    public s32(String str, int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.q(parcel, 3, this.h);
        s90.J(parcel, iW);
    }
}
