package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rn2 extends ya1 implements ScheduledExecutorService {
    public final ScheduledExecutorService h;

    public rn2(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.h = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        xn2 xn2Var = new xn2(Executors.callable(runnable, null));
        return new pn2(xn2Var, this.h.schedule(xn2Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qn2 qn2Var = new qn2(runnable);
        return new pn2(qn2Var, this.h.scheduleAtFixedRate(qn2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qn2 qn2Var = new qn2(runnable);
        return new pn2(qn2Var, this.h.scheduleWithFixedDelay(qn2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        xn2 xn2Var = new xn2(callable);
        return new pn2(xn2Var, this.h.schedule(xn2Var, j, timeUnit));
    }
}
