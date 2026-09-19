package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ge extends zh implements Executor {
    public static final ge h = new ge();
    public static final lc i;

    static {
        l50 l50Var = l50.h;
        int i2 = a30.a;
        if (64 >= i2) {
            i2 = 64;
        }
        i = l50Var.d(a23.q("kotlinx.coroutines.io.parallelism", i2, 12));
    }

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        i.a(icVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(jh.f, runnable);
    }

    @Override // defpackage.lc
    public final String toString() {
        return "Dispatchers.IO";
    }
}
