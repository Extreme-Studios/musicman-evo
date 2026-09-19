package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements gc {
    public final hc f;

    public i(hc hcVar) {
        this.f = hcVar;
    }

    @Override // defpackage.ic
    public final Object b(Object obj, gl glVar) {
        return glVar.f(obj, this);
    }

    @Override // defpackage.ic
    public final ic e(ic icVar) {
        return w40.y(this, icVar);
    }

    @Override // defpackage.ic
    public gc f(hc hcVar) {
        hcVar.getClass();
        if (jn.b(getKey(), hcVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.gc
    public final hc getKey() {
        return this.f;
    }

    @Override // defpackage.ic
    public ic h(hc hcVar) {
        hcVar.getClass();
        return jn.b(getKey(), hcVar) ? jh.f : this;
    }
}
