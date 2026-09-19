package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k71 extends v90 implements l71 {
    @Override // defpackage.l71
    public final void R2(r71 r71Var, p71 p71Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, r71Var);
        kt0.e(parcelU, p71Var);
        K0(parcelU, 6);
    }

    @Override // defpackage.l71
    public final void m1(r71 r71Var, p71 p71Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, r71Var);
        kt0.e(parcelU, p71Var);
        K0(parcelU, 4);
    }

    @Override // defpackage.l71
    public final void n3(String str, p71 p71Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        kt0.e(parcelU, p71Var);
        K0(parcelU, 7);
    }

    @Override // defpackage.l71
    public final void r0(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        K0(parcelU, 9);
    }

    @Override // defpackage.l71
    public final void y0(r71 r71Var, p71 p71Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, r71Var);
        kt0.e(parcelU, p71Var);
        K0(parcelU, 5);
    }
}
