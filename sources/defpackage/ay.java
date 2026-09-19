package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ay extends f0 {
    public static final Parcelable.Creator<ay> CREATOR = new a2(28);
    public final int f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;

    public ay(int i, int i2, int i3, boolean z, boolean z2) {
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = i2;
        this.j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.i);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j);
        s90.J(parcel, iW);
    }
}
