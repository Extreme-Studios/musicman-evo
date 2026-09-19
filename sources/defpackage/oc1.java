package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oc1 implements Runnable {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ oc1(u40 u40Var, Throwable th, f82 f82Var, String str, j52 j52Var) {
        this.h = u40Var;
        this.i = th;
        this.j = f82Var;
        this.g = str;
        this.k = j52Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.f;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheCanceled");
                map.put("src", (String) obj5);
                String str2 = (String) obj4;
                if (!TextUtils.isEmpty(str2)) {
                    map.put("cachedSrc", str2);
                }
                String str3 = (String) obj3;
                String str4 = "internal";
                switch (str3.hashCode()) {
                    case -1947652542:
                        str = "interrupted";
                        str3.equals(str);
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            str4 = "network";
                        }
                        break;
                    case -1347010958:
                        str = "inProgress";
                        str3.equals(str);
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                            str4 = "network";
                        }
                        break;
                    case -659376217:
                        str = "contentLengthMissing";
                        str3.equals(str);
                        break;
                    case -642208130:
                        str = "playerFailed";
                        str3.equals(str);
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            str4 = "policy";
                        }
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                            str4 = "policy";
                        }
                        break;
                    case 3387234:
                        str = "noop";
                        str3.equals(str);
                        break;
                    case 96784904:
                        str = "error";
                        str3.equals(str);
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            str4 = "io";
                        }
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                            str4 = "io";
                        }
                        break;
                }
                map.put("type", str4);
                map.put("reason", str3);
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    map.put("message", str5);
                }
                ((pc1) obj).n(map);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.db)).booleanValue();
                Throwable th = (Throwable) obj3;
                sg1 sg1Var = (sg1) ((u40) obj4).j;
                if (zBooleanValue) {
                    e71.d(sg1Var.a).c("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    e71.a(sg1Var.a).c("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                f82 f82Var = (f82) obj2;
                f82Var.b((String) obj5, (j52) obj, null, null);
                return;
            case 2:
                dt1 dt1Var = (dt1) obj4;
                String str6 = (String) obj5;
                at1 at1Var = (at1) obj3;
                s52 s52Var = (s52) obj2;
                ArrayList arrayList = (ArrayList) obj;
                dt1Var.getClass();
                try {
                    try {
                        if (Objects.equals(str6, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            at1Var.b();
                            return;
                        }
                        Context context = (Context) dt1Var.g.get();
                        if (context == null) {
                            context = dt1Var.f;
                        }
                        try {
                            s52Var.a.L0(new ju(context), at1Var, arrayList);
                            return;
                        } catch (Throwable th2) {
                            throw new l52(th2);
                        }
                    } catch (RemoteException e) {
                        jn.P("", e);
                        return;
                    }
                } catch (RemoteException e2) {
                    throw new na(e2);
                } catch (l52 unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 74);
                    sb.append("Failed to initialize adapter. ");
                    sb.append(str6);
                    sb.append(" does not implement the initialize() method.");
                    at1Var.B3(sb.toString());
                    return;
                }
            case 3:
                ig2 ig2Var = (ig2) obj5;
                HashMap map2 = (HashMap) obj4;
                Context context2 = (Context) obj3;
                View view = (View) obj2;
                map2.putAll(ig2Var.d.b(context2, view));
                ig2Var.g(map2);
                map2.put("f", "v");
                map2.put("ctx", context2);
                map2.put("view", view);
                map2.put("act", (Activity) obj);
                map2.put("bds", null);
                return;
            default:
                ig2 ig2Var2 = (ig2) obj4;
                HashMap map3 = (HashMap) obj3;
                map3.putAll(ig2Var2.d.c());
                ig2Var2.g(map3);
                map3.put("f", "c");
                map3.put("ctx", (Context) obj2);
                map3.put("view", (View) obj);
                map3.put("act", null);
                map3.put("bds", (String) obj5);
                return;
        }
    }

    public /* synthetic */ oc1(dt1 dt1Var, String str, at1 at1Var, s52 s52Var, ArrayList arrayList) {
        this.h = dt1Var;
        this.g = str;
        this.i = at1Var;
        this.j = s52Var;
        this.k = arrayList;
    }

    public /* synthetic */ oc1(ig2 ig2Var, HashMap map, Context context, View view, Activity activity) {
        this.g = ig2Var;
        this.h = map;
        this.i = context;
        this.j = view;
        this.k = activity;
    }

    public /* synthetic */ oc1(ig2 ig2Var, HashMap map, Context context, View view, String str) {
        this.h = ig2Var;
        this.i = map;
        this.j = context;
        this.k = view;
        this.g = str;
    }

    public oc1(pc1 pc1Var, String str, String str2, String str3, String str4) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = pc1Var;
    }
}
