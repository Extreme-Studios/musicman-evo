package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends i2 {
    public final /* synthetic */ int f;
    public final Object g;
    public Object h;
    public final /* synthetic */ Object i;

    public tt1(xt1 xt1Var, String str, w7 w7Var) {
        this.f = 0;
        this.g = str;
        this.h = w7Var;
        Objects.requireNonNull(xt1Var);
        this.i = xt1Var;
    }

    @Override // defpackage.i2
    public void B() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.B();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i2
    public void a() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i2
    public final void b(np npVar) {
        switch (this.f) {
            case 0:
                ((xt1) this.i).C3(xt1.F3(npVar));
                return;
            default:
                yy1 yy1Var = (yy1) this.i;
                h60 h60Var = yy1Var.c;
                n71 n71Var = yy1Var.i;
                hv1 hv1VarQ = null;
                if (n71Var != null) {
                    try {
                        hv1VarQ = n71Var.Q();
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    }
                    break;
                }
                h60Var.a(hv1VarQ);
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.b(npVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.i2
    public void d() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i2
    public final void e() {
        switch (this.f) {
            case 0:
                ((xt1) this.i).B3((w7) this.h, (String) this.g);
                return;
            default:
                yy1 yy1Var = (yy1) this.i;
                h60 h60Var = yy1Var.c;
                n71 n71Var = yy1Var.i;
                hv1 hv1VarQ = null;
                if (n71Var != null) {
                    try {
                        hv1VarQ = n71Var.Q();
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    }
                    break;
                }
                h60Var.a(hv1VarQ);
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.i2
    public void h() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        i2 i2Var = (i2) this.h;
                        if (i2Var != null) {
                            i2Var.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    public tt1(yy1 yy1Var) {
        this.f = 1;
        this.i = yy1Var;
        this.g = new Object();
    }
}
