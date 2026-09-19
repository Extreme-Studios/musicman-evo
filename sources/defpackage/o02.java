package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o02 implements m22 {
    public final sa1 a;
    public final fe3 b;
    public final ScheduledExecutorService c;
    public final ya1 d;
    public final Context e;

    public o02(Context context, sa1 sa1Var, ScheduledExecutorService scheduledExecutorService, ya1 ya1Var) {
        if (!((Boolean) tu0.e.c.a(lx0.o3)).booleanValue()) {
            this.b = new fe3(context);
        }
        this.e = context;
        this.a = sa1Var;
        this.c = scheduledExecutorService;
        this.d = ya1Var;
    }

    @Override // defpackage.m22
    public final hp a() {
        ve3 ve3VarE;
        ix0 ix0Var = lx0.k3;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            if (!((Boolean) tu0Var.c.a(lx0.p3)).booleanValue()) {
                if (!((Boolean) tu0Var.c.a(lx0.l3)).booleanValue()) {
                    return na1.M(v51.u(this.b.e()), lh0.o, za1.g);
                }
                if (((Boolean) tu0Var.c.a(lx0.o3)).booleanValue()) {
                    i8.v(this.e, false);
                    synchronized (i8.z) {
                        ve3VarE = i8.x;
                    }
                } else {
                    ve3VarE = this.b.e();
                }
                if (ve3VarE == null) {
                    return na1.t(new p02(null, -1, 0));
                }
                hp hpVarL = na1.L(v51.u(ve3VarE), kg0.k, za1.g);
                if (((Boolean) tu0Var.c.a(lx0.m3)).booleanValue()) {
                    hpVarL = na1.K(hpVarL, ((Long) tu0Var.c.a(lx0.n3)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return na1.I(hpVarL, Exception.class, new zl0(5, this), this.d);
            }
        }
        return na1.t(new p02(null, -1, 0));
    }

    @Override // defpackage.m22
    public final int c() {
        return 11;
    }
}
