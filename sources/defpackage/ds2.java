package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ds2 {
    public static final ds2 b = new ds2();
    public final AtomicReference a = new AtomicReference(new rs2(new un1(23)));

    public final synchronized void a(os2 os2Var) {
        AtomicReference atomicReference = this.a;
        un1 un1Var = new un1((rs2) atomicReference.get());
        un1Var.q(os2Var);
        atomicReference.set(new rs2(un1Var));
    }

    public final synchronized void b(ss2 ss2Var) {
        AtomicReference atomicReference = this.a;
        un1 un1Var = new un1((rs2) atomicReference.get());
        un1Var.u(ss2Var);
        atomicReference.set(new rs2(un1Var));
    }
}
