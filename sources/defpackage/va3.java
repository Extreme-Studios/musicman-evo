package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class va3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<va3> CREATOR = new b42(15);
    public final ia3[] f;
    public int g;
    public final String h;
    public final int i;

    public va3(Parcel parcel) {
        this.h = parcel.readString();
        ia3[] ia3VarArr = (ia3[]) parcel.createTypedArray(ia3.CREATOR);
        String str = qz1.a;
        this.f = ia3VarArr;
        this.i = ia3VarArr.length;
    }

    public final va3 a(String str) {
        return Objects.equals(this.h, str) ? this : new va3(str, false, this.f);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ia3 ia3Var = (ia3) obj2;
        UUID uuid = be2.a;
        UUID uuid2 = ((ia3) obj).g;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(ia3Var.g) ? 1 : 0;
        }
        return uuid2.compareTo(ia3Var.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va3.class == obj.getClass()) {
            va3 va3Var = (va3) obj;
            if (Objects.equals(this.h, va3Var.h) && Arrays.equals(this.f, va3Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        String str = this.h;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f);
        this.g = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeTypedArray(this.f, 0);
    }

    public va3(String str, boolean z, ia3... ia3VarArr) {
        this.h = str;
        ia3VarArr = z ? (ia3[]) ia3VarArr.clone() : ia3VarArr;
        this.f = ia3VarArr;
        this.i = ia3VarArr.length;
        Arrays.sort(ia3VarArr, this);
    }
}
