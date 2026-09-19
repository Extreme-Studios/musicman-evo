package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh1 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ md1 g;
    public final /* synthetic */ JSONObject h;

    public /* synthetic */ fh1(JSONObject jSONObject, md1 md1Var) {
        this.h = jSONObject;
        this.g = md1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        JSONObject jSONObject = this.h;
        md1 md1Var = this.g;
        switch (i) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb = new StringBuilder(string.length() + 31);
                sb.append("Calling AFMA_updateActiveView(");
                sb.append(string);
                sb.append(")");
                jn.F(sb.toString());
                md1Var.e("AFMA_updateActiveView", jSONObject);
                break;
            default:
                qk2 qk2Var = no1.J;
                md1Var.b("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ fh1(md1 md1Var, JSONObject jSONObject) {
        this.g = md1Var;
        this.h = jSONObject;
    }
}
