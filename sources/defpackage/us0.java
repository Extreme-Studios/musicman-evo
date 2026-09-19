package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class us0 extends Thread {
    public final WeakReference f;
    public final long g;
    public final CountDownLatch h = new CountDownLatch(1);
    public boolean i = false;

    public us0(x2 x2Var, long j) {
        this.f = new WeakReference(x2Var);
        this.g = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        x2 x2Var;
        WeakReference weakReference = this.f;
        try {
            if (this.h.await(this.g, TimeUnit.MILLISECONDS) || (x2Var = (x2) weakReference.get()) == null) {
                return;
            }
            x2Var.c();
            this.i = true;
        } catch (InterruptedException unused) {
            x2 x2Var2 = (x2) weakReference.get();
            if (x2Var2 != null) {
                x2Var2.c();
                this.i = true;
            }
        }
    }
}
