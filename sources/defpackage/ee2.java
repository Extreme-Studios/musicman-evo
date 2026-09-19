package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ee2 extends f0 {
    public static final Parcelable.Creator<ee2> CREATOR = new b42(10);
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ee2(j60 j60Var) {
        this(j60Var.a, j60Var.b, j60Var.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        s90.J(parcel, iW);
    }

    public ee2(boolean z, boolean z2, boolean z3) {
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
