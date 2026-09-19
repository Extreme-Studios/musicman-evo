package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 extends dn2 implements RunnableFuture {
    public volatile mn2 m;

    public xn2(Callable callable) {
        this.m = new wn2(this, callable);
    }

    @Override // defpackage.fm2
    public final void f() {
        mn2 mn2Var;
        if (l() && (mn2Var = this.m) != null) {
            mn2Var.g();
        }
        this.m = null;
    }

    @Override // defpackage.fm2
    public final String g() {
        mn2 mn2Var = this.m;
        if (mn2Var == null) {
            return super.g();
        }
        String string = mn2Var.toString();
        return ec.n(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        mn2 mn2Var = this.m;
        if (mn2Var != null) {
            mn2Var.run();
        }
        this.m = null;
    }
}
