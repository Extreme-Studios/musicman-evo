package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f02 implements j22 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ f02(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (str != null) {
                    rj1Var.a.putString("arek", str);
                }
                break;
            case 1:
                ((rj1) obj).a.putString("ms", str);
                break;
            case 2:
                ej1.E("key_schema", ((rj1) obj).a, str);
                break;
            case 3:
                ej1.E("omid_v", ((rj1) obj).a, str);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", str);
                } catch (JSONException e) {
                    jn.w("Failed putting Ad ID.", e);
                    return;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        w40.G0("pii", jSONObject).put("adsid", str);
                    }
                } catch (JSONException e2) {
                    jn.V("Failed putting trustless token.", e2);
                }
                break;
        }
    }
}
