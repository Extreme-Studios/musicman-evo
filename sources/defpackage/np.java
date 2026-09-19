package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class np extends g2 {
    public final qx k;

    public np(int i, String str, String str2, g2 g2Var, qx qxVar) {
        super(i, str, str2, g2Var);
        this.k = qxVar;
    }

    @Override // defpackage.g2
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectG = super.g();
        qx qxVar = this.k;
        if (qxVar == null) {
            jSONObjectG.put("Response Info", "null");
            return jSONObjectG;
        }
        jSONObjectG.put("Response Info", qxVar.a());
        return jSONObjectG;
    }

    @Override // defpackage.g2
    public final String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
