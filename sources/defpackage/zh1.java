package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zh1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;

    public /* synthetic */ zh1(v63 v63Var, v63 v63Var2, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = v63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.c;
        v63 v63Var2 = this.b;
        switch (i) {
            case 0:
                return new z91(((xe1) v63Var2).a(), ((yj1) v63Var).a().g);
            case 1:
                return new aj1((cj1) v63Var2.c(), ((yj1) v63Var).a());
            case 2:
                return new z91(((xe1) v63Var2).a(), ((yj1) v63Var).a().g);
            case 3:
                n11 n11Var = (n11) v63Var2.c();
                ae aeVar = (ae) v63Var.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new up1(n11Var, aeVar, ya1Var);
            case 4:
                return new ms1((ks1) v63Var2.c(), (if1) v63Var.c());
            case 5:
                return new bu1(((xe1) v63Var2).a(), (es1) v63Var.c());
            case 6:
                return new av1(((xe1) v63Var2).a(), (aa1) v63Var.c());
            case 7:
                return new t12((b12) v63Var2.c(), ((Integer) tu0.e.c.a(lx0.cd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 8:
                return new t12((b12) v63Var2.c(), ((Integer) tu0.e.c.a(lx0.Pc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 9:
                aa1 aa1Var = (aa1) v63Var2.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new g02(aa1Var, ya1Var2, ((xe1) v63Var).a(), 3);
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) v63Var2.c();
                ((xe1) v63Var).a();
                return new xz1(6, scheduledExecutorService);
            case 11:
                return new v52(((xe1) v63Var2).a(), ((ff1) v63Var).c());
            default:
                return new w62(((xe1) v63Var2).a(), (d72) v63Var.c());
        }
    }
}
