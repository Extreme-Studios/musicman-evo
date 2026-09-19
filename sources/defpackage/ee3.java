package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ee3 extends f0 {
    public static final Parcelable.Creator<ee3> CREATOR = new b42(21);
    public final String f;
    public long g;
    public fu1 h;
    public final Bundle i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public ee3(String str, long j, fu1 fu1Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f = str;
        this.g = j;
        this.h = fu1Var;
        this.i = bundle;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        long j = this.g;
        s90.P(parcel, 2, 8);
        parcel.writeLong(j);
        s90.p(parcel, 3, this.h, i);
        s90.m(parcel, 4, this.i);
        s90.q(parcel, 5, this.j);
        s90.q(parcel, 6, this.k);
        s90.q(parcel, 7, this.l);
        s90.q(parcel, 8, this.m);
        s90.J(parcel, iW);
    }
}
