package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class im0 extends Thread {
    public final BlockingQueue f;
    public final hm0 g;
    public final ym0 h;
    public volatile boolean i = false;
    public final s70 j;

    public im0(PriorityBlockingQueue priorityBlockingQueue, z61 z61Var, ym0 ym0Var, s70 s70Var) {
        this.f = priorityBlockingQueue;
        this.g = z61Var;
        this.h = ym0Var;
        this.j = s70Var;
    }

    public final void a() {
        s70 s70Var = this.j;
        mm0 mm0Var = (mm0) this.f.take();
        SystemClock.elapsedRealtime();
        mm0Var.c();
        try {
            try {
                mm0Var.a("network-queue-take");
                synchronized (mm0Var.j) {
                }
                TrafficStats.setThreadStatsTag(mm0Var.i);
                km0 km0VarD = this.g.d(mm0Var);
                mm0Var.a("network-http-complete");
                if (km0VarD.e && mm0Var.g()) {
                    mm0Var.b("not-modified");
                    mm0Var.k();
                } else {
                    md mdVarH = mm0Var.h(km0VarD);
                    mm0Var.a("network-parse-complete");
                    dm0 dm0Var = (dm0) mdVarH.h;
                    if (dm0Var != null) {
                        this.h.b(mm0Var.d(), dm0Var);
                        mm0Var.a("network-cache-written");
                    }
                    synchronized (mm0Var.j) {
                        mm0Var.n = true;
                    }
                    s70Var.N(mm0Var, mdVarH, null);
                    mm0Var.j(mdVarH);
                }
            } catch (qm0 e) {
                SystemClock.elapsedRealtime();
                s70Var.getClass();
                mm0Var.a("post-error");
                ((fx) s70Var.g).g.post(new ib(mm0Var, new md(e), (Object) null, 7));
                mm0Var.k();
            } catch (Exception e2) {
                Log.e("Volley", tm0.d("Unhandled exception %s", e2.toString()), e2);
                qm0 qm0Var = new qm0(e2);
                SystemClock.elapsedRealtime();
                s70Var.getClass();
                mm0Var.a("post-error");
                ((fx) s70Var.g).g.post(new ib(mm0Var, new md(qm0Var), (Object) null, 7));
                mm0Var.k();
            }
            mm0Var.c();
        } catch (Throwable th) {
            mm0Var.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                tm0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
