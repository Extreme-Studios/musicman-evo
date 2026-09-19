package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class do1 implements r63 {
    public final /* synthetic */ int a;
    public final u40 b;

    public /* synthetic */ do1(u40 u40Var, int i) {
        this.a = i;
        this.b = u40Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        u40 u40Var = this.b;
        switch (i) {
            case 0:
                JSONObject jSONObject = (JSONObject) u40Var.g;
                dq.D(jSONObject);
                return jSONObject;
            case 1:
                uq1 uq1Var = (uq1) u40Var.h;
                dq.D(uq1Var);
                return uq1Var;
            case 2:
                return (vs0) u40Var.i;
            default:
                return (d91) u40Var.j;
        }
    }
}
