package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class su1 extends wu1 {
    public final /* synthetic */ int l;
    public final Context m;
    public final Executor n;

    public su1(Context context, ya1 ya1Var, int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = context;
                this.n = ya1Var;
                this.k = new vu0(context, vc3.C.t.c(), this, this, 2);
                break;
            default:
                this.m = context;
                this.n = ya1Var;
                this.k = new vu0(context, vc3.C.t.c(), this, this, 2);
                break;
        }
    }

    @Override // defpackage.wu1, defpackage.y7
    public void U(db dbVar) {
        switch (this.l) {
            case 0:
                jn.F("Cannot connect to remote service, fallback to local instance.");
                this.f.c(new dv1(1));
                break;
            default:
                super.U(dbVar);
                break;
        }
    }

    @Override // defpackage.x7
    public final void Y() {
        switch (this.l) {
            case 0:
                synchronized (this.g) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            try {
                                try {
                                    ((l71) this.k.t()).m1(this.j, ((Boolean) tu0.e.c.a(lx0.Ld)).booleanValue() ? new vu1(this.f, this.j) : new uu1(this));
                                } catch (Throwable th) {
                                    vc3.C.h.d("RemoteAdRequestClientTask.onConnected", th);
                                    this.f.c(new dv1(1));
                                }
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f.c(new dv1(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.g) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            try {
                                ((l71) this.k.t()).y0(this.j, ((Boolean) tu0.e.c.a(lx0.Ld)).booleanValue() ? new vu1(this.f, this.j) : new uu1(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f.c(new dv1(1));
                            } catch (Throwable th3) {
                                vc3.C.h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f.c(new dv1(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }

    public hp c(r71 r71Var) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return this.f;
                }
                this.h = true;
                this.j = r71Var;
                this.k.m();
                cb1 cb1Var = this.f;
                cb1Var.f.a(new va1(26, this), za1.g);
                wu1.b(this.m, cb1Var, this.n);
                return cb1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
