package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ab2 extends f0 {
    public static final Parcelable.Creator<ab2> CREATOR = new b42(7);
    public final String f;
    public final int g;
    public final f93 h;
    public final int i;

    public ab2(String str, int i, f93 f93Var, int i2) {
        this.f = str;
        this.g = i;
        this.h = f93Var;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab2)) {
            return false;
        }
        ab2 ab2Var = (ab2) obj;
        return this.f.equals(ab2Var.f) && this.g == ab2Var.g && this.h.a(ab2Var.h);
    }

    public final int hashCode() {
        return Objects.hash(this.f, Integer.valueOf(this.g), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        s90.p(parcel, 3, this.h, i);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.i);
        s90.J(parcel, iW);
    }
}
