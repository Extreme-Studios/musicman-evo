package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface g31 extends l31, f31 {
    @Override // defpackage.f31
    default void a(String str, Map map) {
        try {
            b("openIntentAsync", ut0.f.a.j(map));
        } catch (JSONException unused) {
            jn.T("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.f31
    default void b(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',");
        sb.append(string);
        sb.append(");");
        jn.F("Dispatching AFMA event: ".concat(sb.toString()));
        l(sb.toString());
    }

    @Override // defpackage.l31
    void l(String str);

    @Override // defpackage.l31
    default void s(String str, String str2) {
        l(ec.o(new StringBuilder(ec.f(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }
}
