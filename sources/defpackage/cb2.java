package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends f0 {
    public static final Parcelable.Creator<cb2> CREATOR = new b42(6);
    public final int f;
    public final byte[] g;
    public final int h;

    public cb2(byte[] bArr, int i, int i2) {
        this.f = i;
        this.g = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.n(parcel, 2, this.g);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.J(parcel, iW);
    }

    public cb2() {
        this(null, 1, 1);
    }
}
