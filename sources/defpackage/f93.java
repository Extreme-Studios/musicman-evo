package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f93 extends f0 {
    public static final Parcelable.Creator<f93> CREATOR = new b42(16);
    public final List A;
    public final int B;
    public final String C;
    public final int D;
    public final long E;
    public final long F;
    public final Bundle G = new Bundle();
    public final int f;
    public final long g;
    public final Bundle h;
    public final int i;
    public final List j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final String n;
    public final qc2 o;
    public final Location p;
    public final String q;
    public final Bundle r;
    public final Bundle s;
    public final List t;
    public final String u;
    public final String v;
    public final boolean w;
    public final q91 x;
    public final int y;
    public final String z;

    public f93(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, qc2 qc2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, q91 q91Var, int i4, String str5, List list3, int i5, String str6, int i6, long j2, long j3) {
        this.f = i;
        this.g = j;
        this.h = bundle == null ? new Bundle() : bundle;
        this.i = i2;
        this.j = list;
        this.k = z;
        this.l = i3;
        this.m = z2;
        this.n = str;
        this.o = qc2Var;
        this.p = location;
        this.q = str2;
        this.r = bundle2 == null ? new Bundle() : bundle2;
        this.s = bundle3;
        this.t = list2;
        this.u = str3;
        this.v = str4;
        this.w = z3;
        this.x = q91Var;
        this.y = i4;
        this.z = str5;
        this.A = list3 == null ? new ArrayList() : list3;
        this.B = i5;
        this.C = str6;
        this.D = i6;
        this.E = j2;
        this.F = j3;
    }

    public final boolean a(f93 f93Var) {
        return f93Var != null && this.f == f93Var.f && this.g == f93Var.g && i8.x(this.h, f93Var.h) && this.i == f93Var.i && s90.d(this.j, f93Var.j) && this.k == f93Var.k && this.l == f93Var.l && this.m == f93Var.m && s90.d(this.n, f93Var.n) && s90.d(this.o, f93Var.o) && s90.d(this.p, f93Var.p) && s90.d(this.q, f93Var.q) && i8.x(this.r, f93Var.r) && i8.x(this.s, f93Var.s) && s90.d(this.t, f93Var.t) && s90.d(this.u, f93Var.u) && s90.d(this.v, f93Var.v) && this.w == f93Var.w && this.y == f93Var.y && s90.d(this.z, f93Var.z) && s90.d(this.A, f93Var.A) && this.B == f93Var.B && s90.d(this.C, f93Var.C) && this.D == f93Var.D;
    }

    public final boolean b() {
        Bundle bundle = this.h;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f93)) {
            return false;
        }
        f93 f93Var = (f93) obj;
        return a(f93Var) && this.E == f93Var.E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Long.valueOf(this.g), this.h, Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), Integer.valueOf(this.l), Boolean.valueOf(this.m), this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, Boolean.valueOf(this.w), Integer.valueOf(this.y), this.z, this.A, Integer.valueOf(this.B), this.C, Integer.valueOf(this.D), Long.valueOf(this.E), Long.valueOf(this.F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 8);
        parcel.writeLong(this.g);
        s90.m(parcel, 3, this.h);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.i);
        s90.s(parcel, 5, this.j);
        s90.P(parcel, 6, 4);
        parcel.writeInt(this.k ? 1 : 0);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.l);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.m ? 1 : 0);
        s90.q(parcel, 9, this.n);
        s90.p(parcel, 10, this.o, i);
        s90.p(parcel, 11, this.p, i);
        s90.q(parcel, 12, this.q);
        s90.m(parcel, 13, this.r);
        s90.m(parcel, 14, this.s);
        s90.s(parcel, 15, this.t);
        s90.q(parcel, 16, this.u);
        s90.q(parcel, 17, this.v);
        s90.P(parcel, 18, 4);
        parcel.writeInt(this.w ? 1 : 0);
        s90.p(parcel, 19, this.x, i);
        s90.P(parcel, 20, 4);
        parcel.writeInt(this.y);
        s90.q(parcel, 21, this.z);
        s90.s(parcel, 22, this.A);
        s90.P(parcel, 23, 4);
        parcel.writeInt(this.B);
        s90.q(parcel, 24, this.C);
        s90.P(parcel, 25, 4);
        parcel.writeInt(this.D);
        s90.P(parcel, 26, 8);
        parcel.writeLong(this.E);
        s90.P(parcel, 27, 8);
        parcel.writeLong(this.F);
        s90.J(parcel, iW);
    }
}
