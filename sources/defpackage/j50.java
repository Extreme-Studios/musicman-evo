package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j50 implements gc, hc {
    public static final j50 f = new j50();

    @Override // defpackage.ic
    public final Object b(Object obj, gl glVar) {
        return glVar.f(obj, this);
    }

    @Override // defpackage.ic
    public final ic e(ic icVar) {
        return w40.y(this, icVar);
    }

    @Override // defpackage.ic
    public final gc f(hc hcVar) {
        hcVar.getClass();
        if (jn.b(this, hcVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.ic
    public final ic h(hc hcVar) {
        hcVar.getClass();
        return jn.b(this, hcVar) ? jh.f : this;
    }

    @Override // defpackage.gc
    public final hc getKey() {
        return this;
    }
}
