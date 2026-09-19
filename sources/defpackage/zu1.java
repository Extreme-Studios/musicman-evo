package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zu1 extends wu1 {
    public String l;
    public int m;

    @Override // defpackage.wu1, defpackage.y7
    public final void U(db dbVar) {
        jn.F("Cannot connect to remote service, fallback to local instance.");
        this.f.c(new dv1(1));
    }

    @Override // defpackage.x7
    public final void Y() {
        synchronized (this.g) {
            try {
                if (!this.i) {
                    this.i = true;
                    try {
                        try {
                            int i = this.m;
                            if (i == 2) {
                                ((l71) this.k.t()).R2(this.j, ((Boolean) tu0.e.c.a(lx0.Ld)).booleanValue() ? new vu1(this.f, this.j) : new uu1(this));
                            } else if (i == 3) {
                                ((l71) this.k.t()).n3(this.l, ((Boolean) tu0.e.c.a(lx0.Ld)).booleanValue() ? new vu1(this.f, this.j) : new uu1(this));
                            } else {
                                this.f.c(new dv1(1));
                            }
                        } catch (Throwable th) {
                            vc3.C.h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f.c(new dv1(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f.c(new dv1(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
