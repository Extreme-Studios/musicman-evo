package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 extends t33 {
    public final ScheduledExecutorService h;
    public final ae i;
    public final es1 j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public ScheduledFuture p;
    public ScheduledFuture q;

    public nl1(ScheduledExecutorService scheduledExecutorService, ae aeVar, es1 es1Var) {
        super(Collections.EMPTY_SET);
        this.k = -1L;
        this.l = -1L;
        this.m = -1L;
        this.n = -1L;
        this.o = false;
        this.h = scheduledExecutorService;
        this.i = aeVar;
        this.j = es1Var;
    }

    public final synchronized void R1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        jn.p(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.o) {
                long j = this.m;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.m = millis;
                return;
            }
            this.i.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ix0 ix0Var = lx0.ae;
            tu0 tu0Var = tu0.e;
            boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
            long j2 = this.k;
            if (zBooleanValue) {
                if (jElapsedRealtime >= j2 || j2 - jElapsedRealtime > millis) {
                    T1(millis);
                    if (((Boolean) tu0Var.c.a(lx0.qe)).booleanValue()) {
                        us2 us2VarA = this.j.a();
                        us2VarA.s("action", "rtnc");
                        us2VarA.y();
                    }
                }
            } else if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                T1(millis);
            }
        }
    }

    public final synchronized void S1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        jn.p(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.o) {
                long j = this.n;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.n = millis;
                return;
            }
            this.i.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.ae)).booleanValue();
            long j2 = this.l;
            if (zBooleanValue) {
                if (jElapsedRealtime == j2) {
                    jn.p("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.l;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    U1(millis);
                }
            } else if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                U1(millis);
            }
        }
    }

    public final synchronized void T1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.p;
            int i = 0;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.p.cancel(false);
            }
            this.i.getClass();
            this.k = SystemClock.elapsedRealtime() + j;
            this.p = this.h.schedule(new ml1(this, i), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void U1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.q;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.q.cancel(false);
            }
            this.i.getClass();
            this.l = SystemClock.elapsedRealtime() + j;
            this.q = this.h.schedule(new ml1(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void r() {
        this.o = false;
        T1(0L);
    }
}
