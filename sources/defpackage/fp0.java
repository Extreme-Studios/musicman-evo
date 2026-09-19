package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.extremestudios.musicmanevo.MusicmanEvoApp;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends bt0 {
    public final /* synthetic */ MusicmanEvoApp b;
    public final /* synthetic */ es0 c;

    public fp0(es0 es0Var, MusicmanEvoApp musicmanEvoApp) {
        this.b = musicmanEvoApp;
        Objects.requireNonNull(es0Var);
        this.c = es0Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.b, "mobile_ads_settings");
        return new n72();
    }

    @Override // defpackage.bt0
    public final Object b() {
        ql1 ql1Var;
        MusicmanEvoApp musicmanEvoApp = this.b;
        lx0.a(musicmanEvoApp);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.wb)).booleanValue();
        es0 es0Var = this.c;
        if (!zBooleanValue) {
            e11 e11Var = (e11) es0Var.h;
            try {
                ju juVar = new ju(musicmanEvoApp);
                ql1 ql1Var2 = (ql1) e11Var.h(musicmanEvoApp);
                Parcel parcelU = ql1Var2.U();
                kt0.e(parcelU, juVar);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = ql1Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof hl1 ? (hl1) iInterfaceQueryLocalInterface : new hk1(strongBinder);
            } catch (RemoteException e) {
                e = e;
                jn.V("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (xw e2) {
                e = e2;
                jn.V("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            ju juVar2 = new ju(musicmanEvoApp);
            try {
                IBinder iBinderB = yd.A(musicmanEvoApp).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    ql1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    ql1Var = iInterfaceQueryLocalInterface2 instanceof ql1 ? (ql1) iInterfaceQueryLocalInterface2 : new ql1(iBinderB);
                }
                Parcel parcelU2 = ql1Var.U();
                kt0.e(parcelU2, juVar2);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = ql1Var.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof hl1 ? (hl1) iInterfaceQueryLocalInterface3 : new hk1(strongBinder2);
            } catch (Exception e3) {
                throw new mb3(e3);
            }
        } catch (RemoteException e4) {
            e = e4;
            f71 f71VarA = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            f71 f71VarA2 = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA2.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (mb3 e6) {
            e = e6;
            f71 f71VarA3 = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA3.c("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.J2(new ju(this.b), ModuleDescriptor.MODULE_VERSION);
    }
}
