package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends v90 implements mn1 {
    @Override // defpackage.mn1
    public final String b() {
        Parcel parcelY = Y(U(), 1);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.mn1
    public final String d() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }
}
