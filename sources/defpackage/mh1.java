package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class mh1 implements yt0 {
    public final ScheduledExecutorService f;
    public final ae g;
    public ScheduledFuture h;
    public long i = -1;
    public long j = -1;
    public t32 k = null;
    public boolean l = false;

    public mh1(ScheduledExecutorService scheduledExecutorService, ae aeVar) {
        this.f = scheduledExecutorService;
        this.g = aeVar;
        vc3.C.g.f(this);
    }

    @Override // defpackage.yt0
    public final void T(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.l) {
                        if (this.j > 0 && (scheduledFuture = this.h) != null && scheduledFuture.isCancelled()) {
                            this.h = this.f.schedule(this.k, this.j, TimeUnit.MILLISECONDS);
                        }
                        this.l = false;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this) {
            try {
                if (this.l) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.h;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.j = -1L;
                } else {
                    this.h.cancel(true);
                    long j = this.i;
                    this.g.getClass();
                    this.j = j - SystemClock.elapsedRealtime();
                }
                this.l = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
