package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class g11 extends jt0 implements t01 {
    public final /* synthetic */ p83 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(p83 p83Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f = p83Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        n01 m01Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            m01Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            m01Var = iInterfaceQueryLocalInterface instanceof n01 ? (n01) iInterfaceQueryLocalInterface : new m01(strongBinder);
        }
        kt0.f(parcel);
        h3(m01Var);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.t01
    public final void h3(n01 n01Var) {
        s70 s70Var;
        String strF;
        p83 p83Var = this.f;
        ju1 ju1Var = (ju1) p83Var.g;
        synchronized (p83Var) {
            s70Var = (s70) p83Var.i;
            if (s70Var == null) {
                s70Var = new s70(n01Var);
                p83Var.i = s70Var;
            }
        }
        r52 r52Var = (r52) ju1Var.g;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        try {
            strF = ((n01) s70Var.g).f();
        } catch (RemoteException e) {
            jn.P("", e);
            strF = null;
        }
        jn.F("Adapter called onAdLoaded with template id ".concat(String.valueOf(strF)));
        r52Var.i = s70Var;
        try {
            ((q41) r52Var.g).g();
        } catch (RemoteException e2) {
            jn.Z("#007 Could not call remote method.", e2);
        }
    }
}
