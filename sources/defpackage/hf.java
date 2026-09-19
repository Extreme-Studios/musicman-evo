package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf extends i30 {
    public int h;

    public hf(int i) {
        super(0L, false);
        this.h = i;
    }

    public abstract yb e();

    public Throwable f(Object obj) {
        ma maVar = obj instanceof ma ? (ma) obj : null;
        if (maVar != null) {
            return maVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        ss0.o(e().getContext(), new uc("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yb ybVarE = e();
            ybVarE.getClass();
            ff ffVar = (ff) ybVarE;
            ac acVar = ffVar.j;
            Object obj = ffVar.l;
            ic context = acVar.getContext();
            Object objS = dq.s(context, obj);
            wn wnVar = null;
            i50 i50VarL = objS != dq.m ? s90.l(acVar, context, objS) : null;
            try {
                ic context2 = acVar.getContext();
                Object objK = k();
                Throwable thF = f(objK);
                if (thF == null) {
                    int i = this.h;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        wnVar = (wn) context2.f(gm.h);
                    }
                }
                if (wnVar != null && !wnVar.A()) {
                    CancellationException cancellationExceptionS = wnVar.s();
                    b(cancellationExceptionS);
                    acVar.d(new rx(cancellationExceptionS));
                } else if (thF != null) {
                    acVar.d(new rx(thF));
                } else {
                    acVar.d(h(objK));
                }
            } finally {
                if (i50VarL == null || i50VarL.P()) {
                    dq.o(context, objS);
                }
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
