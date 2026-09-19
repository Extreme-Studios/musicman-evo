package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ei extends f0 {
    public static final Parcelable.Creator<ei> CREATOR = new os0(23);
    public final String f;
    public final int g;
    public final long h;

    public ei(String str) {
        this.f = str;
        this.h = 1L;
        this.g = -1;
    }

    public final long a() {
        long j = this.h;
        return j == -1 ? this.g : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ei) {
            ei eiVar = (ei) obj;
            String str = eiVar.f;
            String str2 = this.f;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == eiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, Long.valueOf(a())});
    }

    public final String toString() {
        vg2 vg2Var = new vg2(this);
        vg2Var.b(this.f, "name");
        vg2Var.b(Long.valueOf(a()), "version");
        return vg2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 1, this.f);
        s90.P(parcel, 2, 4);
        parcel.writeInt(this.g);
        long jA = a();
        s90.P(parcel, 3, 8);
        parcel.writeLong(jA);
        s90.J(parcel, iW);
    }

    public ei(int i, long j, String str) {
        this.f = str;
        this.g = i;
        this.h = j;
    }
}
