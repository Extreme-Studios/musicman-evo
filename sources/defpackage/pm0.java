package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j41 d;
    public final /* synthetic */ es0 e;

    public pm0(es0 es0Var, Context context, String str, j41 j41Var) {
        this.b = context;
        this.c = str;
        this.d = j41Var;
        Objects.requireNonNull(es0Var);
        this.e = es0Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.b, "native_ad");
        return new x52();
    }

    @Override // defpackage.bt0
    public final Object b() {
        z51 z51Var;
        Context context = this.b;
        lx0.a(context);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.wb)).booleanValue();
        es0 es0Var = this.e;
        j41 j41Var = this.d;
        String str = this.c;
        if (!zBooleanValue) {
            e11 e11Var = (e11) es0Var.g;
            try {
                ju juVar = new ju(context);
                z51 z51Var2 = (z51) e11Var.h(context);
                Parcel parcelU = z51Var2.U();
                kt0.e(parcelU, juVar);
                parcelU.writeString(str);
                kt0.e(parcelU, j41Var);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = z51Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof m51 ? (m51) iInterfaceQueryLocalInterface : new f41(strongBinder);
            } catch (RemoteException e) {
                e = e;
                jn.V("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (xw e2) {
                e = e2;
                jn.V("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            ju juVar2 = new ju(context);
            try {
                IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    z51Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    z51Var = iInterfaceQueryLocalInterface2 instanceof z51 ? (z51) iInterfaceQueryLocalInterface2 : new z51(iBinderB);
                }
                Parcel parcelU2 = z51Var.U();
                kt0.e(parcelU2, juVar2);
                parcelU2.writeString(str);
                kt0.e(parcelU2, j41Var);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = z51Var.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof m51 ? (m51) iInterfaceQueryLocalInterface3 : new f41(strongBinder2);
            } catch (Exception e3) {
                throw new mb3(e3);
            }
        } catch (RemoteException e4) {
            e = e4;
            f71 f71VarA = e71.a(context);
            es0Var.getClass();
            f71VarA.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            f71 f71VarA2 = e71.a(context);
            es0Var.getClass();
            f71VarA2.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (mb3 e6) {
            e = e6;
            f71 f71VarA3 = e71.a(context);
            es0Var.getClass();
            f71VarA3.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.k1(new ju(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
