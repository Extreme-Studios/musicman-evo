package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o21 extends f0 {
    public static final Parcelable.Creator<o21> CREATOR = new os0(9);
    public final boolean f;
    public final String g;
    public final int h;
    public final byte[] i;
    public final String[] j;
    public final String[] k;
    public final boolean l;
    public final long m;

    public o21(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f = z;
        this.g = str;
        this.h = i;
        this.i = bArr;
        this.j = strArr;
        this.k = strArr2;
        this.l = z2;
        this.m = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f ? 1 : 0);
        s90.q(parcel, 2, this.g);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.n(parcel, 4, this.i);
        s90.r(parcel, 5, this.j);
        s90.r(parcel, 6, this.k);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.l ? 1 : 0);
        s90.P(parcel, 8, 8);
        parcel.writeLong(this.m);
        s90.J(parcel, iW);
    }
}
