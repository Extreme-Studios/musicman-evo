package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class tu1 extends wu1 {
    public final Context l;
    public final d60 m;
    public final kc2 n;

    public tu1(Context context, d60 d60Var, kc2 kc2Var) {
        this.l = context;
        this.m = d60Var;
        this.n = kc2Var;
    }

    @Override // defpackage.wu1, defpackage.x7
    public final void T(int i) {
        jn.F("Cannot connect to remote service, fallback to local instance.");
        this.n.o(new RemoteException(ec.j(new StringBuilder(String.valueOf(i).length() + 33), "Connection suspended with cause: ", i)));
    }

    @Override // defpackage.wu1, defpackage.y7
    public final void U(db dbVar) {
        super.U(dbVar);
        this.n.o(new RemoteException("Connection failed: ".concat(String.valueOf(dbVar.i))));
    }

    @Override // defpackage.x7
    public final void Y() {
        synchronized (this.g) {
            if (!this.i) {
                this.i = true;
                try {
                    ((l71) this.k.t()).r0(this.m.f);
                    this.n.mo3a();
                } catch (RemoteException e) {
                    this.n.o(e);
                }
            }
        }
    }
}
