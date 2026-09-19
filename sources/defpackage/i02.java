package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i02 implements j22 {
    public final /* synthetic */ int a;
    public final Bundle b;

    public /* synthetic */ i02(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i = this.a;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (!bundle.isEmpty()) {
                    rj1Var.a.putBundle("installed_adapter_data", bundle);
                }
                break;
            case 1:
                Bundle bundle2 = ((rj1) obj).a;
                Bundle bundleQ = ej1.q("device", bundle2);
                bundleQ.putBundle("android_mem_info", bundle);
                bundle2.putBundle("device", bundleQ);
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (bundle != null) {
                    try {
                        w40.G0("play_store", w40.G0("device", jSONObject)).put("parental_controls", ut0.f.a.k(bundle));
                    } catch (JSONException unused) {
                        jn.p("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
