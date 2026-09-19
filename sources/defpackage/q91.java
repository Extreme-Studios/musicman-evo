package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q91 extends f0 {
    public static final Parcelable.Creator<q91> CREATOR = new os0(25);
    public final String f;
    public final String g;

    public q91(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.q(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
