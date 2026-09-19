package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class w41 extends yu1 {
    public final Object f = new Object();
    public volatile ov1 g;

    @Override // defpackage.hv1
    public final void b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final void b1(ov1 ov1Var) {
        synchronized (this.f) {
            this.g = ov1Var;
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
    public final float g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final int j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.hv1
    public final float k() throws RemoteException {
        throw new RemoteException();
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
        ov1 ov1Var;
        synchronized (this.f) {
            ov1Var = this.g;
        }
        return ov1Var;
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
