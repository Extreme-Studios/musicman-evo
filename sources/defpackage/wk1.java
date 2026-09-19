package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk1 extends jt0 implements hl1 {
    public wk1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        y21 x21Var = null;
        ip1 io1Var = null;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                kt0.f(parcel);
                T1(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                kt0.f(parcel);
                J1(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                P(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                kt0.f(parcel);
                k2(rmVarO0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                T2(rmVarO1, string3);
                parcel2.writeNoException();
                return true;
            case 7:
                float fK = k();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 8:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 9:
                String strM = m();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 10:
                String string4 = parcel.readString();
                kt0.f(parcel);
                D2(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                l41 l41VarB3 = j41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                y2(l41VarB3);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    x21Var = iInterfaceQueryLocalInterface instanceof y21 ? (y21) iInterfaceQueryLocalInterface : new x21(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 2);
                }
                kt0.f(parcel);
                z2(x21Var);
                parcel2.writeNoException();
                return true;
            case 13:
                List listN = n();
                parcel2.writeNoException();
                parcel2.writeTypedList(listN);
                return true;
            case 14:
                nb2 nb2Var = (nb2) kt0.b(parcel, nb2.CREATOR);
                kt0.f(parcel);
                c2(nb2Var);
                parcel2.writeNoException();
                return true;
            case 15:
                u();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    io1Var = iInterfaceQueryLocalInterface2 instanceof ip1 ? (ip1) iInterfaceQueryLocalInterface2 : new io1(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 2);
                }
                kt0.f(parcel);
                w3(io1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = kt0.a(parcel);
                kt0.f(parcel);
                E0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                kt0.f(parcel);
                i0(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
