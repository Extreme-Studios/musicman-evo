package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i11 implements v11 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ i11(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    private final /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                de1 de1Var = (de1) this.g;
                synchronized (de1Var) {
                    try {
                        if (de1Var.M != i) {
                            de1Var.M = i;
                            de1Var.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                jn.V("Exception occurred while getting webview content height", e);
            }
        }
    }

    public static final Bundle b(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                vc3.C.h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e);
            }
        }
        return bundle;
    }

    public static final ArrayList c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            vc3.C.h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:149:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0447  */
    /* JADX WARN: Code duplicated, block: B:171:0x0454  */
    /* JADX WARN: Code duplicated, block: B:174:0x046c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0493  */
    /* JADX WARN: Code duplicated, block: B:185:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:195:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:414:0x047a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x04b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        s2 s2Var;
        j60 j60Var;
        q2 q2Var;
        boolean z;
        et etVar;
        HashMap map2;
        Object obj2;
        w7 adView;
        q2 q2Var2;
        s2 s2Var2;
        i60 i60Var;
        j60 j60Var2;
        et etVar2;
        String str;
        String str2;
        Bundle bundleP0 = null;
        bundleP0 = null;
        g81Var = null;
        g81 g81Var = null;
        activityG = null;
        Activity activityG = null;
        switch (this.f) {
            case 0:
                j11 j11Var = (j11) this.g;
                if (j11Var == null) {
                    return;
                }
                String str3 = (String) map.get("name");
                if (str3 == null) {
                    jn.R("Ad metadata with no name parameter.");
                    str3 = "";
                }
                String str4 = str3;
                if (map.containsKey("info")) {
                    try {
                        bundleP0 = w40.P0(new JSONObject((String) map.get("info")));
                    } catch (JSONException e) {
                        jn.P("Failed to convert ad metadata to JSON.", e);
                    }
                }
                if (bundleP0 == null) {
                    jn.M("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    j11Var.h(str4, bundleP0);
                    return;
                }
            case 1:
                String str5 = (String) map.get("name");
                if (str5 == null) {
                    jn.T("App event with no name parameter.");
                    return;
                } else {
                    ((k11) this.g).n0(str5, (String) map.get("info"));
                    return;
                }
            case 2:
                md1 md1Var = (md1) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f = Float.parseFloat((String) map.get("blurRadius"));
                    }
                    break;
                } catch (NumberFormatException e2) {
                    jn.P("Fail to parse float", e2);
                }
                b21 b21Var = (b21) this.g;
                synchronized (b21Var) {
                    b21Var.a = zEquals;
                    b21Var.d.set(true);
                }
                synchronized (b21Var) {
                    b21Var.b = zEquals2;
                    b21Var.c = f;
                }
                md1Var.M0(zEquals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
                    jn.p("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long j = Long.parseLong((String) map.get("id"));
                    int i = Integer.parseInt((String) map.get("event_type"));
                    vc3.C.k.getClass();
                    ((os1) this.g).a(i, j, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e3) {
                    jn.w("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e3);
                    return;
                }
            case 4:
                ix0 ix0Var = lx0.ga;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    s2 s2Var3 = s2.h;
                    Bundle bundle = new Bundle();
                    bundle.putString("request_origin", "inspector_ooct");
                    q2 q2Var3 = new q2((p2) new p2(1).f1(bundle));
                    String str6 = (String) map.get("adUnitId");
                    if (TextUtils.isEmpty(str6)) {
                        str6 = "";
                    }
                    String str7 = (String) map.get("format");
                    String str8 = TextUtils.isEmpty(str7) ? "" : str7;
                    if (((Boolean) tu0Var.c.a(lx0.ia)).booleanValue()) {
                        boolean z2 = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                        if (z2) {
                            l2 l2Var = new l2(1);
                            if (map.containsKey("keywords")) {
                                ArrayList arrayListC = c((String) map.get("keywords"), "keywords");
                                int size = arrayListC.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj3 = arrayListC.get(i2);
                                    i2++;
                                    ((HashSet) ((i6) l2Var.f).d).add((String) obj3);
                                }
                            }
                            l2Var.f1(b(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> itKeys = jSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        l2Var.e1(next, jSONObject.getString(next));
                                    }
                                } catch (JSONException e4) {
                                    vc3.C.h.d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e4);
                                }
                            }
                            if (map.containsKey("contentUrl")) {
                                l2Var.j1((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                l2Var.k1(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((i6) l2Var.f).m = (String) map.get("requestAgent");
                            }
                            if (map.containsKey("publisherProvidedId")) {
                                ((i6) l2Var.f).l = (String) map.get("publisherProvidedId");
                            }
                            if (map.containsKey("categoryExclusions")) {
                                ArrayList arrayListC2 = c((String) map.get("categoryExclusions"), "categoryExclusions");
                                int size2 = arrayListC2.size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    Object obj4 = arrayListC2.get(i3);
                                    i3++;
                                    ((HashSet) ((i6) l2Var.f).i).add((String) obj4);
                                }
                            }
                            q2Var2 = new m2(l2Var);
                        } else {
                            p2 p2Var = new p2(1);
                            if (map.containsKey("keywords")) {
                                ArrayList arrayListC3 = c((String) map.get("keywords"), "keywords");
                                int size3 = arrayListC3.size();
                                int i4 = 0;
                                while (i4 < size3) {
                                    Object obj5 = arrayListC3.get(i4);
                                    i4++;
                                    ((HashSet) ((i6) p2Var.f).d).add((String) obj5);
                                }
                            }
                            p2Var.f1(b(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> itKeys2 = jSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        p2Var.e1(next2, jSONObject2.getString(next2));
                                    }
                                } catch (JSONException e5) {
                                    vc3.C.h.d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e5);
                                }
                            }
                            if (map.containsKey("contentUrl")) {
                                p2Var.j1((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                p2Var.k1(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((i6) p2Var.f).m = (String) map.get("requestAgent");
                            }
                            q2Var2 = new q2(p2Var);
                        }
                        q2 q2Var4 = q2Var2;
                        String str9 = (String) map.get("width");
                        String str10 = (String) map.get("height");
                        if (TextUtils.isEmpty(str9) || TextUtils.isEmpty(str10)) {
                            s2Var2 = s2.h;
                        } else {
                            try {
                                s2Var = new s2(Integer.parseInt(str9), Integer.parseInt(str10));
                            } catch (NumberFormatException e6) {
                                vc3.C.h.d("OutOfContextTestingGmsgHandler.generateAdSize", e6);
                                s2Var2 = s2.h;
                                s2Var = s2Var2;
                            }
                            if (!map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                                i60Var = new i60();
                                i60Var.a = true;
                                i60Var.b = false;
                                i60Var.c = false;
                                if (map.containsKey("startMuted")) {
                                    i60Var.a = ((String) map.get("startMuted")).equals("1");
                                }
                                if (map.containsKey("customControlsRequested")) {
                                    i60Var.b = ((String) map.get("customControlsRequested")).equals("1");
                                }
                                if (map.containsKey("clickToExpandRequested")) {
                                    i60Var.c = ((String) map.get("clickToExpandRequested")).equals("1");
                                }
                                j60Var2 = new j60(i60Var);
                            } else {
                                j60Var2 = null;
                            }
                            if (!map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (j60Var2 != null && str8.equals("NATIVE"))) {
                                etVar2 = new et();
                                if (map.containsKey("disableImageLoading")) {
                                    etVar2.a = ((String) map.get("disableImageLoading")).equals("1");
                                }
                                if (map.containsKey("mediaAspectRatio")) {
                                    str2 = (String) map.get("mediaAspectRatio");
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            etVar2.b = Integer.parseInt(str2);
                                        } catch (NumberFormatException e7) {
                                            vc3.C.h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e7);
                                        }
                                    }
                                }
                                if (map.containsKey("shouldRequestMultipleImages")) {
                                    etVar2.c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                                }
                                if (map.containsKey("preferredAdChoicesPosition")) {
                                    str = (String) map.get("preferredAdChoicesPosition");
                                    if (!TextUtils.isEmpty(str)) {
                                        try {
                                            etVar2.d = Integer.parseInt(str);
                                        } catch (NumberFormatException e8) {
                                            vc3.C.h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e8);
                                        }
                                    }
                                }
                                if (map.containsKey("customMuteThisAdRequested")) {
                                    etVar2.f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                                }
                                if (j60Var2 != null) {
                                    etVar2.e = j60Var2;
                                }
                                etVar = new et(etVar2);
                                j60Var = j60Var2;
                                q2Var = q2Var4;
                                z = z2;
                            } else {
                                j60Var = j60Var2;
                                q2Var = q2Var4;
                                etVar = null;
                                z = z2;
                            }
                        }
                        s2Var = s2Var2;
                        if (map.containsKey("clickToExpandRequested")) {
                            i60Var = new i60();
                            i60Var.a = true;
                            i60Var.b = false;
                            i60Var.c = false;
                            if (map.containsKey("startMuted")) {
                                i60Var.a = ((String) map.get("startMuted")).equals("1");
                            }
                            if (map.containsKey("customControlsRequested")) {
                                i60Var.b = ((String) map.get("customControlsRequested")).equals("1");
                            }
                            if (map.containsKey("clickToExpandRequested")) {
                                i60Var.c = ((String) map.get("clickToExpandRequested")).equals("1");
                            }
                            j60Var2 = new j60(i60Var);
                        } else {
                            i60Var = new i60();
                            i60Var.a = true;
                            i60Var.b = false;
                            i60Var.c = false;
                            if (map.containsKey("startMuted")) {
                                i60Var.a = ((String) map.get("startMuted")).equals("1");
                            }
                            if (map.containsKey("customControlsRequested")) {
                                i60Var.b = ((String) map.get("customControlsRequested")).equals("1");
                            }
                            if (map.containsKey("clickToExpandRequested")) {
                                i60Var.c = ((String) map.get("clickToExpandRequested")).equals("1");
                            }
                            j60Var2 = new j60(i60Var);
                        }
                        if (map.containsKey("customMuteThisAdRequested")) {
                            etVar2 = new et();
                            if (map.containsKey("disableImageLoading")) {
                                etVar2.a = ((String) map.get("disableImageLoading")).equals("1");
                            }
                            if (map.containsKey("mediaAspectRatio")) {
                                str2 = (String) map.get("mediaAspectRatio");
                                if (!TextUtils.isEmpty(str2)) {
                                    etVar2.b = Integer.parseInt(str2);
                                }
                            }
                            if (map.containsKey("shouldRequestMultipleImages")) {
                                etVar2.c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                            }
                            if (map.containsKey("preferredAdChoicesPosition")) {
                                str = (String) map.get("preferredAdChoicesPosition");
                                if (!TextUtils.isEmpty(str)) {
                                    etVar2.d = Integer.parseInt(str);
                                }
                            }
                            if (map.containsKey("customMuteThisAdRequested")) {
                                etVar2.f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                            }
                            if (j60Var2 != null) {
                                etVar2.e = j60Var2;
                            }
                            etVar = new et(etVar2);
                            j60Var = j60Var2;
                            q2Var = q2Var4;
                            z = z2;
                        } else {
                            etVar2 = new et();
                            if (map.containsKey("disableImageLoading")) {
                                etVar2.a = ((String) map.get("disableImageLoading")).equals("1");
                            }
                            if (map.containsKey("mediaAspectRatio")) {
                                str2 = (String) map.get("mediaAspectRatio");
                                if (!TextUtils.isEmpty(str2)) {
                                    etVar2.b = Integer.parseInt(str2);
                                }
                            }
                            if (map.containsKey("shouldRequestMultipleImages")) {
                                etVar2.c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                            }
                            if (map.containsKey("preferredAdChoicesPosition")) {
                                str = (String) map.get("preferredAdChoicesPosition");
                                if (!TextUtils.isEmpty(str)) {
                                    etVar2.d = Integer.parseInt(str);
                                }
                            }
                            if (map.containsKey("customMuteThisAdRequested")) {
                                etVar2.f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                            }
                            if (j60Var2 != null) {
                                etVar2.e = j60Var2;
                            }
                            etVar = new et(etVar2);
                            j60Var = j60Var2;
                            q2Var = q2Var4;
                            z = z2;
                        }
                        break;
                    } else {
                        s2Var = s2Var3;
                        j60Var = null;
                        q2Var = q2Var3;
                        z = false;
                        etVar = null;
                    }
                    String str11 = (String) map.get("action");
                    if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str6)) {
                        return;
                    }
                    if (str11.equals("load") && !TextUtils.isEmpty(str8)) {
                        xt1 xt1Var = (xt1) this.g;
                        synchronized (xt1Var) {
                            try {
                                switch (str8.hashCode()) {
                                    case -1999289321:
                                        if (str8.equals("NATIVE")) {
                                            j2 j2Var = new j2(xt1Var.E3(), str6);
                                            try {
                                                j2Var.b.r1(new h11(1, new z61(xt1Var, 19, str6)));
                                                break;
                                            } catch (RemoteException e9) {
                                                jn.V("Failed to add google native ad listener", e9);
                                            }
                                            try {
                                                j2Var.b.w0(new zd2(new wt1(xt1Var)));
                                                break;
                                            } catch (RemoteException e10) {
                                                jn.V("Failed to set AdListener.", e10);
                                            }
                                            if (((Boolean) tu0.e.c.a(lx0.ia)).booleanValue() && etVar != null) {
                                                j2Var.b(etVar);
                                            }
                                            j2Var.a().a(q2Var);
                                            return;
                                        }
                                        return;
                                    case -1372958932:
                                        if (str8.equals("INTERSTITIAL")) {
                                            in.a(xt1Var.E3(), str6, q2Var, new ut1(xt1Var, str6));
                                        }
                                        return;
                                    case -428325382:
                                        if (str8.equals("APP_OPEN_AD")) {
                                            hu0.a(xt1Var.E3(), str6, q2Var, new st1(xt1Var, str6));
                                            return;
                                        }
                                        return;
                                    case 543046670:
                                        if (str8.equals("REWARDED")) {
                                            u81.a(xt1Var.E3(), str6, q2Var, new vt1(xt1Var, str6, 0));
                                            return;
                                        }
                                        return;
                                    case 1854800829:
                                        if (str8.equals("REWARDED_INTERSTITIAL")) {
                                            c91.a(xt1Var.E3(), str6, q2Var, new vt1(xt1Var, str6, 1));
                                            return;
                                        }
                                        return;
                                    case 1951953708:
                                        if (str8.equals("BANNER")) {
                                            ix0 ix0Var2 = lx0.ia;
                                            tu0 tu0Var2 = tu0.e;
                                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() && z) {
                                                Context contextE3 = xt1Var.E3();
                                                adView = new n2(contextE3);
                                                dq.g(contextE3, "Context cannot be null");
                                            } else {
                                                adView = new AdView(xt1Var.E3());
                                            }
                                            adView.setAdSize(s2Var);
                                            adView.setAdUnitId(str6);
                                            adView.setAdListener(new tt1(xt1Var, str6, adView));
                                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() && z && j60Var != null) {
                                                ((n2) adView).setVideoOptions(j60Var);
                                            }
                                            adView.b(q2Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (str11.equals("show")) {
                        xt1 xt1Var2 = (xt1) this.g;
                        synchronized (xt1Var2) {
                            try {
                                rt1 rt1Var = xt1Var2.i;
                                md1 md1Var2 = rt1Var.i;
                                if (md1Var2 != null && !md1Var2.l0()) {
                                    activityG = rt1Var.i.g();
                                }
                                if (activityG != null && (obj2 = (map2 = xt1Var2.f).get(str6)) != null) {
                                    ix0 ix0Var3 = lx0.ha;
                                    tu0 tu0Var3 = tu0.e;
                                    if (!((Boolean) tu0Var3.c.a(ix0Var3)).booleanValue() || (obj2 instanceof hu0) || (obj2 instanceof in) || (obj2 instanceof u81) || (obj2 instanceof c91)) {
                                        map2.remove(str6);
                                    }
                                    xt1Var2.D3(xt1.F3(obj2));
                                    if (obj2 instanceof hu0) {
                                        ((hu0) obj2).b(activityG);
                                        return;
                                    }
                                    if (obj2 instanceof in) {
                                        ((in) obj2).b(activityG);
                                        return;
                                    }
                                    if (obj2 instanceof u81) {
                                        u81 u81Var = (u81) obj2;
                                        b91 b91Var = u81Var.c;
                                        b91Var.getClass();
                                        try {
                                            l81 l81Var = u81Var.a;
                                            if (l81Var != null) {
                                                l81Var.e1(b91Var);
                                                l81Var.x2(new ju(activityG));
                                            }
                                            break;
                                        } catch (RemoteException e11) {
                                            jn.Z("#007 Could not call remote method.", e11);
                                        }
                                        return;
                                    }
                                    if (obj2 instanceof c91) {
                                        c91 c91Var = (c91) obj2;
                                        b91 b91Var2 = c91Var.c;
                                        b91Var2.getClass();
                                        try {
                                            l81 l81Var2 = c91Var.a;
                                            if (l81Var2 != null) {
                                                l81Var2.e1(b91Var2);
                                                l81Var2.x2(new ju(activityG));
                                            }
                                            break;
                                        } catch (RemoteException e12) {
                                            jn.Z("#007 Could not call remote method.", e12);
                                        }
                                        return;
                                    }
                                    if (((Boolean) tu0Var3.c.a(ix0Var3)).booleanValue() && ((obj2 instanceof AdView) || (obj2 instanceof NativeAd))) {
                                        Intent intent = new Intent();
                                        Context contextE4 = xt1Var2.E3();
                                        intent.setClassName(contextE4, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                        intent.putExtra("adUnit", str6);
                                        zb3 zb3Var = vc3.C.c;
                                        zb3.s(contextE4, intent);
                                        return;
                                    }
                                    throw th;
                                }
                                return;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                return;
            case 5:
                i21 i21Var = (i21) this.g;
                String str12 = (String) map.get("action");
                if (!"grant".equals(str12)) {
                    if ("video_start".equals(str12)) {
                        i21Var.a();
                        return;
                    } else {
                        if ("video_complete".equals(str12)) {
                            i21Var.r();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int i5 = Integer.parseInt((String) map.get("amount"));
                    String str13 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str13)) {
                        g81Var = new g81(str13, i5);
                    }
                } catch (NumberFormatException e13) {
                    jn.V("Unable to parse reward amount.", e13);
                }
                i21Var.U(g81Var);
                return;
            case 6:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                jn.p("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent2.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    zb3 zb3Var2 = vc3.C.c;
                    zb3.s((Context) this.g, intent2);
                    return;
                } catch (RuntimeException e14) {
                    jn.V("Failed to open Share Sheet", e14);
                    vc3.C.h.d("ShareSheetGmsgHandler.onGmsg", e14);
                    return;
                }
            case 7:
                String str14 = (String) map.get("action");
                if (str14 == null) {
                    jn.T("Action missing from video GMSG.");
                    return;
                }
                if (str14.equals("src")) {
                    String str15 = (String) map.get("src");
                    if (str15 == null) {
                        jn.T("src missing from video GMSG.");
                        return;
                    }
                    i01 i01Var = (i01) this.g;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("mediaUrl", str15);
                    i01Var.f.b(bundle2);
                    return;
                }
                return;
            case 8:
                a(obj, map);
                return;
            default:
                ((mp1) this.g).b.d(map);
                return;
        }
    }
}
