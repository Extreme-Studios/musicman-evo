package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.extremestudios.musicmanevo.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s70 implements WebMessageListenerBoundaryInterface, lu, pg, c2, u1, ww, hn2, qi0, sa2, y7, eb1, dr, n62, gm1, w93 {
    public static final gm h = new gm();
    public final /* synthetic */ int f;
    public final Object g;

    public s70(if1 if1Var, Context context, String str, kb3 kb3Var) {
        this.f = 21;
        s63 s63VarA = s63.a(context);
        s63 s63VarA2 = s63.a(kb3Var);
        s63 s63VarA3 = s63.a(str);
        q63 q63Var = if1Var.j;
        q63 q63VarA = q63.a(new eg1(q63Var, 23));
        q63 q63VarA2 = q63.a(new q12(if1Var.I0, 7));
        this.g = q63.a(new nx0(s63VarA, s63VarA2, s63VarA3, q63.a(new u91(s63VarA, (v63) if1Var.c, (r63) if1Var.D, q63VarA, q63VarA2, 18)), q63VarA, q63VarA2, if1Var.h, if1Var.E, q63Var));
    }

    public static void h(Context context, q2 q2Var, fw fwVar) {
        lx0.a(context);
        if (((Boolean) py0.j.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new ib(context, q2Var, fwVar));
                return;
            }
        }
        new z61(context, 0, q2Var.a).E(fwVar);
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((q51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.sa2
    public void B(int i, long j) {
        ((ga2) this.g).b(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.w93
    public void F() {
        nl1 nl1Var = ((jr1) this.g).g;
        synchronized (nl1Var) {
            try {
                if (nl1Var.o) {
                    return;
                }
                ScheduledFuture scheduledFuture = nl1Var.p;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    nl1Var.m = -1L;
                } else {
                    nl1Var.p.cancel(false);
                    long j = nl1Var.k;
                    nl1Var.i.getClass();
                    nl1Var.m = j - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = nl1Var.q;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    nl1Var.n = -1L;
                } else {
                    nl1Var.q.cancel(false);
                    long j2 = nl1Var.l;
                    nl1Var.i.getClass();
                    nl1Var.n = j2 - SystemClock.elapsedRealtime();
                }
                nl1Var.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public y80 I(View view, y80 y80Var) {
        int i;
        boolean z;
        y80 y80VarB;
        n80 j80Var;
        boolean z2;
        boolean z3;
        v80 v80Var = y80Var.a;
        int i2 = v80Var.j().b;
        c5 c5Var = (c5) this.g;
        Context context = c5Var.p;
        int i3 = v80Var.j().b;
        ActionBarContextView actionBarContextView = c5Var.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c5Var.z.getLayoutParams();
            if (c5Var.z.isShown()) {
                if (c5Var.g0 == null) {
                    c5Var.g0 = new Rect();
                    c5Var.h0 = new Rect();
                }
                Rect rect = c5Var.g0;
                Rect rect2 = c5Var.h0;
                rect.set(v80Var.j().a, v80Var.j().b, v80Var.j().c, v80Var.j().d);
                ViewGroup viewGroup = c5Var.E;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = m70.a;
                    l70.a(viewGroup, rect, rect2);
                    z3 = true;
                } else {
                    if (m70.a) {
                        z3 = true;
                    } else {
                        m70.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            m70.b = declaredMethod;
                            if (declaredMethod.isAccessible()) {
                                z3 = true;
                            } else {
                                z3 = true;
                                try {
                                    m70.b.setAccessible(true);
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                        } catch (NoSuchMethodException unused2) {
                            z3 = true;
                        }
                    }
                    Method method = m70.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = c5Var.E;
                WeakHashMap weakHashMap = w60.a;
                y80 y80VarA = q60.a(viewGroup2);
                int i7 = y80VarA == null ? 0 : y80VarA.a.j().a;
                int i8 = y80VarA == null ? 0 : y80VarA.a.j().c;
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = z3;
                }
                if (i4 <= 0 || c5Var.G != null) {
                    View view2 = c5Var.G;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            c5Var.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    c5Var.G = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    c5Var.E.addView(c5Var.G, -1, layoutParams);
                }
                View view4 = c5Var.G;
                boolean z5 = view4 != null ? z3 : false;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = c5Var.G;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!c5Var.L && z5) {
                    i3 = 0;
                }
                z = z5;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                c5Var.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = c5Var.G;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int i11 = v80Var.j().a;
            int i12 = v80Var.j().c;
            int i13 = v80Var.j().d;
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 34) {
                j80Var = new m80(y80Var);
            } else if (i14 >= 31) {
                j80Var = new l80(y80Var);
            } else if (i14 >= 30) {
                j80Var = new k80(y80Var);
            } else {
                j80Var = i14 >= 29 ? new j80(y80Var) : new h80(y80Var);
            }
            j80Var.d(gn.a(i11, i3, i12, i13));
            y80VarB = j80Var.b();
        } else {
            y80VarB = y80Var;
        }
        WeakHashMap weakHashMap2 = w60.a;
        WindowInsets windowInsetsB = y80VarB.b();
        if (windowInsetsB == null) {
            return y80VarB;
        }
        WindowInsets windowInsetsB2 = n60.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? y80.c(windowInsetsB2, view) : y80VarB;
    }

    public void N(mm0 mm0Var, md mdVar, in2 in2Var) {
        synchronized (mm0Var.j) {
            mm0Var.n = true;
        }
        mm0Var.a("post-response");
        ((fx) this.g).g.post(new ib(mm0Var, mdVar, in2Var, 7));
    }

    public yc3[] P(Handler handler, d73 d73Var, d73 d73Var2) {
        ed1 ed1Var = (ed1) this.g;
        r53 r53Var = r53.i;
        Context context = ed1Var.f;
        db2 db2Var = new db2();
        db2Var.g = context;
        db2Var.h = na3.c;
        hn.M(!db2Var.f);
        db2Var.f = true;
        if (((hb3) db2Var.i) == null) {
            db2Var.i = new hb3(new cd1[0]);
        }
        if (((fb3) db2Var.j) == null) {
            db2Var.j = new fb3(context);
        }
        rb3 rb3Var = new rb3(context, new sw1(context), handler, d73Var2, new qb3(db2Var));
        ba0 ba0Var = new ba0();
        ba0Var.g = context;
        ba0Var.h = r53.i;
        ba0Var.i = new sw1(context);
        ba0Var.h = r53Var;
        ba0Var.j = handler;
        ba0Var.k = d73Var;
        hn.M(!ba0Var.f);
        Handler handler2 = (Handler) ba0Var.j;
        hn.M((handler2 == null && ((d73) ba0Var.k) == null) || !(handler2 == null || ((d73) ba0Var.k) == null));
        ba0Var.f = true;
        return new yc3[]{rb3Var, new ub0(ba0Var)};
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
        es0 es0Var = (es0) this.g;
        synchronized (es0Var.h) {
            try {
                es0Var.k = null;
                if (((vu0) es0Var.i) != null) {
                    es0Var.i = null;
                }
                es0Var.h.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pg
    public void a(final s90 s90Var) {
        za zaVar = new za("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), zaVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: sg
            @Override // java.lang.Runnable
            public final void run() {
                s70 s70Var = this.f;
                s90 s90Var2 = s90Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    ui uiVarG = i8.g((Context) s70Var.g);
                    if (uiVarG == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ti tiVar = (ti) uiVarG.a;
                    synchronized (tiVar.i) {
                        tiVar.k = threadPoolExecutor2;
                    }
                    uiVarG.a.a(new tg(s90Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    s90Var2.j(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.ww
    public void accept(Object obj, Object obj2) {
        p30 p30Var = (p30) this.g;
        k30 k30Var = (k30) obj2;
        ua0 ua0Var = (ua0) ((ya0) obj).t();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(ua0Var.h);
        int i = ga0.a;
        if (p30Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            p30Var.writeToParcel(parcelObtain, 0);
        }
        try {
            ua0Var.g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            k30Var.a.e(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v11, types: [h91] */
    @Override // defpackage.n62
    public Object b(Object obj) {
        e52 e52Var = (e52) obj;
        vg2 vg2Var = ((vi1) this.g).d;
        ArrayList arrayList = (ArrayList) e52Var.b.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            d52 d52Var = (d52) obj2;
            Map map = (Map) vg2Var.g;
            String str = d52Var.a;
            JSONObject jSONObject = d52Var.b;
            if (map.containsKey(str) && jSONObject != null) {
                lg1 lg1Var = (lg1) map.get(str);
                switch (lg1Var.a) {
                    case 0:
                        if (!((Boolean) tu0.e.c.a(lx0.Y9)).booleanValue()) {
                            continue;
                        } else {
                            qt1 qt1Var = (qt1) lg1Var.b;
                            synchronized (qt1Var) {
                                qt1Var.p = jSONObject;
                            }
                        }
                        break;
                    default:
                        ((h91) ((z61) lg1Var.b).h).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                        break;
                }
            } else {
                Map map2 = (Map) vg2Var.h;
                if (map2.containsKey(str) && jSONObject != null) {
                    fg1 fg1Var = (fg1) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    fg1Var.a(map3);
                }
            }
        }
        return e52Var;
    }

    @Override // defpackage.w93
    public void d() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        nl1 nl1Var = ((jr1) this.g).g;
        synchronized (nl1Var) {
            try {
                if (nl1Var.o) {
                    if (nl1Var.m > 0 && (scheduledFuture2 = nl1Var.p) != null && scheduledFuture2.isCancelled()) {
                        nl1Var.T1(nl1Var.m);
                    }
                    if (nl1Var.n > 0 && (scheduledFuture = nl1Var.q) != null && scheduledFuture.isCancelled()) {
                        nl1Var.U1(nl1Var.n);
                    }
                    nl1Var.o = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 11:
                jn.F("Initialized webview successfully for SDKCore.");
                if (((Boolean) tu0.e.c.a(lx0.ya)).booleanValue()) {
                    ep0 ep0Var = (ep0) obj2;
                    jn.I(ep0Var.q, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(ep0Var.I.get())));
                    ep0Var.H.set(true);
                }
                break;
            case 27:
                md1 md1Var = (md1) obj;
                cb1 cb1Var = (cb1) obj2;
                if (md1Var == null) {
                    cb1Var.c(new ky1("Missing webview from video view future.", 1));
                } else {
                    md1Var.t0("/video", new i11(7, new i01(cb1Var)));
                    md1Var.M();
                }
                break;
            default:
                ((it1) obj).s = true;
                ((xt1) obj2).i.b();
                break;
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public z60 l(Class cls) {
        String canonicalName;
        String strG;
        q9 q9VarA = tw.a(cls);
        u40 u40Var = (u40) this.g;
        Map map = q9.b;
        Class cls2 = q9VarA.a;
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            canonicalName = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            canonicalName = (!componentType.isPrimitive() || (strG = ej1.g(componentType.getName())) == null) ? null : strG.concat("Array");
            if (canonicalName == null) {
                canonicalName = "kotlin.Array";
            }
        } else {
            String strG2 = ej1.g(cls2.getName());
            canonicalName = strG2 == null ? cls2.getCanonicalName() : strG2;
        }
        if (canonicalName != null) {
            return u40Var.f(q9VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        j7.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00af A[Catch: JSONException -> 0x00cd, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:20:0x0090, B:22:0x00af, B:25:0x00b8, B:27:0x00c2, B:29:0x00c9), top: B:43:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8 A[Catch: JSONException -> 0x00cd, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:20:0x0090, B:22:0x00af, B:25:0x00b8, B:27:0x00c2, B:29:0x00c9), top: B:43:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2 A[Catch: JSONException -> 0x00cd, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:20:0x0090, B:22:0x00af, B:25:0x00b8, B:27:0x00c2, B:29:0x00c9), top: B:43:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9 A[Catch: JSONException -> 0x00cd, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00cd, blocks: (B:20:0x0090, B:22:0x00af, B:25:0x00b8, B:27:0x00c2, B:29:0x00c9), top: B:43:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        e3 e3Var;
        e3 e3Var2;
        c92 c92Var;
        int i;
        String str;
        String string;
        String string2;
        HashMap map;
        x82 x82Var;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) i8.f(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        kc2[] kc2VarArr = new kc2[ports.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < ports.length; i2++) {
            InvocationHandler invocationHandler3 = ports[i2];
            kc2 kc2Var = new kc2(8, z2);
            kc2Var.g = (WebMessagePortBoundaryInterface) i8.f(WebMessagePortBoundaryInterface.class, invocationHandler3);
            kc2VarArr[i2] = kc2Var;
        }
        int i3 = 2;
        if (y70.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) i8.f(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    e3Var2 = null;
                } else {
                    e3Var = new e3(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (e3Var2 != null) {
                    final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) i8.f(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    c92Var = (c92) ((rz1) this.g).g;
                    i = e3Var2.g;
                    if (i == 0) {
                        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                        if (i != 0) {
                            str = "String";
                        } else if (i != 1) {
                            str = "Unknown";
                        } else {
                            str = "ArrayBuffer";
                        }
                        throw new IllegalStateException(ec.n(sb, str, " expected, but got ", "String"));
                    }
                    try {
                        JSONObject jSONObject = new JSONObject((String) e3Var2.h);
                        string = jSONObject.getString("method");
                        string2 = jSONObject.getJSONObject("data").getString("adSessionId");
                        if (!string.equals("startSession")) {
                            c92Var.a(string2);
                            return;
                        }
                        if (string.equals("finishSession")) {
                            map = c92Var.d;
                            x82Var = (x82) map.get(string2);
                            if (x82Var != null) {
                                x82Var.c();
                                map.remove(string2);
                            }
                        }
                        return;
                    } catch (JSONException e) {
                        hn.u("Error parsing JS message in JavaScriptSessionService.", e);
                        return;
                    }
                }
            }
            e3Var = new e3(i3, webMessagePayloadBoundaryInterface.getAsString());
        } else {
            e3Var = new e3(i3, webMessageBoundaryInterface.getData());
        }
        e3Var2 = e3Var;
        if (e3Var2 != null) {
            final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) i8.f(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            c92Var = (c92) ((rz1) this.g).g;
            i = e3Var2.g;
            if (i == 0) {
                StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
                if (i != 0) {
                    str = "String";
                } else if (i != 1) {
                    str = "Unknown";
                } else {
                    str = "ArrayBuffer";
                }
                throw new IllegalStateException(ec.n(sb2, str, " expected, but got ", "String"));
            }
            JSONObject jSONObject2 = new JSONObject((String) e3Var2.h);
            string = jSONObject2.getString("method");
            string2 = jSONObject2.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                c92Var.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                return;
            }
            map = c92Var.d;
            x82Var = (x82) map.get(string2);
            if (x82Var != null) {
                x82Var.c();
                map.remove(string2);
            }
        }
    }

    @Override // defpackage.c2
    public void p(Object obj) {
        b2 b2Var = (b2) obj;
        xj xjVar = (xj) this.g;
        uj ujVar = (uj) xjVar.C.pollFirst();
        if (ujVar == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = ujVar.f;
        int i = ujVar.g;
        kj kjVarG = xjVar.c.g(str);
        if (kjVarG != null) {
            kjVarG.o(i, b2Var.f, b2Var.g);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.sa2
    public void r(int i, long j, String str) {
        ((ga2) this.g).e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // defpackage.qi0
    public void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        tf1 tf1VarA;
        cw1 cw1Var = (cw1) this.g;
        cw1Var.z(i2 + i, bArr);
        cw1Var.E(i);
        ArrayList arrayList = new ArrayList();
        while (cw1Var.B() > 0) {
            hn.B("Incomplete Mp4Webvtt Top Level box header found.", cw1Var.B() >= 8);
            int iB = cw1Var.b() - 8;
            if (cw1Var.b() == 1987343459) {
                CharSequence charSequenceA = null;
                jf1 jf1VarA = null;
                while (iB > 0) {
                    hn.B("Incomplete vtt cue box header found.", iB >= 8);
                    int iB2 = cw1Var.b();
                    int iB3 = cw1Var.b();
                    int i3 = iB - 8;
                    int i4 = iB2 - 8;
                    byte[] bArr2 = cw1Var.a;
                    int i5 = cw1Var.b;
                    String str = qz1.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    cw1Var.G(i4);
                    if (iB3 == 1937011815) {
                        yj0 yj0Var = new yj0();
                        zj0.c(str2, yj0Var);
                        jf1VarA = yj0Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = zj0.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i3 - i4;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (jf1VarA != null) {
                    jf1VarA.a = charSequenceA;
                    jf1VarA.b = null;
                    tf1VarA = jf1VarA.a();
                } else {
                    Pattern pattern = zj0.a;
                    yj0 yj0Var2 = new yj0();
                    yj0Var2.c = charSequenceA;
                    tf1VarA = yj0Var2.a().a();
                }
                arrayList.add(tf1VarA);
            } else {
                cw1Var.G(iB);
            }
        }
        ri0Var.mo0b(new mi0(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 11:
                vc3.C.h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
                ep0 ep0Var = (ep0) obj;
                jn.I(ep0Var.q, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(ep0Var.I.get())));
                jn.P("Failed to initialize webview for loading SDKCore. ", th);
                ix0 ix0Var = lx0.ya;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && !ep0Var.H.get()) {
                    if (ep0Var.I.getAndIncrement() < ((Integer) tu0Var.c.a(lx0.za)).intValue()) {
                        ep0Var.E3();
                    }
                    break;
                }
                break;
            case 27:
                jn.M("Failed to load media data due to video view load failure.");
                ((cb1) obj).c(th);
                break;
        }
    }

    private final void R(Throwable th) {
    }

    public s70(int i) {
        this.f = i;
        switch (i) {
            case 18:
                this.g = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.g = new cw1();
                break;
        }
    }

    public s70(Handler handler) {
        this.f = 13;
        this.g = new fx(this, handler);
    }

    public s70(n01 n01Var) {
        Context context;
        this.f = 16;
        this.g = n01Var;
        try {
            context = (Context) ju.Z0(n01Var.T0());
        } catch (RemoteException | NullPointerException e) {
            jn.P("", e);
            context = null;
        }
        if (context != null) {
            try {
                ((n01) this.g).C(new ju(new cr(context)));
            } catch (RemoteException e2) {
                jn.P("", e2);
            }
        }
    }

    public s70(r31 r31Var) {
        this.f = 17;
        Objects.requireNonNull(r31Var);
        this.g = r31Var;
    }

    public s70(w51 w51Var, q51 q51Var) {
        this.f = 19;
        this.g = q51Var;
    }

    public /* synthetic */ s70(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public s70(aq1 aq1Var, cb1 cb1Var) {
        this.f = 27;
        this.g = cb1Var;
        Objects.requireNonNull(aq1Var);
    }

    public s70(c70 c70Var, b70 b70Var) {
        this.f = 1;
        c70Var.getClass();
        vc vcVar = vc.b;
        vcVar.getClass();
        this.g = new u40(c70Var, b70Var, vcVar);
    }

    public s70(Context context) {
        this.f = 4;
        this.g = context.getApplicationContext();
    }

    public s70(BottomSheetBehavior bottomSheetBehavior) {
        this.f = 3;
        this.g = bottomSheetBehavior;
        new q7(1, this);
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public /* synthetic */ void mo11b(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 17:
                jn.p("Releasing engine reference.");
                ((r31) obj2).d.q();
                break;
            case 23:
                ((fk1) obj).N((fu1) obj2);
                break;
            case 24:
                ((jl1) obj).h((qc3) obj2);
                break;
            case 25:
                ((dm1) obj).F((gw0) obj2);
                break;
            default:
                ((en1) obj).a((j01) obj2);
                break;
        }
    }
}
