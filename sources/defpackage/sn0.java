package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.extremestudios.musicmanevo.MusicmanEvoApp;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends bt0 {
    public final /* synthetic */ MusicmanEvoApp b;
    public final /* synthetic */ j41 c;
    public final /* synthetic */ es0 d;

    public sn0(es0 es0Var, MusicmanEvoApp musicmanEvoApp, j41 j41Var) {
        this.b = musicmanEvoApp;
        this.c = j41Var;
        Objects.requireNonNull(es0Var);
        this.d = es0Var;
    }

    @Override // defpackage.bt0
    public final /* bridge */ /* synthetic */ Object a() {
        es0.D(this.b, "ads_preloader");
        return null;
    }

    @Override // defpackage.bt0
    public final Object b() {
        ze1 ce1Var;
        kf1 kf1Var;
        ze1 ce1Var2;
        MusicmanEvoApp musicmanEvoApp = this.b;
        ju juVar = new ju(musicmanEvoApp);
        lx0.a(musicmanEvoApp);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.wb)).booleanValue();
        es0 es0Var = this.d;
        j41 j41Var = this.c;
        if (!zBooleanValue) {
            e11 e11Var = (e11) es0Var.k;
            try {
                ju juVar2 = new ju(musicmanEvoApp);
                kf1 kf1Var2 = (kf1) e11Var.h(musicmanEvoApp);
                Parcel parcelU = kf1Var2.U();
                kt0.e(parcelU, juVar2);
                kt0.e(parcelU, j41Var);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = kf1Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    ce1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    ce1Var = iInterfaceQueryLocalInterface instanceof ze1 ? (ze1) iInterfaceQueryLocalInterface : new ce1(strongBinder);
                }
                ce1Var.h1(j41Var);
                return ce1Var;
            } catch (RemoteException e) {
                e = e;
                jn.V("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (xw e2) {
                e = e2;
                jn.V("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = yd.A(musicmanEvoApp).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    kf1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    kf1Var = iInterfaceQueryLocalInterface2 instanceof kf1 ? (kf1) iInterfaceQueryLocalInterface2 : new kf1(iBinderB);
                }
                Parcel parcelU2 = kf1Var.U();
                kt0.e(parcelU2, juVar);
                kt0.e(parcelU2, j41Var);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = kf1Var.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                if (strongBinder2 == null) {
                    ce1Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    ce1Var2 = iInterfaceQueryLocalInterface3 instanceof ze1 ? (ze1) iInterfaceQueryLocalInterface3 : new ce1(strongBinder2);
                }
                ce1Var2.h1(j41Var);
                return ce1Var2;
            } catch (Exception e3) {
                throw new mb3(e3);
            }
        } catch (RemoteException e4) {
            e = e4;
            f71 f71VarA = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA.c("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            f71 f71VarA2 = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA2.c("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (mb3 e6) {
            e = e6;
            f71 f71VarA3 = e71.a(musicmanEvoApp);
            es0Var.getClass();
            f71VarA3.c("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        ju juVar = new ju(this.b);
        j41 j41Var = this.c;
        ze1 ze1VarV0 = oh1Var.V0(juVar, j41Var, ModuleDescriptor.MODULE_VERSION);
        ze1VarV0.h1(j41Var);
        return ze1VarV0;
    }
}
