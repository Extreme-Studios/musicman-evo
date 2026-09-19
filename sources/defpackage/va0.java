package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class va0 extends f0 {
    public static final Parcelable.Creator<va0> CREATOR = new a2(23);
    public final int f;
    public final db g;
    public final bb0 h;

    public va0(int i, db dbVar, bb0 bb0Var) {
        this.f = i;
        this.g = dbVar;
        this.h = bb0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.p(parcel, 2, this.g, i);
        s90.p(parcel, 3, this.h, i);
        s90.J(parcel, iW);
    }
}
