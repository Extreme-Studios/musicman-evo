package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 extends mn2 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ xn2 i;
    public final Object j;

    public wn2(xn2 xn2Var, Callable callable) {
        this.i = xn2Var;
        callable.getClass();
        this.j = callable;
    }

    @Override // defpackage.mn2
    public final Object a() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                wm2 wm2Var = (wm2) obj;
                hp hpVarA = wm2Var.a();
                if (hpVarA != null) {
                    return hpVarA;
                }
                j7.l(jn.E("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", wm2Var));
                return null;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.mn2
    public final String c() {
        switch (this.h) {
            case 0:
                return ((wm2) this.j).toString();
            default:
                return ((Callable) this.j).toString();
        }
    }

    @Override // defpackage.mn2
    public final boolean d() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i.isDone();
    }

    @Override // defpackage.mn2
    public final void e(Object obj) {
        switch (this.h) {
            case 0:
                this.i.m((hp) obj);
                break;
            default:
                this.i.d(obj);
                break;
        }
    }

    @Override // defpackage.mn2
    public final void f(Throwable th) {
        int i = this.h;
        xn2 xn2Var = this.i;
        switch (i) {
            case 0:
                xn2Var.e(th);
                break;
            default:
                xn2Var.e(th);
                break;
        }
    }

    public wn2(xn2 xn2Var, wm2 wm2Var) {
        this.i = xn2Var;
        this.j = wm2Var;
    }
}
