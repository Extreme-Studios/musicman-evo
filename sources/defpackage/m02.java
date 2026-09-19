package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m02 implements j22 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m02(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                ej1.F(((rj1) obj).a, "android_permissions", (ArrayList) this.b);
                return;
            case 1:
                rj1 rj1Var = (rj1) obj;
                w42 w42Var = (w42) this.b;
                if (w42Var != null) {
                    if (((Boolean) tu0.e.c.a(lx0.Jc)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = rj1Var.a;
                    synchronized (w42Var.c) {
                        w42Var.b();
                        z = w42Var.e == 2;
                        break;
                    }
                    bundle.putBoolean("render_in_browser", z);
                    synchronized (w42Var.c) {
                        w42Var.b();
                        z2 = w42Var.e == 3;
                        break;
                    }
                    bundle.putBoolean("disable_ml", z2);
                    return;
                }
                return;
            case 2:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.b);
                    return;
                } catch (JSONException unused) {
                    jn.p("Unable to get cache_state");
                    return;
                }
            case 3:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((a32) this.b).a);
                    return;
                } catch (JSONException unused2) {
                    jn.p("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.b));
                    return;
                } catch (JSONException unused3) {
                    jn.p("Failed putting experiment ids.");
                    return;
                }
        }
    }
}
