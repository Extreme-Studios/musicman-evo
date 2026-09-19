package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ya1 extends AbstractExecutorService implements AutoCloseable, ExecutorService {
    public final /* synthetic */ int f = 0;
    public final Executor g;

    public ya1(ExecutorService executorService) {
        executorService.getClass();
        this.g = executorService;
    }

    public final hp a(Runnable runnable) {
        return (hp) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.g).awaitTermination(j, timeUnit);
        }
    }

    public final hp b(Callable callable) {
        return (hp) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                this.g.execute(runnable);
                break;
            default:
                ((ExecutorService) this.g).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.g).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.g).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new xn2(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.g).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.g).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (hp) super.submit(runnable);
    }

    public String toString() {
        switch (this.f) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.g;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return ec.o(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (hp) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (hp) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new xn2(callable);
    }

    public ya1(Executor executor) {
        this.g = executor;
    }
}
