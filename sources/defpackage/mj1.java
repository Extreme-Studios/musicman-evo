package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mj1 implements r63 {
    public final /* synthetic */ int a = 0;
    public final v63 b;
    public final yj1 c;
    public final q63 d;

    public mj1(yj1 yj1Var, q63 q63Var, q63 q63Var2) {
        this.c = yj1Var;
        this.b = q63Var;
        this.d = q63Var2;
    }

    public e02 a() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        i52 i52VarA = this.c.a();
        return new e02(ya1Var, i52VarA, ((Integer) this.d.c()).intValue());
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        q63 q63Var = this.d;
        yj1 yj1Var = this.c;
        v63 v63Var = this.b;
        switch (i) {
            case 0:
                return new lj1((Context) q63Var.c(), ((ef1) v63Var).a(), yj1Var.a(), 0);
            case 1:
                return new it1((qt1) v63Var.c(), yj1Var.a(), (String) q63Var.c());
            default:
                return a();
        }
    }

    public mj1(q63 q63Var, yj1 yj1Var, q63 q63Var2) {
        this.b = q63Var;
        this.c = yj1Var;
        this.d = q63Var2;
    }

    public mj1(q63 q63Var, v63 v63Var, yj1 yj1Var) {
        this.d = q63Var;
        this.b = v63Var;
        this.c = yj1Var;
    }
}
