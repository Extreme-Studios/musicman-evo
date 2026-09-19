package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 implements uo1 {
    public boolean A;
    public sl1 H;
    public final il1 I;
    public final cp1 J;
    public final vs0 K;
    public final oj1 L;
    public final Context f;
    public final wo1 g;
    public final JSONObject h;
    public final uq1 i;
    public final ro1 j;
    public final zq0 k;
    public final kk1 l;
    public final ak1 m;
    public final ym1 n;
    public final x42 o;
    public final d60 p;
    public final i52 q;
    public final ih1 r;
    public final ep1 s;
    public final ae t;
    public final xm1 u;
    public final f82 v;
    public final mr1 w;
    public final d72 x;
    public final hw1 y;
    public boolean z = false;
    public boolean B = false;
    public boolean C = false;
    public Point D = new Point();
    public Point E = new Point();
    public long F = 0;
    public long G = 0;

    public bo1(Context context, wo1 wo1Var, JSONObject jSONObject, uq1 uq1Var, ro1 ro1Var, zq0 zq0Var, kk1 kk1Var, ak1 ak1Var, ym1 ym1Var, x42 x42Var, d60 d60Var, i52 i52Var, ih1 ih1Var, ep1 ep1Var, ae aeVar, xm1 xm1Var, f82 f82Var, d72 d72Var, hw1 hw1Var, mr1 mr1Var, cp1 cp1Var, il1 il1Var, vs0 vs0Var, oj1 oj1Var) {
        this.f = context;
        this.g = wo1Var;
        this.h = jSONObject;
        this.i = uq1Var;
        this.j = ro1Var;
        this.k = zq0Var;
        this.l = kk1Var;
        this.m = ak1Var;
        this.n = ym1Var;
        this.o = x42Var;
        this.p = d60Var;
        this.q = i52Var;
        this.r = ih1Var;
        this.s = ep1Var;
        this.t = aeVar;
        this.u = xm1Var;
        this.v = f82Var;
        this.x = d72Var;
        this.y = hw1Var;
        this.w = mr1Var;
        this.J = cp1Var;
        this.I = il1Var;
        this.K = vs0Var;
        this.L = oj1Var;
    }

    public final String A(View view) {
        if (!((Boolean) tu0.e.c.a(lx0.S3)).booleanValue()) {
            return null;
        }
        try {
            return this.k.b.i(this.f, view, null);
        } catch (Exception unused) {
            jn.M("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    public final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        List list;
        boolean z3;
        String strG;
        y22 y22Var;
        ae aeVar = this.t;
        ro1 ro1Var = this.j;
        JSONObject jSONObject7 = this.h;
        try {
            y();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            wo1 wo1Var = this.g;
            jSONObject8.put("has_custom_click_handler", ((r01) wo1Var.g.get(ro1Var.g())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", ro1Var.q());
            jSONObject9.put("view_aware_api_used", z);
            qz0 qz0Var = this.q.j;
            jSONObject9.put("custom_mute_requested", qz0Var != null && qz0Var.l);
            synchronized (ro1Var) {
                list = ro1Var.f;
            }
            if (list.isEmpty()) {
                z3 = false;
            } else {
                synchronized (ro1Var) {
                    y22Var = ro1Var.g;
                }
                if (y22Var != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            jSONObject9.put("custom_mute_enabled", z3);
            if (this.s.h != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aeVar.getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.C && this.h.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((r01) wo1Var.g.get(ro1Var.g())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strG = this.k.b.g(this.f, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                jn.P("Exception obtaining click signals", e);
                strG = null;
            }
            jSONObject9.put("click_signals", strG);
            jSONObject9.put("open_chrome_custom_tab", true);
            ix0 ix0Var = lx0.q9;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && ej1.m()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) tu0Var.c.a(lx0.r9)).booleanValue() && ej1.m()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.F);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.G);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.o.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.y.B3(string, ro1Var);
                }
            }
            ej1.s(this.i.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e2) {
            jn.P("Unable to create click JSON.", e2);
        }
    }

    public final void C() {
        try {
            sl1 sl1Var = this.H;
            if (sl1Var != null) {
                sl1Var.K0(sl1Var.U(), 1);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.uo1
    public final void I(String str) {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // defpackage.uo1
    public final void K() {
        uq1 uq1Var = this.i;
        synchronized (uq1Var) {
            qm2 qm2Var = uq1Var.m;
            if (qm2Var == null) {
                return;
            }
            fl1 fl1Var = new fl1(16);
            qm2Var.a(new in2(qm2Var, 0, fl1Var), uq1Var.e);
            uq1Var.m = null;
        }
    }

    @Override // defpackage.uo1
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.D = new Point();
        this.E = new Point();
        if (!this.A) {
            this.u.R1(view);
            this.A = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        ih1 ih1Var = this.r;
        ih1Var.getClass();
        ih1Var.o = new WeakReference(this);
        boolean zR = rs0.r(this.p.h);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zR) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zR) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // defpackage.uo1
    public final void b(sl1 sl1Var) {
        this.H = sl1Var;
    }

    @Override // defpackage.uo1
    public final void c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.h);
            ej1.s(this.i.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.uo1
    public final void d(View view) {
        this.D = new Point();
        this.E = new Point();
        if (view != null) {
            xm1 xm1Var = this.u;
            synchronized (xm1Var) {
                WeakHashMap weakHashMap = xm1Var.h;
                if (weakHashMap.containsKey(view)) {
                    ((rt0) weakHashMap.get(view)).q.remove(xm1Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.A = false;
    }

    @Override // defpackage.uo1
    public final void e() {
        this.C = true;
    }

    @Override // defpackage.uo1
    public final boolean f() {
        return this.h.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // defpackage.uo1
    public final void g(View view) {
        if (!this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            jn.T("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ep1 ep1Var = this.s;
            view.setOnClickListener(ep1Var);
            view.setClickable(true);
            ep1Var.l = new WeakReference(view);
        }
    }

    @Override // defpackage.uo1
    public final JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectM = m(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.C && this.h.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectM != null) {
                jSONObject.put("nas", jSONObjectM);
            }
            return jSONObject;
        } catch (JSONException e) {
            jn.P("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // defpackage.uo1
    public final void i(y01 y01Var) {
        if (!this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            jn.T("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ep1 ep1Var = this.s;
        uq1 uq1Var = ep1Var.f;
        ep1Var.h = y01Var;
        s11 s11Var = ep1Var.i;
        if (s11Var != null) {
            uq1Var.c("/unconfirmedClick", s11Var);
        }
        s11 s11Var2 = new s11(ep1Var, 4, y01Var);
        ep1Var.i = s11Var2;
        uq1Var.b("/unconfirmedClick", s11Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // defpackage.uo1
    public final void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.h;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.C) {
                jn.F("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                jn.F("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.f;
        JSONObject jSONObjectB = rs0.B(context, map, map2, view2, scaleType);
        JSONObject jSONObjectV = rs0.v(context, view2);
        JSONObject jSONObjectX = rs0.x(view2);
        boolean z3 = z2;
        JSONObject jSONObjectA = rs0.A(context, view2);
        String strW = w(view, map);
        JSONObject jSONObjectD = rs0.D(strW, context, this.E, this.D);
        if (z3) {
            try {
                Point point = this.E;
                Point point2 = this.D;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        jn.P("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                jn.P("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                vc3.C.h.d("FirstPartyNativeAdCore.performCustomClickGesture", e3);
            }
        }
        B(view2, jSONObjectV, jSONObjectB, jSONObjectX, jSONObjectA, strW, jSONObjectD, null, z, true);
    }

    @Override // defpackage.uo1
    public final void j0() {
        z(null, null, null, null, null, null, false, null);
    }

    @Override // defpackage.uo1
    public final void k(Bundle bundle) {
        if (bundle == null) {
            jn.F("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!p("touch_reporting")) {
            jn.M("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.k.b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        y();
    }

    @Override // defpackage.uo1
    public final void l(mn1 mn1Var) {
        y22 y22Var;
        y22 y22Var2;
        d72 d72Var = this.x;
        x42 x42Var = this.o;
        f82 f82Var = this.v;
        try {
            if (this.B) {
                return;
            }
            if (mn1Var == null) {
                ro1 ro1Var = this.j;
                synchronized (ro1Var) {
                    y22Var = ro1Var.g;
                }
                if (y22Var != null) {
                    this.B = true;
                    synchronized (ro1Var) {
                        y22Var2 = ro1Var.g;
                    }
                    f82Var.b(y22Var2.g, x42Var.x0, d72Var, null);
                    C();
                    return;
                }
            }
            this.B = true;
            f82Var.b(mn1Var.d(), x42Var.x0, d72Var, null);
            C();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.uo1
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f;
        JSONObject jSONObjectB = rs0.B(context, map, map2, view, scaleType);
        JSONObject jSONObjectV = rs0.v(context, view);
        JSONObject jSONObjectX = rs0.x(view);
        JSONObject jSONObjectA = rs0.A(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectB);
            jSONObject.put("ad_view_signal", jSONObjectV);
            jSONObject.put("scroll_view_signal", jSONObjectX);
            jSONObject.put("lock_screen_signal", jSONObjectA);
            return jSONObject;
        } catch (JSONException e) {
            jn.P("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // defpackage.uo1
    public final void n(Bundle bundle) {
        if (bundle == null) {
            jn.F("Click data is null. No click is reported.");
            return;
        }
        if (!p("click_reporting")) {
            jn.M("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectK = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        f32 f32Var = ut0.f.a;
        f32Var.getClass();
        try {
            jSONObjectK = f32Var.k(bundle);
        } catch (JSONException e) {
            jn.P("Error converting Bundle to JSON", e);
        }
        B(null, null, null, null, null, string, null, jSONObjectK, false, false);
    }

    @Override // defpackage.uo1
    public final void o(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f;
        JSONObject jSONObjectB = rs0.B(context, map, map2, view, scaleType);
        JSONObject jSONObjectV = rs0.v(context, view);
        JSONObject jSONObjectX = rs0.x(view);
        JSONObject jSONObjectA = rs0.A(context, view);
        boolean zE = rs0.E(context, this.o);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.h);
            jSONObject.put("asset_view_signal", jSONObjectB);
            jSONObject.put("ad_view_signal", jSONObjectV);
            jSONObject.put("scroll_view_signal", jSONObjectX);
            jSONObject.put("lock_screen_signal", jSONObjectA);
            if (((Boolean) tu0.e.c.a(lx0.S3)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", zE);
            jSONObject.put("screen", rs0.F(context));
            ej1.s(this.i.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e) {
            jn.P("Unable to create native ad signals logging JSON.", e);
        }
    }

    public final boolean p(String str) {
        JSONObject jSONObjectOptJSONObject = this.h.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // defpackage.uo1
    public final void q(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.f;
        JSONObject jSONObjectB = rs0.B(context, map, map2, view2, scaleType);
        JSONObject jSONObjectV = rs0.v(context, view2);
        JSONObject jSONObjectX = rs0.x(view2);
        JSONObject jSONObjectA = rs0.A(context, view2);
        String strW = w(view, map);
        B(true == ((Boolean) tu0.e.c.a(lx0.Z3)).booleanValue() ? view2 : view, jSONObjectV, jSONObjectB, jSONObjectX, jSONObjectA, strW, rs0.D(strW, context, this.E, this.D), null, z, false);
    }

    @Override // defpackage.uo1
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f;
        z(rs0.v(context, view), rs0.B(context, map, map2, view, scaleType), rs0.x(view), rs0.A(context, view), A(view), null, rs0.E(context, this.o), view);
    }

    @Override // defpackage.uo1
    public final boolean s() {
        if (v() == 0) {
            return true;
        }
        if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
            return this.q.j.o;
        }
        return true;
    }

    @Override // defpackage.uo1
    public final boolean t(Bundle bundle) throws JSONException {
        JSONObject jSONObjectK;
        if (!p("impression_reporting")) {
            jn.M("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        f32 f32Var = ut0.f.a;
        f32Var.getClass();
        if (bundle != null) {
            try {
                jSONObjectK = f32Var.k(bundle);
            } catch (JSONException e) {
                jn.P("Error converting Bundle to JSON", e);
                jSONObjectK = null;
            }
        } else {
            jSONObjectK = null;
        }
        return z(null, null, null, null, ((Boolean) tu0.e.c.a(lx0.kc)).booleanValue() ? A(null) : null, jSONObjectK, false, null);
    }

    @Override // defpackage.uo1
    public final void u(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.D = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.G = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.w.a = motionEvent;
            this.F = jCurrentTimeMillis;
            this.E = this.D;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.D;
        motionEventObtain.setLocation(point.x, point.y);
        this.k.b.f(motionEventObtain);
        motionEventObtain.recycle();
        y();
    }

    @Override // defpackage.uo1
    public final int v() {
        qz0 qz0Var = this.q.j;
        if (qz0Var == null) {
            return 0;
        }
        if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
            return qz0Var.n;
        }
        return 0;
    }

    public final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iQ = this.j.q();
        if (iQ == 1) {
            return "1099";
        }
        if (iQ == 2) {
            return "2099";
        }
        if (iQ != 6) {
            return null;
        }
        return "3099";
    }

    @Override // defpackage.uo1
    public final void x() {
        View view;
        if (this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            ep1 ep1Var = this.s;
            if (ep1Var.h == null || ep1Var.k == null) {
                return;
            }
            ep1Var.j = null;
            ep1Var.k = null;
            WeakReference weakReference = ep1Var.l;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                ep1Var.l = null;
            }
            try {
                y01 y01Var = ep1Var.h;
                y01Var.K0(y01Var.U(), 2);
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
    }

    public final void y() {
        vs0 vs0Var;
        if (!((Boolean) tu0.e.c.a(lx0.pe)).booleanValue() || (vs0Var = this.K) == null) {
            return;
        }
        vs0Var.b = true;
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        oj1 oj1Var;
        x42 x42Var = this.o;
        Context context = this.f;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.h);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            ix0 ix0Var = lx0.S3;
            tu0 tu0Var = tu0.e;
            kx0 kx0Var = tu0Var.c;
            kx0 kx0Var2 = tu0Var.c;
            if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", rs0.F(context));
            if (((Boolean) kx0Var2.a(lx0.re)).booleanValue() && (oj1Var = this.L) != null) {
                AtomicLong atomicLong = oj1Var.a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) kx0Var2.a(lx0.m9)).booleanValue();
            uq1 uq1Var = this.i;
            if (zBooleanValue) {
                uq1Var.b("/clickRecorded", new zn1(this, 1));
            } else {
                uq1Var.b("/logScionEvent", new zn1(this, 0));
            }
            uq1Var.b("/nativeImpression", new s11(this, view));
            uq1Var.b("/nativeImpressionFlowControl", new ao1(this, this.v, x42Var.x0, this.x));
            ej1.s(uq1Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.z) {
                this.z = vc3.C.o.d(context, this.p.f, x42Var.C.toString(), this.q.g);
            }
            return true;
        } catch (JSONException e) {
            jn.P("Unable to create impression JSON.", e);
            return false;
        }
    }
}
