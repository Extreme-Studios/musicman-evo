package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements tw1 {
    public final pf1 a;
    public final Context b;
    public final jr1 c;
    public final i52 d;
    public final Executor e;
    public final wh2 f;
    public final cs1 g;

    public hx1(pf1 pf1Var, Context context, Executor executor, jr1 jr1Var, i52 i52Var, wh2 wh2Var, cs1 cs1Var) {
        this.b = context;
        this.a = pf1Var;
        this.e = executor;
        this.c = jr1Var;
        this.d = i52Var;
        this.f = wh2Var;
        this.g = cs1Var;
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        b52 b52Var = x42Var.s;
        return (b52Var == null || b52Var.a == null) ? false : true;
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        return na1.L(kn2.g, new qn0(this, e52Var, x42Var, 5), this.e);
    }
}
