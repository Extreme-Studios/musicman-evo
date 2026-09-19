package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o32 implements ek1, dl1, f42, lb3, jl1, jk1, zm1 {
    public final w52 f;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public o32 m = null;

    public o32(w52 w52Var) {
        this.f = w52Var;
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.H1(i);
            return;
        }
        Object obj = this.k.get();
        if (obj == null) {
            return;
        }
        try {
            ((lb3) obj).H1(i);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.lb3
    public final void N1() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.N1();
        } else {
            v51.v(this.k, fl1.z);
        }
    }

    @Override // defpackage.lb3
    public final void S2() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.S2();
        } else {
            v51.v(this.k, el1.C);
        }
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.Z(fu1Var);
            return;
        }
        AtomicReference atomicReference = this.g;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((nu0) obj).W(fu1Var);
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((nu0) obj2).H(fu1Var.f);
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    public final void a(qh1 qh1Var) {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.a(qh1Var);
            return;
        }
        Object obj = this.g.get();
        if (obj == null) {
            return;
        }
        try {
            ((nu0) obj).e3(qh1Var);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void b() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.b();
            return;
        }
        bz1 bz1Var = this.f.a;
        if (bz1Var != null) {
            dg3 dg3Var = (dg3) bz1Var.f;
            synchronized (dg3Var) {
                dg3Var.f = 1;
                dg3Var.c();
            }
        }
        if (this.h.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pu0) obj).l();
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // defpackage.lb3
    public final void f() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.f();
            return;
        }
        Object obj = this.k.get();
        if (obj != null) {
            try {
                ((lb3) obj).f();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        AtomicReference atomicReference = this.i;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((pu0) obj2).r();
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((pu0) obj3).d();
        } catch (RemoteException e5) {
            jn.Z("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // defpackage.jl1
    public final void h(qc3 qc3Var) {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.h(qc3Var);
            return;
        }
        Object obj = this.l.get();
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

    @Override // defpackage.dl1
    public final void i() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.i();
        } else {
            v51.v(this.j, el1.B);
        }
    }

    @Override // defpackage.f42
    public final void p(f42 f42Var) {
        this.m = (o32) f42Var;
    }

    @Override // defpackage.zm1
    public final void q0() {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.q0();
            return;
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pu0) obj).e();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.jk1
    public final void s(fu1 fu1Var) {
        o32 o32Var = this.m;
        if (o32Var != null) {
            o32Var.s(fu1Var);
            return;
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pu0) obj).g0(fu1Var);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.lb3
    public final void C1() {
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.zm1
    public final void T0() {
    }

    @Override // defpackage.lb3
    public final void Y() {
    }

    @Override // defpackage.lb3
    public final void g3() {
    }

    @Override // defpackage.lb3
    public final void i3() {
    }

    @Override // defpackage.lb3
    public final void n2() {
    }
}
