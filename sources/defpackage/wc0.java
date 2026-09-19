package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 extends bt0 {
    public final /* synthetic */ AdActivity b;
    public final /* synthetic */ es0 c;

    public wc0(es0 es0Var, AdActivity adActivity) {
        this.b = adActivity;
        Objects.requireNonNull(es0Var);
        this.c = es0Var;
    }

    @Override // defpackage.bt0
    public final /* bridge */ /* synthetic */ Object a() {
        es0.D(this.b, "ad_overlay");
        return null;
    }

    @Override // defpackage.bt0
    public final Object b() {
        IInterface r61Var;
        AdActivity adActivity = this.b;
        lx0.a(adActivity);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.wb)).booleanValue();
        es0 es0Var = this.c;
        if (!zBooleanValue) {
            e11 e11Var = (e11) es0Var.j;
            try {
                ju juVar = new ju(adActivity);
                r61 r61Var2 = (r61) ((t61) e11Var.h(adActivity));
                Parcel parcelU = r61Var2.U();
                kt0.e(parcelU, juVar);
                Parcel parcelY = r61Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof q61 ? (q61) iInterfaceQueryLocalInterface : new o61(strongBinder);
            } catch (RemoteException e) {
                jn.V("Could not create remote AdOverlay.", e);
                return null;
            } catch (xw e2) {
                jn.V("Could not create remote AdOverlay.", e2);
                return null;
            }
        }
        try {
            ju juVar2 = new ju(adActivity);
            try {
                IBinder iBinderB = yd.A(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = s61.f;
                if (iBinderB == null) {
                    r61Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    r61Var = iInterfaceQueryLocalInterface2 instanceof t61 ? (t61) iInterfaceQueryLocalInterface2 : new r61(iBinderB);
                }
                r61 r61Var3 = (r61) r61Var;
                Parcel parcelU2 = r61Var3.U();
                kt0.e(parcelU2, juVar2);
                Parcel parcelY2 = r61Var3.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                int i2 = p61.f;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof q61 ? (q61) iInterfaceQueryLocalInterface3 : new o61(strongBinder2);
            } catch (Exception e3) {
                throw new mb3(e3);
            }
        } catch (RemoteException | NullPointerException | mb3 e4) {
            f71 f71VarA = e71.a(adActivity.getApplicationContext());
            es0Var.getClass();
            f71VarA.c("ClientApiBroker.createAdOverlay", e4);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.L(new ju(this.b));
    }
}
