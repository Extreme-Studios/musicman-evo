package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbub;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class in2 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public final Object h;

    public in2(ue0 ue0Var, Context context, cb1 cb1Var) {
        this.f = 29;
        this.g = context;
        this.h = cb1Var;
    }

    private final void a() {
        String string;
        o11 o11Var = (o11) this.g;
        j01 j01Var = (j01) this.h;
        ns0 ns0Var = o11Var.f;
        String str = o11Var.h;
        ns0Var.getClass();
        if (TextUtils.isEmpty(str) || ns0Var.a()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", j01Var.a);
            jSONObject2.put("signal_dictionary", ut0.f.a.k(j01Var.f));
            jSONObject.put("sr", jSONObject2);
            String str2 = j01Var.c;
            if (TextUtils.isEmpty(str2)) {
                string = "";
            } else {
                jSONObject.put("rs", Base64.encodeToString((str2 == null ? "" : zb3.I(str2, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2")).getBytes(StandardCharsets.UTF_8), 10));
                vc3.C.k.getClass();
                jSONObject.put("ts_ms", System.currentTimeMillis());
                string = jSONObject.toString();
            }
        } catch (JSONException e) {
            vc3.C.h.d("DiskCachingManager.createStringToWrite", e);
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        uk1 uk1Var = ns0Var.b;
        uk1Var.e();
        synchronized (uk1Var.d) {
            uk1Var.b.putString(str, string).commit();
        }
    }

    private final void b() {
        d91 d91Var = (d91) this.g;
        Bitmap bitmap = (Bitmap) this.h;
        d91Var.getClass();
        l13 l13Var = n13.g;
        m13 m13Var = new m13();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, m13Var);
        synchronized (d91Var.h) {
            n43 n43Var = d91Var.a;
            h53 h53VarZ = i53.z();
            n13 n13VarA = m13Var.a();
            h53VarZ.b();
            ((i53) h53VarZ.g).B(n13VarA);
            h53VarZ.b();
            ((i53) h53VarZ.g).A("image/png");
            h53VarZ.b();
            ((i53) h53VarZ.g).C(2);
            i53 i53Var = (i53) h53VarZ.c();
            n43Var.b();
            ((s53) n43Var.g).J(i53Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44 */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thC;
        pr prVar;
        lm lmVar;
        k52 k52Var;
        int i = 2;
        ?? r3 = 0;
        int i2 = 0;
        int i3 = 1;
        lm ue3Var = null;
        Object lt0Var = null;
        Application application = null;
        switch (this.f) {
            case 0:
                hn2 hn2Var = (hn2) this.h;
                Future future = (Future) this.g;
                if ((future instanceof nm2) && (thC = ((nm2) future).c()) != null) {
                    hn2Var.w(thC);
                    return;
                }
                try {
                    hn2Var.mo5e(na1.O(future));
                    return;
                } catch (ExecutionException e) {
                    hn2Var.w(e.getCause());
                    return;
                } catch (Throwable th) {
                    hn2Var.w(th);
                    return;
                }
            case 1:
                o1 o1Var = (o1) this.g;
                r1 r1Var = (r1) this.h;
                rr rrVar = r1Var.h;
                if (rrVar != null && (prVar = rrVar.e) != null) {
                    prVar.m(rrVar);
                }
                View view = (View) r1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (o1Var.b()) {
                        r1Var.x = o1Var;
                    } else if (o1Var.e != null) {
                        o1Var.d(0, 0, false, false);
                        r1Var.x = o1Var;
                    }
                }
                r1Var.z = null;
                return;
            case 2:
                ((y1) this.g).f = this.h;
                return;
            case 3:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((y1) this.h);
                return;
            case 4:
                Object obj = this.h;
                Object obj2 = this.g;
                try {
                    Method method = z1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        z1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 5:
                ((d6) ((zy1) this.g).g).b((Typeface) this.h);
                return;
            case 6:
                ?? r0 = (ArrayList) this.g;
                int size = r0.size();
                while (r3 < size) {
                    gb gbVar = (gb) r0.get(r3);
                    Object obj3 = ((jb) this.h).e;
                    gbVar.b = obj3;
                    gbVar.d(gbVar.d, obj3);
                    r3++;
                }
                return;
            case 7:
                ((id) this.h).g.d((Bundle) this.g);
                return;
            case 8:
                ro roVar = (ro) this.h;
                lc lcVar = roVar.h;
                while (true) {
                    try {
                        ((Runnable) this.g).run();
                    } catch (Throwable th3) {
                        ss0.o(jh.f, th3);
                    }
                    Runnable runnableG = roVar.g();
                    if (runnableG == null) {
                        return;
                    }
                    this.g = runnableG;
                    i2++;
                    if (i2 >= 16 && lcVar.c(roVar)) {
                        lcVar.a(roVar, this);
                        return;
                    }
                    break;
                }
                break;
            case 9:
                ((wi) this.g).accept(this.h);
                return;
            case 10:
                vz vzVar = (vz) this.g;
                try {
                    ((Runnable) this.h).run();
                    return;
                } finally {
                    vzVar.a();
                }
            case 11:
                db dbVar = (db) this.g;
                ba0 ba0Var = (ba0) this.h;
                t3 t3Var = (t3) ba0Var.g;
                z90 z90Var = (z90) ((dm) ba0Var.k).o.get((z3) ba0Var.h);
                if (z90Var == null) {
                    return;
                }
                if (dbVar.g != 0) {
                    z90Var.l(dbVar, null);
                    return;
                }
                ba0Var.f = true;
                if (t3Var.k()) {
                    if (!ba0Var.f || (lmVar = (lm) ba0Var.i) == null) {
                        return;
                    }
                    t3Var.l(lmVar, (Set) ba0Var.j);
                    return;
                }
                try {
                    t3Var.l(null, t3Var.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    t3Var.c("Failed to get service from broker.");
                    z90Var.l(new db(10), null);
                    return;
                }
            case 12:
                la0 la0Var = (la0) this.h;
                va0 va0Var = (va0) this.g;
                db dbVar2 = va0Var.g;
                if (dbVar2.g == 0) {
                    bb0 bb0Var = va0Var.h;
                    dq.f(bb0Var);
                    db dbVar3 = bb0Var.h;
                    if (dbVar3.g != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(dbVar3)), new Exception());
                        la0Var.m.a(dbVar3);
                        la0Var.l.o();
                        return;
                    }
                    ba0 ba0Var2 = la0Var.m;
                    IBinder iBinder = bb0Var.g;
                    if (iBinder != null) {
                        int i4 = d1.g;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        ue3Var = iInterfaceQueryLocalInterface instanceof lm ? (lm) iInterfaceQueryLocalInterface : new ue3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = la0Var.j;
                    ba0Var2.getClass();
                    if (ue3Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        ba0Var2.a(new db(4));
                    } else {
                        ba0Var2.i = ue3Var;
                        ba0Var2.j = set;
                        if (ba0Var2.f) {
                            ((t3) ba0Var2.g).l(ue3Var, set);
                        }
                    }
                } else {
                    la0Var.m.a(dbVar2);
                }
                la0Var.l.o();
                return;
            case 13:
                k2 k2Var = (k2) this.g;
                try {
                    k2Var.b.Z(gm.j(k2Var.a, (xx1) this.h));
                    return;
                } catch (RemoteException e4) {
                    jn.P("Failed to load ad.", e4);
                    return;
                }
            case 14:
                z61 z61Var = (z61) this.g;
                i61 i61Var = (i61) this.h;
                String str = qz1.a;
                d73 d73Var = (d73) z61Var.h;
                d73Var.getClass();
                w32 w32Var = new w32(8, i61Var);
                gr1 gr1Var = d73Var.f.s;
                gr1Var.c(25, w32Var);
                gr1Var.d();
                return;
            case 15:
                z61 z61Var2 = (z61) this.g;
                b03 b03Var = (b03) this.h;
                synchronized (b03Var) {
                }
                String str2 = qz1.a;
                z93 z93Var = ((d73) z61Var2.h).f.x;
                q93 q93VarX = z93Var.x((yd3) z93Var.i.j);
                z93Var.s(q93VarX, 1020, new rz1(q93VarX, b03Var));
                return;
            case 16:
                ep0 ep0Var = (ep0) this.g;
                uq1 uq1Var = ((uq1[]) this.h)[0];
                if (uq1Var != null) {
                    t52 t52Var = ep0Var.k;
                    kn2 kn2VarT = na1.t(uq1Var);
                    synchronized (t52Var) {
                        t52Var.a.addFirst(kn2VarT);
                    }
                    return;
                }
                return;
            case 17:
                try {
                    ((em0) this.h).g.put((mm0) this.g);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 18:
                au0 au0Var = (au0) this.h;
                View view2 = (View) this.g;
                au0Var.getClass();
                try {
                    wt0 wt0Var = new wt0(au0Var.k, au0Var.l, au0Var.m, au0Var.n, au0Var.o, au0Var.p, au0Var.q, au0Var.t);
                    qk qkVar = vc3.C.g;
                    synchronized (qkVar.g) {
                        try {
                            xt0 xt0Var = (xt0) qkVar.h;
                            if (xt0Var != null) {
                                application = xt0Var.g;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (application != null) {
                        String str3 = au0Var.r;
                        if (!TextUtils.isEmpty(str3)) {
                            String str4 = (String) view2.getTag(application.getResources().getIdentifier((String) tu0.e.c.a(lx0.h0), "id", application.getPackageName()));
                            if (str4 != null && str4.equals(str3)) {
                                return;
                            }
                        }
                    }
                    pt ptVarA = au0Var.a(view2, wt0Var);
                    wt0Var.b();
                    if (ptVarA.a == 0 && ptVarA.b == 0) {
                        return;
                    }
                    int i5 = ptVarA.b;
                    if (i5 != 0) {
                        if (i5 == 0) {
                        }
                        au0Var.i.t(wt0Var);
                        return;
                    } else if (wt0Var.k == 0) {
                        return;
                    }
                    um0 um0Var = au0Var.i;
                    synchronized (um0Var.g) {
                        try {
                            if (((LinkedList) um0Var.h).contains(wt0Var)) {
                                return;
                            }
                            au0Var.i.t(wt0Var);
                            return;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                } catch (Exception e5) {
                    jn.P("Exception in fetchContentOnUIThread", e5);
                    vc3.C.h.d("ContentFetchTask.fetchContent", e5);
                    return;
                }
            case 19:
                if (((yu0) this.h).isCancelled()) {
                    ((Future) this.g).cancel(true);
                    return;
                }
                return;
            case 20:
                boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.A5)).booleanValue();
                Context context = (Context) this.h;
                qk qkVar2 = (qk) this.g;
                if (zBooleanValue) {
                    try {
                        try {
                            IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i6 = mt0.f;
                            if (iBinderB != null) {
                                IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                lt0Var = iInterfaceQueryLocalInterface2 instanceof nt0 ? (nt0) iInterfaceQueryLocalInterface2 : new lt0(iBinderB, "com.google.android.gms.ads.clearcut.IClearcut", 2);
                            }
                            qkVar2.g = lt0Var;
                            ((lt0) ((nt0) qkVar2.g)).Z0(new ju(context));
                            qkVar2.f = true;
                            return;
                        } catch (RemoteException | NullPointerException | mb3 unused2) {
                            jn.F("Cannot dynamite load clearcut");
                            return;
                        }
                    } catch (Exception e6) {
                        throw new mb3(e6);
                    }
                }
                return;
            case zw0.zzm /* 21 */:
                a();
                return;
            case 22:
                t31 t31Var = (t31) this.h;
                uj1 uj1Var = (uj1) this.g;
                vc3.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    jn.p("loadJavascriptEngine > Before createJavascriptEngine");
                    k31 k31Var = new k31(uj1Var.a, (d60) uj1Var.d);
                    jn.p("loadJavascriptEngine > After createJavascriptEngine");
                    jn.p("loadJavascriptEngine > Before setting new engine loaded listener");
                    k31Var.f.e0().m = new kc2(15, new q31(uj1Var, arrayList, jCurrentTimeMillis, t31Var, k31Var));
                    jn.p("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    k31Var.p("/jsLoaded", new m31(uj1Var, jCurrentTimeMillis, t31Var, k31Var));
                    kc2 kc2Var = new kc2(18, (boolean) r3);
                    n31 n31Var = new n31(uj1Var, k31Var, kc2Var);
                    kc2Var.g = n31Var;
                    jn.p("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    k31Var.p("/requestReload", n31Var);
                    String str5 = (String) uj1Var.c;
                    jn.p("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str5)));
                    if (str5.endsWith(".js")) {
                        jn.p("loadJavascriptEngine > Before newEngine.loadJavascript");
                        jn.p("loadJavascript on adWebView from path: ".concat(str5));
                        k31.d(new i31(k31Var, "<!DOCTYPE html><html><head><script src=\"" + str5 + "\"></script></head><body></body></html>", r3));
                        jn.p("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str5.startsWith("<html>")) {
                        jn.p("loadJavascriptEngine > Before newEngine.loadHtml");
                        jn.p("loadHtml on adWebView from html");
                        k31.d(new i31(k31Var, str5, i3));
                        jn.p("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        jn.p("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        jn.p("loadHtmlWrapper on adWebView from path: ".concat(str5));
                        k31.d(new i31(k31Var, str5, i));
                        jn.p("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    jn.p("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    zb3.l.postDelayed(new p31(uj1Var, t31Var, k31Var, arrayList, jCurrentTimeMillis, 0), ((Integer) tu0.e.c.a(lx0.d)).intValue());
                    return;
                } catch (Throwable th6) {
                    jn.P("Error creating webview.", th6);
                    ix0 ix0Var = lx0.g8;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        t31Var.o("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th6);
                        return;
                    } else if (((Boolean) tu0Var.c.a(lx0.i8)).booleanValue()) {
                        vc3.C.h.e("SdkJavascriptFactory.loadJavascriptEngine", th6);
                        t31Var.n();
                        return;
                    } else {
                        vc3.C.h.d("SdkJavascriptFactory.loadJavascriptEngine", th6);
                        t31Var.n();
                        return;
                    }
                }
            case 23:
                h30 h30Var = (h30) this.g;
                String str6 = (String) this.h;
                WebView webView = h30Var.b;
                Context context2 = h30Var.a;
                Uri uriB = Uri.parse(str6);
                try {
                    uriB = (!((Boolean) tu0.e.c.a(lx0.Mc)).booleanValue() || (k52Var = h30Var.d) == null) ? h30Var.c.b(uriB, context2, webView, null) : k52Var.a(uriB, context2, webView, null);
                    break;
                } catch (ar0 e7) {
                    jn.H("Failed to append the click signal to URL: ", e7);
                    vc3.C.h.d("TaggingLibraryJsInterface.recordClick", e7);
                }
                h30Var.i.b(uriB.toString(), null, null, null);
                return;
            case 24:
                v33 v33Var = vc3.C.b;
                v33.a(((zzbub) this.h).a, (AdOverlayInfoParcel) this.g, true, null);
                return;
            case 25:
                ((id3) this.g).a((String) this.h, null);
                return;
            case 26:
                b();
                return;
            case 27:
                boolean z = ((ve3) this.g).d;
                tk1 tk1Var = (tk1) this.h;
                if (z) {
                    ((ve3) tk1Var.h).f();
                    return;
                }
                try {
                    ((ve3) ((tk1) this.h).h).e(((zb) tk1Var.i).c((ve3) this.g));
                    return;
                } catch (fy e8) {
                    boolean z2 = e8.getCause() instanceof Exception;
                    ve3 ve3Var = (ve3) ((tk1) this.h).h;
                    if (z2) {
                        ve3Var.d((Exception) e8.getCause());
                        return;
                    } else {
                        ve3Var.d(e8);
                        return;
                    }
                } catch (Exception e9) {
                    ((ve3) ((tk1) this.h).h).d(e9);
                    return;
                }
            case 28:
                Context context3 = (Context) this.g;
                km1 km1Var = (km1) this.h;
                na1.f = (AudioManager) context3.getSystemService("audio");
                km1Var.a();
                return;
            default:
                cb1 cb1Var = (cb1) this.h;
                try {
                    cb1Var.b(x2.a((Context) this.g));
                    return;
                } catch (em | IOException | IllegalStateException e10) {
                    cb1Var.c(e10);
                    jn.P("Exception while getting advertising Id info", e10);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                p83 p83Var = new p83(in2.class.getSimpleName());
                hn2 hn2Var = (hn2) this.h;
                vg2 vg2Var = new vg2(22);
                ((vg2) p83Var.i).h = vg2Var;
                p83Var.i = vg2Var;
                vg2Var.g = hn2Var;
                return p83Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ in2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ in2(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
