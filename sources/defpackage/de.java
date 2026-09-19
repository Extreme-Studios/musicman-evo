package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class de extends xh implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final de n;
    public static final long o;

    static {
        Long l;
        de deVar = new de();
        n = deVar;
        deVar.l(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        o = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.xh
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.j(runnable);
    }

    @Override // defpackage.xh
    public final Thread k() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(n.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void p() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            xh.k.set(this, null);
            xh.l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        u30.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    p();
                    if (m()) {
                        return;
                    }
                    k();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jN = n();
                    if (jN == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = o + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            p();
                            if (m()) {
                                return;
                            }
                            k();
                            return;
                        }
                        if (jN > j2) {
                            jN = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jN > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            p();
                            if (m()) {
                                return;
                            }
                            k();
                            return;
                        }
                        LockSupport.parkNanos(this, jN);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            p();
            if (!m()) {
                k();
            }
            throw th;
        }
    }

    @Override // defpackage.xh
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.lc
    public final String toString() {
        return "DefaultExecutor";
    }
}
