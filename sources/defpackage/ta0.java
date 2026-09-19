package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class ta0 extends ea0 {
    public final k30 b;

    public ta0(k30 k30Var) {
        super(4);
        this.b = k30Var;
    }

    @Override // defpackage.ea0
    public final boolean a(z90 z90Var) {
        if (z90Var.k.get(null) == null) {
            return false;
        }
        j7.j();
        return false;
    }

    @Override // defpackage.ea0
    public final ei[] b(z90 z90Var) {
        if (z90Var.k.get(null) == null) {
            return null;
        }
        j7.j();
        return null;
    }

    @Override // defpackage.ea0
    public final void c(Status status) {
        this.b.a(new v3(status));
    }

    @Override // defpackage.ea0
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.ea0
    public final void e(z90 z90Var) throws DeadObjectException {
        try {
            h(z90Var);
        } catch (DeadObjectException e) {
            c(ea0.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(ea0.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public final void h(z90 z90Var) {
        if (z90Var.k.remove(null) != null) {
            j7.j();
            return;
        }
        k30 k30Var = this.b;
        Boolean bool = Boolean.FALSE;
        ve3 ve3Var = k30Var.a;
        synchronized (ve3Var.a) {
            try {
                if (ve3Var.c) {
                    return;
                }
                ve3Var.c = true;
                ve3Var.e = bool;
                ve3Var.b.g(ve3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ea0
    public final /* bridge */ /* synthetic */ void f(us2 us2Var, boolean z) {
    }
}
