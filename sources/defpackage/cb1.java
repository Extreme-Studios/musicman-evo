package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class cb1 implements hp {
    public final tn2 f = new tn2();

    @Override // defpackage.hp
    public final void a(Runnable runnable, Executor executor) {
        this.f.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zD = this.f.d(obj);
        if (!zD) {
            vc3.C.h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zD;
    }

    public final void c(Throwable th) {
        if (this.f.e(th)) {
            return;
        }
        vc3.C.h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f.f instanceof yl2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f.get(j, timeUnit);
    }
}
