package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qe1 {
    public final me1 a;
    public final es1 b;

    public qe1(me1 me1Var, es1 es1Var) {
        this.a = me1Var;
        this.b = es1Var;
    }

    public final void a(Context context, d60 d60Var) {
        ix0 ix0Var = lx0.we;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            Executor threadPoolExecutor = za1.a;
            if (((Boolean) kx0Var2.a(lx0.ye)).booleanValue()) {
                pe1 pe1Var = new pe1(((Integer) kx0Var2.a(lx0.Ae)).intValue());
                int iIntValue = ((Integer) kx0Var2.a(lx0.ze)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), pe1Var);
            }
            threadPoolExecutor.execute(new ib(this, context, d60Var, 12));
        }
    }
}
