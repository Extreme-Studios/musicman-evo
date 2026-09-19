package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class te3 implements en1 {
    public final cs1 f;
    public final ce3 g;
    public final String h;
    public final int i;

    public te3(cs1 cs1Var, ce3 ce3Var, String str, int i) {
        this.f = cs1Var;
        this.g = ce3Var;
        this.h = str;
        this.i = i;
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        String strOptString;
        if (j01Var == null || this.i == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(j01Var.c);
        cs1 cs1Var = this.f;
        ce3 ce3Var = this.g;
        if (zIsEmpty) {
            ce3Var.a(this.h, j01Var.b, cs1Var);
            return;
        }
        try {
            strOptString = new JSONObject(j01Var.c).optString("request_id");
        } catch (JSONException e) {
            vc3.C.h.d("RenderSignals.getRequestId", e);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        ce3Var.a(strOptString, j01Var.c, cs1Var);
    }

    @Override // defpackage.en1
    public final void F(String str) {
    }
}
