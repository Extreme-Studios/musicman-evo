package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h11 extends jt0 implements x01 {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h11(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        d11 c11Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c11Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c11Var = iInterfaceQueryLocalInterface instanceof d11 ? (d11) iInterfaceQueryLocalInterface : new c11(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 2);
        }
        kt0.f(parcel);
        b2(c11Var);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.x01
    public final void b2(d11 d11Var) {
        String strB;
        String strE;
        String strJ;
        String strG;
        Double dValueOf;
        String strI;
        String strM;
        switch (this.f) {
            case 0:
                kd0 kd0Var = new kd0(d11Var);
                ju1 ju1Var = (ju1) this.g;
                ju1Var.getClass();
                kb0 kb0Var = new kb0();
                kb0Var.l = new Bundle();
                d11 d11Var2 = (d11) kd0Var.g;
                Object objZ0 = null;
                try {
                    strB = d11Var2.b();
                } catch (RemoteException e) {
                    jn.P("", e);
                    strB = null;
                }
                kb0Var.a = strB;
                kb0Var.b = (ArrayList) kd0Var.h;
                try {
                    strE = d11Var2.e();
                } catch (RemoteException e2) {
                    jn.P("", e2);
                    strE = null;
                }
                kb0Var.c = strE;
                kb0Var.d = (b01) kd0Var.i;
                try {
                    strJ = d11Var2.j();
                } catch (RemoteException e3) {
                    jn.P("", e3);
                    strJ = null;
                }
                kb0Var.e = strJ;
                try {
                    strG = d11Var2.g();
                } catch (RemoteException e4) {
                    jn.P("", e4);
                    strG = null;
                }
                kb0Var.f = strG;
                try {
                    double dK = d11Var2.k();
                    dValueOf = dK != -1.0d ? Double.valueOf(dK) : null;
                } catch (RemoteException e5) {
                    jn.P("", e5);
                }
                kb0Var.g = dValueOf;
                try {
                    strI = d11Var2.i();
                } catch (RemoteException e6) {
                    jn.P("", e6);
                    strI = null;
                }
                kb0Var.h = strI;
                try {
                    strM = d11Var2.m();
                } catch (RemoteException e7) {
                    jn.P("", e7);
                    strM = null;
                }
                kb0Var.i = strM;
                try {
                    rm rmVarS = d11Var2.s();
                    if (rmVarS != null) {
                        objZ0 = ju.Z0(rmVarS);
                    }
                } catch (RemoteException e8) {
                    jn.P("", e8);
                }
                kb0Var.k = objZ0;
                kb0Var.m = true;
                kb0Var.n = true;
                h60 h60Var = (h60) kd0Var.j;
                try {
                    if (d11Var2.o() != null) {
                        h60Var.a(d11Var2.o());
                    }
                } catch (RemoteException e9) {
                    jn.P("Exception occurred while getting video controller", e9);
                }
                kb0Var.j = h60Var;
                mr mrVar = ju1Var.g;
                AbstractAdViewAdapter abstractAdViewAdapter = ju1Var.f;
                r52 r52Var = (r52) mrVar;
                r52Var.getClass();
                dq.d("#008 Must be called on the main UI thread.");
                jn.F("Adapter called onAdLoaded.");
                r52Var.h = kb0Var;
                if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
                    Object obj = new Object();
                    new w41();
                    synchronized (obj) {
                    }
                }
                try {
                    ((q41) r52Var.g).g();
                    return;
                } catch (RemoteException e10) {
                    jn.Z("#007 Could not call remote method.", e10);
                    return;
                }
            default:
                g61 g61Var = new g61(d11Var);
                z61 z61Var = (z61) this.g;
                ((xt1) z61Var.g).B3(g61Var, (String) z61Var.h);
                return;
        }
    }
}
