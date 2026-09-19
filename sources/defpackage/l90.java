package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements Runnable {
    public final m90 f;
    public final String g;

    public l90(m90 m90Var, String str) {
        this.f = m90Var;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f.d) {
            try {
                if (((l90) this.f.b.remove(this.g)) != null) {
                    te teVar = (te) this.f.c.remove(this.g);
                    if (teVar != null) {
                        String str = this.g;
                        yp.d().a(te.o, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        teVar.f();
                    }
                } else {
                    yp.d().a("WrkTimerRunnable", "Timer with " + this.g + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
