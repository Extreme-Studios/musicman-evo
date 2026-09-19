package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes.dex */
public final class ln2 extends AbstractOwnableSynchronizer implements Runnable {
    public final mn2 f;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
