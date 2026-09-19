package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends ha1 {
    public static final ArrayList M = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList N = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList O = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList P = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public String A;
    public final String B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final AtomicInteger I;
    public final ay0 J;
    public final x93 K;
    public final g32 L;
    public final if1 g;
    public Context h;
    public final zq0 i;
    public final k52 j;
    public final t52 k;
    public final ya1 l;
    public final ScheduledExecutorService m;
    public c71 n;
    public Point o;
    public Point p;
    public final hs1 q;
    public final f82 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final AtomicInteger y;
    public final d60 z;

    public ep0(if1 if1Var, Context context, zq0 zq0Var, t52 t52Var, ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, hs1 hs1Var, f82 f82Var, d60 d60Var, ay0 ay0Var, k52 k52Var, x93 x93Var, g32 g32Var) {
        ArrayList arrayListJ3;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.o = new Point();
        this.p = new Point();
        this.y = new AtomicInteger(0);
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new AtomicInteger(0);
        this.g = if1Var;
        this.h = context;
        this.i = zq0Var;
        this.j = k52Var;
        this.k = t52Var;
        this.l = ya1Var;
        this.m = scheduledExecutorService;
        this.q = hs1Var;
        this.r = f82Var;
        this.z = d60Var;
        this.J = ay0Var;
        ix0 ix0Var = lx0.E7;
        tu0 tu0Var = tu0.e;
        this.s = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        ix0 ix0Var2 = lx0.D7;
        kx0 kx0Var = tu0Var.c;
        this.t = ((Boolean) kx0Var.a(ix0Var2)).booleanValue();
        this.u = ((Boolean) kx0Var.a(lx0.G7)).booleanValue();
        this.v = ((Boolean) kx0Var.a(lx0.I7)).booleanValue();
        this.w = (String) kx0Var.a(lx0.H7);
        this.x = (String) kx0Var.a(lx0.J7);
        this.B = (String) kx0Var.a(lx0.K7);
        this.K = x93Var;
        this.L = g32Var;
        if (((Boolean) kx0Var.a(lx0.L7)).booleanValue()) {
            this.C = J3((String) kx0Var.a(lx0.M7));
            this.D = J3((String) kx0Var.a(lx0.N7));
            this.E = J3((String) kx0Var.a(lx0.O7));
            arrayListJ3 = J3((String) kx0Var.a(lx0.P7));
        } else {
            this.C = M;
            this.D = N;
            this.E = O;
            arrayListJ3 = P;
        }
        this.F = arrayListJ3;
    }

    public static boolean F3(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri I3(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        ec.x(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList J3(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!yd.v(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static d72 K3(hp hpVar, ma1 ma1Var) {
        if (e72.a() && ((Boolean) my0.e.u()).booleanValue()) {
            try {
                d72 d72Var = (d72) ((xf1) na1.O(hpVar)).a.c();
                d72Var.b(new ArrayList(Collections.singletonList(ma1Var.g)));
                f93 f93Var = ma1Var.i;
                d72Var.c(f93Var == null ? "" : f93Var.u);
                d72Var.d(f93Var.r);
                return d72Var;
            } catch (ExecutionException e) {
                vc3.C.h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    public final void B3(ArrayList arrayList, rm rmVar, x61 x61Var, boolean z) {
        Map map;
        if (!((Boolean) tu0.e.c.a(lx0.b8)).booleanValue()) {
            try {
                v61 v61Var = (v61) x61Var;
                Parcel parcelU = v61Var.U();
                parcelU.writeString("The updating URL feature is not enabled.");
                v61Var.K0(parcelU, 2);
                return;
            } catch (RemoteException e) {
                jn.P("", e);
                return;
            }
        }
        int i = 0;
        ch0 ch0Var = new ch0(this, arrayList, rmVar, i);
        ya1 ya1Var = this.l;
        hp hpVarB = ya1Var.b(ch0Var);
        c71 c71Var = this.n;
        if (c71Var == null || (map = c71Var.g) == null || map.isEmpty()) {
            jn.R("Asset view map is empty.");
        } else {
            hpVarB = na1.L(hpVarB, new ki0(this, i), ya1Var);
        }
        hpVarB.a(new in2(hpVarB, i, new be0(this, x61Var, z, i)), this.g.b());
    }

    public final void C3(ArrayList arrayList, rm rmVar, x61 x61Var, boolean z) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        hp hpVarL;
        Map map;
        if (!((Boolean) tu0.e.c.a(lx0.b8)).booleanValue()) {
            jn.T("The updating URL feature is not enabled.");
            try {
                v61 v61Var = (v61) x61Var;
                Parcel parcelU = v61Var.U();
                parcelU.writeString("The updating URL feature is not enabled.");
                v61Var.K0(parcelU, 2);
                return;
            } catch (RemoteException e) {
                jn.P("", e);
                return;
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList2 = this.D;
            arrayList3 = this.C;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            if (F3((Uri) obj, arrayList3, arrayList2)) {
                i2++;
            }
        }
        int i4 = 1;
        if (i2 > 1) {
            jn.T("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            Uri uri = (Uri) obj2;
            if (F3(uri, arrayList3, arrayList2)) {
                ch0 ch0Var = new ch0(this, uri, rmVar, i4);
                ya1 ya1Var = this.l;
                hp hpVarB = ya1Var.b(ch0Var);
                c71 c71Var = this.n;
                if (c71Var == null || (map = c71Var.g) == null || map.isEmpty()) {
                    jn.R("Asset view map is empty.");
                    hpVarL = hpVarB;
                } else {
                    hpVarL = na1.L(hpVarB, new ki0(this, i4), ya1Var);
                }
            } else {
                jn.T("Not a Google URL: ".concat(String.valueOf(uri)));
                hpVarL = na1.t(uri);
            }
            arrayList4.add(hpVarL);
        }
        ym2 ym2Var = new ym2(vj2.m(arrayList4), true);
        ym2Var.a(new in2(ym2Var, i, new be0(this, x61Var, z, i4)), this.g.b());
    }

    public final void D3() {
        ix0 ix0Var = lx0.ra;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((Boolean) kx0Var.a(ix0Var)).booleanValue() || ((Boolean) kx0Var2.a(lx0.ua)).booleanValue()) {
            return;
        }
        if (((Boolean) kx0Var2.a(lx0.ya)).booleanValue() && this.G.getAndSet(true)) {
            return;
        }
        E3();
    }

    public final void E3() {
        ep0 ep0Var;
        hp hpVarG;
        int i = 0;
        if (((Boolean) wy0.e.u()).booleanValue()) {
            x93 x93Var = this.K;
            synchronized (x93Var) {
                x93Var.c(true);
                x93Var.c(false);
            }
            return;
        }
        int i2 = 11;
        if (((Boolean) tu0.e.c.a(lx0.Rb)).booleanValue()) {
            hpVarG = na1.G(new zy1(i2, this), za1.a);
            ep0Var = this;
        } else {
            ep0Var = this;
            hpVarG = (hp) ep0Var.G3(this.h, null, "BANNER", null, null, 0, null, new Bundle(), null).b.c();
        }
        s70 s70Var = new s70(i2, ep0Var);
        hpVarG.a(new in2(hpVarG, i, s70Var), ep0Var.g.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    public final xf1 G3(Context context, String str, String str2, kb3 kb3Var, f93 f93Var, int i, String str3, Bundle bundle, ma1 ma1Var) {
        kb3 kb3Var2;
        h52 h52Var = new h52();
        boolean zEquals = "REWARDED".equals(str2);
        yp ypVar = h52Var.o;
        if (zEquals) {
            ypVar.g = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            ypVar.g = 3;
        }
        if1 if1Var = this.g.b;
        uj1 uj1Var = new uj1();
        uj1Var.a = context;
        h52Var.c = str == null ? "adUnitId" : str;
        h52Var.a = f93Var == null ? new f93(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L, 0L) : f93Var;
        if (kb3Var == null) {
            switch (str2) {
                case "NATIVE":
                    kb3Var2 = kb3.a();
                    break;
                case "APP_OPEN_AD":
                    kb3Var2 = kb3.b();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    kb3Var2 = new kb3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                    break;
                case "BANNER":
                    kb3Var2 = new kb3(context, s2.h);
                    break;
                default:
                    kb3Var2 = new kb3();
                    break;
            }
        } else {
            kb3Var2 = kb3Var;
        }
        h52Var.b = kb3Var2;
        h52Var.s = true;
        h52Var.t = bundle;
        uj1Var.b = h52Var.a();
        uj1Var.g = i;
        uj1 uj1Var2 = new uj1(uj1Var);
        r52 r52Var = new r52(10, false);
        r52Var.g = str2;
        r52Var.h = str3;
        r52Var.i = ma1Var;
        p83 p83Var = new p83(r52Var);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return new xf1(if1Var, p83Var, uj1Var2);
    }

    public final fn2 H3(String str) {
        uq1[] uq1VarArr = new uq1[1];
        hp hpVarB = this.k.b();
        qn0 qn0Var = new qn0(this, uq1VarArr, str, 0);
        ya1 ya1Var = this.l;
        pm2 pm2VarL = na1.L(hpVarB, qn0Var, ya1Var);
        pm2VarL.a(new in2(this, 16, uq1VarArr), ya1Var);
        return na1.I(na1.M((fn2) na1.K(fn2.r(pm2VarL), ((Integer) tu0.e.c.a(lx0.c8)).intValue(), TimeUnit.MILLISECONDS, this.m), lh0.c, ya1Var), Exception.class, lh0.d, ya1Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0057  */
    @Override // defpackage.ia1
    public final void f2(rm rmVar, ma1 ma1Var, fa1 fa1Var) {
        int i;
        hp hpVarL;
        hp hpVarB;
        Bundle bundle = new Bundle();
        ix0 ix0Var = lx0.m2;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            bundle.putLong("api-call", ma1Var.i.E);
            ec.q(vc3.C.k, bundle, "dynamite-enter");
        }
        Context context = (Context) ju.Z0(rmVar);
        this.h = context;
        a72 a72VarJ = a72.j(context, 22);
        a72VarJ.a();
        int i2 = 0;
        if (((Boolean) kx0Var2.a(lx0.U7)).booleanValue()) {
            f93 f93Var = ma1Var.i;
            if (f93Var.h.getBoolean("optimize_for_app_start", false) && Objects.equals(jn.z(f93Var), "requester_type_8")) {
                i = ma1Var.j != 2 ? 1 : 2;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        String str = ma1Var.g;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            ix0 ix0Var2 = lx0.T7;
            if (!((String) kx0Var2.a(ix0Var2)).isEmpty()) {
                arrayList = Arrays.asList(((String) kx0Var2.a(ix0Var2)).split(","));
            }
            if (arrayList.contains(jn.z(ma1Var.i))) {
                jn2 jn2VarC = na1.C(new IllegalArgumentException("Unknown format is no longer supported."));
                hpVarL = na1.C(new IllegalArgumentException("Unknown format is no longer supported."));
                hpVarB = jn2VarC;
            } else if (((Boolean) kx0Var2.a(lx0.Rb)).booleanValue()) {
                ya1 ya1Var = za1.a;
                hpVarB = ya1Var.b(new vi(this, ma1Var, i, bundle));
                hpVarL = na1.L(hpVarB, kg0.b, ya1Var);
            } else {
                xf1 xf1VarG3 = G3(this.h, ma1Var.f, str, ma1Var.h, ma1Var.i, i, ma1Var.k, bundle, ma1Var);
                kn2 kn2VarT = na1.t(xf1VarG3);
                hpVarL = (hp) xf1VarG3.b.c();
                hpVarB = kn2VarT;
            }
        } else if (((Boolean) kx0Var2.a(lx0.Rb)).booleanValue()) {
            ya1 ya1Var2 = za1.a;
            hpVarB = ya1Var2.b(new vi(this, ma1Var, i, bundle));
            hpVarL = na1.L(hpVarB, kg0.b, ya1Var2);
        } else {
            xf1 xf1VarG4 = G3(this.h, ma1Var.f, str, ma1Var.h, ma1Var.i, i, ma1Var.k, bundle, ma1Var);
            kn2 kn2VarT2 = na1.t(xf1VarG4);
            hpVarL = (hp) xf1VarG4.b.c();
            hpVarB = kn2VarT2;
        }
        hpVarL.a(new in2(hpVarL, i2, new kd0((Object) this, hpVarB, (Object) ma1Var, (Object) fa1Var, (Object) a72VarJ, 0)), this.g.b());
    }
}
