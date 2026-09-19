package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li2 implements ii2 {
    public final o8 f = new o8();
    public volatile ii2 g;
    public Object h;

    public li2(ii2 ii2Var) {
        this.g = ii2Var;
    }

    @Override // defpackage.ii2
    public final Object a() {
        ii2 ii2Var = this.g;
        ki2 ki2Var = ki2.g;
        if (ii2Var != ki2Var) {
            synchronized (this.f) {
                try {
                    if (this.g != ki2Var) {
                        Object objA = this.g.a();
                        this.h = objA;
                        this.g = ki2Var;
                        return objA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.h;
    }

    public final String toString() {
        Object objN = this.g;
        if (objN == ki2.g) {
            String strValueOf = String.valueOf(this.h);
            objN = ec.n(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objN);
        return ec.n(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }
}
