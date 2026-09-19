package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i71 extends f0 {
    public static final Parcelable.Creator<i71> CREATOR = new os0(16);
    public final boolean f;
    public final List g;

    public i71(boolean z, List list) {
        this.f = z;
        this.g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        s90.s(parcel, 3, this.g);
        s90.J(parcel, iW);
    }
}
