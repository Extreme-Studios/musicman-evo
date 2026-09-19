package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class un extends sn {
    public final wn e;
    public final vn f;
    public final m9 g;
    public final Object h;

    public un(wn wnVar, vn vnVar, m9 m9Var, Object obj) {
        this.e = wnVar;
        this.f = vnVar;
        this.g = m9Var;
        this.h = obj;
    }

    @Override // defpackage.sn
    public final boolean k() {
        return false;
    }

    @Override // defpackage.sn
    public final void l(Throwable th) {
        m9 m9Var = this.g;
        m9 m9VarE = wn.E(m9Var);
        wn wnVar = this.e;
        vn vnVar = this.f;
        Object obj = this.h;
        if (m9VarE == null || !wnVar.N(vnVar, m9VarE, obj)) {
            vnVar.a.e(new vo(2), 2);
            m9 m9VarE2 = wn.E(m9Var);
            if (m9VarE2 == null || !wnVar.N(vnVar, m9VarE2, obj)) {
                wnVar.i(wnVar.r(vnVar, obj));
            }
        }
    }
}
