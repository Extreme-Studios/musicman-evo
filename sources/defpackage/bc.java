package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bc extends AtomicBoolean implements OutcomeReceiver {
    public final z8 f;

    public bc(z8 z8Var) {
        super(false);
        this.f = z8Var;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f.d(ar.d(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f.d(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
