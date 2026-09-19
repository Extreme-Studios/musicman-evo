package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p02 implements j22 {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;

    public /* synthetic */ p02(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i = this.a;
        int i2 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                Bundle bundle = ((rj1) obj).a;
                if (!TextUtils.isEmpty(str) && i2 != -1) {
                    Bundle bundleQ = ej1.q("pii", bundle);
                    bundle.putBundle("pii", bundleQ);
                    bundleQ.putString("pvid", str);
                    bundleQ.putInt("pvid_s", i2);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((rj1) obj).a;
                if (((Boolean) tu0.e.c.a(lx0.ib)).booleanValue()) {
                    if (!TextUtils.isEmpty(str)) {
                        bundle2.putString("topics", str);
                    }
                    if (i2 != -1) {
                        bundle2.putInt("atps", i2);
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(str) && i2 != -1) {
                    try {
                        JSONObject jSONObjectG0 = w40.G0("pii", jSONObject);
                        jSONObjectG0.put("pvid", str);
                        jSONObjectG0.put("pvid_s", i2);
                    } catch (JSONException e) {
                        jn.w("Failed putting gms core app set ID info.", e);
                    }
                    break;
                }
                break;
        }
    }
}
