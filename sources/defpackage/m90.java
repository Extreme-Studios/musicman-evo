package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m90 {
    public static final String e = yp.f("WorkTimer");
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    public m90() {
        k90 k90Var = new k90();
        k90Var.a = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(k90Var);
    }

    public final void a(String str, te teVar) {
        synchronized (this.d) {
            yp.d().a(e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            l90 l90Var = new l90(this, str);
            this.b.put(str, l90Var);
            this.c.put(str, teVar);
            this.a.schedule(l90Var, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((l90) this.b.remove(str)) != null) {
                    yp.d().a(e, "Stopping timer for " + str, new Throwable[0]);
                    this.c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
