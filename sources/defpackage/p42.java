package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p42 implements ku, yk1, ek1, ck1, jk1, jl1, f42, zm1 {
    public final w52 f;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public final AtomicReference m = new AtomicReference();
    public p42 n = null;

    public p42(w52 w52Var) {
        this.f = w52Var;
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
        int i = w71Var.g;
        String str3 = w71Var.f;
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.I(w71Var, str, str2);
            return;
        }
        Object obj = this.i.get();
        if (obj != null) {
            try {
                ((o81) obj).W0(new a91(str3, i));
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.k.get();
        if (obj2 != null) {
            try {
                t81 t81Var = (t81) obj2;
                a91 a91Var = new a91(str3, i);
                Parcel parcelU = t81Var.U();
                kt0.e(parcelU, a91Var);
                parcelU.writeString(str);
                parcelU.writeString(str2);
                t81Var.K0(parcelU, 2);
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.j.get();
        if (obj3 != null) {
            try {
                y71 y71Var = (y71) obj3;
                Parcel parcelU2 = y71Var.U();
                kt0.e(parcelU2, w71Var);
                y71Var.K0(parcelU2, 5);
            } catch (RemoteException e5) {
                jn.Z("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        Object obj4 = this.l.get();
        if (obj4 == null) {
            return;
        }
        try {
            x71 x71Var = (x71) obj4;
            Parcel parcelU3 = x71Var.U();
            kt0.e(parcelU3, w71Var);
            parcelU3.writeString(str);
            parcelU3.writeString(str2);
            x71Var.K0(parcelU3, 2);
        } catch (RemoteException e7) {
            jn.Z("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }

    @Override // defpackage.ck1
    public final void U() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.U();
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
        Object obj = this.i.get();
        if (obj != null) {
            try {
                ((o81) obj).d();
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
            y71 y71Var = (y71) obj2;
            y71Var.K0(y71Var.U(), 4);
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.Z(fu1Var);
            return;
        }
        int i = fu1Var.f;
        AtomicReference atomicReference = this.h;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((s81) obj).a(fu1Var);
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((s81) obj2).t(i);
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.j.get();
        if (obj3 == null) {
            return;
        }
        try {
            y71 y71Var = (y71) obj3;
            Parcel parcelU = y71Var.U();
            parcelU.writeInt(i);
            y71Var.K0(parcelU, 7);
        } catch (RemoteException e5) {
            jn.Z("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // defpackage.ck1
    public final void a() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.a();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            y71 y71Var = (y71) obj;
            y71Var.K0(y71Var.U(), 6);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.ck1
    public final void b() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.b();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            y71 y71Var = (y71) obj;
            y71Var.K0(y71Var.U(), 3);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.ck1
    public final void d() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.d();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            y71 y71Var = (y71) obj;
            y71Var.K0(y71Var.U(), 8);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.e();
            return;
        }
        Object obj = this.h.get();
        if (obj != null) {
            try {
                ((s81) obj).b();
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
            y71 y71Var = (y71) obj2;
            y71Var.K0(y71Var.U(), 1);
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // defpackage.jl1
    public final void h(qc3 qc3Var) {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.h(qc3Var);
            return;
        }
        Object obj = this.m.get();
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

    @Override // defpackage.ku
    public final void l() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.l();
        } else {
            v51.v(this.g, fl1.A);
        }
    }

    @Override // defpackage.f42
    public final void p(f42 f42Var) {
        this.n = (p42) f42Var;
    }

    @Override // defpackage.zm1
    public final void q0() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.q0();
        } else {
            v51.v(this.i, el1.D);
        }
    }

    @Override // defpackage.ck1
    public final void r() {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.r();
            return;
        }
        AtomicReference atomicReference = this.i;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((o81) obj).b();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 != null) {
            try {
                y71 y71Var = (y71) obj2;
                y71Var.K0(y71Var.U(), 2);
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
            ((o81) obj3).g();
        } catch (RemoteException e5) {
            jn.Z("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // defpackage.jk1
    public final void s(fu1 fu1Var) {
        p42 p42Var = this.n;
        if (p42Var != null) {
            p42Var.s(fu1Var);
            return;
        }
        AtomicReference atomicReference = this.i;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((o81) obj).u2(fu1Var);
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
            ((o81) obj2).z(fu1Var.f);
        } catch (RemoteException e3) {
            jn.Z("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            jn.V("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // defpackage.zm1
    public final void T0() {
    }
}
