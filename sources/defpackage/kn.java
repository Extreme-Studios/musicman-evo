package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class kn extends sn {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(kn.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final rn e;

    public kn(rn rnVar) {
        this.e = rnVar;
    }

    @Override // defpackage.sn
    public final boolean k() {
        return true;
    }

    @Override // defpackage.sn
    public final void l(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.h(th);
        }
    }
}
