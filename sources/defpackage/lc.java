package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc extends i implements gc {
    public static final kc g = new kc(ig.g, new jc());

    public lc() {
        super(ig.g);
    }

    public abstract void a(ic icVar, Runnable runnable);

    public boolean c(ic icVar) {
        return !(this instanceof h50);
    }

    public lc d(int i) {
        ej1.d(i);
        return new ro(this, i);
    }

    @Override // defpackage.i, defpackage.ic
    public final gc f(hc hcVar) {
        gc gcVarA;
        hcVar.getClass();
        if (hcVar instanceof kc) {
            kc kcVar = (kc) hcVar;
            hc hcVar2 = this.f;
            if ((hcVar2 == kcVar || kcVar.g == hcVar2) && (gcVarA = kcVar.a(this)) != null) {
                return gcVarA;
            }
        } else if (ig.g == hcVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.i, defpackage.ic
    public final ic h(hc hcVar) {
        hcVar.getClass();
        if (hcVar instanceof kc) {
            kc kcVar = (kc) hcVar;
            hc hcVar2 = this.f;
            if ((hcVar2 != kcVar && kcVar.g != hcVar2) || kcVar.a(this) == null) {
                return this;
            }
        } else if (ig.g != hcVar) {
            return this;
        }
        return jh.f;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + yd.g(this);
    }
}
