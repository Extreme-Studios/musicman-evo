package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class mn2 extends AtomicReference implements Runnable {
    public static final t8 f;
    public static final t8 g;

    static {
        int i = 10;
        f = new t8(i);
        g = new t8(i);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        ln2 ln2Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof ln2;
            t8 t8Var = g;
            if (!z2) {
                if (runnable != t8Var) {
                    break;
                }
            } else {
                ln2Var = (ln2) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == t8Var || compareAndSet(runnable, t8Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(ln2Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        t8 t8Var = g;
        t8 t8Var2 = f;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ln2 ln2Var = new ln2(this);
            ln2Var.a(Thread.currentThread());
            if (compareAndSet(runnable, ln2Var)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(t8Var2)) == t8Var) {
                    }
                } finally {
                    if (((Runnable) getAndSet(t8Var2)) == t8Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            t8 t8Var = f;
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, t8Var)) {
                            b(threadCurrentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, t8Var)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, t8Var)) {
                b(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strN;
        Runnable runnable = (Runnable) get();
        if (runnable == f) {
            strN = "running=[DONE]";
        } else if (runnable instanceof ln2) {
            strN = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strN = ec.n(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strN = "running=[NOT STARTED YET]";
        }
        String strC = c();
        return ec.n(new StringBuilder(strN.length() + 2 + String.valueOf(strC).length()), strN, ", ", strC);
    }
}
