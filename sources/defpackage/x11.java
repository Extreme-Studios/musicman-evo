package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x11 extends v90 implements u21 {
    @Override // defpackage.u21
    public final boolean zze(rm rmVar, String str, String str2) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        Parcel parcelY = Y(parcelU, 1);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.u21
    public final void zzf(rm rmVar) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        K0(parcelU, 2);
    }

    @Override // defpackage.u21
    public final boolean zzg(rm rmVar, jb0 jb0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, jb0Var);
        Parcel parcelY = Y(parcelU, 3);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }
}
