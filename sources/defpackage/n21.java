package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n21 extends f0 {
    public static final Parcelable.Creator<n21> CREATOR = new os0(8);
    public final String f;
    public final String[] g;
    public final String[] h;

    public n21(String str, String[] strArr, String[] strArr2) {
        this.f = str;
        this.g = strArr;
        this.h = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.r(parcel, 2, this.g);
        s90.r(parcel, 3, this.h);
        s90.J(parcel, iW);
    }
}
