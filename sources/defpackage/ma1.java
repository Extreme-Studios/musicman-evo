package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ma1 extends f0 {
    public static final Parcelable.Creator<ma1> CREATOR = new os0(24);
    public final String f;
    public final String g;
    public final kb3 h;
    public final f93 i;
    public final int j;
    public final String k;

    public ma1(String str, String str2, kb3 kb3Var, f93 f93Var, int i, String str3) {
        this.f = str;
        this.g = str2;
        this.h = kb3Var;
        this.i = f93Var;
        this.j = i;
        this.k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.q(parcel, 2, this.g);
        s90.p(parcel, 3, this.h, i);
        s90.p(parcel, 4, this.i, i);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j);
        s90.q(parcel, 6, this.k);
        s90.J(parcel, iW);
    }
}
