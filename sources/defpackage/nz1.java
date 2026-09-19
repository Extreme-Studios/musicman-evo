package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nz1 implements v6, pl1, yk1, ek1, lk1, ib0, ck1, jl1, jk1, zm1 {
    public final es1 n;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicBoolean k = new AtomicBoolean(true);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final ArrayBlockingQueue o = new ArrayBlockingQueue(((Integer) tu0.e.c.a(lx0.F9)).intValue());

    public nz1(es1 es1Var) {
        this.n = es1Var;
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        this.k.set(true);
        this.m.set(false);
    }

    @Override // defpackage.ib0
    public final void B() {
        Object obj;
        if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue() || (obj = this.f.get()) == null) {
            return;
        }
        try {
            ((b11) obj).f();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.lk1
    public final void B0() {
        v51.v(this.f, el1.z);
    }

    @Override // defpackage.v6
    public final synchronized void N(String str, String str2) {
        if (!this.k.get()) {
            Object obj = this.g.get();
            if (obj != null) {
                try {
                    ((ig1) obj).n0(str, str2);
                } catch (RemoteException e) {
                    jn.Z("#007 Could not call remote method.", e);
                } catch (NullPointerException e2) {
                    jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                }
            }
            return;
        }
        if (!this.o.offer(new Pair(str, str2))) {
            jn.F("The queue for app events is full, dropping the new event.");
            es1 es1Var = this.n;
            if (es1Var != null) {
                us2 us2VarA = es1Var.a();
                us2VarA.s("action", "dae_action");
                us2VarA.s("dae_name", str);
                us2VarA.s("dae_data", str2);
                us2VarA.t();
            }
        }
    }

    @Override // defpackage.zm1
    public final void T0() {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((b11) obj).j();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.ck1
    public final void U() {
        v51.v(this.f, fl1.y);
        v51.v(this.j, el1.A);
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        AtomicReference atomicReference = this.f;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((b11) obj).W(fu1Var);
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((b11) obj2).H(fu1Var.f);
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.i.get();
        if (obj3 != null) {
            try {
                ((m21) obj3).N(fu1Var);
            } catch (RemoteException e5) {
                jn.Z("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        this.k.set(false);
        this.o.clear();
    }

    @Override // defpackage.ck1
    public final void a() {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((b11) obj).b();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.yk1
    public final synchronized void e() {
        Object obj;
        Object obj2 = this.f.get();
        if (obj2 == null) {
            obj = this.i.get();
            if (obj != null) {
                try {
                    ((m21) obj).y();
                } catch (RemoteException e) {
                    jn.Z("#007 Could not call remote method.", e);
                } catch (NullPointerException e2) {
                    jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                }
            }
            this.m.set(true);
            w();
        } else {
            try {
                ((b11) obj2).d();
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
            obj = this.i.get();
            if (obj != null) {
                ((m21) obj).y();
            }
            this.m.set(true);
            w();
        }
        throw th;
    }

    @Override // defpackage.jl1
    public final void h(qc3 qc3Var) {
        Object obj = this.h.get();
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

    public final synchronized b11 l() {
        return (b11) this.f.get();
    }

    public final void p(ig1 ig1Var) {
        this.g.set(ig1Var);
        this.l.set(true);
        w();
    }

    @Override // defpackage.zm1
    public final void q0() {
        Object obj;
        if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue() && (obj = this.f.get()) != null) {
            try {
                ((b11) obj).f();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((xi1) obj2).d();
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // defpackage.ck1
    public final void r() {
        Object obj = this.f.get();
        if (obj != null) {
            try {
                ((b11) obj).e();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        AtomicReference atomicReference = this.j;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((xi1) obj2).r();
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
            ((xi1) obj3).b();
        } catch (RemoteException e5) {
            jn.Z("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // defpackage.jk1
    public final void s(fu1 fu1Var) {
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            ((xi1) obj).N2(fu1Var);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void w() {
        if (this.l.get() && this.m.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.o;
            for (Pair pair : arrayBlockingQueue) {
                Object obj = this.g.get();
                if (obj != null) {
                    try {
                        ((ig1) obj).n0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    } catch (NullPointerException e2) {
                        jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.k.set(false);
        }
    }

    @Override // defpackage.ck1
    public final void b() {
    }

    @Override // defpackage.ck1
    public final void d() {
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
    }
}
