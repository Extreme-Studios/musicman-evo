package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends f0 {
    public static final Parcelable.Creator<ra0> CREATOR = new a2(22);
    public final List f;
    public final String g;

    public ra0(ArrayList arrayList, String str) {
        this.f = arrayList;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.s(parcel, 1, this.f);
        s90.q(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
