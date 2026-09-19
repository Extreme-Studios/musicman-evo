package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s8 implements hp {
    public final WeakReference f;
    public final r8 g = new r8(this);

    public s8(q8 q8Var) {
        this.f = new WeakReference(q8Var);
    }

    @Override // defpackage.hp
    public final void a(Runnable runnable, Executor executor) {
        this.g.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        q8 q8Var = (q8) this.f.get();
        boolean zCancel = this.g.cancel(z);
        if (zCancel && q8Var != null) {
            q8Var.a = null;
            q8Var.b = null;
            q8Var.c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.g.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g.f instanceof y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g.isDone();
    }

    public final String toString() {
        return this.g.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.g.get(j, timeUnit);
    }
}
