package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g21 implements h21 {
    public final /* synthetic */ int a = 1;
    public final cb1 b;

    public g21(s11 s11Var, cb1 cb1Var) {
        this.b = cb1Var;
        Objects.requireNonNull(s11Var);
    }

    @Override // defpackage.h21
    public final void w(String str) {
        int i = this.a;
        cb1 cb1Var = this.b;
        switch (i) {
            case 0:
                cb1Var.c(new w31(str));
                break;
            default:
                try {
                    if (str == null) {
                        cb1Var.c(new w31());
                    } else {
                        cb1Var.c(new w31(str));
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
        }
    }

    @Override // defpackage.h21
    public final void x(JSONObject jSONObject) {
        int i = this.a;
        cb1 cb1Var = this.b;
        switch (i) {
            case 0:
                cb1Var.b(jSONObject);
                break;
            default:
                try {
                    cb1Var.b(jSONObject);
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    cb1Var.c(e);
                    return;
                }
                break;
        }
    }

    public g21(g41 g41Var, cb1 cb1Var) {
        this.b = cb1Var;
    }
}
