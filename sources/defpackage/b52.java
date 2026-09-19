package defpackage;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b52 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public b52(JsonReader jsonReader) {
        JSONObject jSONObjectQ0 = w40.q0(jsonReader);
        this.d = jSONObjectQ0;
        this.a = jSONObjectQ0.optString("ad_html", null);
        this.b = jSONObjectQ0.optString("ad_base_url", null);
        this.c = jSONObjectQ0.optJSONObject("ad_json");
    }
}
