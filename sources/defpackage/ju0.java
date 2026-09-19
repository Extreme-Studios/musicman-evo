package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ju0 extends v90 implements ku0 {
    @Override // defpackage.ku0
    public final void I1(rm rmVar, pu0 pu0Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, pu0Var);
        K0(parcelU, 4);
    }

    @Override // defpackage.ku0
    public final lu1 e() {
        Parcel parcelY = Y(U(), 5);
        lu1 lu1VarB3 = zj1.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return lu1VarB3;
    }
}
