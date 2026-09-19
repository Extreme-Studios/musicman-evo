package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class ai extends zh implements se {
    public final Executor h;

    public ai(Executor executor) {
        this.h = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        try {
            this.h.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            rs0.e(icVar, cancellationException);
            ke keVar = jf.a;
            ge.h.a(icVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ai) && ((ai) obj).h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h);
    }

    @Override // defpackage.lc
    public final String toString() {
        return this.h.toString();
    }
}
