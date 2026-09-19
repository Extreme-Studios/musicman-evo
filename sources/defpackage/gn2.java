package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gn2 extends fn2 {
    public final hp m;

    public gn2(hp hpVar) {
        hpVar.getClass();
        this.m = hpVar;
    }

    @Override // defpackage.fm2, defpackage.hp
    public final void a(Runnable runnable, Executor executor) {
        this.m.a(runnable, executor);
    }

    @Override // defpackage.fm2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.m.cancel(z);
    }

    @Override // defpackage.fm2, java.util.concurrent.Future
    public final Object get() {
        return this.m.get();
    }

    @Override // defpackage.fm2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.m.isCancelled();
    }

    @Override // defpackage.fm2, java.util.concurrent.Future
    public final boolean isDone() {
        return this.m.isDone();
    }

    @Override // defpackage.fm2
    public final String toString() {
        return this.m.toString();
    }

    @Override // defpackage.fm2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.m.get(j, timeUnit);
    }
}
