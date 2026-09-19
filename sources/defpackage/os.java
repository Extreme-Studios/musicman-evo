package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class os extends f0 {
    public static final Parcelable.Creator<os> CREATOR = new a2(24);
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;

    public os(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = j2;
        this.k = str;
        this.l = str2;
        this.m = i4;
        this.n = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.P(parcel, 4, 8);
        parcel.writeLong(this.i);
        s90.P(parcel, 5, 8);
        parcel.writeLong(this.j);
        s90.q(parcel, 6, this.k);
        s90.q(parcel, 7, this.l);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.m);
        s90.P(parcel, 9, 4);
        parcel.writeInt(this.n);
        s90.J(parcel, iW);
    }
}
