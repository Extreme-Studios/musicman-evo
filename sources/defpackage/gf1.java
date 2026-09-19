package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gf1 implements r63 {
    public final xe1 a;
    public final q63 b;

    public gf1(xe1 xe1Var, q63 q63Var) {
        this.a = xe1Var;
        this.b = q63Var;
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kd0 c() {
        Context contextA = this.a.a();
        e72 e72Var = (e72) this.b.c();
        vc3 vc3Var = vc3.C;
        a41 a41VarI = vc3Var.r.i(contextA, d60.a(), e72Var);
        ue0 ue0Var = z31.b;
        a41VarI.getClass();
        return new kd0(contextA, vc3Var.r.i(contextA, d60.a(), e72Var).a("google.afma.sdkConstants.getSdkConstants", ue0Var, ue0Var), d60.a());
    }
}
