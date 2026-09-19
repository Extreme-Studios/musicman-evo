package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends f0 {
    public static final Parcelable.Creator<jb0> CREATOR = new os0(2);
    public final String f;
    public final String g;
    public final String h;

    public jb0(String str, String str2, String str3) {
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.q(parcel, 2, this.g);
        s90.q(parcel, 3, this.h);
        s90.J(parcel, iW);
    }
}
