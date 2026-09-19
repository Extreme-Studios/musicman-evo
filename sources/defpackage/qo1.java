package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends yu1 {
    public final Object f = new Object();
    public final hv1 g;
    public final v41 h;

    public qo1(hv1 hv1Var, v41 v41Var) {
        this.g = hv1Var;
        this.h = v41Var;
    }

    @Override // defpackage.hv1
    public final void b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final void b1(ov1 ov1Var) {
        synchronized (this.f) {
            try {
                hv1 hv1Var = this.g;
                if (hv1Var != null) {
                    hv1Var.b1(ov1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hv1
    public final void d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final boolean f() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final float g() {
        v41 v41Var = this.h;
        if (v41Var != null) {
            return v41Var.K();
        }
        return 0.0f;
    }

    @Override // defpackage.hv1
    public final int j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final float k() {
        v41 v41Var = this.h;
        if (v41Var != null) {
            return v41Var.B();
        }
        return 0.0f;
    }

    @Override // defpackage.hv1
    public final float m() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final boolean o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final void o0(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final ov1 p() {
        synchronized (this.f) {
            try {
                hv1 hv1Var = this.g;
                if (hv1Var == null) {
                    return null;
                }
                return hv1Var.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hv1
    public final boolean q() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final void x() throws RemoteException {
        throw new RemoteException();
    }
}
