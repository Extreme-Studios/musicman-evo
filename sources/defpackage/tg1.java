package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class tg1 implements r63 {
    public final /* synthetic */ int a = 1;
    public final q63 b;
    public final q63 c;
    public final v63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;

    public tg1(xe1 xe1Var, ve1 ve1Var, q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4) {
        this.d = xe1Var;
        this.e = ve1Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.f = q63Var3;
        this.g = q63Var4;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.g;
        v63 v63Var2 = this.f;
        v63 v63Var3 = this.e;
        v63 v63Var4 = this.d;
        q63 q63Var = this.c;
        q63 q63Var2 = this.b;
        switch (i) {
            case 0:
                Context contextA = ((xe1) v63Var4).a();
                h73 h73VarC = ((ve1) v63Var3).c();
                rw1 rw1Var = (rw1) q63Var2.c();
                mr1 mr1Var = (mr1) q63Var.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new sg1(contextA, h73VarC, rw1Var, mr1Var, ya1Var, (ya1) v63Var2.c(), (ScheduledExecutorService) v63Var.c());
            default:
                return new ig2((qg2) q63Var2.c(), (ng2) q63Var.c(), (tg2) v63Var4.c(), (dh2) v63Var3.c(), (vc2) v63Var2.c(), (ExecutorService) v63Var.c());
        }
    }

    public tg1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, s63 s63Var, s63 s63Var2) {
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = q63Var4;
        this.f = s63Var;
        this.g = s63Var2;
    }
}
