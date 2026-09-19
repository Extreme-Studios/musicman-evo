package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d60 extends f0 {
    public static final Parcelable.Creator<d60> CREATOR = new b42(22);
    public final String f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public d60(int i, int i2, int i3, boolean z, boolean z2) {
        String str = z ? "0" : "1";
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i2).length() + length + 13 + 1);
        ec.v(sb, "afma-sdk-a-v", i, ".", i2);
        this(ec.m(sb, ".", str), i, i2, z, z2);
    }

    public static d60 a() {
        return new d60(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.g);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.h);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.P(parcel, 6, 4);
        parcel.writeInt(this.j ? 1 : 0);
        s90.J(parcel, iW);
    }

    public d60(int i, int i2, boolean z) {
        this(i, i2, 0, z, false);
    }

    public d60(String str, int i, int i2, boolean z, boolean z2) {
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
    }
}
