package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l32 implements r63 {
    public final /* synthetic */ int a;

    public /* synthetic */ l32(int i) {
        this.a = i;
    }

    @Override // defpackage.v63
    public final Object c() {
        switch (this.a) {
            case 0:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new c12(ya1Var, 5);
            case 1:
                return new g52();
            case 2:
                return new f52();
            case 3:
                p52 p52Var = new p52();
                try {
                    lo2.a();
                    break;
                } catch (GeneralSecurityException e) {
                    jn.p("Failed to Configure Aead. ".concat(e.toString()));
                    vc3.C.h.d("CryptoUtils.registerAead", e);
                }
                return p52Var;
            case 4:
                return new q52();
            case 5:
                return ae.a;
            case 6:
                w52 w52Var = new w52();
                w52Var.a = null;
                return w52Var;
            case 7:
                return new i62();
            case 8:
                ya1 ya1Var2 = za1.f;
                dq.D(ya1Var2);
                return ya1Var2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof ya1) {
                    return (ya1) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new rn2((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new ya1(executorServiceUnconfigurableExecutorService);
            case 10:
                rn2 rn2Var = za1.e;
                dq.D(rn2Var);
                return rn2Var;
            case 11:
                ya1 ya1Var3 = za1.f;
                dq.D(ya1Var3);
                return ya1Var3;
            case 12:
                return new oe(2);
            case 13:
                return new rc2();
            case 14:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                dq.D(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            case 15:
                return new bf2();
            case 16:
                return new ne2();
            case 17:
                return new fa2();
            case 18:
                return new mg2();
            default:
                return new yg2();
        }
    }
}
