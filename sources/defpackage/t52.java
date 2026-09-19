package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class t52 {
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final Callable b;
    public final ya1 c;

    public t52(tq1 tq1Var, ya1 ya1Var) {
        this.b = tq1Var;
        this.c = ya1Var;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.a;
        int size = i - linkedBlockingDeque.size();
        for (int i2 = 0; i2 < size; i2++) {
            linkedBlockingDeque.add(this.c.b(this.b));
        }
    }

    public final synchronized hp b() {
        a(1);
        return (hp) this.a.poll();
    }
}
