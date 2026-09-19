package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zs0 extends f0 {
    public static final Parcelable.Creator<zs0> CREATOR = new os0(4);
    public final String f;
    public final int g;

    public zs0(String str, int i) {
        this.f = str == null ? "" : str;
        this.g = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.J(parcel, iW);
    }
}
