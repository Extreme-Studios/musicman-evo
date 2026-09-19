package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a9 extends ma {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(a9.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public a9(z8 z8Var, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + z8Var + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
