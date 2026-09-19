package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements yk1, ib0, pl1, lk1, ck1, dm1 {
    public final ae f;
    public final pa1 g;

    public zi1(ae aeVar, pa1 pa1Var) {
        this.f = aeVar;
        this.g = pa1Var;
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        ae aeVar = this.f;
        pa1 pa1Var = this.g;
        aeVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (pa1Var.d) {
            try {
                pa1Var.k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    pa1Var.b.a(pa1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ib0
    public final void B() {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            if (pa1Var.k != -1) {
                oa1 oa1Var = new oa1(pa1Var);
                oa1Var.c.a.getClass();
                oa1Var.a = SystemClock.elapsedRealtime();
                pa1Var.c.add(oa1Var);
                pa1Var.i++;
                ua1 ua1Var = pa1Var.b;
                synchronized (ua1Var.f) {
                    ta1 ta1Var = ua1Var.i;
                    synchronized (ta1Var.f) {
                        ta1Var.i++;
                    }
                }
                ua1Var.a(pa1Var);
            }
        }
    }

    @Override // defpackage.lk1
    public final void B0() {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            try {
                if (pa1Var.k != -1 && pa1Var.g == -1) {
                    pa1Var.a.getClass();
                    pa1Var.g = SystemClock.elapsedRealtime();
                    pa1Var.b.a(pa1Var);
                }
                ua1 ua1Var = pa1Var.b;
                synchronized (ua1Var.f) {
                    ta1 ta1Var = ua1Var.i;
                    synchronized (ta1Var.f) {
                        ta1Var.j++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dm1
    public final void F(gw0 gw0Var) {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            ua1 ua1Var = pa1Var.b;
            synchronized (ua1Var.f) {
                ua1Var.i.b();
            }
        }
    }

    @Override // defpackage.ck1
    public final void U() {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            try {
                if (pa1Var.k != -1) {
                    LinkedList linkedList = pa1Var.c;
                    if (!linkedList.isEmpty()) {
                        oa1 oa1Var = (oa1) linkedList.getLast();
                        if (oa1Var.b == -1) {
                            oa1Var.c.a.getClass();
                            oa1Var.b = SystemClock.elapsedRealtime();
                            pa1Var.b.a(pa1Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            try {
                if (pa1Var.k != -1) {
                    pa1Var.a.getClass();
                    pa1Var.h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dm1
    public final void y0(gw0 gw0Var) {
        pa1 pa1Var = this.g;
        synchronized (pa1Var.d) {
            ua1 ua1Var = pa1Var.b;
            synchronized (ua1Var.f) {
                ua1Var.i.b();
            }
        }
    }

    @Override // defpackage.ck1
    public final void a() {
    }

    @Override // defpackage.ck1
    public final void b() {
    }

    @Override // defpackage.ck1
    public final void d() {
    }

    @Override // defpackage.dm1
    public final void p() {
    }

    @Override // defpackage.ck1
    public final void r() {
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
    }

    @Override // defpackage.dm1
    public final void R(boolean z) {
    }

    @Override // defpackage.dm1
    public final void f0(gw0 gw0Var) {
    }

    @Override // defpackage.dm1
    public final void o0(boolean z) {
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
    }
}
