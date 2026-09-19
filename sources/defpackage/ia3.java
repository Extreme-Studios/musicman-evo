package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ia3 implements Parcelable {
    public static final Parcelable.Creator<ia3> CREATOR = new b42(18);
    public int f;
    public final UUID g;
    public final String h;
    public final String i;
    public final byte[] j;

    public ia3(Parcel parcel) {
        this.g = new UUID(parcel.readLong(), parcel.readLong());
        this.h = parcel.readString();
        String string = parcel.readString();
        String str = qz1.a;
        this.i = string;
        this.j = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ia3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ia3 ia3Var = (ia3) obj;
        return Objects.equals(this.h, ia3Var.h) && Objects.equals(this.i, ia3Var.i) && Objects.equals(this.g, ia3Var.g) && Arrays.equals(this.j, ia3Var.j);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.g.hashCode() * 31;
        String str = this.h;
        int iHashCode2 = Arrays.hashCode(this.j) + ((this.i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.g;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
    }

    public ia3(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.g = uuid;
        this.h = null;
        this.i = rn0.i(str);
        this.j = bArr;
    }
}
