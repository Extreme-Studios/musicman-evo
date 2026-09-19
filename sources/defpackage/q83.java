package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q83 extends f0 {
    public static final Parcelable.Creator<q83> CREATOR = new b42(13);
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final float j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public q83(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = z3;
        this.j = f;
        this.k = i;
        this.l = z4;
        this.m = z5;
        this.n = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.q(parcel, 4, this.h);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.P(parcel, 6, 4);
        parcel.writeFloat(this.j);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.k);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        s90.P(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        s90.P(parcel, 10, 4);
        parcel.writeInt(this.n ? 1 : 0);
        s90.J(parcel, iW);
    }

    public q83(boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
