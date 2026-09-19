package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 implements qt0 {
    public final md1 f;
    public final Executor g;
    public final AtomicReference h = new AtomicReference();

    public bi1(md1 md1Var, Executor executor) {
        this.f = md1Var;
        this.g = executor;
    }

    @Override // defpackage.qt0
    public final synchronized void Q0(pt0 pt0Var) {
        md1 md1Var = this.f;
        if (md1Var != null) {
            if (((Boolean) tu0.e.c.a(lx0.sd)).booleanValue()) {
                boolean z = pt0Var.j;
                AtomicReference atomicReference = this.h;
                if (z) {
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.g.execute(new xd1(md1Var, 3));
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference.getAndSet(bool2))) {
                        this.g.execute(new xd1(md1Var, 2));
                    }
                }
            }
        }
    }
}
