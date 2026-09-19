package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class de1 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, md1 {
    public static final /* synthetic */ int h0 = 0;
    public boolean A;
    public boolean B;
    public Boolean C;
    public boolean D;
    public final String E;
    public fe1 F;
    public boolean G;
    public boolean H;
    public pz0 I;
    public kq1 J;
    public u32 K;
    public int L;
    public int M;
    public rx0 N;
    public final rx0 O;
    public rx0 P;
    public final us2 Q;
    public int R;
    public nf0 S;
    public boolean T;
    public final i4 U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public HashMap d0;
    public final WindowManager e0;
    public final oe1 f;
    public final cv0 f0;
    public final zq0 g;
    public boolean g0;
    public final k52 h;
    public final ey0 i;
    public final d60 j;
    public w93 k;
    public final vg2 l;
    public final DisplayMetrics m;
    public final float n;
    public x42 o;
    public z42 p;
    public boolean q;
    public boolean r;
    public he1 s;
    public nf0 t;
    public qw1 u;
    public pw1 v;
    public eg w;
    public final String x;
    public boolean y;
    public boolean z;

    public de1(oe1 oe1Var, eg egVar, String str, boolean z, zq0 zq0Var, ey0 ey0Var, d60 d60Var, w93 w93Var, vg2 vg2Var, cv0 cv0Var, x42 x42Var, z42 z42Var, k52 k52Var) {
        z42 z42Var2;
        String str2;
        super(oe1Var);
        this.q = false;
        this.r = false;
        this.D = true;
        this.E = "";
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.f = oe1Var;
        this.w = egVar;
        this.x = str;
        this.A = z;
        this.g = zq0Var;
        this.h = k52Var;
        this.i = ey0Var;
        this.j = d60Var;
        this.k = w93Var;
        this.l = vg2Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.e0 = windowManager;
        zb3 zb3Var = vc3.C.c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.m = displayMetrics;
        this.n = displayMetrics.density;
        this.f0 = cv0Var;
        this.o = x42Var;
        this.p = z42Var;
        this.U = new i4(oe1Var.a, this, this);
        this.g0 = false;
        setBackgroundColor(0);
        if (((Boolean) tu0.e.c.a(lx0.rc)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            jn.P("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        ix0 ix0Var = lx0.qc;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) tu0Var.c.a(lx0.Xd)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        vc3 vc3Var = vc3.C;
        settings.setUserAgentString(vc3Var.c.E(oe1Var, d60Var.f));
        Context context = getContext();
        na1.p(context, new hq0(settings, 17, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        Z();
        addJavascriptInterface(new ge1(this, new zx(18, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        us2 us2Var = this.Q;
        if (us2Var != null) {
            sx0 sx0Var = (sx0) us2Var.h;
            mx0 mx0VarA = vc3Var.h.a();
            if (mx0VarA != null) {
                ((ArrayBlockingQueue) mx0VarA.b).offer(sx0Var);
            }
        }
        sx0 sx0Var2 = new sx0(this.x);
        us2 us2Var2 = new us2(sx0Var2);
        this.Q = us2Var2;
        synchronized (sx0Var2.c) {
        }
        if (((Boolean) tu0Var.c.a(lx0.Y1)).booleanValue() && (z42Var2 = this.p) != null && (str2 = z42Var2.b) != null) {
            sx0Var2.c("gqi", str2);
        }
        rx0 rx0VarD = sx0.d();
        this.O = rx0VarD;
        ((HashMap) us2Var2.g).put("native:view_create", rx0VarD);
        Context contextCreatePackageContext = null;
        this.P = null;
        this.N = null;
        if (ao2.r == null) {
            ao2.r = new ao2();
        }
        ao2 ao2Var = ao2.r;
        ao2Var.getClass();
        jn.p("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(oe1Var);
        if (!defaultUserAgent.equals(ao2Var.g)) {
            int i = fm.c;
            try {
                contextCreatePackageContext = oe1Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                oe1Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(oe1Var)).apply();
            }
            ao2Var.g = defaultUserAgent;
        }
        jn.p("User agent is updated.");
        vc3Var.h.k.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #3 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:72:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:72:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0051  */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x0058, B:49:0x005e, B:54:0x0065), top: B:69:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0065 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x0058, B:49:0x005e, B:54:0x0065), top: B:69:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void A(String str) {
        Boolean bool;
        Boolean bool2;
        String strConcat;
        Boolean bool3;
        synchronized (this) {
            bool = this.C;
        }
        if (bool == null) {
            synchronized (this) {
                try {
                    sa1 sa1Var = vc3.C.h;
                    synchronized (sa1Var.a) {
                        bool3 = sa1Var.j;
                    }
                    this.C = bool3;
                    if (bool3 == null) {
                        try {
                            evaluateJavascript("(function(){})()", null);
                            I(Boolean.TRUE);
                        } catch (IllegalStateException unused) {
                            I(Boolean.FALSE);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (l0()) {
                        jn.T("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (l0()) {
                    jn.T("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(strConcat);
                }
            }
        }
        synchronized (this) {
            bool2 = this.C;
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (l0()) {
                        evaluateJavascript(str, null);
                    } else {
                        jn.T("#004 The webview is destroyed. Ignoring action.");
                    }
                    return;
                }
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (l0()) {
                    loadUrl(strConcat);
                } else {
                    jn.T("#004 The webview is destroyed. Ignoring action.");
                }
            }
        }
    }

    @Override // defpackage.md1
    public final synchronized pz0 A0() {
        return this.I;
    }

    @Override // defpackage.ib0
    public final void B() {
        he1 he1Var = this.s;
        if (he1Var != null) {
            he1Var.B();
        }
    }

    @Override // defpackage.md1
    public final void C(String str, String str2) {
        he1 he1Var = this.s;
        hw1 hw1Var = he1Var.K;
        yd1 yd1Var = he1Var.f;
        he1Var.a(new AdOverlayInfoParcel(yd1Var, yd1Var.f.j, str, str2, hw1Var));
    }

    @Override // defpackage.md1
    public final void C0(x42 x42Var, z42 z42Var) {
        this.o = x42Var;
        this.p = z42Var;
    }

    @Override // defpackage.md1
    public final synchronized void D(pw1 pw1Var) {
        this.v = pw1Var;
    }

    @Override // defpackage.md1
    public final z42 D0() {
        return this.p;
    }

    @Override // defpackage.md1
    public final x42 E() {
        return this.o;
    }

    @Override // defpackage.w93
    public final synchronized void F() {
        w93 w93Var = this.k;
        if (w93Var != null) {
            w93Var.F();
        }
    }

    @Override // defpackage.md1
    public final void F0() {
        jn.p("Cannot add text view to inner AdWebView");
    }

    @Override // defpackage.md1
    public final void G(boolean z, int i, String str, boolean z2, boolean z3) {
        he1 he1Var = this.s;
        yd1 yd1Var = he1Var.f;
        boolean zX0 = yd1Var.f.X0();
        boolean zN = he1.N(zX0, yd1Var);
        boolean z4 = true;
        if (!zN && z2) {
            z4 = false;
        }
        ib0 ib0Var = zN ? null : he1Var.j;
        sd1 sd1Var = zX0 ? null : new sd1(yd1Var, he1Var.k);
        j11 j11Var = he1Var.n;
        hw1 hw1Var = null;
        k11 k11Var = he1Var.o;
        boolean z5 = z4;
        sd1 sd1Var2 = sd1Var;
        md0 md0Var = he1Var.z;
        d60 d60Var = yd1Var.f.j;
        zm1 zm1Var = z5 ? null : he1Var.p;
        if (he1.I(yd1Var)) {
            hw1Var = he1Var.K;
        }
        he1Var.a(new AdOverlayInfoParcel(ib0Var, sd1Var2, j11Var, k11Var, md0Var, yd1Var, z, i, str, d60Var, zm1Var, hw1Var, z3));
    }

    @Override // defpackage.md1
    public final void H() {
        setBackgroundColor(0);
    }

    @Override // defpackage.md1
    public final synchronized void H0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        try {
            try {
                if (l0()) {
                    jn.T("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                try {
                    String str4 = (String) tu0.e.c.a(lx0.a0);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        try {
                            jSONObject.put("version", str4);
                            jSONObject.put("sdk", "Google Mobile Ads");
                            jSONObject.put("sdkVersion", "12.4.51-000");
                            str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (JSONException e) {
                        jn.V("Unable to build MRAID_ENV", e);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, je1.a(str2, str3), "text/html", "UTF-8", null);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
        }
        throw th;
    }

    public final void I(Boolean bool) {
        synchronized (this) {
            this.C = bool;
        }
        sa1 sa1Var = vc3.C.h;
        synchronized (sa1Var.a) {
            sa1Var.j = bool;
        }
    }

    @Override // defpackage.md1
    public final void I0() {
        this.g0 = true;
    }

    @Override // defpackage.md1
    public final int J() {
        return getMeasuredHeight();
    }

    @Override // defpackage.md1
    public final void J0() {
        boolean z;
        HashMap map = new HashMap(3);
        vc3 vc3Var = vc3.C;
        mb0 mb0Var = vc3Var.i;
        synchronized (mb0Var) {
            z = mb0Var.a;
        }
        map.put("app_muted", String.valueOf(z));
        map.put("app_volume", String.valueOf(vc3Var.i.a()));
        map.put("device_volume", String.valueOf(mb0.b(getContext())));
        a("volume", map);
    }

    @Override // defpackage.md1
    public final void K(r91 r91Var, boolean z, boolean z2, String str) {
        this.s.f0(r91Var, z, z2, str);
    }

    @Override // defpackage.md1
    public final synchronized void L(pz0 pz0Var) {
        this.I = pz0Var;
    }

    @Override // defpackage.md1
    public final void L0(Context context) {
        oe1 oe1Var = this.f;
        oe1Var.setBaseContext(context);
        this.U.a = oe1Var.a;
    }

    @Override // defpackage.md1
    public final void M() {
        if (this.N == null) {
            us2 us2Var = this.Q;
            jn.q((sx0) us2Var.h, this.O, "aes2");
            rx0 rx0VarD = sx0.d();
            this.N = rx0VarD;
            ((HashMap) us2Var.g).put("native:view_show", rx0VarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.j.f);
        a("onshow", map);
    }

    @Override // defpackage.md1
    public final synchronized void M0(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        nf0 nf0Var = this.t;
        if (nf0Var != null) {
            b43 b43Var = nf0Var.q;
            if (z) {
                b43Var.setBackgroundColor(0);
            } else {
                b43Var.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // defpackage.md1
    public final synchronized nf0 N0() {
        return this.S;
    }

    @Override // defpackage.md1
    public final synchronized void O0(boolean z) {
        try {
            boolean z2 = this.A;
            this.A = z;
            Z();
            if (z != z2) {
                if (((Boolean) tu0.e.c.a(lx0.b0)).booleanValue()) {
                    if (!this.w.b()) {
                    }
                }
                try {
                    b("onStateChanged", new JSONObject().put("state", true != z ? "default" : "expanded"));
                } catch (JSONException e) {
                    jn.P("Error occurred while dispatching state change.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void P(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // defpackage.md1
    public final synchronized boolean P0() {
        return this.D;
    }

    @Override // defpackage.md1
    public final ArrayList Q() {
        return new ArrayList();
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        boolean z;
        synchronized (this) {
            z = pt0Var.j;
            this.G = z;
        }
        o0(z);
    }

    public final /* synthetic */ void R(String str) {
        super.loadUrl(str);
    }

    @Override // defpackage.md1
    public final synchronized void R0(u32 u32Var) {
        this.K = u32Var;
    }

    @Override // defpackage.md1
    public final zq0 S() {
        return this.g;
    }

    @Override // defpackage.md1
    public final synchronized void S0(kq1 kq1Var) {
        this.J = kq1Var;
    }

    @Override // defpackage.md1
    public final synchronized u32 T() {
        return this.K;
    }

    @Override // defpackage.zm1
    public final void T0() {
        he1 he1Var = this.s;
        if (he1Var != null) {
            he1Var.T0();
        }
    }

    public final /* synthetic */ void U() {
        super.loadUrl("about:blank");
    }

    @Override // defpackage.md1
    public final synchronized void U0(fe1 fe1Var) {
        if (this.F != null) {
            jn.M("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.F = fe1Var;
        }
    }

    @Override // defpackage.md1
    public final synchronized String V() {
        return this.x;
    }

    @Override // defpackage.md1
    public final synchronized pw1 V0() {
        return this.v;
    }

    @Override // defpackage.md1
    public final synchronized void W(eg egVar) {
        this.w = egVar;
        requestLayout();
    }

    @Override // defpackage.md1
    public final synchronized void W0(boolean z) {
        this.D = z;
    }

    @Override // defpackage.md1
    public final synchronized void X(nf0 nf0Var) {
        this.S = nf0Var;
    }

    @Override // defpackage.md1
    public final synchronized boolean X0() {
        return this.A;
    }

    public final synchronized void Y() {
        try {
            zb3.l.post(new zd1(this, 1));
        } catch (Throwable th) {
            vc3.C.h.d("AdWebViewImpl.loadUrlUnsafe", th);
            jn.V("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.md1
    public final void Y0(int i, boolean z, boolean z2) {
        ib0 ib0Var;
        zm1 zm1Var;
        he1 he1Var = this.s;
        yd1 yd1Var = he1Var.f;
        boolean zN = he1.N(yd1Var.f.X0(), yd1Var);
        boolean z3 = true;
        if (!zN && z2) {
            z3 = false;
        }
        if (zN) {
            ib0Var = null;
            zm1Var = null;
        } else {
            ib0Var = he1Var.j;
            zm1Var = null;
        }
        zm1 zm1Var2 = zm1Var;
        he1Var.a(new AdOverlayInfoParcel(ib0Var, he1Var.k, he1Var.z, yd1Var, z, i, yd1Var.f.j, z3 ? zm1Var2 : he1Var.p, he1.I(yd1Var) ? he1Var.K : zm1Var2));
    }

    public final synchronized void Z() {
        try {
            x42 x42Var = this.o;
            if (x42Var != null && x42Var.m0) {
                jn.F("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.B) {
                            setLayerType(1, null);
                        }
                        this.B = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (this.A || this.w.b()) {
                jn.F("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.B) {
                            setLayerType(0, null);
                        }
                        this.B = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            jn.F("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.B) {
                        setLayerType(0, null);
                    }
                    this.B = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        } catch (Throwable th4) {
            throw th4;
        }
        throw th4;
    }

    @Override // defpackage.md1
    public final synchronized boolean Z0() {
        return this.y;
    }

    @Override // defpackage.f31
    public final void a(String str, Map map) {
        try {
            b(str, ut0.f.a.j(map));
        } catch (JSONException unused) {
            jn.T("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.md1
    public final Context a0() {
        return this.f.c;
    }

    @Override // defpackage.md1
    public final synchronized void a1(int i) {
        this.R = i;
    }

    @Override // defpackage.f31
    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        jn.F("Dispatching AFMA event: ".concat(sb.toString()));
        A(sb.toString());
    }

    @Override // defpackage.md1
    public final synchronized void b0() {
        kq1 kq1Var = this.J;
        if (kq1Var != null) {
            zb3.l.post(new va1(20, kq1Var));
        }
    }

    @Override // defpackage.md1
    public final synchronized void b1(String str, pc1 pc1Var) {
        try {
            if (this.d0 == null) {
                this.d0 = new HashMap();
            }
            this.d0.put(str, pc1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.md1
    public final int c() {
        return getMeasuredWidth();
    }

    @Override // defpackage.md1
    public final kd0 c0() {
        return null;
    }

    @Override // defpackage.md1
    public final synchronized void c1(boolean z) {
        nf0 nf0Var;
        int i = this.L + (true != z ? -1 : 1);
        this.L = i;
        if (i > 0 || (nf0Var = this.t) == null) {
            return;
        }
        synchronized (nf0Var.s) {
            try {
                nf0Var.v = true;
                ly1 ly1Var = nf0Var.u;
                if (ly1Var != null) {
                    e32 e32Var = zb3.l;
                    e32Var.removeCallbacks(ly1Var);
                    e32Var.post(nf0Var.u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w93
    public final synchronized void d() {
        w93 w93Var = this.k;
        if (w93Var != null) {
            w93Var.d();
        }
    }

    @Override // defpackage.md1
    public final void d0(String str, oc2 oc2Var) {
        he1 he1Var = this.s;
        if (he1Var != null) {
            synchronized (he1Var.i) {
                try {
                    List<v11> list = (List) he1Var.h.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (v11 v11Var : list) {
                        if (v11Var instanceof h31) {
                            if (((h31) v11Var).f.equals((v11) oc2Var.g)) {
                                arrayList.add(v11Var);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.md1
    public final void d1(String str, v11 v11Var) {
        he1 he1Var = this.s;
        if (he1Var != null) {
            synchronized (he1Var.i) {
                try {
                    List list = (List) he1Var.h.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(v11Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final synchronized void destroy() {
        View decorView;
        try {
            us2 us2Var = this.Q;
            if (us2Var != null) {
                sx0 sx0Var = (sx0) us2Var.h;
                mx0 mx0VarA = vc3.C.h.a();
                if (mx0VarA != null) {
                    ((ArrayBlockingQueue) mx0VarA.b).offer(sx0Var);
                }
            }
            i4 i4Var = this.U;
            i4Var.e = false;
            Activity activity = (Activity) i4Var.a;
            if (activity != null && i4Var.c) {
                de1 de1Var = (de1) i4Var.b;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(de1Var);
                }
                i4Var.c = false;
            }
            nf0 nf0Var = this.t;
            if (nf0Var != null) {
                nf0Var.y();
                this.t.x();
                this.t = null;
            }
            this.u = null;
            this.v = null;
            this.s.e();
            this.K = null;
            this.k = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.z) {
                return;
            }
            vc3.C.A.a(this);
            n0();
            this.z = true;
            if (!((Boolean) tu0.e.c.a(lx0.Bb)).booleanValue()) {
                jn.p("Destroying the WebView immediately...");
                r();
                return;
            }
            Activity activity2 = this.f.a;
            if (activity2 != null && activity2.isDestroyed()) {
                jn.p("Destroying the WebView immediately...");
                r();
            } else {
                jn.p("Initiating WebView self destruct sequence in 3...");
                jn.p("Loading blank page in WebView, 2...");
                Y();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.l31
    public final void e(String str, JSONObject jSONObject) {
        s(str, jSONObject.toString());
    }

    @Override // defpackage.md1
    public final /* synthetic */ he1 e0() {
        return this.s;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (l0()) {
            jn.Z("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) tu0.e.c.a(lx0.Cb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            za1.f.a(new ib(this, str, valueCallback, 11));
        }
    }

    @Override // defpackage.md1
    public final synchronized fe1 f() {
        return this.F;
    }

    public final synchronized void f0() {
        if (this.T) {
            return;
        }
        this.T = true;
        vc3.C.h.k.decrementAndGet();
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.z) {
                        this.s.e();
                        vc3.C.A.a(this);
                        n0();
                        f0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // defpackage.md1
    public final Activity g() {
        return this.f.a;
    }

    @Override // defpackage.md1
    public final void g0(int i) {
        rx0 rx0Var = this.O;
        us2 us2Var = this.Q;
        if (i == 0) {
            jn.q((sx0) us2Var.h, rx0Var, "aebb2");
        }
        jn.q((sx0) us2Var.h, rx0Var, "aeh2");
        us2Var.getClass();
        ((sx0) us2Var.h).c("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.j.f);
        a("onhide", map);
    }

    @Override // defpackage.md1
    public final boolean h0() {
        return false;
    }

    @Override // defpackage.md1
    public final void i() {
        nf0 nf0VarX0 = x0();
        if (nf0VarX0 != null) {
            nf0VarX0.q.g = true;
        }
    }

    @Override // defpackage.md1
    public final void i0() {
        jn.q((sx0) this.Q.h, this.O, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.j.f);
        a("onhide", map);
    }

    @Override // defpackage.md1
    public final rx0 j() {
        return this.O;
    }

    @Override // defpackage.md1
    public final synchronized void j0(qw1 qw1Var) {
        this.u = qw1Var;
    }

    @Override // defpackage.md1
    public final vg2 k() {
        return this.l;
    }

    @Override // defpackage.md1
    public final synchronized qw1 k0() {
        return this.u;
    }

    @Override // defpackage.l31
    public final void l(String str) {
        A(str);
    }

    @Override // defpackage.md1
    public final synchronized boolean l0() {
        return this.z;
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final synchronized void loadData(String str, String str2, String str3) {
        if (l0()) {
            jn.T("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (l0()) {
            jn.T("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final synchronized void loadUrl(String str) {
        if (l0()) {
            jn.T("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            zb3.l.post(new hb1(this, str, 3, false));
        } catch (Throwable th) {
            vc3.C.h.d("AdWebViewImpl.loadUrl", th);
            jn.V("Could not call loadUrl. ", th);
        }
    }

    @Override // defpackage.md1
    public final synchronized String m() {
        return this.E;
    }

    @Override // defpackage.md1
    public final synchronized void m0(nf0 nf0Var) {
        this.t = nf0Var;
    }

    @Override // defpackage.md1
    public final us2 n() {
        return this.Q;
    }

    public final synchronized void n0() {
        try {
            HashMap map = this.d0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((pc1) it.next()).a();
                }
            }
            this.d0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.md1
    public final synchronized String o() {
        z42 z42Var = this.p;
        if (z42Var == null) {
            return null;
        }
        return z42Var.b;
    }

    public final void o0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        a("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z = true;
            if (!l0()) {
                i4 i4Var = this.U;
                i4Var.d = true;
                if (i4Var.e) {
                    i4Var.d();
                }
            }
            if (this.g0) {
                onResume();
                this.g0 = false;
            }
            boolean z2 = this.G;
            he1 he1Var = this.s;
            if (he1Var == null || !he1Var.U()) {
                z = z2;
            } else {
                if (!this.H) {
                    synchronized (this.s.i) {
                    }
                    synchronized (this.s.i) {
                    }
                    this.H = true;
                }
                w();
            }
            o0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        he1 he1Var;
        View decorView;
        synchronized (this) {
            try {
                if (!l0()) {
                    i4 i4Var = this.U;
                    i4Var.d = false;
                    Activity activity = (Activity) i4Var.a;
                    if (activity != null && i4Var.c) {
                        de1 de1Var = (de1) i4Var.b;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(de1Var);
                        }
                        i4Var.c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.H && (he1Var = this.s) != null && he1Var.U() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.s.i) {
                    }
                    synchronized (this.s.i) {
                    }
                    this.H = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) tu0.e.c.a(lx0.Qb)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zb3 zb3Var = vc3.C.c;
            zb3.s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            jn.F(sb.toString());
            vc3.C.h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (l0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zW = w();
        nf0 nf0VarX0 = x0();
        if (nf0VarX0 != null && zW && nf0VarX0.r) {
            nf0VarX0.r = false;
            nf0VarX0.i.M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:19:0x0025, B:24:0x002d, B:26:0x003f, B:29:0x0044, B:31:0x004b, B:35:0x0055, B:38:0x005a, B:41:0x006b, B:49:0x0083, B:43:0x0072, B:46:0x0077, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:63:0x00d0, B:62:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:80:0x010a, B:82:0x0111, B:86:0x0118, B:88:0x012a, B:90:0x0138, B:94:0x0145, B:96:0x0148, B:98:0x01ba, B:99:0x01bd, B:101:0x01c4, B:106:0x01d1, B:108:0x01d7, B:109:0x01da, B:111:0x01de, B:112:0x01e7, B:115:0x01f2), top: B:120:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        eg egVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (l0()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.A && (i3 = (egVar = this.w).a) != 0) {
            if (i3 == 5) {
                super.onMeasure(i, i2);
                return;
            }
            if (i3 == 4) {
                if (((Boolean) tu0.e.c.a(lx0.j4)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                fe1 fe1VarF = f();
                float fM = fe1VarF != null ? fe1VarF.m() : 0.0f;
                if (fM == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * fM;
                int i8 = (int) (size / fM);
                if (size2 != 0) {
                    i4 = (int) f;
                    if (size == 0) {
                        i7 = size;
                    } else if (i4 != 0) {
                        i8 = (int) (i4 / fM);
                        i5 = size2;
                        i6 = i4;
                        i7 = i6;
                    }
                    i5 = size2;
                    i6 = i4;
                } else if (i8 != 0) {
                    i6 = (int) (i8 * fM);
                    i7 = size;
                    i5 = i8;
                } else {
                    size2 = 0;
                    i4 = (int) f;
                    if (size == 0) {
                        i7 = size;
                    } else if (i4 != 0) {
                        i8 = (int) (i4 / fM);
                        i5 = size2;
                        i6 = i4;
                        i7 = i6;
                    }
                    i5 = size2;
                    i6 = i4;
                }
                setMeasuredDimension(Math.min(i6, i7), Math.min(i8, i5));
                return;
            }
            int i9 = 8;
            if (i3 == 2) {
                if (((Boolean) tu0.e.c.a(lx0.r4)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                t0("/contentHeight", new i11(i9, this));
                A("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.m.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i10 = this.M;
                setMeasuredDimension(size3, i10 != -1 ? (int) (i10 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (egVar.b()) {
                DisplayMetrics displayMetrics = this.m;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i12 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            eg egVar2 = this.w;
            boolean z = egVar2.c > i11 || egVar2.b > i12;
            if (((Boolean) tu0.e.c.a(lx0.T5)).booleanValue()) {
                eg egVar3 = this.w;
                float f3 = egVar3.c;
                float f4 = this.n;
                z &= f3 / f4 <= ((float) i11) / f4 && ((float) egVar3.b) / f4 <= ((float) i12) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.r) {
                    this.f0.b(10002);
                    this.r = true;
                }
                eg egVar4 = this.w;
                setMeasuredDimension(egVar4.c, egVar4.b);
                return;
            }
            eg egVar5 = this.w;
            float f5 = egVar5.c;
            float f6 = this.n;
            int i13 = (int) (f5 / f6);
            int i14 = (int) (egVar5.b / f6);
            int i15 = (int) (size4 / f6);
            int i16 = (int) (size5 / f6);
            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 36 + String.valueOf(i14).length() + 18 + String.valueOf(i15).length() + 1 + String.valueOf(i16).length() + 4);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(i13);
            sb.append("x");
            sb.append(i14);
            sb.append(" dp, but only has ");
            sb.append(i15);
            sb.append("x");
            sb.append(i16);
            sb.append(" dp.");
            jn.T(sb.toString());
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.q) {
                return;
            }
            this.f0.b(10001);
            this.q = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final void onPause() {
        if (l0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) tu0.e.c.a(lx0.rd)).booleanValue() && na1.k("MUTE_AUDIO")) {
                jn.F("Muting webview");
                int i = v70.a;
                if (!y70.h.b()) {
                    throw y70.a();
                }
                ((WebViewProviderBoundaryInterface) v70.b(this).g).setAudioMuted(true);
            }
        } catch (Exception e) {
            jn.P("Could not pause webview.", e);
            if (((Boolean) tu0.e.c.a(lx0.ud)).booleanValue()) {
                vc3.C.h.d("AdWebViewImpl.onPause", e);
            }
        }
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final void onResume() {
        if (l0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) tu0.e.c.a(lx0.rd)).booleanValue() && na1.k("MUTE_AUDIO")) {
                jn.F("Unmuting webview");
                int i = v70.a;
                if (!y70.h.b()) {
                    throw y70.a();
                }
                ((WebViewProviderBoundaryInterface) v70.b(this).g).setAudioMuted(false);
            }
        } catch (Exception e) {
            jn.P("Could not resume webview.", e);
            if (((Boolean) tu0.e.c.a(lx0.ud)).booleanValue()) {
                vc3.C.h.d("AdWebViewImpl.onResume", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0042 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:27:0x003e, B:29:0x0042, B:32:0x0048), top: B:59:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x004c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0050  */
    /* JADX WARN: Code duplicated, block: B:41:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:59:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        zq0 zq0Var;
        ey0 ey0Var;
        pz0 pz0Var;
        boolean z2;
        boolean z3;
        if (((Boolean) tu0.e.c.a(lx0.R3)).booleanValue()) {
            he1 he1Var = this.s;
            synchronized (he1Var.i) {
                z3 = he1Var.x;
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.s.U()) {
            he1 he1Var2 = this.s;
            synchronized (he1Var2.i) {
                z2 = he1Var2.y;
            }
            if (!z2) {
                synchronized (this) {
                    pz0Var = this.I;
                    if (pz0Var != null) {
                        pz0Var.g(motionEvent);
                    }
                }
            } else if (z) {
                synchronized (this) {
                    try {
                        pz0Var = this.I;
                        if (pz0Var != null) {
                            pz0Var.g(motionEvent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                zq0Var = this.g;
                if (zq0Var != null) {
                    zq0Var.b.f(motionEvent);
                }
                ey0Var = this.i;
                if (ey0Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getEventTime() > ey0Var.a.getEventTime()) {
                        ey0Var.a = MotionEvent.obtain(motionEvent);
                    } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > ey0Var.b.getEventTime()) {
                        ey0Var.b = MotionEvent.obtain(motionEvent);
                    }
                }
            }
        } else if (z) {
            synchronized (this) {
                pz0Var = this.I;
                if (pz0Var != null) {
                    pz0Var.g(motionEvent);
                }
            }
        } else {
            zq0Var = this.g;
            if (zq0Var != null) {
                zq0Var.b.f(motionEvent);
            }
            ey0Var = this.i;
            if (ey0Var != null) {
                if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 0) {
                        ey0Var.b = MotionEvent.obtain(motionEvent);
                    }
                } else if (motionEvent.getAction() == 0) {
                    ey0Var.b = MotionEvent.obtain(motionEvent);
                }
            }
        }
        if (l0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.md1
    public final synchronized int q() {
        return this.R;
    }

    @Override // defpackage.zm1
    public final void q0() {
        he1 he1Var = this.s;
        if (he1Var != null) {
            he1Var.q0();
        }
    }

    public final synchronized void r() {
        jn.p("Destroying WebView!");
        f0();
        zb3.l.post(new zd1(this, 0));
    }

    @Override // defpackage.md1
    public final hp r0() {
        ey0 ey0Var = this.i;
        return ey0Var == null ? kn2.g : (fn2) na1.K(fn2.r(kn2.g), ((Long) qy0.c.u()).longValue(), TimeUnit.MILLISECONDS, ey0Var.c);
    }

    @Override // defpackage.l31
    public final void s(String str, String str2) {
        A(ec.o(new StringBuilder(ec.f(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // defpackage.md1
    public final k52 s0() {
        return this.h;
    }

    @Override // android.webkit.WebView, defpackage.md1
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof he1) {
            this.s = (he1) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (l0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            jn.P("Could not stop loading webview.", e);
        }
    }

    @Override // defpackage.md1
    public final void t0(String str, v11 v11Var) {
        he1 he1Var = this.s;
        if (he1Var != null) {
            he1Var.b(str, v11Var);
        }
    }

    @Override // defpackage.md1
    public final d60 u() {
        return this.j;
    }

    @Override // defpackage.md1
    public final synchronized pc1 u0(String str) {
        HashMap map = this.d0;
        if (map == null) {
            return null;
        }
        return (pc1) map.get(str);
    }

    @Override // defpackage.md1
    public final void v(boolean z, int i, String str, String str2, boolean z2) {
        he1 he1Var = this.s;
        yd1 yd1Var = he1Var.f;
        boolean zX0 = yd1Var.f.X0();
        boolean zN = he1.N(zX0, yd1Var);
        boolean z3 = true;
        if (!zN && z2) {
            z3 = false;
        }
        ib0 ib0Var = zN ? null : he1Var.j;
        sd1 sd1Var = zX0 ? null : new sd1(yd1Var, he1Var.k);
        j11 j11Var = he1Var.n;
        hw1 hw1Var = null;
        k11 k11Var = he1Var.o;
        boolean z4 = z3;
        sd1 sd1Var2 = sd1Var;
        md0 md0Var = he1Var.z;
        d60 d60Var = yd1Var.f.j;
        zm1 zm1Var = z4 ? null : he1Var.p;
        if (he1.I(yd1Var)) {
            hw1Var = he1Var.K;
        }
        he1Var.a(new AdOverlayInfoParcel(ib0Var, sd1Var2, j11Var, k11Var, md0Var, yd1Var, z, i, str, str2, d60Var, zm1Var, hw1Var));
    }

    @Override // defpackage.md1
    public final void v0(boolean z) {
        this.s.I = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r11.c0 != r9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.w():boolean");
    }

    @Override // defpackage.md1
    public final synchronized void w0(boolean z) {
        boolean z2;
        nf0 nf0Var = this.t;
        if (nf0Var == null) {
            this.y = z;
            return;
        }
        he1 he1Var = this.s;
        synchronized (he1Var.i) {
            z2 = he1Var.v;
        }
        nf0Var.H3(z2, z);
    }

    @Override // defpackage.md1
    public final synchronized eg x() {
        return this.w;
    }

    @Override // defpackage.md1
    public final synchronized nf0 x0() {
        return this.t;
    }

    @Override // defpackage.md1
    public final synchronized void y(int i) {
        nf0 nf0Var = this.t;
        if (nf0Var != null) {
            nf0Var.I3(i);
        }
    }

    @Override // defpackage.md1
    public final void z(long j, boolean z) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        a("onCacheAccessComplete", map);
    }

    @Override // defpackage.md1
    public final synchronized boolean z0() {
        return this.L > 0;
    }

    @Override // defpackage.md1
    public final View p0() {
        return this;
    }

    @Override // defpackage.md1
    public final WebView t() {
        return this;
    }

    @Override // defpackage.md1
    public final void O(int i) {
    }
}
