package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ix1 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final v63 c;
    public final s63 d;

    public /* synthetic */ ix1(q63 q63Var, s63 s63Var, v63 v63Var, int i) {
        this.a = i;
        this.b = q63Var;
        this.d = s63Var;
        this.c = v63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        int i2 = 1;
        s63 s63Var = this.d;
        v63 v63Var = this.c;
        q63 q63Var = this.b;
        switch (i) {
            case 0:
                return new ex1((Context) q63Var.c(), (pf1) s63Var.a, (Executor) v63Var.c(), i2);
            case 1:
                Context context = (Context) q63Var.c();
                d60 d60VarA = ((ef1) v63Var).a();
                sf1 sf1Var = (sf1) s63Var.a;
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new kx1(context, d60VarA, sf1Var, ya1Var);
            case 2:
                return new ex1((Context) q63Var.c(), (hf1) s63Var.a, (Executor) v63Var.c(), 2);
            case 3:
                return new kx1((Context) q63Var.c(), (hf1) s63Var.a, ((ef1) v63Var).a());
            case 4:
                return new ny1((Context) q63Var.c(), (Executor) v63Var.c(), (wf1) s63Var.a, 0);
            default:
                return new ny1((Context) q63Var.c(), (Executor) v63Var.c(), (wf1) s63Var.a, 1);
        }
    }

    public /* synthetic */ ix1(q63 q63Var, v63 v63Var, s63 s63Var, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = v63Var;
        this.d = s63Var;
    }
}
