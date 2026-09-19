package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud extends s20 implements cl {
    public int j;

    @Override // defpackage.cl
    public final Object h(Object obj) {
        ud udVar = new ud(1, (yb) obj);
        k50 k50Var = k50.a;
        udVar.m(k50Var);
        return k50Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        int i = this.j;
        if (i == 0) {
            ar.n(obj);
            this.j = 1;
            throw null;
        }
        if (i == 1) {
            ar.n(obj);
            return k50.a;
        }
        j7.e("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
