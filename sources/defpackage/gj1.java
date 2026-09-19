package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gj1 implements r63 {
    public final /* synthetic */ int a = 1;
    public final xe1 b;
    public final ef1 c;
    public final q63 d;

    public gj1(xe1 xe1Var, ef1 ef1Var, q63 q63Var) {
        this.b = xe1Var;
        this.c = ef1Var;
        this.d = q63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        q63 q63Var = this.d;
        ef1 ef1Var = this.c;
        xe1 xe1Var = this.b;
        switch (i) {
            case 0:
                Context contextA = xe1Var.a();
                e72 e72Var = (e72) q63Var.c();
                d60 d60VarA = ef1Var.a();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new dj1(contextA, e72Var, d60VarA, ya1Var);
            default:
                a41 a41VarN = new u40(7).n(xe1Var.a(), ef1Var.a(), (e72) q63Var.c());
                dq.D(a41VarN);
                return a41VarN;
        }
    }

    public gj1(xe1 xe1Var, q63 q63Var, ef1 ef1Var) {
        this.b = xe1Var;
        this.d = q63Var;
        this.c = ef1Var;
    }
}
