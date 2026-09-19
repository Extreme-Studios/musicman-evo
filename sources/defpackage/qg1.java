package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends v90 implements oh1 {
    @Override // defpackage.oh1
    public final n71 F2(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        n71 j61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 2);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            j61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j61Var = iInterfaceQueryLocalInterface instanceof n71 ? (n71) iInterfaceQueryLocalInterface : new j61(strongBinder);
        }
        parcelY.recycle();
        return j61Var;
    }

    @Override // defpackage.oh1
    public final hl1 J2(rm rmVar, int i) {
        hl1 hk1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 9);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            hk1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            hk1Var = iInterfaceQueryLocalInterface instanceof hl1 ? (hl1) iInterfaceQueryLocalInterface : new hk1(strongBinder);
        }
        parcelY.recycle();
        return hk1Var;
    }

    @Override // defpackage.oh1
    public final q61 L(rm rmVar) {
        q61 o61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        Parcel parcelY = Y(parcelU, 8);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = p61.f;
        if (strongBinder == null) {
            o61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            o61Var = iInterfaceQueryLocalInterface instanceof q61 ? (q61) iInterfaceQueryLocalInterface : new o61(strongBinder);
        }
        parcelY.recycle();
        return o61Var;
    }

    @Override // defpackage.oh1
    public final n71 U1(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        n71 j61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            j61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j61Var = iInterfaceQueryLocalInterface instanceof n71 ? (n71) iInterfaceQueryLocalInterface : new j61(strongBinder);
        }
        parcelY.recycle();
        return j61Var;
    }

    @Override // defpackage.oh1
    public final ze1 V0(rm rmVar, l41 l41Var, int i) {
        ze1 ce1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 18);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ce1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            ce1Var = iInterfaceQueryLocalInterface instanceof ze1 ? (ze1) iInterfaceQueryLocalInterface : new ce1(strongBinder);
        }
        parcelY.recycle();
        return ce1Var;
    }

    @Override // defpackage.oh1
    public final n71 Z2(rm rmVar, kb3 kb3Var, String str, l41 l41Var, int i) {
        n71 j61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 13);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            j61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j61Var = iInterfaceQueryLocalInterface instanceof n71 ? (n71) iInterfaceQueryLocalInterface : new j61(strongBinder);
        }
        parcelY.recycle();
        return j61Var;
    }

    @Override // defpackage.oh1
    public final ls1 a1(rm rmVar, l41 l41Var, int i) {
        ls1 wr1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 17);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            wr1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            wr1Var = iInterfaceQueryLocalInterface instanceof ls1 ? (ls1) iInterfaceQueryLocalInterface : new wr1(strongBinder);
        }
        parcelY.recycle();
        return wr1Var;
    }

    @Override // defpackage.oh1
    public final n71 d1(rm rmVar, kb3 kb3Var, String str, int i) {
        n71 j61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.c(parcelU, kb3Var);
        parcelU.writeString(str);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 10);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            j61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j61Var = iInterfaceQueryLocalInterface instanceof n71 ? (n71) iInterfaceQueryLocalInterface : new j61(strongBinder);
        }
        parcelY.recycle();
        return j61Var;
    }

    @Override // defpackage.oh1
    public final ia1 d2(rm rmVar, l41 l41Var, int i) {
        ia1 ga1Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 14);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = ha1.f;
        if (strongBinder == null) {
            ga1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            ga1Var = iInterfaceQueryLocalInterface instanceof ia1 ? (ia1) iInterfaceQueryLocalInterface : new ga1(strongBinder);
        }
        parcelY.recycle();
        return ga1Var;
    }

    @Override // defpackage.oh1
    public final m51 k1(rm rmVar, String str, l41 l41Var, int i) {
        m51 f41Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 3);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            f41Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            f41Var = iInterfaceQueryLocalInterface instanceof m51 ? (m51) iInterfaceQueryLocalInterface : new f41(strongBinder);
        }
        parcelY.recycle();
        return f41Var;
    }

    @Override // defpackage.oh1
    public final k61 s1(rm rmVar, l41 l41Var, int i) {
        k61 h61Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 15);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = hw1.m;
        if (strongBinder == null) {
            h61Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            h61Var = iInterfaceQueryLocalInterface instanceof k61 ? (k61) iInterfaceQueryLocalInterface : new h61(strongBinder);
        }
        parcelY.recycle();
        return h61Var;
    }

    @Override // defpackage.oh1
    public final l81 t2(rm rmVar, String str, l41 l41Var, int i) {
        l81 j81Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        parcelU.writeString(str);
        kt0.e(parcelU, l41Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 12);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = k81.f;
        if (strongBinder == null) {
            j81Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            j81Var = iInterfaceQueryLocalInterface instanceof l81 ? (l81) iInterfaceQueryLocalInterface : new j81(strongBinder);
        }
        parcelY.recycle();
        return j81Var;
    }

    @Override // defpackage.oh1
    public final e01 y1(rm rmVar, rm rmVar2) {
        e01 c01Var;
        Parcel parcelU = U();
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, rmVar2);
        Parcel parcelY = Y(parcelU, 5);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = d01.f;
        if (strongBinder == null) {
            c01Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c01Var = iInterfaceQueryLocalInterface instanceof e01 ? (e01) iInterfaceQueryLocalInterface : new c01(strongBinder);
        }
        parcelY.recycle();
        return c01Var;
    }
}
