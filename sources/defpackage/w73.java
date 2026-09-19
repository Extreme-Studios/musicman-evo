package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w73 extends f0 {
    public static final Parcelable.Creator<w73> CREATOR = new b42(11);
    public Bundle f;
    public ei[] g;
    public int h;
    public eb i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.m(parcel, 1, this.f);
        s90.t(parcel, 2, this.g, i);
        int i2 = this.h;
        s90.P(parcel, 3, 4);
        parcel.writeInt(i2);
        s90.p(parcel, 4, this.i, i);
        s90.J(parcel, iW);
    }
}
