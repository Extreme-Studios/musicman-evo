package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qc3 extends f0 {
    public static final Parcelable.Creator<qc3> CREATOR = new b42(20);
    public final int f;
    public final int g;
    public final String h;
    public final long i;

    public qc3(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.q(parcel, 3, this.h);
        s90.P(parcel, 4, 8);
        parcel.writeLong(this.i);
        s90.J(parcel, iW);
    }
}
