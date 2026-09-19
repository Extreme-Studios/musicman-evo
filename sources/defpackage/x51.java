package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x51 extends f0 {
    public static final Parcelable.Creator<x51> CREATOR = new os0(13);
    public final int f;
    public final int g;
    public final int h;

    public x51(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x51)) {
            x51 x51Var = (x51) obj;
            if (x51Var.h == this.h && x51Var.g == this.g && x51Var.f == this.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f, this.g, this.h});
    }

    public final String toString() {
        int i = this.f;
        int length = String.valueOf(i).length();
        int i2 = this.g;
        int length2 = String.valueOf(i2).length();
        int i3 = this.h;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.J(parcel, iW);
    }
}
