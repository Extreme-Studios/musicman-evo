package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class yu1 extends jt0 implements hv1 {
    public yu1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static hv1 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof hv1 ? (hv1) iInterfaceQueryLocalInterface : new pu1(iBinder);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        ov1 ov1Var;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                o0(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zF = f();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 5:
                int iJ = j();
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 6:
                float fG = g();
                parcel2.writeNoException();
                parcel2.writeFloat(fG);
                return true;
            case 7:
                float fK = k();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ov1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    ov1Var = iInterfaceQueryLocalInterface instanceof ov1 ? (ov1) iInterfaceQueryLocalInterface : new ov1(strongBinder);
                }
                kt0.f(parcel);
                b1(ov1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fM = m();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 10:
                boolean zO = o();
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 11:
                ov1 ov1VarP = p();
                parcel2.writeNoException();
                kt0.e(parcel2, ov1VarP);
                return true;
            case 12:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader3 = kt0.a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 13:
                x();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
