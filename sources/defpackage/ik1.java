package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends t33 implements fk1 {
    public final ScheduledExecutorService h;
    public ScheduledFuture i;
    public boolean j;

    public ik1(gk1 gk1Var, Set set, ya1 ya1Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.j = false;
        this.h = scheduledExecutorService;
        I1(gk1Var, ya1Var);
    }

    @Override // defpackage.fk1
    public final void N(fu1 fu1Var) {
        L1(new s70(23, fu1Var));
    }

    @Override // defpackage.fk1
    public final void P(on1 on1Var) {
        if (this.j) {
            return;
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        L1(new zx(20, on1Var));
    }

    public final void R1() {
        this.i = this.h.schedule(new va1(17, this), ((Integer) tu0.e.c.a(lx0.xb)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.fk1
    public final void b() {
        L1(ue0.h);
    }
}
