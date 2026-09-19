package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e12 implements j22 {
    public final JSONObject a;
    public final JSONObject b;

    public e12(JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        rj1 rj1Var = (rj1) obj;
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            rj1Var.b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
