package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 extends v90 implements nu0 {
    @Override // defpackage.nu0
    public final void H(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        K0(parcelU, 2);
    }

    @Override // defpackage.nu0
    public final void W(fu1 fu1Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, fu1Var);
        K0(parcelU, 3);
    }

    @Override // defpackage.nu0
    public final void e3(ku0 ku0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, ku0Var);
        K0(parcelU, 1);
    }
}
