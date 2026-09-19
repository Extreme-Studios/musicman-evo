package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class k81 extends jt0 implements l81 {
    public static final /* synthetic */ int f = 0;

    public k81() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        s81 q81Var = null;
        s81 q81Var2 = null;
        sp1 sp1Var = null;
        t81 t81Var = null;
        o81 m81Var = null;
        switch (i) {
            case 1:
                f93 f93Var = (f93) kt0.b(parcel, f93.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    q81Var = iInterfaceQueryLocalInterface instanceof s81 ? (s81) iInterfaceQueryLocalInterface : new q81(strongBinder);
                }
                kt0.f(parcel);
                r2(f93Var, q81Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    m81Var = iInterfaceQueryLocalInterface2 instanceof o81 ? (o81) iInterfaceQueryLocalInterface2 : new m81(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 2);
                }
                kt0.f(parcel);
                e1(m81Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 4:
                String strG = g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                x2(rmVarO0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    t81Var = iInterfaceQueryLocalInterface3 instanceof t81 ? (t81) iInterfaceQueryLocalInterface3 : new t81(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 2);
                }
                kt0.f(parcel);
                B2(t81Var);
                parcel2.writeNoException();
                return true;
            case 7:
                z81 z81Var = (z81) kt0.b(parcel, z81.CREATOR);
                kt0.f(parcel);
                C2(z81Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    sp1Var = iInterfaceQueryLocalInterface4 instanceof sp1 ? (sp1) iInterfaceQueryLocalInterface4 : new sp1(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 2);
                }
                kt0.f(parcel);
                e2(sp1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleE = e();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleE);
                return true;
            case 10:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                ClassLoader classLoader2 = kt0.a;
                boolean z = parcel.readInt() != 0;
                kt0.f(parcel);
                D1(rmVarO1, z);
                parcel2.writeNoException();
                return true;
            case 11:
                i81 i81VarI = i();
                parcel2.writeNoException();
                kt0.e(parcel2, i81VarI);
                return true;
            case 12:
                lu1 lu1VarM = m();
                parcel2.writeNoException();
                kt0.e(parcel2, lu1VarM);
                return true;
            case 13:
                sr1 sr1VarB3 = ka2.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                f1(sr1VarB3);
                parcel2.writeNoException();
                return true;
            case 14:
                f93 f93Var2 = (f93) kt0.b(parcel, f93.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    q81Var2 = iInterfaceQueryLocalInterface5 instanceof s81 ? (s81) iInterfaceQueryLocalInterface5 : new q81(strongBinder5);
                }
                kt0.f(parcel);
                L1(f93Var2, q81Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                u3(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strO = o();
                parcel2.writeNoException();
                parcel2.writeString(strO);
                return true;
            case 17:
                long jN = n();
                parcel2.writeNoException();
                parcel2.writeLong(jN);
                return true;
            case 18:
                long j = parcel.readLong();
                kt0.f(parcel);
                j1(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
