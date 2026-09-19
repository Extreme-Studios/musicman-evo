package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class b71 extends jt0 implements n71 {
    public b71() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        b11 uz0Var = null;
        xi1 di1Var = null;
        m21 q11Var = null;
        sr1 zq1Var = null;
        nu0 lu0Var = null;
        y71 y71Var = null;
        yh1 yh1Var = null;
        zy0 px0Var = null;
        ux0 ux0Var = null;
        ig1 uf1Var = null;
        switch (i) {
            case 1:
                rm rmVarC = c();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarC);
                return true;
            case 2:
                r();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zL = l();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 4:
                f93 f93Var = (f93) kt0.b(parcel, f93.CREATOR);
                kt0.f(parcel);
                boolean Z = Z(f93Var);
                parcel2.writeNoException();
                parcel2.writeInt(Z ? 1 : 0);
                return true;
            case 5:
                d();
                parcel2.writeNoException();
                return true;
            case 6:
                e();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    uz0Var = iInterfaceQueryLocalInterface instanceof b11 ? (b11) iInterfaceQueryLocalInterface : new uz0(strongBinder);
                }
                kt0.f(parcel);
                X2(uz0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    uf1Var = iInterfaceQueryLocalInterface2 instanceof ig1 ? (ig1) iInterfaceQueryLocalInterface2 : new uf1(strongBinder2);
                }
                kt0.f(parcel);
                J0(uf1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                i();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                m();
                parcel2.writeNoException();
                return true;
            case 12:
                kb3 kb3VarO = o();
                parcel2.writeNoException();
                kt0.d(parcel2, kb3VarO);
                return true;
            case 13:
                kb3 kb3Var = (kb3) kt0.b(parcel, kb3.CREATOR);
                kt0.f(parcel);
                P0(kb3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                kt0.f(parcel);
                q();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                parcel.readString();
                kt0.f(parcel);
                n();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strD = D();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    ux0Var = iInterfaceQueryLocalInterface3 instanceof ux0 ? (ux0) iInterfaceQueryLocalInterface3 : new ux0(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 2);
                }
                kt0.f(parcel);
                o3(ux0Var);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    px0Var = iInterfaceQueryLocalInterface4 instanceof zy0 ? (zy0) iInterfaceQueryLocalInterface4 : new px0(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 2);
                }
                kt0.f(parcel);
                I2(px0Var);
                parcel2.writeNoException();
                return true;
            case zw0.zzm /* 21 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yh1Var = iInterfaceQueryLocalInterface5 instanceof yh1 ? (yh1) iInterfaceQueryLocalInterface5 : new yh1(strongBinder7);
                }
                kt0.f(parcel);
                O1(yh1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                i1(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zB = B();
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    y71Var = iInterfaceQueryLocalInterface6 instanceof y71 ? (y71) iInterfaceQueryLocalInterface6 : new y71(strongBinder8);
                }
                kt0.f(parcel);
                o2(y71Var);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                kt0.f(parcel);
                E1(string);
                parcel2.writeNoException();
                return true;
            case 26:
                hv1 hv1VarQ = Q();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarQ);
                return true;
            case 29:
                ee2 ee2Var = (ee2) kt0.b(parcel, ee2.CREATOR);
                kt0.f(parcel);
                K2(ee2Var);
                parcel2.writeNoException();
                return true;
            case 30:
                kt0.f(parcel);
                G();
                parcel2.writeNoException();
                return true;
            case 31:
                String strV = v();
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 32:
                ig1 ig1VarS = s();
                parcel2.writeNoException();
                kt0.e(parcel2, ig1VarS);
                return true;
            case 33:
                b11 b11VarQ2 = q2();
                parcel2.writeNoException();
                kt0.e(parcel2, b11VarQ2);
                return true;
            case 34:
                boolean zA2 = kt0.a(parcel);
                kt0.f(parcel);
                u1(zA2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strU = u();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                }
                kt0.f(parcel);
                j2();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleK = k();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleK);
                return true;
            case 38:
                parcel.readString();
                kt0.f(parcel);
                p0();
                parcel2.writeNoException();
                return true;
            case 39:
                kf3 kf3Var = (kf3) kt0.b(parcel, kf3.CREATOR);
                kt0.f(parcel);
                B1(kf3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    lu0Var = iInterfaceQueryLocalInterface7 instanceof nu0 ? (nu0) iInterfaceQueryLocalInterface7 : new lu0(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 2);
                }
                kt0.f(parcel);
                L2(lu0Var);
                parcel2.writeNoException();
                return true;
            case 41:
                lu1 lu1VarM = M();
                parcel2.writeNoException();
                kt0.e(parcel2, lu1VarM);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zq1Var = iInterfaceQueryLocalInterface8 instanceof sr1 ? (sr1) iInterfaceQueryLocalInterface8 : new zq1(strongBinder11);
                }
                kt0.f(parcel);
                a2(zq1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                f93 f93Var2 = (f93) kt0.b(parcel, f93.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    q11Var = iInterfaceQueryLocalInterface9 instanceof m21 ? (m21) iInterfaceQueryLocalInterface9 : new q11(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 2);
                }
                kt0.f(parcel);
                c1(f93Var2, q11Var);
                parcel2.writeNoException();
                return true;
            case 44:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                k3(rmVarO0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    di1Var = iInterfaceQueryLocalInterface10 instanceof xi1 ? (xi1) iInterfaceQueryLocalInterface10 : new di1(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 2);
                }
                kt0.f(parcel);
                p2(di1Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zK = K();
                parcel2.writeNoException();
                ClassLoader classLoader3 = kt0.a;
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 47:
                long jK0 = k0();
                parcel2.writeNoException();
                parcel2.writeLong(jK0);
                return true;
            case 48:
                long j = parcel.readLong();
                kt0.f(parcel);
                t1(j);
                parcel2.writeNoException();
                return true;
        }
    }
}
