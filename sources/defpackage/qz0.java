package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qz0 extends f0 {
    public static final Parcelable.Creator<qz0> CREATOR = new os0(7);
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int j;
    public final ee2 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final boolean o;
    public final int p;

    /* JADX WARN: Illegal instructions before constructor call */
    public qz0(ft ftVar) {
        boolean z = ftVar.a;
        int i = ftVar.b;
        boolean z2 = ftVar.d;
        int i2 = ftVar.e;
        j60 j60Var = ftVar.f;
        this(4, z, i, z2, i2, j60Var != null ? new ee2(j60Var) : null, ftVar.g, ftVar.c, 0, false, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j);
        s90.p(parcel, 6, this.k, i);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.l ? 1 : 0);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.m);
        s90.P(parcel, 9, 4);
        parcel.writeInt(this.n);
        s90.P(parcel, 10, 4);
        parcel.writeInt(this.o ? 1 : 0);
        s90.P(parcel, 11, 4);
        parcel.writeInt(this.p);
        s90.J(parcel, iW);
    }

    public qz0(int i, boolean z, int i2, boolean z2, int i3, ee2 ee2Var, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = ee2Var;
        this.l = z3;
        this.m = i4;
        this.o = z4;
        this.n = i5;
        this.p = i6;
    }
}
