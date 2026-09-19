package defpackage;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class h12 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;

    public /* synthetic */ h12(r63 r63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, int i) {
        this.a = i;
        this.b = r63Var;
        this.c = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        v63 v63Var2 = this.d;
        v63 v63Var3 = this.c;
        v63 v63Var4 = this.b;
        switch (i) {
            case 0:
                c02 c02VarA = ((n02) v63Var4).c();
                b12 b12Var = (b12) v63Var3.c();
                List list = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) v63Var.c();
                if (list.contains("10")) {
                    return new t12(b12Var, ((Integer) tu0.e.c.a(lx0.Uc)).intValue(), scheduledExecutorService);
                }
                return new t12(c02VarA, ((Integer) tu0.e.c.a(lx0.Uc)).intValue(), scheduledExecutorService);
            case 1:
                c02 c02VarC = ((t02) v63Var4).c();
                b12 b12Var2 = (b12) v63Var3.c();
                List list2 = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) v63Var.c();
                if (list2.contains("54")) {
                    return new t12(b12Var2, ((Integer) tu0.e.c.a(lx0.ed)).intValue(), scheduledExecutorService2);
                }
                return new t12(c02VarC, ((Integer) tu0.e.c.a(lx0.ed)).intValue(), scheduledExecutorService2);
            case 2:
                k02 k02VarC = ((x02) v63Var4).c();
                b12 b12Var3 = (b12) v63Var3.c();
                List list3 = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) v63Var.c();
                if (list3.contains("13")) {
                    return new t12(b12Var3, ((Integer) tu0.e.c.a(lx0.dd)).intValue(), scheduledExecutorService3);
                }
                return new t12(k02VarC, ((Integer) tu0.e.c.a(lx0.dd)).intValue(), scheduledExecutorService3);
            case 3:
                c02 c02VarC2 = ((o12) v63Var4).c();
                b12 b12Var4 = (b12) v63Var3.c();
                List list4 = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) v63Var.c();
                if (list4.contains("60")) {
                    return new t12(b12Var4, ((Integer) tu0.e.c.a(lx0.Ed)).intValue(), scheduledExecutorService4);
                }
                return new t12(c02VarC2, ((Integer) tu0.e.c.a(lx0.Ed)).intValue(), scheduledExecutorService4);
            case 4:
                a02 a02VarC = ((h22) v63Var4).c();
                b12 b12Var5 = (b12) v63Var3.c();
                List list5 = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) v63Var.c();
                if (list5.contains("35")) {
                    return new t12(b12Var5, ((Integer) tu0.e.c.a(lx0.Rc)).intValue(), scheduledExecutorService5);
                }
                return new t12(a02VarC, ((Integer) tu0.e.c.a(lx0.Rc)).intValue(), scheduledExecutorService5);
            default:
                k02 k02VarC2 = ((t22) v63Var4).c();
                b12 b12Var6 = (b12) v63Var3.c();
                List list6 = (List) v63Var2.c();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) v63Var.c();
                if (list6.contains("39")) {
                    return new t12(b12Var6, ((Integer) tu0.e.c.a(lx0.Oc)).intValue(), scheduledExecutorService6);
                }
                return new t12(k02VarC2, ((Integer) tu0.e.c.a(lx0.Oc)).intValue(), scheduledExecutorService6);
        }
    }
}
