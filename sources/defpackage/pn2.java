package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class pn2 extends rs0 implements ScheduledFuture, hp, Future {
    public final fm2 v;
    public final ScheduledFuture w;

    public pn2(fm2 fm2Var, ScheduledFuture scheduledFuture) {
        super(22);
        this.v = fm2Var;
        this.w = scheduledFuture;
    }

    @Override // defpackage.hp
    public final void a(Runnable runnable, Executor executor) {
        this.v.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.v.cancel(z);
        if (zCancel) {
            this.w.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.w.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.v.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.w.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.v.isDone();
    }

    @Override // defpackage.rs0
    public final /* synthetic */ Object u() {
        return this.v;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.v.get(j, timeUnit);
    }
}
