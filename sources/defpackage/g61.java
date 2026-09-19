package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class g61 extends NativeAd {
    public final d11 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public g61(d11 d11Var) {
        new AtomicLong();
        this.a = d11Var;
        try {
            List listD = d11Var.d();
            if (listD != null) {
                for (Object obj : listD) {
                    a01 a01VarB3 = obj instanceof IBinder ? oz0.B3((IBinder) obj) : null;
                    if (a01VarB3 != null) {
                        this.b.add(new zy1(a01VarB3));
                    }
                }
            }
        } catch (RemoteException e) {
            jn.P("", e);
        }
        try {
            List listX = this.a.X();
            if (listX != null) {
                for (Object obj2 : listX) {
                    mn1 mn1VarB3 = obj2 instanceof IBinder ? y22.B3((IBinder) obj2) : null;
                    if (mn1VarB3 != null) {
                        this.c.add(new gp2(mn1VarB3));
                    }
                }
            }
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
        try {
            a01 a01VarF = this.a.f();
            if (a01VarF != null) {
                new zy1(a01VarF);
            }
        } catch (RemoteException e3) {
            jn.P("", e3);
        }
        try {
            if (this.a.n() != null) {
                new dr0(this.a.n());
            }
        } catch (RemoteException e4) {
            jn.P("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            jn.P("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            jn.P("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final qx c() {
        lu1 lu1VarG;
        try {
            lu1VarG = this.a.G();
        } catch (RemoteException e) {
            jn.P("", e);
            lu1VarG = null;
        }
        if (lu1VarG != null) {
            return new qx(lu1VarG);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ rm d() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            jn.P("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.a.Q0(bundle);
        } catch (RemoteException e) {
            jn.P("Failed to record native event", e);
        }
    }
}
