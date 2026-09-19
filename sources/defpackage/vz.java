package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vz implements Executor {
    public final Executor g;
    public volatile Runnable i;
    public final ArrayDeque f = new ArrayDeque();
    public final Object h = new Object();

    public vz(Executor executor) {
        this.g = executor;
    }

    public final void a() {
        synchronized (this.h) {
            try {
                Runnable runnable = (Runnable) this.f.poll();
                this.i = runnable;
                if (runnable != null) {
                    this.g.execute(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.h) {
            try {
                this.f.add(new in2(this, 10, runnable));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
