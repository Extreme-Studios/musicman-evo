package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bg1 extends wk1 {
    public final Context f;
    public final d60 g;
    public final rr1 h;
    public final vw1 i;
    public final ez1 j;
    public final dt1 k;
    public final aa1 l;
    public final ur1 m;
    public final qt1 n;
    public final kz0 o;
    public final e72 p;
    public final r52 q;
    public final dj1 r;
    public final es1 s;
    public boolean t = false;
    public final Long u;

    public bg1(Context context, d60 d60Var, rr1 rr1Var, vw1 vw1Var, ez1 ez1Var, dt1 dt1Var, aa1 aa1Var, ur1 ur1Var, qt1 qt1Var, kz0 kz0Var, e72 e72Var, r52 r52Var, dj1 dj1Var, es1 es1Var) {
        this.f = context;
        this.g = d60Var;
        this.h = rr1Var;
        this.i = vw1Var;
        this.j = ez1Var;
        this.k = dt1Var;
        this.l = aa1Var;
        this.m = ur1Var;
        this.n = qt1Var;
        this.o = kz0Var;
        this.p = e72Var;
        this.q = r52Var;
        this.r = dj1Var;
        this.s = es1Var;
        vc3.C.k.getClass();
        this.u = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.hl1
    public final void D2(String str) {
        this.j.b(str);
    }

    @Override // defpackage.hl1
    public final void E0(boolean z) throws RemoteException {
        try {
            Context context = this.f;
            kc2.n(context).p(z);
            if (z) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                    return;
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e) {
                vc3.C.h.d("clearStorageOnGpidPubDisable_scar", e);
                return;
            }
            throw new RemoteException(e.getMessage());
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // defpackage.hl1
    public final synchronized void J1(String str) {
        Context context = this.f;
        lx0.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) tu0.e.c.a(lx0.s4)).booleanValue()) {
                vc3.C.l.e(context, this.g, true, null, str, null, null, this.p, null, null, this.n.f());
            }
        }
    }

    @Override // defpackage.hl1
    public final synchronized void P(boolean z) {
        mb0 mb0Var = vc3.C.i;
        synchronized (mb0Var) {
            mb0Var.a = z;
        }
    }

    @Override // defpackage.hl1
    public final synchronized void T1(float f) {
        mb0 mb0Var = vc3.C.i;
        synchronized (mb0Var) {
            mb0Var.b = f;
        }
    }

    @Override // defpackage.hl1
    public final void T2(rm rmVar, String str) {
        String strN;
        ag1 ag1Var;
        Context context = this.f;
        lx0.a(context);
        if (((Boolean) tu0.e.c.a(lx0.z4)).booleanValue()) {
            try {
                zb3 zb3Var = vc3.C.c;
                strN = zb3.N(context);
            } catch (RemoteException | RuntimeException e) {
                vc3.C.h.d("NonagonMobileAdsSettingManager_AppId", e);
                strN = "";
            }
        } else {
            strN = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strN) ? str : strN;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ix0 ix0Var = lx0.s4;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        ix0 ix0Var2 = lx0.a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) kx0Var2.a(ix0Var2)).booleanValue();
        if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue()) {
            ag1Var = new ag1(this, (Runnable) ju.Z0(rmVar), 0);
        } else {
            ag1Var = null;
            z = zBooleanValue2;
        }
        ag1 ag1Var2 = ag1Var;
        if (z) {
            vc3.C.l.e(this.f, this.g, true, null, str2, null, ag1Var2, this.p, this.s, this.u, this.n.f());
        }
    }

    @Override // defpackage.hl1
    public final synchronized void b() {
        if (this.t) {
            jn.T("Mobile ads is initialized already.");
            return;
        }
        Context context = this.f;
        lx0.a(context);
        d60 d60Var = this.g;
        es1 es1Var = this.s;
        vc3 vc3Var = vc3.C;
        vc3Var.h.b(context, d60Var, es1Var);
        this.r.b();
        vc3Var.j.m(context);
        final int i = 1;
        this.t = true;
        this.k.a();
        ez1 ez1Var = this.j;
        ez1Var.getClass();
        h73 h73VarG = vc3Var.h.g();
        final int i2 = 2;
        h73VarG.c.add(new dz1(ez1Var, 2));
        final int i3 = 0;
        ez1Var.f.execute(new dz1(ez1Var, 0));
        ix0 ix0Var = lx0.u4;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            ur1 ur1Var = this.m;
            if (!ur1Var.f.getAndSet(true)) {
                h73 h73VarG2 = vc3Var.h.g();
                h73VarG2.c.add(new tr1(ur1Var, 0));
            }
            ur1Var.c.execute(new tr1(ur1Var, 2));
        }
        this.n.a();
        if (((Boolean) tu0Var.c.a(lx0.X9)).booleanValue()) {
            final int i4 = 3;
            za1.a.execute(new Runnable(this) { // from class: zf1
                public final /* synthetic */ bg1 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    lz0 lz0Var;
                    boolean z;
                    String str;
                    int i5 = i4;
                    bg1 bg1Var = this.g;
                    switch (i5) {
                        case 0:
                            i8.v(bg1Var.f, true);
                            return;
                        case 1:
                            wx0 wx0Var = vc3.C.n;
                            Context context2 = bg1Var.f;
                            es1 es1Var2 = bg1Var.s;
                            if (wx0Var.b.getAndSet(true)) {
                                return;
                            }
                            wx0Var.c = context2;
                            wx0Var.d = es1Var2;
                            if (wx0Var.f != null || context2 == null || (strA = nd.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            wx0Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, wx0Var, 33);
                            return;
                        case 2:
                            g71 g71Var = new g71("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            kz0 kz0Var = bg1Var.o;
                            kz0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = yd.A(kz0Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        lz0Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        lz0Var = iInterfaceQueryLocalInterface instanceof lz0 ? (lz0) iInterfaceQueryLocalInterface : new lz0(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = lz0Var.U();
                                    kt0.e(parcelU, g71Var);
                                    lz0Var.K0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new mb3(e);
                                }
                            } catch (RemoteException e2) {
                                jn.T("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (mb3 e3) {
                                jn.T("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            vc3 vc3Var2 = vc3.C;
                            h73 h73VarG3 = vc3Var2.h.g();
                            h73VarG3.h();
                            synchronized (h73VarG3.a) {
                                z = h73VarG3.y;
                                break;
                            }
                            if (z) {
                                h73 h73VarG4 = vc3Var2.h.g();
                                h73VarG4.h();
                                synchronized (h73VarG4.a) {
                                    str = h73VarG4.z;
                                    break;
                                }
                                if (vc3Var2.o.b(bg1Var.f, str, bg1Var.g.f)) {
                                    return;
                                }
                                vc3Var2.h.g().e(false);
                                vc3Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tu0Var.c.a(lx0.Kb)).booleanValue()) {
            za1.a.execute(new Runnable(this) { // from class: zf1
                public final /* synthetic */ bg1 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    lz0 lz0Var;
                    boolean z;
                    String str;
                    int i5 = i2;
                    bg1 bg1Var = this.g;
                    switch (i5) {
                        case 0:
                            i8.v(bg1Var.f, true);
                            return;
                        case 1:
                            wx0 wx0Var = vc3.C.n;
                            Context context2 = bg1Var.f;
                            es1 es1Var2 = bg1Var.s;
                            if (wx0Var.b.getAndSet(true)) {
                                return;
                            }
                            wx0Var.c = context2;
                            wx0Var.d = es1Var2;
                            if (wx0Var.f != null || context2 == null || (strA = nd.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            wx0Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, wx0Var, 33);
                            return;
                        case 2:
                            g71 g71Var = new g71("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            kz0 kz0Var = bg1Var.o;
                            kz0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = yd.A(kz0Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        lz0Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        lz0Var = iInterfaceQueryLocalInterface instanceof lz0 ? (lz0) iInterfaceQueryLocalInterface : new lz0(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = lz0Var.U();
                                    kt0.e(parcelU, g71Var);
                                    lz0Var.K0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new mb3(e);
                                }
                            } catch (RemoteException e2) {
                                jn.T("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (mb3 e3) {
                                jn.T("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            vc3 vc3Var2 = vc3.C;
                            h73 h73VarG3 = vc3Var2.h.g();
                            h73VarG3.h();
                            synchronized (h73VarG3.a) {
                                z = h73VarG3.y;
                                break;
                            }
                            if (z) {
                                h73 h73VarG4 = vc3Var2.h.g();
                                h73VarG4.h();
                                synchronized (h73VarG4.a) {
                                    str = h73VarG4.z;
                                    break;
                                }
                                if (vc3Var2.o.b(bg1Var.f, str, bg1Var.g.f)) {
                                    return;
                                }
                                vc3Var2.h.g().e(false);
                                vc3Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tu0Var.c.a(lx0.o3)).booleanValue()) {
            za1.a.execute(new Runnable(this) { // from class: zf1
                public final /* synthetic */ bg1 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    lz0 lz0Var;
                    boolean z;
                    String str;
                    int i5 = i3;
                    bg1 bg1Var = this.g;
                    switch (i5) {
                        case 0:
                            i8.v(bg1Var.f, true);
                            return;
                        case 1:
                            wx0 wx0Var = vc3.C.n;
                            Context context2 = bg1Var.f;
                            es1 es1Var2 = bg1Var.s;
                            if (wx0Var.b.getAndSet(true)) {
                                return;
                            }
                            wx0Var.c = context2;
                            wx0Var.d = es1Var2;
                            if (wx0Var.f != null || context2 == null || (strA = nd.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            wx0Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, wx0Var, 33);
                            return;
                        case 2:
                            g71 g71Var = new g71("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            kz0 kz0Var = bg1Var.o;
                            kz0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = yd.A(kz0Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        lz0Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        lz0Var = iInterfaceQueryLocalInterface instanceof lz0 ? (lz0) iInterfaceQueryLocalInterface : new lz0(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = lz0Var.U();
                                    kt0.e(parcelU, g71Var);
                                    lz0Var.K0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new mb3(e);
                                }
                            } catch (RemoteException e2) {
                                jn.T("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (mb3 e3) {
                                jn.T("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            vc3 vc3Var2 = vc3.C;
                            h73 h73VarG3 = vc3Var2.h.g();
                            h73VarG3.h();
                            synchronized (h73VarG3.a) {
                                z = h73VarG3.y;
                                break;
                            }
                            if (z) {
                                h73 h73VarG4 = vc3Var2.h.g();
                                h73VarG4.h();
                                synchronized (h73VarG4.a) {
                                    str = h73VarG4.z;
                                    break;
                                }
                                if (vc3Var2.o.b(bg1Var.f, str, bg1Var.g.f)) {
                                    return;
                                }
                                vc3Var2.h.g().e(false);
                                vc3Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tu0Var.c.a(lx0.Z4)).booleanValue()) {
            if (((Boolean) tu0Var.c.a(lx0.a5)).booleanValue()) {
                za1.a.execute(new Runnable(this) { // from class: zf1
                    public final /* synthetic */ bg1 g;

                    {
                        this.g = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strA;
                        lz0 lz0Var;
                        boolean z;
                        String str;
                        int i5 = i;
                        bg1 bg1Var = this.g;
                        switch (i5) {
                            case 0:
                                i8.v(bg1Var.f, true);
                                return;
                            case 1:
                                wx0 wx0Var = vc3.C.n;
                                Context context2 = bg1Var.f;
                                es1 es1Var2 = bg1Var.s;
                                if (wx0Var.b.getAndSet(true)) {
                                    return;
                                }
                                wx0Var.c = context2;
                                wx0Var.d = es1Var2;
                                if (wx0Var.f != null || context2 == null || (strA = nd.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                    return;
                                }
                                wx0Var.a = context2.getApplicationContext();
                                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                if (!TextUtils.isEmpty(strA)) {
                                    intent.setPackage(strA);
                                }
                                context2.bindService(intent, wx0Var, 33);
                                return;
                            case 2:
                                g71 g71Var = new g71("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                kz0 kz0Var = bg1Var.o;
                                kz0Var.getClass();
                                try {
                                    try {
                                        IBinder iBinderB = yd.A(kz0Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (iBinderB == null) {
                                            lz0Var = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            lz0Var = iInterfaceQueryLocalInterface instanceof lz0 ? (lz0) iInterfaceQueryLocalInterface : new lz0(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel parcelU = lz0Var.U();
                                        kt0.e(parcelU, g71Var);
                                        lz0Var.K0(parcelU, 1);
                                        return;
                                    } catch (Exception e) {
                                        throw new mb3(e);
                                    }
                                } catch (RemoteException e2) {
                                    jn.T("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                    return;
                                } catch (mb3 e3) {
                                    jn.T("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                    return;
                                }
                            default:
                                vc3 vc3Var2 = vc3.C;
                                h73 h73VarG3 = vc3Var2.h.g();
                                h73VarG3.h();
                                synchronized (h73VarG3.a) {
                                    z = h73VarG3.y;
                                    break;
                                }
                                if (z) {
                                    h73 h73VarG4 = vc3Var2.h.g();
                                    h73VarG4.h();
                                    synchronized (h73VarG4.a) {
                                        str = h73VarG4.z;
                                        break;
                                    }
                                    if (vc3Var2.o.b(bg1Var.f, str, bg1Var.g.f)) {
                                        return;
                                    }
                                    vc3Var2.h.g().e(false);
                                    vc3Var2.h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.hl1
    public final void c2(nb2 nb2Var) {
        aa1 aa1Var = this.l;
        Context context = this.f;
        aa1Var.getClass();
        y91 y91VarV = y91.v(context);
        h91 h91Var = (h91) ((q63) y91VarV.i).c();
        ((ae) y91VarV.g).getClass();
        h91Var.a(-1, System.currentTimeMillis());
        if (((Boolean) tu0.e.c.a(lx0.A0)).booleanValue() && aa1Var.a(context) && aa1.g(context)) {
            synchronized (aa1Var.i) {
            }
        }
    }

    @Override // defpackage.hl1
    public final synchronized boolean i() {
        boolean z;
        mb0 mb0Var = vc3.C.i;
        synchronized (mb0Var) {
            z = mb0Var.a;
        }
        return z;
    }

    @Override // defpackage.hl1
    public final void i0(String str) {
        if (((Boolean) tu0.e.c.a(lx0.ja)).booleanValue()) {
            vc3.C.h.g = str;
        }
    }

    @Override // defpackage.hl1
    public final synchronized float k() {
        return vc3.C.i.a();
    }

    @Override // defpackage.hl1
    public final void k2(rm rmVar, String str) {
        if (rmVar == null) {
            jn.M("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ju.Z0(rmVar);
        if (context == null) {
            jn.M("Context is null. Failed to open debug menu.");
            return;
        }
        oo0 oo0Var = new oo0(context);
        oo0Var.d = str;
        oo0Var.e = this.g.f;
        oo0Var.b();
    }

    @Override // defpackage.hl1
    public final String m() {
        return this.g.f;
    }

    @Override // defpackage.hl1
    public final List n() {
        return this.k.b();
    }

    @Override // defpackage.hl1
    public final void u() {
        this.k.q = false;
    }

    @Override // defpackage.hl1
    public final void w3(ip1 ip1Var) {
        this.n.e(ip1Var, pt1.g);
    }

    @Override // defpackage.hl1
    public final void y2(l41 l41Var) {
        this.q.K(l41Var);
    }

    @Override // defpackage.hl1
    public final void z2(y21 y21Var) {
        dt1 dt1Var = this.k;
        dt1Var.getClass();
        dt1Var.e.f.a(new hb1(dt1Var, y21Var, 16, false), dt1Var.j);
    }
}
