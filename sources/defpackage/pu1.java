package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class pu1 extends v90 implements hv1 {
    public pu1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 2);
    }

    @Override // defpackage.hv1
    public final void b1(ov1 ov1Var) {
        Parcel parcelU = U();
        kt0.e(parcelU, ov1Var);
        K0(parcelU, 8);
    }

    @Override // defpackage.hv1
    public final float g() {
        throw null;
    }

    @Override // defpackage.hv1
    public final float k() {
        throw null;
    }

    @Override // defpackage.hv1
    public final float m() {
        throw null;
    }

    @Override // defpackage.hv1
    public final ov1 p() {
        ov1 ov1Var;
        Parcel parcelY = Y(U(), 11);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ov1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            ov1Var = iInterfaceQueryLocalInterface instanceof ov1 ? (ov1) iInterfaceQueryLocalInterface : new ov1(strongBinder);
        }
        parcelY.recycle();
        return ov1Var;
    }
}
