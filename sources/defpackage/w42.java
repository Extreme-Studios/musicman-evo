package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w42 {
    public final ae a;
    public final es1 b;
    public final Object c = new Object();
    public volatile int e = 1;
    public volatile long d = 0;

    public w42(ae aeVar, es1 es1Var) {
        this.a = aeVar;
        this.b = es1Var;
    }

    public final void a(boolean z) {
        if (((Boolean) tu0.e.c.a(lx0.Rd)).booleanValue()) {
            us2 us2VarA = this.b.a();
            us2VarA.s("action", "mbs_state");
            us2VarA.s("mbs_state", true != z ? "0" : "1");
            us2VarA.t();
        }
        if (z) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.c) {
            try {
                if (this.e == 3) {
                    if (this.d + ((Long) tu0.e.c.a(lx0.q6)).longValue() <= jCurrentTimeMillis) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i2) {
        b();
        Object obj = this.c;
        this.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i2;
                if (this.e == 3) {
                    this.d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
