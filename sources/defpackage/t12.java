package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t12 implements m22 {
    public final m22 a;
    public final long b;
    public final ScheduledExecutorService c;

    public t12(m22 m22Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = m22Var;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.m22
    public final hp a() {
        hp hpVarA = this.a.a();
        TimeUnit timeUnit = ((Boolean) tu0.e.c.a(lx0.x2)).booleanValue() ? TimeUnit.MICROSECONDS : TimeUnit.MILLISECONDS;
        long j = this.b;
        if (j > 0) {
            hpVarA = na1.K(hpVarA, j, timeUnit, this.c);
        }
        return na1.J(hpVarA, Throwable.class, new r21(9, this), za1.g);
    }

    @Override // defpackage.m22
    public final int c() {
        return this.a.c();
    }
}
