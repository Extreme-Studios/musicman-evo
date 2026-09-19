package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g32 {
    public final Context a;
    public final ApplicationInfo b;
    public final ArrayList c;
    public final d60 d;
    public final JSONObject e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public g32(Context context, ArrayList arrayList, d60 d60Var) {
        this.a = context;
        this.b = context.getApplicationInfo();
        this.c = arrayList;
        this.d = d60Var;
    }

    public final void a(WebView webView) {
        if (this.f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoD = null;
        ApplicationInfo applicationInfo = this.b;
        if (applicationInfo != null) {
            try {
                packageInfoD = q90.a(this.a).d(applicationInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.e;
        if (packageInfoD != null) {
            try {
                jSONObject.put("vc", packageInfoD.versionCode);
                jSONObject.put("vnm", packageInfoD.versionName);
            } catch (JSONException e) {
                vc3.C.h.d("PawAppSignalGenerator.initialize", e);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) tu0.e.c.a(lx0.Da)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.d.f);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) wy0.b.u()).booleanValue() && na1.k("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) tu0.e.c.a(lx0.Ca), b());
            int i = bk2.h;
            ck2 ck2Var = new ck2("*");
            int i2 = v70.a;
            if (!y70.e.b()) {
                throw y70.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f.get()) {
            a(null);
        }
        return this.e;
    }
}
