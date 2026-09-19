package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nr1 {
    public final gr1 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public nr1(gr1 gr1Var) {
        this.a = gr1Var;
    }

    public final void a(qk qkVar) {
        this.c.set(true);
        synchronized (qkVar.g) {
            try {
                if (((xt0) qkVar.h) == null) {
                    qkVar.h = new xt0();
                }
                xt0 xt0Var = (xt0) qkVar.h;
                synchronized (xt0Var.h) {
                    xt0Var.l.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gr1 gr1Var = this.a;
        gr1Var.getClass();
        rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 3));
    }

    public final void b() {
        if (this.b.get()) {
            gr1 gr1Var = this.a;
            gr1Var.getClass();
            rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 5));
        }
    }

    public final void c() {
        if (this.b.get()) {
            gr1 gr1Var = this.a;
            gr1Var.getClass();
            rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 0));
        }
    }

    public final void d() {
        if (this.b.getAndSet(false)) {
            gr1 gr1Var = this.a;
            gr1Var.getClass();
            rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 4));
        }
    }
}
