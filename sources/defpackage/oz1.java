package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class oz1 implements jl1 {
    public final AtomicReference f = new AtomicReference();

    @Override // defpackage.jl1
    public final void h(qc3 qc3Var) {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((sr1) obj).S1(qc3Var);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
