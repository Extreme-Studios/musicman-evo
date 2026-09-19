package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m11 implements v11 {
    public static final /* synthetic */ m11 g = new m11(20);
    public static final /* synthetic */ m11 h = new m11(21);
    public static final /* synthetic */ m11 i = new m11(22);
    public static final /* synthetic */ m11 j = new m11(23);
    public static final /* synthetic */ m11 k = new m11(24);
    public static final /* synthetic */ m11 l = new m11(27);
    public final /* synthetic */ int f;

    public /* synthetic */ m11(int i2) {
        this.f = i2;
    }

    private final void a(Object obj, Map map) {
        pc1 pc1Var;
        fc1 fc1Var;
        qc1 qc1Var;
        pc1 sc1Var;
        md1 md1Var = (md1) obj;
        if (jn.a0(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            jn.F("Precache GMSG: ".concat(jSONObject.toString()));
        }
        gc1 gc1Var = vc3.C.A;
        if (map.containsKey("abort")) {
            if (gc1Var.a(md1Var)) {
                return;
            }
            jn.T("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numB = b("periodicReportIntervalMs", map);
        b("exoPlayerRenderingIntervalMs", map);
        b("exoPlayerIdleIntervalMs", map);
        ub1 ub1Var = new ub1((String) map.get("flags"));
        fc1 fc1Var2 = null;
        int i2 = 0;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    jn.T("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (ub1Var.k) {
                ArrayList arrayList = gc1Var.f;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        fc1Var = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    fc1Var = (fc1) obj2;
                    if (fc1Var.h == md1Var && str.equals(fc1Var.j)) {
                        break;
                    }
                }
            } else {
                ArrayList arrayList2 = gc1Var.f;
                int size2 = arrayList2.size();
                int i5 = 0;
                do {
                    if (i5 >= size2) {
                        fc1Var = null;
                        break;
                    } else {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        fc1Var = (fc1) obj3;
                    }
                } while (fc1Var.h != md1Var);
            }
            if (fc1Var != null) {
                jn.T("Precache task is already running.");
                return;
            }
            if (md1Var.k() == null) {
                jn.T("Precache requires a dependency provider.");
                return;
            }
            Integer numB2 = b("player", map);
            if (numB2 == null) {
                numB2 = 0;
            }
            if (numB != null) {
                md1Var.a1(numB.intValue());
            }
            int iIntValue = numB2.intValue();
            Object obj4 = md1Var.k().h;
            if (iIntValue > 0) {
                int i6 = ed1.A.get();
                if (i6 < ub1Var.g) {
                    tc1 tc1Var = new tc1(md1Var);
                    ed1 ed1Var = new ed1(md1Var.getContext(), ub1Var, (md1) tc1Var.h.get(), null);
                    jn.R("ExoPlayerAdapter initialized.");
                    tc1Var.i = ed1Var;
                    ed1Var.o = tc1Var;
                    sc1Var = tc1Var;
                } else {
                    if (((Boolean) tu0.e.c.a(lx0.q)).booleanValue()) {
                        i6 = sc1.t.get();
                    }
                    sc1Var = i6 < ub1Var.b ? new sc1(md1Var, ub1Var) : new rc1(md1Var);
                }
            } else {
                qc1Var = new qc1(md1Var);
                File cacheDir = qc1Var.f.getCacheDir();
                if (cacheDir == null) {
                    jn.T("Context.getCacheDir() returned null");
                    sc1Var = qc1Var;
                } else {
                    File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                    qc1Var.i = file;
                    if (!file.isDirectory() && !file.mkdirs()) {
                        jn.T("Could not create preload cache directory at ".concat(String.valueOf(file.getAbsolutePath())));
                        qc1Var.i = null;
                        sc1Var = qc1Var;
                    } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                        sc1Var = qc1Var;
                        jn.T("Could not set cache file permissions at ".concat(String.valueOf(file.getAbsolutePath())));
                        qc1Var.i = null;
                        sc1Var = qc1Var;
                    }
                }
            }
            sc1Var = qc1Var;
            new fc1(md1Var, sc1Var, str, strArr).o1();
            pc1Var = sc1Var;
        } else {
            ArrayList arrayList3 = gc1Var.f;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj5 = arrayList3.get(i2);
                i2++;
                fc1 fc1Var3 = (fc1) obj5;
                if (fc1Var3.h == md1Var) {
                    fc1Var2 = fc1Var3;
                    break;
                }
            }
            if (fc1Var2 == null) {
                jn.T("Precache must specify a source.");
                return;
            }
            pc1Var = fc1Var2.i;
        }
        Integer numB3 = b("minBufferMs", map);
        if (numB3 != null) {
            pc1Var.i(numB3.intValue());
        }
        Integer numB4 = b("maxBufferMs", map);
        if (numB4 != null) {
            pc1Var.h(numB4.intValue());
        }
        Integer numB5 = b("bufferForPlaybackMs", map);
        if (numB5 != null) {
            pc1Var.j(numB5.intValue());
        }
        Integer numB6 = b("bufferForPlaybackAfterRebufferMs", map);
        if (numB6 != null) {
            pc1Var.k(numB6.intValue());
        }
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            jn.T(sb.toString());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0330  */
    /* JADX WARN: Code duplicated, block: B:106:0x0333  */
    /* JADX WARN: Code duplicated, block: B:268:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:269:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:272:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0304  */
    /* JADX WARN: Code duplicated, block: B:98:0x030d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        JSONObject jSONObjectH;
        JSONObject jSONObjectMo15l;
        s62 s62Var;
        s62 s62Var2;
        s62 s62Var3;
        String str;
        String str2;
        ih2 ih2Var;
        s62 s62Var4;
        oh2 oh2Var;
        qx1 qx1Var;
        char c;
        char c2;
        Intent uri;
        Intent intent;
        ResolveInfo resolveInfoResolveActivity;
        boolean z;
        String[] strArrSplit;
        char c3 = 0;
        char c4 = 1;
        int i2 = 0;
        switch (this.f) {
            case 0:
                md1 md1Var = (md1) obj;
                WindowManager windowManager = (WindowManager) md1Var.getContext().getSystemService("window");
                zb3 zb3Var = vc3.C.c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i3 = displayMetrics.widthPixels;
                int i4 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                HashMap map2 = new HashMap();
                ((View) md1Var).getLocationInWindow(iArr);
                map2.put("xInPixels", Integer.valueOf(iArr[0]));
                ec.p(iArr[1], map2, "yInPixels", i3, "windowWidthInPixels");
                map2.put("windowHeightInPixels", Integer.valueOf(i4));
                md1Var.a("locationReady", map2);
                jn.T("GET LOCATION COMPILED");
                return;
            case 1:
                md1 md1Var2 = (md1) obj;
                pz0 pz0VarA0 = md1Var2.A0();
                if (pz0VarA0 == null || (jSONObjectH = pz0VarA0.h()) == null) {
                    md1Var2.b("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    md1Var2.b("nativeAdViewSignalsReady", jSONObjectH);
                    return;
                }
            case 2:
                md1 md1Var3 = (md1) obj;
                pz0 pz0VarA1 = md1Var3.A0();
                if (pz0VarA1 == null || (jSONObjectMo15l = pz0VarA1.mo15l()) == null) {
                    md1Var3.b("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    md1Var3.b("nativeClickMetaReady", jSONObjectMo15l);
                    return;
                }
            case 3:
                md1 md1Var4 = (md1) obj;
                ba0 ba0Var = vc3.C.s;
                Context context = md1Var4.getContext();
                synchronized (ba0Var) {
                    ba0Var.i = md1Var4;
                    if (!ba0Var.b(context)) {
                        ba0Var.d("Unable to bind", "on_play_store_bind");
                        return;
                    }
                    HashMap map3 = new HashMap();
                    map3.put("action", "fetch_completed");
                    ba0Var.e("on_play_store_bind", map3);
                    return;
                }
            case 4:
                md1 md1Var5 = (md1) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    jn.p("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                jh2 jh2Var = new jh2();
                jh2Var.c = 8388691;
                byte b = (byte) (jh2Var.g | 1);
                jh2Var.d = -1.0f;
                jh2Var.g = (byte) (((byte) (((byte) (b | 2)) | 4)) | 8);
                jh2Var.b = (String) map.get("appId");
                jh2Var.e = md1Var5.getWidth();
                jh2Var.g = (byte) (jh2Var.g | 16);
                IBinder windowToken = md1Var5.p0().getWindowToken();
                if (windowToken == null) {
                    j7.l("Null windowToken");
                    return;
                }
                jh2Var.a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    jh2Var.c = Integer.parseInt((String) map.get("gravityY")) | Integer.parseInt((String) map.get("gravityX"));
                    jh2Var.g = (byte) (jh2Var.g | 1);
                } else {
                    jh2Var.c = 81;
                    jh2Var.g = (byte) (jh2Var.g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    jh2Var.d = Float.parseFloat((String) map.get("verticalMargin"));
                    jh2Var.g = (byte) (jh2Var.g | 2);
                } else {
                    jh2Var.d = 0.02f;
                    jh2Var.g = (byte) (jh2Var.g | 2);
                }
                if (map.containsKey("enifd")) {
                    jh2Var.f = (String) map.get("enifd");
                }
                try {
                    vc3.C.s.c(md1Var5, jh2Var.a());
                    return;
                } catch (NullPointerException e) {
                    vc3.C.h.d("DefaultGmsgHandlers.ShowLMDOverlay", e);
                    jn.p("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                ba0 ba0Var2 = vc3.C.s;
                if (!ba0Var2.f || (s62Var = (s62) ba0Var2.j) == null) {
                    jn.p("LastMileDelivery not connected");
                    return;
                } else {
                    ((oh2) s62Var.f).a(ba0Var2.f(), (s62) ba0Var2.k, 1);
                    ba0Var2.e("onLMDOverlayExpand", new HashMap());
                    return;
                }
            case 6:
                ba0 ba0Var3 = vc3.C.s;
                if (!ba0Var3.f || (s62Var2 = (s62) ba0Var3.j) == null) {
                    jn.p("LastMileDelivery not connected");
                    return;
                } else {
                    ((oh2) s62Var2.f).a(ba0Var3.f(), (s62) ba0Var3.k, 2);
                    ba0Var3.e("onLMDOverlayCollapse", new HashMap());
                    return;
                }
            case 7:
                ba0 ba0Var4 = vc3.C.s;
                if (!ba0Var4.f || (s62Var3 = (s62) ba0Var4.j) == null) {
                    jn.p("LastMileDelivery not connected");
                    return;
                }
                if (!((Boolean) tu0.e.c.a(lx0.mc)).booleanValue() || TextUtils.isEmpty((String) ba0Var4.h)) {
                    String str3 = (String) ba0Var4.g;
                    if (str3 != null) {
                        str2 = str3;
                        str = null;
                    } else {
                        ba0Var4.d("Missing session token and/or appId", "onLMDupdate");
                        str = null;
                    }
                    ih2Var = new ih2(str2, str);
                    s62Var4 = (s62) ba0Var4.k;
                    oh2Var = (oh2) s62Var3.f;
                    qx1Var = oh2Var.a;
                    if (qx1Var == null) {
                        oh2.c.f("error: %s", "Play Store not found.");
                        return;
                    } else {
                        if (oh2.c(s62Var4, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                            qx1Var.d(new sh2(qx1Var, new ib(oh2Var, ih2Var, s62Var4, 18), 0));
                            return;
                        }
                        return;
                    }
                }
                str = (String) ba0Var4.h;
                str2 = null;
                ih2Var = new ih2(str2, str);
                s62Var4 = (s62) ba0Var4.k;
                oh2Var = (oh2) s62Var3.f;
                qx1Var = oh2Var.a;
                if (qx1Var == null) {
                    oh2.c.f("error: %s", "Play Store not found.");
                    return;
                } else {
                    if (oh2.c(s62Var4, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                        return;
                    }
                    qx1Var.d(new sh2(qx1Var, new ib(oh2Var, ih2Var, s62Var4, 18), 0));
                    return;
                }
            case 8:
                md1 md1Var6 = (md1) obj;
                try {
                    mc2 mc2VarF = mc2.f(md1Var6.getContext());
                    mc2VarF.getClass();
                    synchronized (mc2.class) {
                        mc2VarF.c(false);
                        break;
                    }
                    nc2.f(md1Var6.getContext()).h();
                    oc2.o(md1Var6.getContext()).r();
                    return;
                } catch (IOException e2) {
                    vc3.C.h.d("DefaultGmsgHandlers.ResetPaid", e2);
                    return;
                }
            case 9:
                md1 md1Var7 = (md1) obj;
                try {
                    String str4 = (String) map.get("enabled");
                    m11 m11Var = u11.a;
                    if (dq.J("true", str4) || dq.J("false", str4)) {
                        kc2 kc2VarN = kc2.n(md1Var7.getContext());
                        boolean z2 = Boolean.parseBoolean(str4);
                        kc2VarN.getClass();
                        synchronized (kc2.class) {
                            try {
                                ((z61) kc2VarN.g).F(Boolean.valueOf(z2), "paidv2_user_option");
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    vc3.C.h.d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e3);
                    return;
                }
            case 10:
                md1 md1Var8 = (md1) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> itKeys = jSONObject.keys();
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(md1Var8.getContext()).edit();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof Integer) {
                            editorEdit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            editorEdit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            editorEdit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            editorEdit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            editorEdit.putString(next, (String) obj2);
                        }
                    }
                    editorEdit.apply();
                    return;
                } catch (JSONException e4) {
                    vc3.C.h.d("GMSG write local storage KV pairs handler", e4);
                    return;
                }
            case 11:
                md1 md1Var9 = (md1) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(md1Var9.getContext()).edit();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        editorEdit2.remove(jSONArray.getString(i5));
                    }
                    editorEdit2.apply();
                    return;
                } catch (JSONException e5) {
                    vc3.C.h.d("GMSG clear local storage keys handler", e5);
                    return;
                }
            case 12:
                md1 md1Var10 = (md1) obj;
                if (md1Var10.T() != null) {
                    md1Var10.T().B3(3);
                }
                nf0 nf0VarX0 = md1Var10.x0();
                if (nf0VarX0 != null) {
                    nf0VarX0.y();
                    return;
                }
                nf0 nf0VarN0 = md1Var10.N0();
                if (nf0VarN0 != null) {
                    nf0VarN0.y();
                    return;
                } else {
                    jn.T("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((md1) obj).w0("1".equals(map.get("custom_close")));
                return;
            case 14:
                jn.R("Received log message: ".concat(String.valueOf((String) map.get("string"))));
                return;
            case 15:
                pz0 pz0VarA2 = ((md1) obj).A0();
                if (pz0VarA2 != null) {
                    pz0VarA2.mo14a();
                    return;
                }
                return;
            case 16:
                ((md1) obj).W0(!Boolean.parseBoolean((String) map.get("disabled")));
                return;
            case 17:
                md1 md1Var11 = (md1) obj;
                String str5 = (String) map.get("action");
                if ("pause".equals(str5)) {
                    md1Var11.F();
                    return;
                } else {
                    if ("resume".equals(str5)) {
                        md1Var11.d();
                        return;
                    }
                    return;
                }
            case 18:
                md1 md1Var12 = (md1) obj;
                if (map.containsKey("start")) {
                    he1 he1VarE0 = md1Var12.e0();
                    synchronized (he1VarE0.i) {
                        break;
                    }
                    he1VarE0.H++;
                    he1VarE0.Z();
                    return;
                }
                if (map.containsKey("stop")) {
                    he1 he1VarE1 = md1Var12.e0();
                    he1VarE1.H--;
                    he1VarE1.Z();
                    return;
                } else {
                    if (map.containsKey("cancel")) {
                        he1 he1VarE2 = md1Var12.e0();
                        cv0 cv0Var = he1VarE2.g;
                        if (cv0Var != null) {
                            cv0Var.b(10005);
                        }
                        he1VarE2.G = true;
                        he1VarE2.s = 10004;
                        he1VarE2.t = "Page loaded delay cancel.";
                        he1VarE2.Z();
                        he1VarE2.f.destroy();
                        return;
                    }
                    return;
                }
            case 19:
                md1 md1Var13 = (md1) obj;
                if (map.containsKey("start")) {
                    md1Var13.c1(true);
                }
                if (map.containsKey("stop")) {
                    md1Var13.c1(false);
                    return;
                }
                return;
            case 20:
                md1 md1Var14 = (md1) obj;
                m11 m11Var2 = u11.a;
                if (!((Boolean) tu0.e.c.a(lx0.S8)).booleanValue()) {
                    jn.T("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str6 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str6)) {
                    jn.T("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap map4 = new HashMap();
                Boolean boolValueOf = Boolean.valueOf(md1Var14.getContext().getPackageManager().getLaunchIntentForPackage(str6) != null);
                map4.put(str6, boolValueOf);
                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 13 + boolValueOf.toString().length());
                sb.append("/canOpenApp;");
                sb.append(str6);
                sb.append(";");
                sb.append(boolValueOf);
                jn.p(sb.toString());
                md1Var14.a("openableApp", map4);
                return;
            case zw0.zzm /* 21 */:
                md1 md1Var15 = (md1) obj;
                m11 m11Var3 = u11.a;
                PackageManager packageManager = md1Var15.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i6 = 0;
                        while (i6 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i6);
                                String strOptString = jSONObject3.optString("id");
                                String strOptString2 = jSONObject3.optString("u");
                                String strOptString3 = jSONObject3.optString("i");
                                String strOptString4 = jSONObject3.optString("m");
                                String strOptString5 = jSONObject3.optString("p");
                                c2 = c4;
                                String strOptString6 = jSONObject3.optString("c");
                                String strOptString7 = jSONObject3.optString("intent_url");
                                try {
                                    try {
                                        if (!TextUtils.isEmpty(strOptString7)) {
                                            try {
                                                uri = Intent.parseUri(strOptString7, i2);
                                                i2 = i2;
                                            } catch (URISyntaxException e6) {
                                                jn.P("Error parsing the url: ".concat(String.valueOf(strOptString7)), e6);
                                                uri = null;
                                            }
                                            if (uri == null) {
                                                uri = new Intent();
                                                if (!TextUtils.isEmpty(strOptString2)) {
                                                    uri.setData(Uri.parse(strOptString2));
                                                }
                                                if (!TextUtils.isEmpty(strOptString3)) {
                                                    uri.setAction(strOptString3);
                                                }
                                                if (!TextUtils.isEmpty(strOptString4)) {
                                                    uri.setType(strOptString4);
                                                }
                                                if (!TextUtils.isEmpty(strOptString5)) {
                                                    uri.setPackage(strOptString5);
                                                }
                                                if (!TextUtils.isEmpty(strOptString6)) {
                                                    strArrSplit = strOptString6.split("/", 2);
                                                    if (strArrSplit.length == 2) {
                                                        uri.setComponent(new ComponentName(strArrSplit[i2], strArrSplit[c2]));
                                                    }
                                                }
                                            }
                                            intent = uri;
                                            c = 0;
                                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                            if (resolveInfoResolveActivity != null) {
                                                z = c2;
                                            } else {
                                                z = i2;
                                            }
                                            jSONObject2.put(strOptString, z);
                                            i6++;
                                            c3 = c;
                                            c4 = c2;
                                            i2 = i2;
                                        }
                                        jSONObject2.put(strOptString, z);
                                    } catch (JSONException e7) {
                                        jn.P("Error constructing openable urls response.", e7);
                                    }
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                } catch (NullPointerException e8) {
                                    vc3.C.h.d(intent.toString(), e8);
                                    resolveInfoResolveActivity = null;
                                }
                                uri = null;
                                if (uri == null) {
                                    uri = new Intent();
                                    if (!TextUtils.isEmpty(strOptString2)) {
                                        uri.setData(Uri.parse(strOptString2));
                                    }
                                    if (!TextUtils.isEmpty(strOptString3)) {
                                        uri.setAction(strOptString3);
                                    }
                                    if (!TextUtils.isEmpty(strOptString4)) {
                                        uri.setType(strOptString4);
                                    }
                                    if (!TextUtils.isEmpty(strOptString5)) {
                                        uri.setPackage(strOptString5);
                                    }
                                    if (!TextUtils.isEmpty(strOptString6)) {
                                        strArrSplit = strOptString6.split("/", 2);
                                        if (strArrSplit.length == 2) {
                                            uri.setComponent(new ComponentName(strArrSplit[i2], strArrSplit[c2]));
                                        }
                                    }
                                }
                                intent = uri;
                                c = 0;
                                if (resolveInfoResolveActivity != null) {
                                    z = c2;
                                } else {
                                    z = i2;
                                }
                            } catch (JSONException e9) {
                                c = c3;
                                c2 = c4;
                                i2 = i2;
                                jn.P("Error parsing the intent data.", e9);
                            }
                            i6++;
                            c3 = c;
                            c4 = c2;
                            i2 = i2;
                            break;
                        }
                        md1Var15.b("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        md1Var15.b("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    md1Var15.b("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                md1 md1Var16 = (md1) obj;
                m11 m11Var4 = u11.a;
                String str7 = (String) map.get("u");
                if (str7 == null) {
                    jn.T("URL missing from httpTrack GMSG.");
                    return;
                } else if (((Boolean) tu0.e.c.a(lx0.f)).booleanValue() && str7.isEmpty()) {
                    jn.T("URL is empty from httpTrack GMSG.");
                    return;
                } else {
                    new l51(md1Var16.getContext(), md1Var16.u().f, str7, md1Var16.E() != null ? md1Var16.E().x0 : null).o1();
                    return;
                }
            case 23:
                md1 md1Var17 = (md1) obj;
                m11 m11Var5 = u11.a;
                String str8 = (String) map.get("tx");
                String str9 = (String) map.get("ty");
                String str10 = (String) map.get("td");
                try {
                    int i7 = Integer.parseInt(str8);
                    int i8 = Integer.parseInt(str9);
                    int i9 = Integer.parseInt(str10);
                    zq0 zq0VarS = md1Var17.S();
                    if (zq0VarS != null) {
                        zq0VarS.b.a(i7, i8, i9);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    jn.T("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                md1 md1Var18 = (md1) obj;
                m11 m11Var6 = u11.a;
                String str11 = (String) map.get("urls");
                if (TextUtils.isEmpty(str11)) {
                    jn.T("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] strArrSplit2 = str11.split(",");
                HashMap map5 = new HashMap();
                PackageManager packageManager2 = md1Var18.getContext().getPackageManager();
                for (String str12 : strArrSplit2) {
                    String[] strArrSplit3 = str12.split(";", 2);
                    Boolean boolValueOf2 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(strArrSplit3.length > 1 ? strArrSplit3[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit3[0].trim())), 65536) != null);
                    map5.put(str12, boolValueOf2);
                    StringBuilder sb2 = new StringBuilder(str12.length() + 14 + boolValueOf2.toString().length());
                    sb2.append("/canOpenURLs;");
                    sb2.append(str12);
                    sb2.append(";");
                    sb2.append(boolValueOf2);
                    jn.p(sb2.toString());
                }
                md1Var18.a("openableURLs", map5);
                return;
            case 25:
                md1 md1Var19 = (md1) obj;
                fe1 fe1VarF = md1Var19.f();
                if (fe1VarF == null) {
                    try {
                        fe1 fe1Var = new fe1(md1Var19, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        md1Var19.U0(fe1Var);
                        fe1VarF = fe1Var;
                    } catch (NullPointerException | NumberFormatException e10) {
                        jn.P("Unable to parse videoMeta message.", e10);
                        vc3.C.h.d("VideoMetaGmsgHandler.onGmsg", e10);
                        return;
                    }
                }
                float f = Float.parseFloat((String) map.get("duration"));
                boolean zEquals = "1".equals(map.get("muted"));
                float f2 = Float.parseFloat((String) map.get("currentTime"));
                int i10 = Integer.parseInt((String) map.get("playbackState"));
                if (i10 >= 0 && i10 <= 3) {
                    i2 = i10;
                }
                String str13 = (String) map.get("aspectRatio");
                float f3 = TextUtils.isEmpty(str13) ? 0.0f : Float.parseFloat(str13);
                if (jn.a0(3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(f2).length() + 45 + String.valueOf(f).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i2).length() + 17 + String.valueOf(str13).length());
                    sb3.append("Video Meta GMSG: currentTime : ");
                    sb3.append(f2);
                    sb3.append(" , duration : ");
                    sb3.append(f);
                    sb3.append(" , isMuted : ");
                    sb3.append(zEquals);
                    sb3.append(" , playbackState : ");
                    sb3.append(i2);
                    sb3.append(" , aspectRatio : ");
                    sb3.append(str13);
                    jn.F(sb3.toString());
                }
                fe1VarF.D3(f2, f, i2, zEquals, f3);
                return;
            case 26:
                a(obj, map);
                return;
            default:
                jn.F("Show native ad policy validator overlay.");
                ((md1) obj).p0().setVisibility(0);
                return;
        }
    }
}
