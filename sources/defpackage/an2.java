package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class an2 extends mn2 {
    public final Executor h;
    public final /* synthetic */ bn2 i;
    public final Callable j;
    public final /* synthetic */ bn2 k;

    public an2(bn2 bn2Var, Callable callable, Executor executor) {
        this.k = bn2Var;
        this.i = bn2Var;
        executor.getClass();
        this.h = executor;
        this.j = callable;
    }

    @Override // defpackage.mn2
    public final Object a() {
        return this.j.call();
    }

    @Override // defpackage.mn2
    public final String c() {
        return this.j.toString();
    }

    @Override // defpackage.mn2
    public final boolean d() {
        return this.i.isDone();
    }

    @Override // defpackage.mn2
    public final void e(Object obj) {
        this.i.u = null;
        this.k.d(obj);
    }

    @Override // defpackage.mn2
    public final void f(Throwable th) {
        bn2 bn2Var = this.i;
        bn2Var.u = null;
        if (th instanceof ExecutionException) {
            bn2Var.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            bn2Var.cancel(false);
        } else {
            bn2Var.e(th);
        }
    }
}
