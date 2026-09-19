package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wa1 {
    public ya1 a;
    public es1 b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;
    public long f = -1;

    public final void a(ya1 ya1Var, es1 es1Var) {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.a = ya1Var;
        this.b = es1Var;
        ix0 ix0Var = lx0.te;
        tu0 tu0Var = tu0.e;
        this.e = ((Long) tu0Var.c.a(ix0Var)).longValue();
        this.f = ((Long) tu0Var.c.a(lx0.ue)).longValue();
    }
}
