package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yj implements Parcelable {
    public static final Parcelable.Creator<yj> CREATOR = new a2(5);
    public ArrayList f;
    public ArrayList g;
    public t7[] h;
    public int i;
    public String j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
