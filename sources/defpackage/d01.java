package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class d01 extends jt0 implements e01 {
    public static final /* synthetic */ int f = 0;

    public d01() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        yz0 xz0Var;
        switch (i) {
            case 1:
                String string = parcel.readString();
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                X0(rmVarO0, string);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                kt0.f(parcel);
                rm rmVarO = O(string2);
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarO);
                return true;
            case 3:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                N0(rmVarO1);
                parcel2.writeNoException();
                return true;
            case 4:
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                ju.O0(parcel.readStrongBinder());
                parcel.readInt();
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                L(rmVarO2);
                parcel2.writeNoException();
                return true;
            case 7:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                F0(rmVarO3);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    xz0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    xz0Var = iInterfaceQueryLocalInterface instanceof yz0 ? (yz0) iInterfaceQueryLocalInterface : new xz0(strongBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 2);
                }
                kt0.f(parcel);
                U2(xz0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                A1(rmVarO4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
