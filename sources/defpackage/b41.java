package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b41 implements h21 {
    public final r31 a;
    public final cb1 b;
    public final /* synthetic */ c41 c;

    public b41(r31 r31Var, c41 c41Var, cb1 cb1Var) {
        Objects.requireNonNull(c41Var);
        this.c = c41Var;
        this.a = r31Var;
        this.b = cb1Var;
    }

    @Override // defpackage.h21
    public final void w(String str) {
        r31 r31Var = this.a;
        cb1 cb1Var = this.b;
        try {
            if (str == null) {
                cb1Var.c(new w31());
            } else {
                cb1Var.c(new w31(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            r31Var.p();
        }
    }

    @Override // defpackage.h21
    public final void x(JSONObject jSONObject) {
        r31 r31Var = this.a;
        cb1 cb1Var = this.b;
        try {
            try {
                cb1Var.b(((x31) this.c.c).x(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                cb1Var.c(e);
            }
        } finally {
            r31Var.p();
        }
    }
}
