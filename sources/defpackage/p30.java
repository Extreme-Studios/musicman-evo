package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p30 extends f0 {
    public static final Parcelable.Creator<p30> CREATOR = new a2(19);
    public final int f;
    public List g;

    public p30(int i, List list) {
        this.f = i;
        this.g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.u(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
