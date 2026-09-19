package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class jt1 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;

    public /* synthetic */ jt1(q63 q63Var, int i) {
        this.a = i;
        this.b = q63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        q63 q63Var = this.b;
        switch (i) {
            case 0:
                it1 it1Var = (it1) q63Var.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new wm1(it1Var, ya1Var);
            case 1:
                it1 it1Var2 = (it1) q63Var.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new wm1(it1Var2, ya1Var2);
            case 2:
                it1 it1Var3 = (it1) q63Var.c();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new wm1(it1Var3, ya1Var3);
            case 3:
                return new wm1((bu1) q63Var.c(), za1.g);
            case 4:
                return new wm1((bu1) q63Var.c(), za1.g);
            case 5:
                return new wm1((bu1) q63Var.c(), za1.g);
            case 6:
                Context context = (Context) q63Var.c();
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new su1(context, ya1Var4, 0);
            case 7:
                vv1 vv1Var = (vv1) q63Var.c();
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new wm1(vv1Var, ya1Var5);
            case 8:
                vv1 vv1Var2 = (vv1) q63Var.c();
                ya1 ya1Var6 = za1.a;
                dq.D(ya1Var6);
                return new wm1(vv1Var2, ya1Var6);
            case 9:
                return new k52((zq0) q63Var.c());
            case 10:
                return new wm1((v52) q63Var.c(), za1.g);
            case 11:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) q63Var.c()));
                dq.D(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 12:
                return new c82((bw1) q63Var.c());
            case 13:
                return new re2((dh2) q63Var.c());
            case 14:
                return new zg2();
            default:
                return new ce3((hs1) q63Var.c());
        }
    }
}
