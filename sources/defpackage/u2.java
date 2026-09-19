package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {
    public final ee3 a;
    public final g2 b;

    public u2(ee3 ee3Var) {
        this.a = ee3Var;
        fu1 fu1Var = ee3Var.h;
        this.b = fu1Var == null ? null : fu1Var.a();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ee3 ee3Var = this.a;
        jSONObject.put("Adapter", ee3Var.f);
        jSONObject.put("Latency", ee3Var.g);
        String str = ee3Var.j;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = ee3Var.k;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = ee3Var.l;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = ee3Var.m;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = ee3Var.i;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        g2 g2Var = this.b;
        if (g2Var == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", g2Var.g());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
