package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class f11 extends jt0 implements r01 {
    public final /* synthetic */ p83 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(p83 p83Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
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
        String string = parcel.readString();
        kt0.f(parcel);
        S0(m01Var, string);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.r01
    public final void S0(n01 n01Var, String str) {
        s70 s70Var;
        p83 p83Var = this.f;
        if (((ju1) p83Var.h) == null) {
            return;
        }
        synchronized (p83Var) {
            s70Var = (s70) p83Var.i;
            if (s70Var == null) {
                s70Var = new s70(n01Var);
                p83Var.i = s70Var;
            }
        }
        r52 r52Var = (r52) ((ju1) p83Var.h).g;
        r52Var.getClass();
        try {
            ((q41) r52Var.g).d3((n01) s70Var.g, str);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
