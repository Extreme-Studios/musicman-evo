package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp extends p8 implements rk, xn {
    public final boolean l;

    public sp(tp tpVar) {
        super(tpVar, yd.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.l = false;
    }

    @Override // defpackage.rk
    public final Object a() {
        return this.g.getClass().getSimpleName();
    }

    public final xn d() {
        if (this.l) {
            return this;
        }
        xn xnVar = this.f;
        if (xnVar != null) {
            return xnVar;
        }
        tw.a.getClass();
        this.f = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sp) {
            sp spVar = (sp) obj;
            return c().equals(spVar.c()) && this.i.equals(spVar.i) && this.j.equals(spVar.j) && jn.b(this.g, spVar.g);
        }
        if (obj instanceof sp) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xn xnVarD = d();
        return xnVarD != this ? xnVarD.toString() : ec.m(new StringBuilder("property "), this.i, " (Kotlin reflection is not available)");
    }
}
