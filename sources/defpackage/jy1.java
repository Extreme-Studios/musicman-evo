package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class jy1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;
    public final v63 d;

    public /* synthetic */ jy1(v63 v63Var, v63 v63Var2, v63 v63Var3, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = v63Var2;
        this.d = v63Var3;
    }

    public a02 a() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new a02(ya1Var, (rr1) this.b.c(), (dt1) this.c.c(), (j02) this.d.c(), 2);
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.d;
        v63 v63Var2 = this.c;
        v63 v63Var3 = this.b;
        switch (i) {
            case 0:
                return new r52((q52) v63Var3.c(), (qr1) v63Var2.c(), (es1) v63Var.c(), 22, false);
            case 1:
                return a();
            case 2:
                Context contextA = ((xe1) v63Var3).a();
                sa1 sa1Var = (sa1) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) v63Var.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new o02(contextA, sa1Var, scheduledExecutorService, ya1Var);
            case 3:
                Object xz1Var = new xz1(0, ((xe1) ((zz1) v63Var3).a).a());
                b12 b12Var = (b12) v63Var2.c();
                if (true == ((List) v63Var.c()).contains("2")) {
                    xz1Var = b12Var;
                }
                dq.D(xz1Var);
                return xz1Var;
            case 4:
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                c12 c12Var = new c12(ya1Var2, 2);
                b12 b12Var2 = (b12) v63Var3.c();
                List list = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) v63Var.c();
                if (list.contains("24")) {
                    return new t12(b12Var2, ((Integer) tu0.e.c.a(lx0.Wc)).intValue(), scheduledExecutorService2);
                }
                return new t12(c12Var, ((Integer) tu0.e.c.a(lx0.Wc)).intValue(), scheduledExecutorService2);
            case 5:
                Object objC = ((v12) v63Var3).c();
                b12 b12Var3 = (b12) v63Var2.c();
                if (true == ((List) v63Var.c()).contains("29")) {
                    objC = b12Var3;
                }
                dq.D(objC);
                return objC;
            case 6:
                return new dg2((Context) v63Var3.c(), (vc2) v63Var2.c(), (tg2) v63Var.c());
            case 7:
                return new cg2((Context) v63Var3.c(), (ExecutorService) v63Var2.c(), (ud2) v63Var.c());
            default:
                return new sg2((dh2) v63Var2.c(), ((vc2) v63Var.c()).J().A());
        }
    }
}
