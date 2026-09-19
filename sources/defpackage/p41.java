package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p41 extends jt0 implements q41 {
    public p41() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static q41 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof q41 ? (q41) iInterfaceQueryLocalInterface : new o41(iBinder);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        i81 h81Var;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                d();
                break;
            case 3:
                int i2 = parcel.readInt();
                kt0.f(parcel);
                m0(i2);
                break;
            case 4:
                f();
                break;
            case 5:
                j();
                break;
            case 6:
                g();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                kt0.f(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                kt0.f(parcel);
                w2(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                }
                parcel.readString();
                kt0.f(parcel);
                break;
            case 11:
                j0();
                break;
            case 12:
                parcel.readString();
                kt0.f(parcel);
                break;
            case 13:
                p();
                break;
            case 14:
                g81 g81Var = (g81) kt0.b(parcel, g81.CREATOR);
                kt0.f(parcel);
                r3(g81Var);
                break;
            case 15:
                x();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    h81Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    h81Var = iInterfaceQueryLocalInterface instanceof i81 ? (i81) iInterfaceQueryLocalInterface : new h81(strongBinder3);
                }
                kt0.f(parcel);
                m2(h81Var);
                break;
            case 17:
                int i3 = parcel.readInt();
                kt0.f(parcel);
                f0(i3);
                break;
            case 18:
                H0();
                break;
            case 19:
                kt0.f(parcel);
                break;
            case 20:
                h0();
                break;
            case zw0.zzm /* 21 */:
                String string3 = parcel.readString();
                kt0.f(parcel);
                i0(string3);
                break;
            case 22:
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                kt0.f(parcel);
                x0(string4, i4);
                break;
            case 23:
                fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
                kt0.f(parcel);
                M0(fu1Var);
                break;
            case 24:
                fu1 fu1Var2 = (fu1) kt0.b(parcel, fu1.CREATOR);
                kt0.f(parcel);
                G1(fu1Var2);
                break;
            case 25:
                b0();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
