package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 extends jt0 implements ku0 {
    public final ph1 f;
    public final n71 g;
    public final o32 h;
    public boolean i;
    public final es1 j;

    public qh1(ph1 ph1Var, n71 n71Var, o32 o32Var, es1 es1Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.i = ((Boolean) tu0.e.c.a(lx0.P0)).booleanValue();
        this.f = ph1Var;
        this.g = n71Var;
        this.h = o32Var;
        this.j = es1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        oj1 oj1Var;
        oj1 oj1Var2;
        pu0 ou0Var = null;
        String strV = null;
        n71 n71Var = this.g;
        ph1 ph1Var = this.f;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                kt0.e(parcel2, n71Var);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    ou0Var = iInterfaceQueryLocalInterface instanceof pu0 ? (pu0) iInterfaceQueryLocalInterface : new ou0(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 2);
                }
                kt0.f(parcel);
                I1(rmVarO0, ou0Var);
                parcel2.writeNoException();
                return true;
            case 5:
                lu1 lu1VarE = e();
                parcel2.writeNoException();
                kt0.e(parcel2, lu1VarE);
                return true;
            case 6:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                this.i = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                sr1 sr1VarB3 = ka2.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                dq.d("setOnPaidEventListener must be called on the main UI thread.");
                o32 o32Var = this.h;
                if (o32Var != null) {
                    try {
                        if (!sr1VarB3.d()) {
                            this.j.b();
                        }
                    } catch (RemoteException e) {
                        jn.H("Error in making CSI ping for reporting paid event callback", e);
                    }
                    o32Var.l.set(sr1VarB3);
                    break;
                }
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    strV = n71Var.v();
                    break;
                } catch (RemoteException e2) {
                    jn.Z("#007 Could not call remote method.", e2);
                }
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 9:
                long j = (ph1Var == null || (oj1Var = ph1Var.j) == null) ? 0L : oj1Var.a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 10:
                long j2 = parcel.readLong();
                kt0.f(parcel);
                if (ph1Var != null && (oj1Var2 = ph1Var.j) != null) {
                    oj1Var2.a(j2);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ku0
    public final void I1(rm rmVar, pu0 pu0Var) {
        try {
            this.h.i.set(pu0Var);
            this.f.c((Activity) ju.Z0(rmVar), this.i);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.ku0
    public final lu1 e() {
        if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue()) {
            return this.f.f;
        }
        return null;
    }
}
