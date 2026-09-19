package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.webkit.ProfileStore;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ va1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    private final /* synthetic */ void a() {
        qj1 qj1Var = (qj1) this.g;
        synchronized (qj1Var.f) {
            try {
                if (qj1Var.n) {
                    return;
                }
                qj1Var.n = true;
                qj1Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        ik1 ik1Var = (ik1) this.g;
        synchronized (ik1Var) {
            jn.M("Timeout waiting for show call succeed to be called.");
            ik1Var.P(new on1("Timeout for show call succeed."));
            ik1Var.j = true;
        }
    }

    private final void c() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        rt1 rt1Var = (rt1) this.g;
        md1 md1Var = rt1Var.i;
        qt1 qt1Var = rt1Var.h;
        synchronized (qt1Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    String str = qt1Var.k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append("afma-sdk-a-v");
                        sb.append(str);
                        jSONObject.put("sdkVersion", sb.toString());
                    }
                    jSONObject.put("internalSdkVersion", qt1Var.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", qt1Var.d.a());
                    ix0 ix0Var = lx0.ja;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        String str2 = vc3.C.h.g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j = qt1Var.q;
                    vc3 vc3Var = vc3.C;
                    vc3Var.k.getClass();
                    if (j < System.currentTimeMillis() / 1000) {
                        qt1Var.o = "{}";
                    }
                    jSONObject.put("networkExtras", qt1Var.o);
                    jSONObject.put("adSlots", qt1Var.i());
                    jSONObject.put("appInfo", qt1Var.e.a());
                    String str3 = vc3Var.h.g().m().e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) tu0Var.c.a(lx0.Y9)).booleanValue() && (jSONObject2 = qt1Var.p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 13);
                        sb2.append("Server data: ");
                        sb2.append(string);
                        jn.F(sb2.toString());
                        jSONObject.put("serverData", qt1Var.p);
                    }
                    if (((Boolean) tu0Var.c.a(lx0.X9)).booleanValue()) {
                        jSONObject.put("openAction", qt1Var.v);
                        jSONObject.put("gesture", qt1Var.r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", vc3Var.o.g());
                    f32 f32Var = ut0.f.a;
                    jSONObject.put("isSimulator", f32.o());
                    if (((Boolean) tu0Var.c.a(lx0.la)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(qt1Var.x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) tu0Var.c.a(lx0.na))) {
                        jSONObject.put("gmaDisk", (JSONObject) qt1Var.h.b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) tu0Var.c.a(lx0.ma))) {
                        jSONObject.put("userDisk", (JSONObject) qt1Var.g.b);
                    }
                } catch (JSONException e) {
                    vc3.C.h.e("Inspector.toJson", e);
                    jn.V("Ad inspector encountered an error", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        md1Var.s("window.inspectorInfo", jSONObject.toString());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0017, B:8:0x001b, B:13:0x0024, B:19:0x0030, B:21:0x0034, B:23:0x003a, B:25:0x0044, B:27:0x004e, B:29:0x005f, B:28:0x0053, B:30:0x0061, B:32:0x0070, B:34:0x0078), top: B:42:0x0017 }] */
    private final void d() {
        String strA;
        TelephonyManager telephonyManager;
        ku1 ku1Var = (ku1) this.g;
        jg3 jg3Var = (jg3) ku1Var.a.get();
        if (jg3Var != null) {
            int iB = ku1Var.c.b();
            kg3 kg3Var = jg3Var.a;
            synchronized (kg3Var) {
                try {
                    if (kg3Var.q != iB || kg3Var.r == null) {
                        kg3Var.q = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (kg3Var.r == null) {
                                Context context = kg3Var.f;
                                String str = qz1.a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strA = dq.A(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strA = dq.A(Locale.getDefault().getCountry());
                                    } else {
                                        strA = dq.A(networkCountryIso);
                                    }
                                }
                                kg3Var.r = strA;
                            }
                            kg3Var.o = kg3Var.b(iB);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            kg3Var.a(kg3Var.j > 0 ? (int) (jElapsedRealtime - kg3Var.k) : 0, kg3Var.l, kg3Var.o);
                            kg3Var.k = jElapsedRealtime;
                            kg3Var.l = 0L;
                            kg3Var.n = 0L;
                            kg3Var.m = 0L;
                            aq aqVar = kg3Var.i;
                            ((ArrayList) aqVar.f).clear();
                            aqVar.b = -1;
                            aqVar.c = 0;
                            aqVar.d = 0;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final /* synthetic */ void e() {
        zt1 zt1Var = (zt1) this.g;
        AtomicReference atomicReference = zt1Var.d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zt1Var.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        es1 es1Var;
        long j;
        long j2;
        long j3;
        ProfileStore profileStore;
        ProfileStore profileStore2 = null;
        int i = 0;
        int i2 = 1;
        switch (this.f) {
            case 0:
                ((AtomicBoolean) this.g).getAndSet(true);
                return;
            case 1:
                wa1 wa1Var = (wa1) this.g;
                while (wa1Var.d.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    zb3.l.post(new va1(i, atomicBoolean));
                    try {
                        Thread.sleep(wa1Var.e);
                        if (!atomicBoolean.get()) {
                            if (((Boolean) tu0.e.c.a(lx0.ve)).booleanValue() && (es1Var = wa1Var.b) != null) {
                                us2 us2VarA = es1Var.a();
                                us2VarA.s("action", "paa");
                                us2VarA.y();
                            }
                        }
                        do {
                            try {
                                Thread.sleep(wa1Var.f);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 2:
                ((lb1) this.g).g();
                return;
            case 3:
                vc3.C.A.f.remove((fc1) this.g);
                return;
            case 4:
                tc1 tc1Var = (tc1) this.g;
                String strO = tc1.o(tc1Var.j);
                try {
                    ix0 ix0Var = lx0.J;
                    tu0 tu0Var = tu0.e;
                    long jLongValue = ((Long) tu0Var.c.a(ix0Var)).longValue() * 1000;
                    long jIntValue = ((Integer) tu0Var.c.a(lx0.v)).intValue();
                    boolean zBooleanValue = ((Boolean) tu0Var.c.a(lx0.Y1)).booleanValue();
                    synchronized (tc1Var) {
                        vc3.C.k.getClass();
                        if (System.currentTimeMillis() - tc1Var.n > jLongValue) {
                            StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                            sb.append("Timeout reached. Limit: ");
                            sb.append(jLongValue);
                            sb.append(" ms");
                            throw new IOException(sb.toString());
                        }
                        if (tc1Var.k) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!tc1Var.l) {
                            d93 d93Var = tc1Var.i.l;
                            if (!(d93Var != null)) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jR1 = d93Var.R1();
                            if (jR1 > 0) {
                                long jS1 = tc1Var.i.l.S1();
                                if (jS1 != tc1Var.o) {
                                    boolean z = jS1 > 0;
                                    String str = tc1Var.j;
                                    if (zBooleanValue) {
                                        ed1 ed1Var = tc1Var.i;
                                        j3 = (ed1Var.x == null || !ed1Var.x.u) ? ed1Var.p : 0L;
                                    } else {
                                        j3 = -1;
                                    }
                                    j = jS1;
                                    j2 = jR1;
                                    f32.b.post(new ic1(tc1Var, str, strO, j, j2, j3, zBooleanValue ? tc1Var.i.q() : -1L, zBooleanValue ? tc1Var.i.r() : -1L, z, ed1.z.get(), ed1.A.get()));
                                    tc1Var.o = j;
                                } else {
                                    j = jS1;
                                    j2 = jR1;
                                }
                                if (j >= j2) {
                                    f32.b.post(new nc1(tc1Var, tc1Var.j, strO, j2));
                                } else if (tc1Var.i.p >= jIntValue && j > 0) {
                                }
                            } else {
                                tu0Var = tu0Var;
                            }
                            zb3.l.postDelayed(new va1(4, tc1Var), ((Long) tu0Var.c.a(lx0.K)).longValue());
                            return;
                        }
                        vc3.C.A.f.remove(tc1Var.m);
                        return;
                    }
                } catch (Exception e) {
                    String str2 = tc1Var.j;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(message).length());
                    sb2.append("Failed to preload url ");
                    sb2.append(str2);
                    sb2.append(" Exception: ");
                    sb2.append(message);
                    jn.T(sb2.toString());
                    vc3.C.h.e("VideoStreamExoPlayerCache.preload", e);
                    tc1Var.a();
                    tc1Var.m(tc1Var.j, strO, "error", tc1.p("error", e));
                }
                break;
            case 5:
                yd1 yd1Var = ((he1) this.g).f;
                i4 i4Var = yd1Var.f.U;
                i4Var.e = true;
                if (i4Var.d) {
                    i4Var.d();
                }
                nf0 nf0VarX0 = yd1Var.f.x0();
                if (nf0VarX0 != null) {
                    nf0VarX0.q.removeView(nf0VarX0.k);
                    nf0VarX0.G3(true);
                    return;
                }
                return;
            case 6:
                int i3 = he1.M;
                mx0 mx0VarA = vc3.C.h.a();
                String str3 = (String) this.g;
                if (((HashSet) mx0VarA.h).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) mx0VarA.f);
                linkedHashMap.put("ue", str3);
                mx0VarA.d(mx0VarA.b((LinkedHashMap) mx0VarA.c, linkedHashMap), null);
                return;
            case 7:
                el1 el1Var = vc3.C.x;
                x82 x82Var = ((qw1) this.g).a;
                el1Var.getClass();
                el1.n(new iw1(x82Var, i2));
                return;
            case 8:
                qe1 qe1Var = (qe1) this.g;
                es1 es1Var2 = qe1Var.b;
                vc3.C.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                me1 me1Var = qe1Var.a;
                me1Var.getClass();
                if (!na1.k("MULTI_PROFILE")) {
                    jn.F("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                    break;
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                    jn.F("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                        jn.F("Unable to get ProfileStore instance: ".concat(String.valueOf(e3.getMessage())));
                    }
                    break;
                }
                profileStore2 = profileStore;
                if (profileStore2 == null) {
                    jn.T("WebViewCompat failure: No instance");
                    if (((Boolean) tu0.e.c.a(lx0.Be)).booleanValue()) {
                        us2 us2VarA2 = es1Var2.a();
                        us2VarA2.s("action", "webview_p_f");
                        us2VarA2.s("webview_p_f", "No instance");
                        us2VarA2.t();
                        return;
                    }
                    return;
                }
                me1Var.a = profileStore2.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) tu0.e.c.a(lx0.Be)).booleanValue()) {
                    vc3.C.k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    us2 us2VarA3 = es1Var2.a();
                    us2VarA3.s("action", "webview_p_l");
                    us2VarA3.s("webview_p_l", Long.toString(jElapsedRealtime2));
                    us2VarA3.t();
                    return;
                }
                return;
            case 9:
                ((se1) this.g).a();
                return;
            case 10:
                ((bh1) this.g).g.d.i();
                return;
            case 11:
                ih1 ih1Var = ((bh1) this.g).g.d;
                synchronized (ih1Var) {
                    ih1Var.a();
                    ih1Var.n = true;
                }
                return;
            case 12:
                sh1 sh1Var = (sh1) this.g;
                v01 v01Var = sh1Var.q.d;
                if (v01Var == null) {
                    return;
                }
                try {
                    n71 n71Var = (n71) sh1Var.s.c();
                    ju juVar = new ju(sh1Var.l);
                    Parcel parcelU = v01Var.U();
                    kt0.e(parcelU, n71Var);
                    kt0.e(parcelU, juVar);
                    v01Var.K0(parcelU, 1);
                    return;
                } catch (RemoteException e4) {
                    jn.P("RemoteException when notifyAdLoad is called", e4);
                    return;
                }
            case 13:
                ((si1) this.g).c = false;
                return;
            case 14:
                dj1 dj1Var = (dj1) this.g;
                i8.G(dj1Var.h);
                dj1Var.m = true;
                return;
            case 15:
                nj1 nj1Var = (nj1) this.g;
                synchronized (nj1Var) {
                    try {
                        tn2 tn2Var = nj1Var.k;
                        if (tn2Var.isDone()) {
                            return;
                        }
                        tn2Var.d(Boolean.TRUE);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                ((uo1) this.g).c();
                return;
            case 19:
                zo1 zo1Var = (zo1) this.g;
                if (zo1Var.l == null) {
                    View view = new View(zo1Var.i.getContext());
                    zo1Var.l = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (zo1Var.i != zo1Var.l.getParent()) {
                    zo1Var.i.addView(zo1Var.l);
                    return;
                }
                return;
            case 20:
                kq1 kq1Var = (kq1) this.g;
                try {
                    kq1Var.getClass();
                    dq.d("#008 Must be called on the main UI thread.");
                    kq1Var.C3();
                    no1 no1Var = kq1Var.h;
                    if (no1Var != null) {
                        no1Var.o();
                    }
                    kq1Var.h = null;
                    kq1Var.f = null;
                    kq1Var.g = null;
                    kq1Var.i = true;
                    return;
                } catch (RemoteException e5) {
                    jn.Z("#007 Could not call remote method.", e5);
                    return;
                }
            case zw0.zzm /* 21 */:
                String str4 = vc3.C.h.g().m().e;
                boolean zIsEmpty = TextUtils.isEmpty(str4);
                cb1 cb1Var = (cb1) this.g;
                if (zIsEmpty) {
                    cb1Var.c(new Exception());
                    return;
                } else {
                    cb1Var.b(str4);
                    return;
                }
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                e();
                return;
            case 25:
                ((su1) this.g).a();
                return;
            case 26:
                ((su1) this.g).a();
                return;
            case 27:
                p83 p83Var = (p83) this.g;
                if1 if1Var = ((if1) p83Var.h).b;
                dq.F((Context) p83Var.g, Context.class);
                dr0 dr0Var = new dr0(if1Var);
                q63 q63Var = if1Var.j;
                ue1 ue1Var = if1Var.a;
                u91 u91Var = (u91) dr0Var.g;
                Context context = ue1Var.b;
                dq.D(context);
                ya1 ya1Var = za1.b;
                dq.D(ya1Var);
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                o63 o63VarB = q63.b(u91Var);
                d60 d60Var = ue1Var.a;
                dq.D(d60Var);
                r52 r52Var = new r52(context, ya1Var, ya1Var2, o63VarB, d60Var, dr0Var, (es1) q63Var.c());
                zb3 zb3Var = vc3.C.c;
                if (zb3.e(context.getPackageName())) {
                    ya1Var2.execute(new va1(28, r52Var));
                    return;
                }
                kc2 kc2Var = new kc2(25, r52Var);
                dq.D(context);
                dq.D(d60Var);
                ya1Var.execute(new va1(29, new tu1(context, d60Var, kc2Var)));
                return;
            case 28:
                ((r52) this.g).P();
                return;
            default:
                tu1 tu1Var = (tu1) this.g;
                synchronized (tu1Var.g) {
                    try {
                        if (tu1Var.h) {
                            return;
                        }
                        tu1Var.h = true;
                        vu0 vu0Var = new vu0(tu1Var.l, vc3.C.t.c(), tu1Var, tu1Var, 2);
                        tu1Var.k = vu0Var;
                        vu0Var.m();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
