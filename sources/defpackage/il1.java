package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class il1 extends t33 implements lk1, dl1 {
    public final x42 h;
    public final AtomicBoolean i;
    public final e52 j;

    public il1(Set set, x42 x42Var, e52 e52Var) {
        super(set);
        this.i = new AtomicBoolean();
        this.h = x42Var;
        this.j = e52Var;
    }

    @Override // defpackage.lk1
    public final void B0() {
        int i = this.h.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            R1();
        }
    }

    public final void R1() {
        qc3 qc3Var;
        if (((Boolean) tu0.e.c.a(lx0.x8)).booleanValue() && this.i.compareAndSet(false, true) && (qc3Var = this.h.e0) != null && qc3Var.f == 3) {
            L1(new s70(24, qc3Var));
        }
    }

    @Override // defpackage.t33
    public final void i() {
        if (this.h.b == 1) {
            R1();
        }
    }
}
