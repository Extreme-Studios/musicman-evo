package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p61 extends jt0 implements q61 {
    public static final /* synthetic */ int f = 0;

    public p61() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                Y2(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                j();
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                k();
                parcel2.writeNoException();
                return true;
            case 5:
                i();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                c0(bundle2);
                parcel2.writeNoException();
                kt0.d(parcel2, bundle2);
                return true;
            case 7:
                S();
                parcel2.writeNoException();
                return true;
            case 8:
                x();
                parcel2.writeNoException();
                return true;
            case 9:
                u();
                parcel2.writeNoException();
                return true;
            case 10:
                b();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zE = e();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 12:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                Intent intent = (Intent) kt0.b(parcel, Intent.CREATOR);
                kt0.f(parcel);
                W1(i2, i3, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                C(rmVarO0);
                parcel2.writeNoException();
                return true;
            case 14:
                d();
                parcel2.writeNoException();
                return true;
            case 15:
                int i4 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                kt0.f(parcel);
                P1(i4, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
