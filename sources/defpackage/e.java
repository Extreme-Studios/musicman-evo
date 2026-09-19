package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Parcelable {
    public final Parcelable f;
    public static final c g = new c();
    public static final Parcelable.Creator<e> CREATOR = new d(0);

    public e(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == g ? null : parcelable;
        } else {
            j7.p("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, i);
    }

    public e() {
        this.f = null;
    }

    public e(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f = parcelable == null ? g : parcelable;
    }
}
