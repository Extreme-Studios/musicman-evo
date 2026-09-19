package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm2 extends rm2 {
    @Override // defpackage.rm2
    public final /* synthetic */ void s(Object obj) {
        m((hp) obj);
    }

    @Override // defpackage.rm2
    public final Object t(Object obj, Object obj2) {
        xm2 xm2Var = (xm2) obj;
        hp hpVarB = xm2Var.b(obj2);
        if (hpVarB != null) {
            return hpVarB;
        }
        j7.l(jn.E("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xm2Var));
        return null;
    }
}
