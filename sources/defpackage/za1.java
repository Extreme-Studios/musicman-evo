package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class za1 {
    public static final ya1 a;
    public static final ya1 b;
    public static final ya1 c;
    public static final xa1 d;
    public static final rn2 e;
    public static final ya1 f;
    public static final ya1 g;

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        ix0 ix0Var = lx0.bc;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (kx0Var.b(ix0Var) == null || !((Boolean) kx0Var2.b(ix0Var)).booleanValue()) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new cb0("Default", 1));
        } else {
            ix0 ix0Var2 = lx0.cc;
            if (kx0Var2.b(ix0Var2) != null) {
                ix0 ix0Var3 = lx0.dc;
                if (kx0Var2.b(ix0Var3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) kx0Var2.b(ix0Var2)).intValue(), ((Integer) kx0Var2.b(ix0Var2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cb0("Default", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) kx0Var2.b(ix0Var3)).booleanValue());
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new cb0("Default", 1));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new cb0("Default", 1));
            }
        }
        a = new ya1((Executor) threadPoolExecutor);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        cb0 cb0Var = new cb0("Loader", 1);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, linkedBlockingQueue, cb0Var);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        b = new ya1((Executor) threadPoolExecutor2);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new cb0("Activeview", 1));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        c = new ya1((Executor) threadPoolExecutor3);
        xa1 xa1Var = new xa1(3, new cb0("Schedule", 1));
        d = xa1Var;
        e = new rn2(xa1Var);
        f = new ya1(new h90(1));
        g = new ya1(cn2.f);
    }
}
