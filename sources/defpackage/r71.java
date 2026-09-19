package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r71 extends f0 {
    public static final Parcelable.Creator<r71> CREATOR = new os0(18);
    public final Bundle f;
    public final d60 g;
    public final ApplicationInfo h;
    public final String i;
    public final List j;
    public final PackageInfo k;
    public final String l;
    public final String m;
    public c62 n;
    public String o;
    public final boolean p;
    public final boolean q;
    public final Bundle r;
    public final Bundle s;
    public final int t;

    public r71(Bundle bundle, d60 d60Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, c62 c62Var, String str4, boolean z, boolean z2, Bundle bundle2, Bundle bundle3, int i) {
        this.f = bundle;
        this.g = d60Var;
        this.i = str;
        this.h = applicationInfo;
        this.j = arrayList;
        this.k = packageInfo;
        this.l = str2;
        this.m = str3;
        this.n = c62Var;
        this.o = str4;
        this.p = z;
        this.q = z2;
        this.r = bundle2;
        this.s = bundle3;
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.m(parcel, 1, this.f);
        s90.p(parcel, 2, this.g, i);
        s90.p(parcel, 3, this.h, i);
        s90.q(parcel, 4, this.i);
        s90.s(parcel, 5, this.j);
        s90.p(parcel, 6, this.k, i);
        s90.q(parcel, 7, this.l);
        s90.q(parcel, 9, this.m);
        s90.p(parcel, 10, this.n, i);
        s90.q(parcel, 11, this.o);
        s90.P(parcel, 12, 4);
        parcel.writeInt(this.p ? 1 : 0);
        s90.P(parcel, 13, 4);
        parcel.writeInt(this.q ? 1 : 0);
        s90.m(parcel, 14, this.r);
        s90.m(parcel, 15, this.s);
        s90.P(parcel, 16, 4);
        parcel.writeInt(this.t);
        s90.J(parcel, iW);
    }
}
