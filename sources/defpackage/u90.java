package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends f0 {
    public static final Parcelable.Creator<u90> CREATOR = new a2(20);
    public final int f;
    public final int g;
    public final Intent h;

    public u90(int i, int i2, Intent intent) {
        this.f = i;
        this.g = i2;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.p(parcel, 3, this.h, i);
        s90.J(parcel, iW);
    }
}
