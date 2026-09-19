package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xl2 extends dn2 implements Runnable {
    public static final /* synthetic */ int p = 0;
    public hp m;
    public Class n;
    public Object o;

    public xl2(hp hpVar, Class cls, Object obj) {
        hpVar.getClass();
        this.m = hpVar;
        this.n = cls;
        this.o = obj;
    }

    @Override // defpackage.fm2
    public final void f() {
        n(this.m);
        this.m = null;
        this.n = null;
        this.o = null;
    }

    @Override // defpackage.fm2
    public final String g() {
        String strN;
        hp hpVar = this.m;
        Class cls = this.n;
        Object obj = this.o;
        String strG = super.g();
        if (hpVar != null) {
            String string = hpVar.toString();
            strN = ec.n(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strN = "";
        }
        if (cls == null || obj == null) {
            if (strG != null) {
                return strN.concat(strG);
            }
            return null;
        }
        int length = strN.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        ec.x(sb, strN, "exceptionType=[", string2, "], fallback=[");
        return ec.m(sb, string3, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objO;
        hp hpVar = this.m;
        Class cls = this.n;
        Object obj = this.o;
        if (((obj == null) || ((hpVar == null) | (cls == null))) || (this.f instanceof yl2)) {
            return;
        }
        this.m = null;
        try {
            th = hpVar instanceof nm2 ? ((nm2) hpVar).c() : null;
            objO = th == null ? na1.O(hpVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(hpVar.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                ec.x(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            d(objO);
            return;
        }
        if (!cls.isInstance(th)) {
            m(hpVar);
            return;
        }
        try {
            Object objT = t(obj, th);
            this.n = null;
            this.o = null;
            s(objT);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                e(th2);
            } finally {
                this.n = null;
                this.o = null;
            }
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Throwable th);
}
