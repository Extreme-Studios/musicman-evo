package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 implements lb3 {
    public final ok1 f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public ui1(ok1 ok1Var) {
        this.f = ok1Var;
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        this.g.set(true);
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f.L1(zf0.o);
    }

    @Override // defpackage.lb3
    public final void N1() {
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f.L1(zf0.o);
    }

    @Override // defpackage.lb3
    public final void f() {
        this.f.L1(ue0.j);
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
