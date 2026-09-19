package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r91 extends f0 {
    public static final Parcelable.Creator<r91> CREATOR = new os0(3);
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Intent m;
    public final lb0 n;
    public final boolean o;
    public final Bundle p;

    public r91(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z, Bundle bundle) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = intent;
        this.n = (lb0) ju.Z0(ju.O0(iBinder));
        this.o = z;
        this.p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.q(parcel, 3, this.g);
        s90.q(parcel, 4, this.h);
        s90.q(parcel, 5, this.i);
        s90.q(parcel, 6, this.j);
        s90.q(parcel, 7, this.k);
        s90.q(parcel, 8, this.l);
        s90.p(parcel, 9, this.m, i);
        s90.o(parcel, 10, new ju(this.n));
        s90.P(parcel, 11, 4);
        parcel.writeInt(this.o ? 1 : 0);
        s90.m(parcel, 12, this.p);
        s90.J(parcel, iW);
    }

    public r91(Intent intent, lb0 lb0Var) {
        this(null, null, null, null, null, null, null, intent, new ju(lb0Var), false, new Bundle());
    }

    public r91(String str, String str2, String str3, String str4, String str5, String str6, String str7, lb0 lb0Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ju(lb0Var), false, new Bundle());
    }
}
