package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c62 extends f0 {
    public static final Parcelable.Creator<c62> CREATOR = new b42(1);
    public final Context f;
    public final int g;
    public final b62 h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;

    public c62(Context context, b62 b62Var, int i, int i2, int i3, String str, String str2, String str3) {
        b62.values();
        this.f = context;
        this.g = b62Var.ordinal();
        this.h = b62Var;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.o = i4;
        this.m = i4 - 1;
        "onAdClosed".equals(str3);
        this.n = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.g);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.i);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.j);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.k);
        s90.q(parcel, 5, this.l);
        s90.P(parcel, 6, 4);
        parcel.writeInt(this.m);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.n);
        s90.J(parcel, iW);
    }

    public c62(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        b62[] b62VarArrValues = b62.values();
        this.f = null;
        this.g = i;
        this.h = b62VarArrValues[i];
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = str;
        this.m = i5;
        this.o = new int[]{1, 2, 3}[i5];
        this.n = i6;
        int i7 = new int[]{1}[i6];
    }
}
