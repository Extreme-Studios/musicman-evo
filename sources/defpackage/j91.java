package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j91 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final s63 c;

    public j91(s63 s63Var, q63 q63Var) {
        this.a = 0;
        this.c = s63Var;
        this.b = q63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        int i2 = 0;
        s63 s63Var = this.c;
        q63 q63Var = this.b;
        switch (i) {
            case 0:
                return new z61((ae) s63Var.a, 13, (h91) q63Var.c());
            case 1:
                return new vr1((cv0) q63Var.c(), (k42) s63Var.a);
            case 2:
                Context context = (Context) q63Var.c();
                nf1 nf1Var = (nf1) s63Var.a;
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new ex1(context, nf1Var, ya1Var, i2);
            case 3:
                return new gx1((Context) q63Var.c(), (nf1) s63Var.a, 0);
            case 4:
                return new kx1((Context) q63Var.c(), (pf1) s63Var.a);
            case 5:
                return new gx1((Context) q63Var.c(), (sf1) s63Var.a, 1);
            default:
                return new gx1((Context) q63Var.c(), (wf1) s63Var.a, 2);
        }
    }

    public /* synthetic */ j91(q63 q63Var, s63 s63Var, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = s63Var;
    }
}
