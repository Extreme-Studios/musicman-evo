package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c81 extends f0 {
    public static final Parcelable.Creator<c81> CREATOR = new os0(19);
    public final f93 f;
    public final String g;

    public c81(String str, f93 f93Var) {
        this.f = f93Var;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.p(parcel, 2, this.f, i);
        s90.q(parcel, 3, this.g);
        s90.J(parcel, iW);
    }
}
