package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class g12 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;

    public g12(q63 q63Var, bk1 bk1Var) {
        this.a = 15;
        this.b = q63Var;
        this.c = bk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01f8  */
    @Override // defpackage.v63
    public final Object c() {
        Object ck2Var;
        int i = this.a;
        v63 v63Var = this.b;
        v63 v63Var2 = this.c;
        switch (i) {
            case 0:
                return new t12(((ou1) v63Var2).a(), ((Integer) tu0.e.c.a(lx0.gd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 1:
                return new t12(((jy1) v63Var2).a(), ((Integer) tu0.e.c.a(lx0.id)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 2:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new t12(new k02(ya1Var, ((xe1) ((eg1) v63Var2).b).a(), 0), ((Integer) tu0.e.c.a(lx0.qd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 3:
                return new t12(new xz1(3, (y32) ((rs1) v63Var2).b.a), ((Integer) tu0.e.c.a(lx0.bd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 4:
                return new t12(((yi1) v63Var2).a(), ((Integer) tu0.e.c.a(lx0.jd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 5:
                Context contextA = ((xe1) ((eg1) v63Var2).b).a();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new t12(new k02(contextA, ya1Var2, 3), ((Integer) tu0.e.c.a(lx0.ad)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 6:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                k02 k02Var = new k02(ya1Var3, ((xe1) ((eg1) v63Var2).b).a(), 4);
                Context contextA2 = ((xe1) v63Var).a();
                if (((Boolean) tu0.e.c.a(lx0.gc)).booleanValue()) {
                    zb3 zb3Var = vc3.C.c;
                    if (zb3.d(contextA2)) {
                        int i2 = bk2.h;
                        ck2Var = new ck2(k02Var);
                    } else {
                        int i3 = bk2.h;
                        ck2Var = wk2.o;
                    }
                } else {
                    int i4 = bk2.h;
                    ck2Var = wk2.o;
                }
                dq.D(ck2Var);
                return ck2Var;
            case 7:
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new t12(new c02(ya1Var4, 3, ((er1) v63Var2).b.a()), ((Integer) tu0.e.c.a(lx0.nd)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 8:
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new t12(new c02(ya1Var5, 5, (qt1) ((q12) v63Var2).b.c()), ((Integer) tu0.e.c.a(lx0.Yc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 9:
                return new t12(new xz1(4, (w42) ((q12) v63Var2).b.c()), ((Integer) tu0.e.c.a(lx0.od)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 10:
                ya1 ya1Var6 = za1.a;
                dq.D(ya1Var6);
                return new t12(new c12(((xe1) ((q12) v63Var2).b).a(), ya1Var6), ((Integer) tu0.e.c.a(lx0.Vc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 11:
                ya1 ya1Var7 = za1.a;
                dq.D(ya1Var7);
                return new t12(new c02(ya1Var7, 6, (os1) ((q12) v63Var2).b.c()), ((Integer) tu0.e.c.a(lx0.Xc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 12:
                return new t12(((yi1) v63Var2).b(), ((Integer) tu0.e.c.a(lx0.Tc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 13:
                zh1 zh1Var = (zh1) v63Var2;
                aa1 aa1Var = (aa1) zh1Var.b.c();
                ya1 ya1Var8 = za1.a;
                dq.D(ya1Var8);
                return new t12(new g02(aa1Var, ya1Var8, ((xe1) zh1Var.c).a(), 3), ((Integer) tu0.e.c.a(lx0.Sc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 14:
                ya1 ya1Var9 = za1.a;
                dq.D(ya1Var9);
                return new t12(new k02(ya1Var9, ((xe1) ((q12) v63Var2).b).a(), 5), ((Integer) tu0.e.c.a(lx0.Qc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 15:
                ya1 ya1Var10 = za1.a;
                dq.D(ya1Var10);
                return new u62(ya1Var10, (ScheduledExecutorService) v63Var.c(), new t62(((bk1) v63Var2).b.c()));
            default:
                return new tg2((yg2) ((q63) v63Var2).c(), ((w63) v63Var).c());
        }
    }

    public /* synthetic */ g12(v63 v63Var, v63 v63Var2, int i) {
        this.a = i;
        this.c = v63Var;
        this.b = v63Var2;
    }
}
