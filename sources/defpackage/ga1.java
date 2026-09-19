package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends v90 implements ia1 {
    public ga1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 2);
    }

    @Override // defpackage.ia1
    public final void f2(rm rmVar, ma1 ma1Var, fa1 fa1Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, ma1Var);
        kt0.e(parcelU, fa1Var);
        K0(parcelU, 1);
    }
}
