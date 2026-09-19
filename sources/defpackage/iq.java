package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class iq extends e {
    public static final Parcelable.Creator<iq> CREATOR = new d(1);
    public boolean h;

    public iq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            iq.class.getClassLoader();
        }
        this.h = parcel.readInt() == 1;
    }

    @Override // defpackage.e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
