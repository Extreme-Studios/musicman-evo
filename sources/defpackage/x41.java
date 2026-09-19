package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class x41 extends jt0 implements m51 {
    public x41() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        t01 s01Var;
        b11 uz0Var = null;
        d31 d31Var = null;
        x01 w01Var = null;
        v01 v01Var = null;
        yh1 yh1Var = null;
        r01 q01Var = null;
        p01 p01Var = null;
        o01 o01Var = null;
        switch (i) {
            case 1:
                s31 s31VarB = b();
                parcel2.writeNoException();
                kt0.e(parcel2, s31VarB);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    uz0Var = iInterfaceQueryLocalInterface instanceof b11 ? (b11) iInterfaceQueryLocalInterface : new uz0(strongBinder);
                }
                kt0.f(parcel);
                w0(uz0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    o01Var = iInterfaceQueryLocalInterface2 instanceof o01 ? (o01) iInterfaceQueryLocalInterface2 : new o01(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 2);
                }
                kt0.f(parcel);
                m3(o01Var);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    p01Var = iInterfaceQueryLocalInterface3 instanceof p01 ? (p01) iInterfaceQueryLocalInterface3 : new p01(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 2);
                }
                kt0.f(parcel);
                v3(p01Var);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    s01Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    s01Var = iInterfaceQueryLocalInterface4 instanceof t01 ? (t01) iInterfaceQueryLocalInterface4 : new s01(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 2);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    q01Var = iInterfaceQueryLocalInterface5 instanceof r01 ? (r01) iInterfaceQueryLocalInterface5 : new q01(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 2);
                }
                kt0.f(parcel);
                n1(string, s01Var, q01Var);
                parcel2.writeNoException();
                return true;
            case 6:
                qz0 qz0Var = (qz0) kt0.b(parcel, qz0.CREATOR);
                kt0.f(parcel);
                x1(qz0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yh1Var = iInterfaceQueryLocalInterface6 instanceof yh1 ? (yh1) iInterfaceQueryLocalInterface6 : new yh1(strongBinder6);
                }
                kt0.f(parcel);
                O2(yh1Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    v01Var = iInterfaceQueryLocalInterface7 instanceof v01 ? (v01) iInterfaceQueryLocalInterface7 : new v01(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 2);
                }
                kb3 kb3Var = (kb3) kt0.b(parcel, kb3.CREATOR);
                kt0.f(parcel);
                Z1(v01Var, kb3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                ew ewVar = (ew) kt0.b(parcel, ew.CREATOR);
                kt0.f(parcel);
                D0(ewVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    w01Var = iInterfaceQueryLocalInterface8 instanceof x01 ? (x01) iInterfaceQueryLocalInterface8 : new w01(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 2);
                }
                kt0.f(parcel);
                r1(w01Var);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                a31 a31Var = (a31) kt0.b(parcel, a31.CREATOR);
                kt0.f(parcel);
                x3(a31Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    d31Var = iInterfaceQueryLocalInterface9 instanceof d31 ? (d31) iInterfaceQueryLocalInterface9 : new d31(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 2);
                }
                kt0.f(parcel);
                v0(d31Var);
                parcel2.writeNoException();
                return true;
            case 15:
                o2 o2Var = (o2) kt0.b(parcel, o2.CREATOR);
                kt0.f(parcel);
                G0(o2Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
