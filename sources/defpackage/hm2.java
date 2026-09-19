package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends ss0 {
    @Override // defpackage.ss0
    public final void C(mm2 mm2Var, Thread thread) {
        mm2Var.a = thread;
    }

    @Override // defpackage.ss0
    public final void L(mm2 mm2Var, mm2 mm2Var2) {
        mm2Var.b = mm2Var2;
    }

    @Override // defpackage.ss0
    public final boolean R(nm2 nm2Var, mm2 mm2Var, mm2 mm2Var2) {
        synchronized (nm2Var) {
            try {
                if (nm2Var.h != mm2Var) {
                    return false;
                }
                nm2Var.h = mm2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final boolean W(fm2 fm2Var, cm2 cm2Var, cm2 cm2Var2) {
        synchronized (fm2Var) {
            try {
                if (fm2Var.g != cm2Var) {
                    return false;
                }
                fm2Var.g = cm2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final mm2 Y(fm2 fm2Var) {
        mm2 mm2Var;
        mm2 mm2Var2 = mm2.c;
        synchronized (fm2Var) {
            try {
                mm2Var = fm2Var.h;
                if (mm2Var != mm2Var2) {
                    fm2Var.h = mm2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mm2Var;
    }

    @Override // defpackage.ss0
    public final cm2 c0(fm2 fm2Var) {
        cm2 cm2Var;
        cm2 cm2Var2 = cm2.d;
        synchronized (fm2Var) {
            try {
                cm2Var = fm2Var.g;
                if (cm2Var != cm2Var2) {
                    fm2Var.g = cm2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    @Override // defpackage.ss0
    public final boolean f0(nm2 nm2Var, Object obj, Object obj2) {
        synchronized (nm2Var) {
            try {
                if (nm2Var.f != obj) {
                    return false;
                }
                nm2Var.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
