package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e91 extends f0 {
    public static final Parcelable.Creator<e91> CREATOR = new os0(22);
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final List m;

    public e91(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = z3;
        this.l = z4;
        this.m = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.q(parcel, 3, this.g);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.s(parcel, 6, this.j);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.k ? 1 : 0);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        s90.s(parcel, 9, this.m);
        s90.J(parcel, iW);
    }
}
