package defpackage;

import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends fw {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public zx0(ay0 ay0Var, String str) {
        this.b = str;
        Objects.requireNonNull(ay0Var);
        this.c = ay0Var;
    }

    @Override // defpackage.fw
    public final void a(String str) {
        int i = this.a;
        String str2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                jn.T("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    ay0 ay0Var = (ay0) obj;
                    ay0Var.g.h(ay0Var.b(str2, str).toString());
                } catch (JSONException e) {
                    jn.P("Error creating PACT Error Response JSON: ", e);
                    return;
                }
                break;
            default:
                h30 h30Var = (h30) obj;
                jn.T("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) wy0.c.u()).booleanValue() ? ",\"as\":".concat(h30Var.k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                um0 um0Var = wy0.e;
                String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) um0Var.u()).booleanValue() ? ((Long) wy0.h.u()).longValue() : 0L), strConcat);
                int i2 = 0;
                if (((Boolean) um0Var.u()).booleanValue()) {
                    try {
                        h30Var.h.execute(new k21(this, str3, i2));
                    } catch (RuntimeException e2) {
                        vc3.C.h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e2);
                    }
                } else {
                    h30Var.b.evaluateJavascript(str3, null);
                }
                if (((Boolean) wy0.c.u()).booleanValue() && ((Boolean) wy0.d.u()).booleanValue()) {
                    i73 i73Var = h30Var.l;
                    i73Var.getClass();
                    i73Var.c.execute(new aq2(i73Var, i2));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fw
    public final void b(s70 s70Var) {
        String str;
        int i = this.a;
        Object obj = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                try {
                    ay0 ay0Var = (ay0) obj;
                    ay0Var.g.h(ay0Var.c(str2, ((kp2) s70Var.g).g).toString());
                } catch (JSONException e) {
                    jn.P("Error creating PACT Signal Response JSON: ", e);
                    return;
                }
                break;
            default:
                h30 h30Var = (h30) obj;
                String str3 = ((kp2) s70Var.g).g;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) wy0.c.u()).booleanValue()) {
                        jSONObject.put("as", h30Var.k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) wy0.e.u()).booleanValue() ? ((Long) wy0.h.u()).longValue() : 0L);
                    jSONObject.put("signal", str3);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, ((kp2) s70Var.g).g, Long.valueOf(((Boolean) wy0.e.u()).booleanValue() ? ((Long) wy0.h.u()).longValue() : 0L), ((Boolean) wy0.c.u()).booleanValue() ? ",\"as\":".concat(h30Var.k.b().toString()) : "");
                }
                if (((Boolean) wy0.e.u()).booleanValue()) {
                    try {
                        h30Var.h.execute(new k21(this, str, 1));
                    } catch (RuntimeException e2) {
                        vc3.C.h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e2);
                    }
                } else {
                    h30Var.b.evaluateJavascript(str, null);
                }
                if (((Boolean) wy0.c.u()).booleanValue() && ((Boolean) wy0.d.u()).booleanValue()) {
                    i73 i73Var = h30Var.l;
                    i73Var.getClass();
                    i73Var.c.execute(new aq2(i73Var, 0));
                    break;
                }
                break;
        }
    }

    public zx0(h30 h30Var, String str) {
        this.b = str;
        this.c = h30Var;
    }
}
