package defpackage;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class em0 extends Thread {
    public static final boolean l = tm0.a;
    public final BlockingQueue f;
    public final BlockingQueue g;
    public final ym0 h;
    public volatile boolean i = false;
    public final y91 j;
    public final s70 k;

    public em0(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, ym0 ym0Var, s70 s70Var) {
        this.f = priorityBlockingQueue;
        this.g = priorityBlockingQueue2;
        this.h = ym0Var;
        this.k = s70Var;
        this.j = new y91(this, priorityBlockingQueue2, s70Var);
    }

    public final void a() {
        mm0 mm0Var = (mm0) this.f.take();
        mm0Var.a("cache-queue-take");
        mm0Var.c();
        try {
            synchronized (mm0Var.j) {
            }
            ym0 ym0Var = this.h;
            dm0 dm0VarA = ym0Var.a(mm0Var.d());
            if (dm0VarA == null) {
                mm0Var.a("cache-miss");
                if (!this.j.C(mm0Var)) {
                    this.g.put(mm0Var);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (dm0VarA.e < jCurrentTimeMillis) {
                    mm0Var.a("cache-hit-expired");
                    mm0Var.o = dm0VarA;
                    if (!this.j.C(mm0Var)) {
                        this.g.put(mm0Var);
                    }
                } else {
                    mm0Var.a("cache-hit");
                    byte[] bArr = dm0VarA.a;
                    Map map = dm0VarA.g;
                    md mdVarH = mm0Var.h(new km0(200, bArr, map, km0.a(map), false));
                    mm0Var.a("cache-hit-parsed");
                    if (!(((qm0) mdVarH.i) == null)) {
                        mm0Var.a("cache-parsing-failed");
                        String strD = mm0Var.d();
                        synchronized (ym0Var) {
                            dm0 dm0VarA2 = ym0Var.a(strD);
                            if (dm0VarA2 != null) {
                                dm0VarA2.f = 0L;
                                dm0VarA2.e = 0L;
                                ym0Var.b(strD, dm0VarA2);
                            }
                        }
                        mm0Var.o = null;
                        if (!this.j.C(mm0Var)) {
                            this.g.put(mm0Var);
                        }
                    } else if (dm0VarA.f < jCurrentTimeMillis) {
                        mm0Var.a("cache-hit-refresh-needed");
                        mm0Var.o = dm0VarA;
                        mdVarH.f = true;
                        boolean zC = this.j.C(mm0Var);
                        s70 s70Var = this.k;
                        if (zC) {
                            s70Var.N(mm0Var, mdVarH, null);
                        } else {
                            s70Var.N(mm0Var, mdVarH, new in2(this, mm0Var, 17, false));
                        }
                    } else {
                        this.k.N(mm0Var, mdVarH, null);
                    }
                }
            }
            mm0Var.c();
        } catch (Throwable th) {
            mm0Var.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (l) {
            tm0.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.h.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                tm0.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
