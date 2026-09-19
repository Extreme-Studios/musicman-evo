package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends wn implements yb, qc {
    public final ic h;

    public h(ic icVar, boolean z) {
        super(z);
        y((wn) icVar.f(gm.h));
        this.h = icVar.e(this);
    }

    @Override // defpackage.wn
    public final void G(Object obj) {
        if (obj instanceof ma) {
            ma.b.get((ma) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(tc tcVar, h hVar, gl glVar) {
        int iOrdinal = tcVar.ordinal();
        k50 k50Var = k50.a;
        if (iOrdinal == 0) {
            try {
                ss0.t(s90.h(((ac) glVar).k(this, hVar)), k50Var);
                return;
            } catch (Throwable th) {
                d(new rx(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                s90.h(((ac) glVar).k(this, hVar)).d(k50Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new na();
            }
            try {
                ic icVar = this.h;
                Object objS = dq.s(icVar, null);
                try {
                    w40.b(2, glVar);
                    Object objF = glVar.f(hVar, this);
                    dq.o(icVar, objS);
                    if (objF != rc.f) {
                        d(objF);
                    }
                } catch (Throwable th2) {
                    dq.o(icVar, objS);
                    throw th2;
                }
            } catch (Throwable th3) {
                d(new rx(th3));
            }
        }
    }

    @Override // defpackage.qc
    public final ic a() {
        return this.h;
    }

    @Override // defpackage.yb
    public final void d(Object obj) {
        Throwable thA = sx.a(obj);
        if (thA != null) {
            obj = new ma(thA, false);
        }
        Object objD = D(obj);
        if (objD == dq.g) {
            return;
        }
        k(objD);
    }

    @Override // defpackage.yb
    public final ic getContext() {
        return this.h;
    }

    @Override // defpackage.wn
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.wn
    public final void x(na naVar) {
        ss0.o(this.h, naVar);
    }
}
