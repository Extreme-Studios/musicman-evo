package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s21 extends f0 {
    public static final Parcelable.Creator<s21> CREATOR = new os0(10);
    public final String f;
    public final boolean g;
    public final int h;
    public final String i;

    public s21(String str, int i, String str2, boolean z) {
        this.f = str;
        this.g = z;
        this.h = i;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.q(parcel, 4, this.i);
        s90.J(parcel, iW);
    }
}
