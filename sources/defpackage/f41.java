package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends v90 implements m51 {
    public f41(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 2);
    }

    @Override // defpackage.m51
    public final s31 b() {
        s31 v21Var;
        Parcel parcelY = Y(U(), 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v21Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            v21Var = iInterfaceQueryLocalInterface instanceof s31 ? (s31) iInterfaceQueryLocalInterface : new v21(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 2);
        }
        parcelY.recycle();
        return v21Var;
    }

    @Override // defpackage.m51
    public final void n1(String str, t01 t01Var, r01 r01Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        kt0.e(parcelU, t01Var);
        kt0.e(parcelU, r01Var);
        K0(parcelU, 5);
    }

    @Override // defpackage.m51
    public final void r1(x01 x01Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, x01Var);
        K0(parcelU, 10);
    }

    @Override // defpackage.m51
    public final void w0(b11 b11Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, b11Var);
        K0(parcelU, 2);
    }

    @Override // defpackage.m51
    public final void x1(qz0 qz0Var) {
        Parcel parcelU = U();
        kt0.c(parcelU, qz0Var);
        K0(parcelU, 6);
    }
}
