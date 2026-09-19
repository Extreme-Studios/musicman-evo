package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class rm2 extends dn2 implements Runnable {
    public static final /* synthetic */ int o = 0;
    public hp m;
    public Object n;

    public rm2(hp hpVar, Object obj) {
        hpVar.getClass();
        this.m = hpVar;
        this.n = obj;
    }

    @Override // defpackage.fm2
    public final void f() {
        n(this.m);
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.fm2
    public final String g() {
        String strN;
        hp hpVar = this.m;
        Object obj = this.n;
        String strG = super.g();
        if (hpVar != null) {
            String string = hpVar.toString();
            strN = ec.n(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strN = "";
        }
        if (obj == null) {
            if (strG != null) {
                return strN.concat(strG);
            }
            return null;
        }
        int length = strN.length();
        String string2 = obj.toString();
        return ec.o(new StringBuilder(string2.length() + length + 10 + 1), strN, "function=[", string2, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        hp hpVar = this.m;
        Object obj = this.n;
        if (((this.f instanceof yl2) | (hpVar == null)) || (obj == null)) {
            return;
        }
        this.m = null;
        if (hpVar.isCancelled()) {
            m(hpVar);
            return;
        }
        try {
            try {
                Object objT = t(obj, na1.O(hpVar));
                this.n = null;
                s(objT);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.n = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            e(e2.getCause());
        } catch (Exception e3) {
            e(e3);
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Object obj2);
}
