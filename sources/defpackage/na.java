package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class na extends RuntimeException {
    public na(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    public na(String str) {
        super(str);
    }

    public na(int i) {
        super(ec.j(new StringBuilder(String.valueOf(i).length() + 3), "r: ", i));
    }
}
