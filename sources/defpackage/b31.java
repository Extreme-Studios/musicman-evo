package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b31 extends v90 implements c31 {
    @Override // defpackage.c31
    public final void b() {
        K0(U(), 1);
    }

    @Override // defpackage.c31
    public final void t(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 2);
    }
}
