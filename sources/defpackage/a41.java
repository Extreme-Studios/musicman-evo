package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a41 {
    public static final zf0 b = new zf0(12);
    public final uj1 a;

    public a41(Context context, d60 d60Var, String str, e72 e72Var) {
        uj1 uj1Var = new uj1();
        uj1Var.b = new Object();
        uj1Var.g = 1;
        uj1Var.c = str;
        uj1Var.a = context.getApplicationContext();
        uj1Var.d = d60Var;
        uj1Var.e = e72Var;
        this.a = uj1Var;
    }

    public final c41 a(String str, y31 y31Var, x31 x31Var) {
        return new c41(this.a, str, y31Var, x31Var);
    }
}
