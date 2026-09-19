package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ib implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public ib(au0 au0Var, wt0 wt0Var, WebView webView, boolean z) {
        this.f = 8;
        this.h = webView;
        this.i = au0Var;
        this.g = new zt0(this, wt0Var, webView, z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        om0 om0Var;
        Object objCall = null;
        boolean zBooleanValue = true;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        switch (this.f) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.i;
                Context context = (Context) this.h;
                Intent intent = (Intent) this.g;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    yp.d().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    hv.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    hv.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    hv.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    hv.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                try {
                    zBooleanValue = ((Boolean) ((xz) this.i).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((yv) this.g).a((String) this.h, zBooleanValue);
                return;
            case 2:
                try {
                    objCall = ((vi) this.g).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.i).post(new in2((wi) this.h, 9, objCall));
                return;
            case 3:
                ((g90) this.g).e.e((String) this.h, (ig) this.i);
                return;
            case 4:
                j90 j90VarK = ((WorkDatabase) this.g).h().k((String) this.h);
                if (j90VarK == null || kb.i.equals(j90VarK.j)) {
                    return;
                }
                synchronized (((x20) this.i).h) {
                    ((x20) this.i).k.put((String) this.h, j90VarK);
                    ((x20) this.i).l.add(j90VarK);
                    x20 x20Var = (x20) this.i;
                    x20Var.m.b(x20Var.l);
                    break;
                }
                return;
            case 5:
                new z61((Context) this.h, false ? 1 : 0, ((q2) this.g).a).E((fw) this.i);
                return;
            case 6:
                z61 z61Var = (z61) this.g;
                final de3 de3Var = (de3) this.h;
                final k03 k03Var = (k03) this.i;
                z61Var.getClass();
                String str = qz1.a;
                z93 z93Var = ((d73) z61Var.h).f.x;
                final q93 q93VarY = z93Var.y();
                final int i = false ? 1 : 0;
                z93Var.s(q93VarY, 1017, new hp1(q93VarY, de3Var, k03Var, i) { // from class: s93
                    public final /* synthetic */ int f;
                    public final /* synthetic */ de3 g;

                    {
                        this.f = i;
                        this.g = de3Var;
                    }

                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj) {
                        r93 r93Var = (r93) obj;
                        switch (this.f) {
                            case 0:
                                r93Var.l(this.g);
                                break;
                            default:
                                r93Var.g(this.g);
                                break;
                        }
                    }
                });
                return;
            case 7:
                mm0 mm0Var = (mm0) this.g;
                synchronized (mm0Var.j) {
                    break;
                }
                md mdVar = (md) this.h;
                qm0 qm0Var = (qm0) mdVar.i;
                if (qm0Var == null) {
                    mm0Var.i(mdVar.g);
                } else {
                    synchronized (mm0Var.j) {
                        om0Var = mm0Var.k;
                        break;
                    }
                    om0Var.d(qm0Var);
                }
                if (mdVar.f) {
                    mm0Var.a("intermediate-response");
                } else {
                    mm0Var.b("done");
                }
                Runnable runnable = (Runnable) this.i;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                zt0 zt0Var = (zt0) this.g;
                WebView webView = (WebView) this.h;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zt0Var);
                        return;
                    } catch (Throwable unused3) {
                        zt0Var.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 9:
                h30 h30Var = (h30) this.g;
                Bundle bundle = (Bundle) this.h;
                zx0 zx0Var = (zx0) this.i;
                r53 r53Var = vc3.C.f;
                Context context2 = h30Var.a;
                CookieManager cookieManagerC = r53Var.c();
                bundle.putBoolean("accept_3p_cookie", cookieManagerC != null ? cookieManagerC.acceptThirdPartyCookies(h30Var.b) : false);
                s70.h(context2, new q2((p2) new p2(1).f1(bundle)), zx0Var);
                return;
            case 10:
                pb1 pb1Var = ((kb1) this.i).v;
                if (pb1Var != null) {
                    pb1Var.c("error", "what", (String) this.g, "extra", (String) this.h);
                    return;
                }
                return;
            case 11:
                ((de1) this.g).P((String) this.h, (ValueCallback) this.i);
                return;
            case 12:
                qe1 qe1Var = (qe1) this.g;
                Context context3 = (Context) this.h;
                d60 d60Var = (d60) this.i;
                vc3 vc3Var = vc3.C;
                vc3Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                vc3Var.c.E(context3, d60Var.f);
                ix0 ix0Var = lx0.xe;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    vc3Var.k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    us2 us2VarA = qe1Var.b.a();
                    us2VarA.s("action", "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb.append(jElapsedRealtime2);
                    us2VarA.s("webview_startup_l", sb.toString());
                    us2VarA.t();
                }
                if (((Boolean) tu0Var.c.a(lx0.De)).booleanValue()) {
                    za1.f.execute(new va1(8, qe1Var));
                    return;
                }
                return;
            case 13:
                ((f82) this.g).b((String) this.h, (j52) this.i, null, null);
                return;
            case 14:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.g;
                String str2 = (String) this.h;
                id3 id3Var = (id3) this.i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                bw1.c(sQLiteDatabase, id3Var);
                return;
            case 15:
                ny1.c((e52) this.g, (x42) this.h, (ww1) this.i);
                return;
            case 16:
                hg2 hg2Var = (hg2) this.g;
                kd0 kd0Var = (kd0) this.h;
                fe2 fe2Var = (fe2) this.i;
                if (!hg2Var.a.a(kd0Var)) {
                    throw new na(2);
                }
                hg2Var.g.set("2.".concat(String.valueOf(fe2Var.z().z())));
                return;
            case 17:
                ig2 ig2Var = (ig2) this.g;
                HashMap map = (HashMap) this.i;
                Context context4 = (Context) this.h;
                map.putAll(ig2Var.d.a());
                ig2Var.g(map);
                map.put("f", "q");
                map.put("ctx", context4);
                return;
            case 18:
                oh2 oh2Var = (oh2) this.g;
                ih2 ih2Var = (ih2) this.h;
                s62 s62Var = (s62) this.i;
                String str3 = oh2Var.b;
                try {
                    qx1 qx1Var = oh2Var.a;
                    if (qx1Var == null) {
                        throw null;
                    }
                    hh2 hh2Var = (hh2) qx1Var.o;
                    if (hh2Var == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str3);
                    String str4 = ih2Var.a;
                    if (!oh2.b(str4)) {
                        str4.getClass();
                        bundle2.putString("sessionToken", str4.trim());
                    }
                    String str5 = ih2Var.b;
                    if (!oh2.b(str5)) {
                        str5.getClass();
                        bundle2.putString("appId", str5.trim());
                    }
                    nh2 nh2Var = new nh2(oh2Var, s62Var);
                    fh2 fh2Var = (fh2) hh2Var;
                    Parcel parcelU = fh2Var.U();
                    kt0.c(parcelU, bundle2);
                    kt0.e(parcelU, nh2Var);
                    fh2Var.O0(parcelU, 2);
                    return;
                } catch (RemoteException e) {
                    oh2.c.g(e, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 19:
                oh2 oh2Var2 = (oh2) this.g;
                kh2 kh2Var = (kh2) this.h;
                s62 s62Var2 = (s62) this.i;
                String str6 = oh2Var2.b;
                try {
                    qx1 qx1Var2 = oh2Var2.a;
                    if (qx1Var2 == null) {
                        throw null;
                    }
                    hh2 hh2Var2 = (hh2) qx1Var2.o;
                    if (hh2Var2 == null) {
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("callerPackage", str6);
                    bundle3.putBinder("windowToken", kh2Var.a);
                    String str7 = kh2Var.f;
                    if (!oh2.b(str7)) {
                        str7.getClass();
                        bundle3.putString("adFieldEnifd", str7.trim());
                    }
                    bundle3.putInt("layoutGravity", kh2Var.c);
                    bundle3.putFloat("layoutVerticalMargin", kh2Var.d);
                    bundle3.putInt("displayMode", 0);
                    bundle3.putInt("triggerMode", 0);
                    bundle3.putInt("windowWidthPx", kh2Var.e);
                    if (!oh2.b(null) || !oh2.b(null)) {
                        throw null;
                    }
                    String str8 = kh2Var.b;
                    if (!oh2.b(str8)) {
                        str8.getClass();
                        bundle3.putString("appId", str8.trim());
                    }
                    if (!oh2.b(null)) {
                        throw null;
                    }
                    bundle3.putBoolean("stableSessionToken", true);
                    nh2 nh2Var2 = new nh2(oh2Var2, s62Var2);
                    fh2 fh2Var2 = (fh2) hh2Var2;
                    Parcel parcelU2 = fh2Var2.U();
                    parcelU2.writeString(str6);
                    kt0.c(parcelU2, bundle3);
                    kt0.e(parcelU2, nh2Var2);
                    fh2Var2.O0(parcelU2, 1);
                    return;
                } catch (RemoteException e2) {
                    oh2.c.g(e2, "show overlay display from: %s", str6);
                    return;
                }
            case 20:
                j83 j83Var = (j83) this.g;
                sj2 sj2Var = (sj2) this.h;
                yd3 yd3Var = (yd3) this.i;
                z93 z93Var2 = j83Var.c;
                qk2 qk2VarF = sj2Var.f();
                t33 t33Var = z93Var2.l;
                t33Var.getClass();
                es0 es0Var = z93Var2.i;
                es0Var.getClass();
                es0Var.g = vj2.m(qk2VarF);
                if (!qk2VarF.isEmpty()) {
                    es0Var.j = (yd3) qk2VarF.get(0);
                    yd3Var.getClass();
                    es0Var.k = yd3Var;
                }
                if (((yd3) es0Var.i) == null) {
                    es0Var.i = es0.B(t33Var, (vj2) es0Var.g, (yd3) es0Var.j, (su0) es0Var.f);
                }
                es0Var.z(t33Var.G1());
                return;
            case zw0.zzm /* 21 */:
                Pair pair = (Pair) this.h;
                ((z93) ((n83) this.g).g.n).p(((Integer) pair.first).intValue(), (yd3) pair.second, (vd3) this.i);
                return;
            case 22:
                x93 x93Var = (x93) this.g;
                Object obj = this.h;
                Pair pair2 = (Pair) this.i;
                if (obj instanceof WebView) {
                    Context context5 = x93Var.c;
                    CookieManager cookieManagerC2 = vc3.C.f.c();
                    if (cookieManagerC2 != null) {
                        zAcceptThirdPartyCookies = cookieManagerC2.acceptThirdPartyCookies((WebView) obj);
                    }
                }
                HashMap map2 = x93Var.a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                ta3 ta3Var = (ta3) map2.get(boolValueOf);
                if (ta3Var != null) {
                    vc3.C.k.getClass();
                    if (ta3Var.c > System.currentTimeMillis()) {
                        x93Var.e(ta3Var, pair2, true);
                        return;
                    }
                }
                HashMap map3 = x93Var.b;
                List arrayList = (List) map3.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map3.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
                return;
            case 23:
                un1 un1Var = (un1) this.g;
                final de3 de3Var2 = (de3) this.h;
                final k03 k03Var2 = (k03) this.i;
                un1Var.getClass();
                String str9 = qz1.a;
                z93 z93Var3 = ((d73) un1Var.h).f.x;
                final q93 q93VarY2 = z93Var3.y();
                final char c = 1 == true ? 1 : 0;
                z93Var3.s(q93VarY2, 1009, new hp1(q93VarY2, de3Var2, k03Var2, c) { // from class: s93
                    public final /* synthetic */ int f;
                    public final /* synthetic */ de3 g;

                    {
                        this.f = c;
                        this.g = de3Var2;
                    }

                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj2) {
                        r93 r93Var = (r93) obj2;
                        switch (this.f) {
                            case 0:
                                r93Var.l(this.g);
                                break;
                            default:
                                r93Var.g(this.g);
                                break;
                        }
                    }
                });
                return;
            case 24:
                ba0 ba0Var = (ba0) this.g;
                String str10 = (String) this.h;
                HashMap map4 = (HashMap) this.i;
                md1 md1Var = (md1) ba0Var.i;
                if (md1Var != null) {
                    md1Var.a(str10, map4);
                    return;
                }
                return;
            default:
                String str11 = (String) this.h;
                Pair[] pairArr = (Pair[]) this.i;
                hs1 hs1Var = (hs1) this.g;
                hs1Var.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(hs1Var.a);
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str11)) {
                    concurrentHashMap.put("action", str11);
                }
                for (Pair pair3 : pairArr) {
                    String str12 = (String) pair3.first;
                    String str13 = (String) pair3.second;
                    if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                        concurrentHashMap.put(str12, str13);
                    }
                }
                hs1Var.a(concurrentHashMap, false);
                return;
        }
    }

    public /* synthetic */ ib(int i, Object obj, Object obj2, String str) {
        this.f = i;
        this.i = obj;
        this.g = obj2;
        this.h = str;
    }

    public /* synthetic */ ib(Context context, q2 q2Var, fw fwVar) {
        this.f = 5;
        this.h = context;
        this.g = q2Var;
        this.i = fwVar;
    }

    public /* synthetic */ ib(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public /* synthetic */ ib(ig2 ig2Var, HashMap map, Context context) {
        this.f = 17;
        this.g = ig2Var;
        this.i = map;
        this.h = context;
    }

    public /* synthetic */ ib(int i) {
        this.f = i;
    }
}
