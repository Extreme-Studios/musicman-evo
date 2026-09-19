package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends v90 implements fa1 {
    @Override // defpackage.fa1
    public final void t3(String str, Bundle bundle, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        kt0.c(parcelU, bundle);
        K0(parcelU, 3);
    }

    @Override // defpackage.fa1
    public final void w(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        K0(parcelU, 2);
    }
}
