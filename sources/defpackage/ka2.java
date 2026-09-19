package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends jt0 implements sr1 {
    public ka2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static sr1 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof sr1 ? (sr1) iInterfaceQueryLocalInterface : new zq1(iBinder);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            kt0.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = kt0.a;
        parcel2.writeInt(1);
        return true;
    }

    @Override // defpackage.sr1
    public final boolean d() {
        return true;
    }

    @Override // defpackage.sr1
    public final void S1(qc3 qc3Var) {
    }
}
