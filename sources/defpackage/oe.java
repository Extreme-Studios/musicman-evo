package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class oe implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Serializable b;

    public oe(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new AtomicInteger(1);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            case 1:
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, ec.j(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
            case 2:
                int andIncrement2 = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, ec.j(new StringBuilder(String.valueOf(andIncrement2).length() + 14), "AdWorker(NG) #", andIncrement2));
            default:
                String str = qz1.a;
                return new Thread(runnable, (String) serializable);
        }
    }

    public oe(aa1 aa1Var) {
        this.a = 1;
        this.b = new AtomicInteger(1);
    }

    public /* synthetic */ oe(String str) {
        this.a = 3;
        this.b = str;
    }
}
