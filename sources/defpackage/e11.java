package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class e11 extends z4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e11(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.z4
    public final /* synthetic */ Object g(IBinder iBinder) {
        switch (this.c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface instanceof h01 ? (h01) iInterfaceQueryLocalInterface : new f01(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface2 instanceof t61 ? (t61) iInterfaceQueryLocalInterface2 : new r61(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface3 instanceof ql1 ? (ql1) iInterfaceQueryLocalInterface3 : new ql1(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface4 instanceof z51 ? (z51) iInterfaceQueryLocalInterface4 : new z51(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return iInterfaceQueryLocalInterface5 instanceof b81 ? (b81) iInterfaceQueryLocalInterface5 : new b81(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface6 instanceof kf1 ? (kf1) iInterfaceQueryLocalInterface6 : new kf1(iBinder);
        }
    }

    public n71 p(Context context, kb3 kb3Var, String str, l41 l41Var, int i) {
        b81 b81Var;
        lx0.a(context);
        if (((Boolean) tu0.e.c.a(lx0.wb)).booleanValue()) {
            try {
                ju juVar = new ju(context);
                try {
                    IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        b81Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        b81Var = iInterfaceQueryLocalInterface instanceof b81 ? (b81) iInterfaceQueryLocalInterface : new b81(iBinderB);
                    }
                    IBinder iBinderZ0 = b81Var.Z0(juVar, kb3Var, str, l41Var, i);
                    if (iBinderZ0 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderZ0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof n71 ? (n71) iInterfaceQueryLocalInterface2 : new j61(iBinderZ0);
                    }
                } catch (Exception e) {
                    throw new mb3(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                Exception exc = e;
                e71.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                jn.Z("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Exception exc2 = e;
                e71.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                jn.Z("#007 Could not call remote method.", exc2);
                return null;
            } catch (mb3 e4) {
                e = e4;
                Exception exc3 = e;
                e71.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc3);
                jn.Z("#007 Could not call remote method.", exc3);
                return null;
            }
        } else {
            try {
                IBinder iBinderZ1 = ((b81) h(context)).Z0(new ju(context), kb3Var, str, l41Var, i);
                if (iBinderZ1 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderZ1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof n71 ? (n71) iInterfaceQueryLocalInterface3 : new j61(iBinderZ1);
                }
            } catch (RemoteException e5) {
                e = e5;
                jn.H("Could not create remote AdManager.", e);
                return null;
            } catch (xw e6) {
                e = e6;
                jn.H("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
