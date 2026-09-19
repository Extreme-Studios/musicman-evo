package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c32 implements j22 {
    public final String a;
    public final String b;

    public c32(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject jSONObjectG0 = w40.G0("pii", (JSONObject) obj);
            jSONObjectG0.put("doritos", this.a);
            jSONObjectG0.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            jn.p("Failed putting doritos string.");
        }
    }
}
