package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl2 extends xl2 {
    @Override // defpackage.xl2
    public final /* synthetic */ void s(Object obj) {
        m((hp) obj);
    }

    @Override // defpackage.xl2
    public final Object t(Object obj, Throwable th) {
        xm2 xm2Var = (xm2) obj;
        hp hpVarB = xm2Var.b(th);
        if (hpVarB != null) {
            return hpVarB;
        }
        j7.l(jn.E("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xm2Var));
        return null;
    }
}
