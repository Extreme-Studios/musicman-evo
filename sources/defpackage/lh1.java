package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lh1 implements r63 {
    public final /* synthetic */ int a;
    public final ti1 b;

    public /* synthetic */ lh1(ti1 ti1Var, int i) {
        this.a = i;
        this.b = ti1Var;
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        ti1 ti1Var = this.b;
        switch (i) {
            case 0:
                try {
                    return new JSONObject(ti1Var.a().z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new to1(ti1Var.a());
        }
    }
}
