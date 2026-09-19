package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class no1 extends mi1 {
    public static final qk2 J;
    public boolean A;
    public final z91 B;
    public final zq0 C;
    public final d60 D;
    public final Context E;
    public final po1 F;
    public final oz1 G;
    public final HashMap H;
    public final ArrayList I;
    public final Executor l;
    public final ro1 m;
    public final uo1 n;
    public final ap1 o;
    public final to1 p;
    public final wo1 q;
    public final o63 r;
    public final o63 s;
    public final o63 t;
    public final o63 u;
    public final o63 v;
    public np1 w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        tj2 tj2Var = vj2.g;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        dq.y(objArr, 6);
        J = vj2.o(objArr, 6);
    }

    public no1(nm0 nm0Var, Executor executor, ro1 ro1Var, uo1 uo1Var, ap1 ap1Var, to1 to1Var, wo1 wo1Var, o63 o63Var, o63 o63Var2, o63 o63Var3, o63 o63Var4, o63 o63Var5, z91 z91Var, zq0 zq0Var, d60 d60Var, Context context, po1 po1Var, oz1 oz1Var) {
        super(nm0Var);
        this.l = executor;
        this.m = ro1Var;
        this.n = uo1Var;
        this.o = ap1Var;
        this.p = to1Var;
        this.q = wo1Var;
        this.r = o63Var;
        this.s = o63Var2;
        this.t = o63Var3;
        this.u = o63Var4;
        this.v = o63Var5;
        this.B = z91Var;
        this.C = zq0Var;
        this.D = d60Var;
        this.E = context;
        this.F = po1Var;
        this.G = oz1Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        ix0 ix0Var = lx0.sb;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zb3 zb3Var = vc3.C.c;
        long jA = zb3.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jA >= ((long) ((Integer) tu0Var.c.a(lx0.tb)).intValue());
        }
        return false;
    }

    @Override // defpackage.mi1
    public final void a() {
        ko1 ko1Var = new ko1(this, 1);
        Executor executor = this.l;
        executor.execute(ko1Var);
        if (this.m.q() != 7) {
            uo1 uo1Var = this.n;
            Objects.requireNonNull(uo1Var);
            executor.execute(new va1(18, uo1Var));
        }
        super.a();
    }

    public final synchronized void c(final View view, final int i) {
        if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
            np1 np1Var = this.w;
            if (np1Var == null) {
                jn.F("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = np1Var instanceof yo1;
                this.l.execute(new Runnable() { // from class: mo1
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        no1 no1Var = this.f;
                        np1 np1Var2 = no1Var.w;
                        if (np1Var2 == null) {
                            jn.F("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        no1Var.n.j(view, np1Var2.Z0(), no1Var.w.g(), no1Var.w.k(), z, no1Var.k(), i);
                    }
                });
            }
        }
    }

    public final qw1 e(final String str, boolean z) {
        boolean z2;
        boolean z3;
        final String str2;
        final int i;
        final int i2;
        String str3;
        to1 to1Var = this.p;
        if (to1Var.c() && !TextUtils.isEmpty(str)) {
            ro1 ro1Var = this.m;
            md1 md1VarJ = ro1Var.j();
            md1 md1VarH = ro1Var.h();
            if (md1VarJ == null && md1VarH == null) {
                jn.T("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            to1Var.f();
            int iA = to1Var.f().a();
            int i3 = iA - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (iA != 1) {
                        str3 = iA != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    jn.T(sb.toString());
                    return null;
                }
                if (md1VarJ == null) {
                    jn.T("Omid media type was display but there was no display webview.");
                    return null;
                }
                z3 = false;
                z2 = true;
            } else if (md1VarH != null) {
                z2 = false;
                z3 = true;
            } else {
                jn.T("Omid media type was video but there was no video webview.");
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                md1VarJ = md1VarH;
            }
            if (md1VarJ == null) {
                jn.T("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.E;
            vc3 vc3Var = vc3.C;
            vc3Var.x.getClass();
            if (!el1.c(context)) {
                jn.T("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            d60 d60Var = this.D;
            int i4 = d60Var.g;
            int i5 = d60Var.h;
            StringBuilder sb2 = new StringBuilder(g72.a(i4, 1) + String.valueOf(i5).length());
            sb2.append(i4);
            sb2.append(".");
            sb2.append(i5);
            final String string = sb2.toString();
            if (z3) {
                i2 = 3;
                i = 2;
            } else {
                i = ro1Var.q() == 3 ? 4 : 3;
                i2 = 2;
            }
            el1 el1Var = vc3Var.x;
            final WebView webViewT = md1VarJ.t();
            final String str4 = this.b.l0;
            el1Var.getClass();
            qw1 qw1Var = (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g) ? (qw1) el1.k(new mw1() { // from class: kw1
                @Override // defpackage.mw1
                public final Object a() {
                    String str5 = str;
                    if (TextUtils.isEmpty(str5)) {
                        j7.p("Name is null or empty");
                        return null;
                    }
                    String str6 = string;
                    if (TextUtils.isEmpty(str6)) {
                        j7.p("Version is null or empty");
                        return null;
                    }
                    yl1 yl1Var = new yl1(str5, str6);
                    d92 d92VarH = el1.h("javascript");
                    String str7 = str2;
                    d92 d92VarH2 = el1.h(str7);
                    int i6 = i2;
                    y82 y82VarJ = el1.j(ec.b(i6));
                    d92 d92Var = d92.i;
                    if (d92VarH == d92Var) {
                        jn.T("Omid js session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (y82VarJ == null) {
                        jn.T("Omid js session error; Unable to parse creative type: ".concat(ec.A(i6)));
                        return null;
                    }
                    if (y82VarJ == y82.j && d92VarH2 == d92Var) {
                        jn.T("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str7)));
                        return null;
                    }
                    m40 m40Var = new m40(yl1Var, webViewT, str4, "", w82.h);
                    db2 db2VarE = db2.e(y82VarJ, el1.i(ec.c(i)), d92VarH, d92VarH2, true);
                    if (v51.m.g) {
                        return new qw1(new x82(db2VarE, m40Var, UUID.randomUUID().toString()), m40Var);
                    }
                    j7.e("Method called before OM SDK activation");
                    return null;
                }
            }) : null;
            if (qw1Var == null) {
                jn.T("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (ro1Var) {
                ro1Var.l = qw1Var;
            }
            md1VarJ.j0(qw1Var);
            if (z3) {
                x82 x82Var = qw1Var.a;
                if (md1VarH != null) {
                    View viewP0 = md1VarH.p0();
                    vc3Var.x.getClass();
                    el1.g(x82Var, viewP0);
                }
                this.A = true;
            }
            if (z) {
                el1 el1Var2 = vc3Var.x;
                x82 x82Var2 = qw1Var.a;
                el1Var2.getClass();
                el1.f(x82Var2);
                md1VarJ.a("onSdkLoaded", new m7(0));
            }
            return qw1Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(View view) {
        cb1 cb1Var;
        ro1 ro1Var = this.m;
        if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || ro1Var.q() == 3) {
            n(view, ro1Var.k());
            return;
        }
        synchronized (ro1Var) {
            cb1Var = ro1Var.n;
        }
        if (cb1Var == null) {
            return;
        }
        z61 z61Var = new z61((Object) this, (Object) view, 17, false);
        cb1Var.a(new in2((Object) cb1Var, (int) (0 == true ? 1 : 0), (Object) z61Var), this.l);
    }

    public final synchronized void g(np1 np1Var) {
        Iterator<String> itKeys;
        View view;
        vq0 vq0Var;
        try {
            if (!this.x) {
                this.w = np1Var;
                ap1 ap1Var = this.o;
                ap1Var.g.execute(new hb1(ap1Var, np1Var, 13, false));
                this.n.a(np1Var.Z0(), np1Var.k(), np1Var.i(), np1Var, np1Var);
                ix0 ix0Var = lx0.Q2;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (vq0Var = this.C.b) != null) {
                    vq0Var.e(np1Var.Z0());
                }
                if (((Boolean) tu0Var.c.a(lx0.S1)).booleanValue()) {
                    x42 x42Var = this.b;
                    if (x42Var.k0 && (itKeys = x42Var.j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            np1 np1Var2 = this.w;
                            WeakReference weakReference = np1Var2 == null ? null : (WeakReference) np1Var2.g().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                rt0 rt0Var = new rt0(this.E, view);
                                this.I.add(rt0Var);
                                rt0Var.q.add(new jo1(this, next));
                                rt0Var.d(3);
                            }
                        }
                    }
                }
                if (np1Var.f() != null) {
                    rt0 rt0VarF = np1Var.f();
                    rt0VarF.q.add(this.B);
                    rt0VarF.d(3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(np1 np1Var) {
        View viewZ0 = np1Var.Z0();
        np1Var.g();
        this.n.d(viewZ0);
        if (np1Var.O0() != null) {
            np1Var.O0().setClickable(false);
            np1Var.O0().removeAllViews();
        }
        if (np1Var.f() != null) {
            rt0 rt0VarF = np1Var.f();
            rt0VarF.q.remove(this.B);
        }
        this.w = null;
    }

    public final synchronized void i(View view, Map map, Map map2) {
        this.o.a(this.w);
        this.n.r(view, map, map2, k());
        this.y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.z) {
            synchronized (this) {
                if (map == null) {
                    view2 = null;
                } else {
                    try {
                        qk2 qk2Var = J;
                        int i = qk2Var.i;
                        int i2 = 0;
                        while (true) {
                            if (i2 < i) {
                                WeakReference weakReference = (WeakReference) map.get((String) qk2Var.get(i2));
                                i2++;
                                if (weakReference != null) {
                                    view2 = (View) weakReference.get();
                                }
                            } else {
                                view2 = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (view2 != null) {
                    ix0 ix0Var = lx0.me;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.n.o(view, map, map2, k());
                            this.z = true;
                        }
                    } else {
                        if (!((Boolean) tu0Var.c.a(lx0.ne)).booleanValue()) {
                            ix0 ix0Var2 = lx0.oe;
                            if (((Float) tu0Var.c.a(ix0Var2)).floatValue() > 0.0d) {
                                double dFloatValue = ((Float) tu0Var.c.a(ix0Var2)).floatValue();
                                Rect rect2 = new Rect();
                                if (view2.getGlobalVisibleRect(rect2, new Point())) {
                                    if (rect2.height() * rect2.width() >= ((double) (view2.getHeight() * view2.getWidth())) * (dFloatValue / 100.0d)) {
                                        this.n.o(view, map, map2, k());
                                        this.z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.n.o(view, map, map2, k());
                            this.z = true;
                        }
                    }
                }
            }
        }
    }

    public final synchronized ImageView.ScaleType k() {
        np1 np1Var = this.w;
        if (np1Var == null) {
            jn.F("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        rm rmVarP = np1Var.p();
        if (rmVarP != null) {
            return (ImageView.ScaleType) ju.Z0(rmVarP);
        }
        return ap1.k;
    }

    public final void l() {
        hp hpVar;
        if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
            e("Google", true);
            return;
        }
        ro1 ro1Var = this.m;
        synchronized (ro1Var) {
            hpVar = ro1Var.m;
        }
        if (hpVar == null) {
            return;
        }
        zy1 zy1Var = new zy1(23, this);
        hpVar.a(new in2(hpVar, 0, zy1Var), this.l);
    }

    public final void n(View view, qw1 qw1Var) {
        md1 md1VarJ = this.m.j();
        if (!this.p.c() || qw1Var == null || md1VarJ == null || view == null) {
            return;
        }
        el1 el1Var = vc3.C.x;
        x82 x82Var = qw1Var.a;
        el1Var.getClass();
        el1.g(x82Var, view);
    }

    public final synchronized void o() {
        this.x = true;
        this.l.execute(new ko1(this, 0));
        nk1 nk1Var = this.c;
        nk1Var.getClass();
        nk1Var.L1(new iv(null));
    }

    public final synchronized boolean p(Bundle bundle) {
        if (this.y) {
            return true;
        }
        boolean zT = this.n.t(bundle);
        this.y = zT;
        return zT;
    }

    public final synchronized void q(np1 np1Var) {
        if (((Boolean) tu0.e.c.a(lx0.Q1)).booleanValue()) {
            zb3.l.post(new lo1(this, np1Var, 0));
        } else {
            g(np1Var);
        }
    }

    public final synchronized void r(np1 np1Var) {
        if (((Boolean) tu0.e.c.a(lx0.Q1)).booleanValue()) {
            zb3.l.post(new lo1(this, np1Var, 1));
        } else {
            h(np1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    public final synchronized void s(View view, View view2, Map map, Map map2, boolean z) {
        ro1 ro1Var;
        md1 md1VarH;
        jp1 jp1Var;
        ap1 ap1Var = this.o;
        np1 np1Var = this.w;
        if (np1Var == null || (jp1Var = ap1Var.e) == null || np1Var.O0() == null || !ap1Var.c.a()) {
            this.n.q(view, view2, map, map2, z, k());
            if (this.A) {
                ro1Var = this.m;
                if (ro1Var.h() != null && (md1VarH = ro1Var.h()) != null) {
                    md1VarH.a("onSdkAdUserInteractionClick", new m7(0));
                    return;
                }
            }
            return;
        }
        try {
            np1Var.O0().addView(jp1Var.a());
        } catch (wd1 e) {
            jn.w("web view can not be obtained", e);
        }
        this.n.q(view, view2, map, map2, z, k());
        if (this.A) {
            ro1Var = this.m;
            if (ro1Var.h() != null) {
                md1VarH.a("onSdkAdUserInteractionClick", new m7(0));
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    public final synchronized void t(View view, Map map, Map map2, boolean z) {
        Iterator it;
        View view2;
        if (this.y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.S1)).booleanValue() && this.b.k0) {
            HashMap map3 = this.H;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z) {
                i(view, map, map2);
                j(view, map, map2);
                return;
            }
            if (((Boolean) tu0.e.c.a(lx0.l4)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z) {
                i(view, map, map2);
                j(view, map, map2);
                return;
            }
            if (((Boolean) tu0.e.c.a(lx0.l4)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && d(view2)) {
                        i(view, map, map2);
                        return;
                    }
                }
            }
        }
    }
}
