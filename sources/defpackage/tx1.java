package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tx1 implements vw1 {
    public final rr1 a;

    public tx1(rr1 rr1Var) {
        this.a = rr1Var;
    }

    @Override // defpackage.vw1
    public final ww1 a(String str, JSONObject jSONObject) {
        return new ww1(this.a.a(str, jSONObject), new nx1(), str);
    }
}
