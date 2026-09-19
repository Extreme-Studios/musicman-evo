package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 implements yk1, qt0, xl1 {
    public final x42 f;
    public final kk1 g;
    public final cl1 h;
    public final kl1 k;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean l = new AtomicBoolean();

    public gi1(x42 x42Var, kk1 kk1Var, cl1 cl1Var, kl1 kl1Var) {
        this.f = x42Var;
        this.g = kk1Var;
        this.h = cl1Var;
        this.k = kl1Var;
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        int i = this.f.e;
        if (i == 1) {
            if (pt0Var.j && this.i.compareAndSet(false, true)) {
                this.g.a();
            }
        } else if (i == 4 && pt0Var.j && this.l.compareAndSet(false, true)) {
            this.k.a();
        }
        if (pt0Var.j && this.j.compareAndSet(false, true)) {
            cl1 cl1Var = this.h;
            synchronized (cl1Var) {
                cl1Var.L1(ue0.m);
            }
        }
    }

    @Override // defpackage.yk1
    public final synchronized void e() {
        int i = this.f.e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.i.compareAndSet(false, true)) {
            this.g.a();
        }
    }

    @Override // defpackage.xl1
    public final void p() {
        if (this.f.e == 4 && this.i.compareAndSet(false, true)) {
            this.g.a();
        }
    }

    @Override // defpackage.xl1
    public final void w() {
    }
}
