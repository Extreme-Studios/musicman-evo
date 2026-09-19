package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final q63 c;

    public /* synthetic */ eh1(q63 q63Var, v63 v63Var, int i) {
        this.a = i;
        this.c = q63Var;
        this.b = v63Var;
    }

    public qy1 a() {
        return new qy1((cz1) this.c.c(), (rr1) this.b.c());
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        q63 q63Var = this.c;
        v63 v63Var = this.b;
        switch (i) {
            case 0:
                return new dh1(((xe1) v63Var).a(), (ot0) q63Var.c());
            case 1:
                return new zi1((ae) v63Var.c(), (pa1) q63Var.c());
            case 2:
                return new vs0((Context) v63Var.c(), (d91) q63Var.c());
            case 3:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 4:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 5:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 6:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 7:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 8:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 9:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 10:
                return new wm1((tl1) q63Var.c(), (Executor) v63Var.c());
            case 11:
                return a();
            case 12:
                hp hpVar = (hp) q63Var.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new g02(hpVar, ya1Var, (ScheduledExecutorService) v63Var.c(), 0);
            default:
                return rs0.w((Context) v63Var.c(), (ga2) q63Var.c());
        }
    }

    public /* synthetic */ eh1(v63 v63Var, q63 q63Var, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = q63Var;
    }
}
