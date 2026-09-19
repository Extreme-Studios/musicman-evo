package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class iq1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final q63 c;
    public final q63 d;
    public final q63 e;

    public iq1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4) {
        this.a = 5;
        this.c = q63Var;
        this.b = q63Var2;
        this.d = q63Var3;
        this.e = q63Var4;
    }

    public mx0 a() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new mx0(ya1Var, (ScheduledExecutorService) this.b.c(), (oi1) this.c.c(), (hy1) this.d.c(), (e82) this.e.c());
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        q63 q63Var = this.e;
        q63 q63Var2 = this.d;
        v63 v63Var = this.b;
        q63 q63Var3 = this.c;
        switch (i) {
            case 0:
                return new gq1((Executor) v63Var.c(), (kh1) q63Var3.c(), (xm1) q63Var2.c(), (sg1) q63Var.c());
            case 1:
                return a();
            case 2:
                return new bg2((qg2) q63Var3.c(), (lg2) q63Var2.c(), (ng2) q63Var.c(), (dh2) v63Var.c());
            case 3:
                return new ng2((kd2) q63Var3.c(), (kd2) q63Var2.c(), q63.b(q63Var), (dh2) v63Var.c(), 0);
            case 4:
                return new ng2((kd2) q63Var3.c(), (kd2) q63Var2.c(), q63.b(q63Var), (dh2) v63Var.c(), 1);
            default:
                return new te3((cs1) q63Var3.c(), (ce3) v63Var.c(), (String) q63Var2.c(), ((Integer) q63Var.c()).intValue());
        }
    }

    public /* synthetic */ iq1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, int i) {
        this.a = i;
        this.c = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
        this.b = q63Var4;
    }

    public /* synthetic */ iq1(v63 v63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
    }
}
