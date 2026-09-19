package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j41 d;

    public nb0(es0 es0Var, Context context, String str, j41 j41Var) {
        this.b = context;
        this.c = str;
        this.d = j41Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.b, "rewarded");
        return new o92();
    }

    @Override // defpackage.bt0
    public final Object b() {
        p81 p81Var;
        String str = this.c;
        j41 j41Var = this.d;
        Context context = this.b;
        ju juVar = new ju(context);
        try {
            try {
                IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    p81Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    p81Var = iInterfaceQueryLocalInterface instanceof p81 ? (p81) iInterfaceQueryLocalInterface : new p81(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 2);
                }
                IBinder iBinderZ0 = p81Var.Z0(juVar, str, j41Var);
                if (iBinderZ0 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderZ0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof l81 ? (l81) iInterfaceQueryLocalInterface2 : new j81(iBinderZ0);
            } catch (Exception e) {
                throw new mb3(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            jn.Z("#007 Could not call remote method.", e);
            return null;
        } catch (mb3 e3) {
            e = e3;
            jn.Z("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.t2(new ju(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
