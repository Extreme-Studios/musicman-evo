package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class yc implements r63 {
    public final /* synthetic */ int a;
    public final xe1 b;
    public final ef1 c;

    public /* synthetic */ yc(xe1 xe1Var, ef1 ef1Var, int i) {
        this.a = i;
        this.b = xe1Var;
        this.c = ef1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        ef1 ef1Var = this.c;
        xe1 xe1Var = this.b;
        switch (i) {
            case 0:
                return new xc((Context) xe1Var.c(), (d60) ef1Var.c());
            case 1:
                return new rt1(xe1Var.a(), ef1Var.a());
            case 2:
                Context contextA = xe1Var.a();
                d60 d60VarA = ef1Var.a();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new zt1(contextA, d60VarA, ya1Var);
            default:
                Context contextA2 = xe1Var.a();
                ix0 ix0Var = lx0.a;
                return new g32(contextA2, tu0.e.a.N(), ef1Var.a());
        }
    }
}
