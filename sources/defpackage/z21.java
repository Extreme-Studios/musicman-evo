package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z21 extends f0 {
    public static final Parcelable.Creator<z21> CREATOR = new os0(11);
    public final String f;
    public final Bundle g;

    public z21(String str, Bundle bundle) {
        this.f = str;
        this.g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.m(parcel, 2, this.g);
        s90.J(parcel, iW);
    }
}
