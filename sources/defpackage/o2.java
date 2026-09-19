package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends f0 {
    public static final Parcelable.Creator<o2> CREATOR = new os0(1);
    public final boolean f;

    public o2(boolean z) {
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f ? 1 : 0);
        s90.J(parcel, iW);
    }
}
