package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class hn1 implements lb3, ib0 {
    public final nr1 f;
    public final z42 g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public hn1(nr1 nr1Var, z42 z42Var) {
        this.f = nr1Var;
        this.g = z42Var;
    }

    @Override // defpackage.ib0
    public final void B() {
        nr1 nr1Var = this.f;
        if (nr1Var.b.get()) {
            gr1 gr1Var = nr1Var.a;
            gr1Var.getClass();
            rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 1));
        }
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        a();
    }

    @Override // defpackage.lb3
    public final void N1() {
        a();
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        nr1 nr1Var = this.f;
        if (nr1Var.b.getAndSet(false)) {
            gr1 gr1Var = nr1Var.a;
            gr1Var.getClass();
            rs0.j((wb) gr1Var.c, new bc2(gr1Var, null, 2));
        }
    }

    @Override // defpackage.lb3
    public final void f() {
        String str = this.g.b;
        boolean zV = yd.v(str);
        nr1 nr1Var = this.f;
        if (zV) {
            nr1Var.getClass();
            return;
        }
        if (!nr1Var.c.get() || nr1Var.b.getAndSet(true)) {
            return;
        }
        gr1 gr1Var = nr1Var.a;
        gr1Var.getClass();
        str.getClass();
        rs0.j((wb) gr1Var.c, new sd(gr1Var, str, null, 5));
    }

    @Override // defpackage.lb3
    public final void C1() {
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.lb3
    public final void S2() {
    }

    @Override // defpackage.lb3
    public final void Y() {
    }

    @Override // defpackage.lb3
    public final void g3() {
    }

    @Override // defpackage.lb3
    public final void i3() {
    }

    @Override // defpackage.lb3
    public final void n2() {
    }
}
