package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qc2 extends f0 {
    public static final Parcelable.Creator<qc2> CREATOR = new b42(9);
    public final String f;

    public qc2(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 15, this.f);
        s90.J(parcel, iW);
    }
}
