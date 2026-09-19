package defpackage;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class r92 {
    public final String a;
    public long c = System.nanoTime();
    public int d = 1;
    public da2 b = new da2(null);

    public r92(String str) {
        this.a = str;
    }

    public void b() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.b.get();
    }

    public void d(x82 x82Var, m40 m40Var) {
        e(x82Var, m40Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006e  */
    public final void e(x82 x82Var, m40 m40Var, JSONObject jSONObject) {
        char c;
        String str;
        String str2 = x82Var.g;
        JSONObject jSONObject2 = new JSONObject();
        v92.b(jSONObject2, "environment", "app");
        v92.b(jSONObject2, "adSessionType", (w82) m40Var.l);
        JSONObject jSONObject3 = new JSONObject();
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        v92.b(jSONObject3, "deviceType", ec.n(new StringBuilder(String.valueOf(str3).length() + 2 + String.valueOf(str4).length()), str3, "; ", str4));
        v92.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        v92.b(jSONObject3, "os", "Android");
        v92.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = yd.q;
        if (uiModeManager == null) {
            c = 3;
        } else {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c = 2;
            } else if (currentModeType != 4) {
                c = 3;
            } else {
                c = 1;
            }
        }
        if (c == 1) {
            str = "ctv";
        } else if (c == 2) {
            str = "mobile";
        } else {
            if (c != 3) {
                throw null;
            }
            str = "other";
        }
        v92.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        v92.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        yl1 yl1Var = (yl1) m40Var.f;
        v92.b(jSONObject4, "partnerName", yl1Var.f);
        v92.b(jSONObject4, "partnerVersion", yl1Var.g);
        v92.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        v92.b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        v92.b(jSONObject5, "appId", n92.h.g.getApplicationContext().getPackageName());
        v92.b(jSONObject2, "app", jSONObject5);
        String str5 = (String) m40Var.k;
        if (str5 != null) {
            v92.b(jSONObject2, "contentUrl", str5);
        }
        String str6 = (String) m40Var.j;
        if (str6 != null) {
            v92.b(jSONObject2, "customReferenceData", str6);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList((ArrayList) m40Var.h).iterator();
        if (!it.hasNext()) {
            gm.m.p(c(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
        } else {
            it.next().getClass();
            j7.j();
        }
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        v92.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        gm.m.p(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}
