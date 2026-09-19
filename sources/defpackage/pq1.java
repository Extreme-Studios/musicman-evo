package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pq1 extends jt0 implements d11 {
    public final String f;
    public final no1 g;
    public final ro1 h;
    public final es1 i;

    public pq1(String str, no1 no1Var, ro1 ro1Var, es1 es1Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f = str;
        this.g = no1Var;
        this.h = ro1Var;
        this.i = es1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        a01 a01Var;
        double d;
        String strP;
        String strP2;
        rm rmVar;
        List list2;
        y22 y22Var;
        yz0 yz0Var;
        boolean zF;
        oj1 oj1Var;
        oj1 oj1Var2;
        int i2 = 0;
        y01 y01Var = null;
        sl1 sl1Var = null;
        switch (i) {
            case 2:
                String strA = this.h.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 3:
                ro1 ro1Var = this.h;
                synchronized (ro1Var) {
                    list = ro1Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strC = this.h.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                ro1 ro1Var2 = this.h;
                synchronized (ro1Var2) {
                    a01Var = ro1Var2.s;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, a01Var);
                return true;
            case 6:
                String strE = this.h.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 7:
                String strF = this.h.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                ro1 ro1Var3 = this.h;
                synchronized (ro1Var3) {
                    d = ro1Var3.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                ro1 ro1Var4 = this.h;
                synchronized (ro1Var4) {
                    strP = ro1Var4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                ro1 ro1Var5 = this.h;
                synchronized (ro1Var5) {
                    strP2 = ro1Var5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                hv1 hv1VarR = this.h.r();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarR);
                return true;
            case 12:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                this.g.o();
                parcel2.writeNoException();
                return true;
            case 14:
                wz0 wz0VarS = this.h.s();
                parcel2.writeNoException();
                kt0.e(parcel2, wz0VarS);
                return true;
            case 15:
                Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                no1 no1Var = this.g;
                synchronized (no1Var) {
                    no1Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                boolean zP = this.g.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                no1 no1Var2 = this.g;
                synchronized (no1Var2) {
                    no1Var2.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                rm rmVarV = v();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarV);
                return true;
            case 19:
                ro1 ro1Var6 = this.h;
                synchronized (ro1Var6) {
                    rmVar = ro1Var6.q;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, rmVar);
                return true;
            case 20:
                Bundle bundleD = this.h.d();
                parcel2.writeNoException();
                kt0.d(parcel2, bundleD);
                return true;
            case zw0.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    y01Var = iInterfaceQueryLocalInterface instanceof y01 ? (y01) iInterfaceQueryLocalInterface : new y01(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 2);
                }
                kt0.f(parcel);
                D3(y01Var);
                parcel2.writeNoException();
                return true;
            case 22:
                no1 no1Var3 = this.g;
                synchronized (no1Var3) {
                    no1Var3.n.x();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List listX = X();
                parcel2.writeNoException();
                parcel2.writeList(listX);
                return true;
            case 24:
                ro1 ro1Var7 = this.h;
                synchronized (ro1Var7) {
                    list2 = ro1Var7.f;
                }
                if (!list2.isEmpty()) {
                    synchronized (ro1Var7) {
                        y22Var = ro1Var7.g;
                    }
                    if (y22Var != null) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(i2);
                return true;
            case 25:
                mn1 mn1VarB3 = y22.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                B3(mn1VarB3);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    sl1Var = iInterfaceQueryLocalInterface2 instanceof sl1 ? (sl1) iInterfaceQueryLocalInterface2 : new sl1(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 2);
                }
                kt0.f(parcel);
                C3(sl1Var);
                parcel2.writeNoException();
                return true;
            case 27:
                no1 no1Var4 = this.g;
                synchronized (no1Var4) {
                    no1Var4.n.e();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                no1 no1Var5 = this.g;
                synchronized (no1Var5) {
                    np1 np1Var = no1Var5.w;
                    if (np1Var == null) {
                        jn.F("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        no1Var5.l.execute(new c61(no1Var5, np1Var instanceof yo1, 1));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                po1 po1Var = this.g.F;
                synchronized (po1Var) {
                    yz0Var = po1Var.a;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, yz0Var);
                return true;
            case 30:
                no1 no1Var6 = this.g;
                synchronized (no1Var6) {
                    zF = no1Var6.n.f();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 31:
                lu1 lu1VarG = G();
                parcel2.writeNoException();
                kt0.e(parcel2, lu1VarG);
                return true;
            case 32:
                sr1 sr1VarB3 = ka2.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                try {
                    if (!sr1VarB3.d()) {
                        this.i.b();
                    }
                    break;
                } catch (RemoteException e) {
                    jn.H("Error in making CSI ping for reporting paid event callback", e);
                }
                no1 no1Var7 = this.g;
                synchronized (no1Var7) {
                    no1Var7.G.f.set(sr1VarB3);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) kt0.b(parcel, Bundle.CREATOR);
                kt0.f(parcel);
                Q0(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                no1 no1Var8 = this.g;
                long j = (no1Var8 == null || (oj1Var = no1Var8.j) == null) ? 0L : oj1Var.a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 35:
                long j2 = parcel.readLong();
                kt0.f(parcel);
                no1 no1Var9 = this.g;
                if (no1Var9 != null && (oj1Var2 = no1Var9.j) != null) {
                    oj1Var2.a(j2);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void B3(mn1 mn1Var) {
        no1 no1Var = this.g;
        synchronized (no1Var) {
            no1Var.n.l(mn1Var);
        }
    }

    public final void C3(sl1 sl1Var) {
        no1 no1Var = this.g;
        synchronized (no1Var) {
            no1Var.n.b(sl1Var);
        }
    }

    public final void D3(y01 y01Var) {
        no1 no1Var = this.g;
        synchronized (no1Var) {
            no1Var.n.i(y01Var);
        }
    }

    @Override // defpackage.d11
    public final lu1 G() {
        if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue()) {
            return this.g.f;
        }
        return null;
    }

    @Override // defpackage.d11
    public final void Q0(Bundle bundle) {
        if (((Boolean) tu0.e.c.a(lx0.Nd)).booleanValue()) {
            no1 no1Var = this.g;
            md1 md1VarH = no1Var.m.h();
            if (md1VarH == null) {
                jn.M("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                no1Var.l.execute(new fh1(md1VarH, jSONObject));
            } catch (JSONException e) {
                jn.P("Error reading event signals", e);
            }
        }
    }

    @Override // defpackage.d11
    public final List X() {
        List list;
        y22 y22Var;
        List list2;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            list = ro1Var.f;
        }
        if (!list.isEmpty()) {
            synchronized (ro1Var) {
                y22Var = ro1Var.g;
            }
            if (y22Var != null) {
                ro1 ro1Var2 = this.h;
                synchronized (ro1Var2) {
                    list2 = ro1Var2.f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.d11
    public final String b() {
        return this.h.a();
    }

    @Override // defpackage.d11
    public final List d() {
        List list;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            list = ro1Var.e;
        }
        return list;
    }

    @Override // defpackage.d11
    public final String e() {
        return this.h.c();
    }

    @Override // defpackage.d11
    public final a01 f() {
        a01 a01Var;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            a01Var = ro1Var.s;
        }
        return a01Var;
    }

    @Override // defpackage.d11
    public final String g() {
        return this.h.f();
    }

    @Override // defpackage.d11
    public final String i() {
        String strP;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            strP = ro1Var.p("store");
        }
        return strP;
    }

    @Override // defpackage.d11
    public final String j() {
        return this.h.e();
    }

    @Override // defpackage.d11
    public final double k() {
        double d;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            d = ro1Var.r;
        }
        return d;
    }

    @Override // defpackage.d11
    public final String m() {
        String strP;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            strP = ro1Var.p("price");
        }
        return strP;
    }

    @Override // defpackage.d11
    public final wz0 n() {
        return this.h.s();
    }

    @Override // defpackage.d11
    public final hv1 o() {
        return this.h.r();
    }

    @Override // defpackage.d11
    public final rm s() {
        rm rmVar;
        ro1 ro1Var = this.h;
        synchronized (ro1Var) {
            rmVar = ro1Var.q;
        }
        return rmVar;
    }

    @Override // defpackage.d11
    public final rm v() {
        return new ju(this.g);
    }
}
