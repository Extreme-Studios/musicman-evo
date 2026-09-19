package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de0 {
    public final fe0 a;
    public final fe0 b;

    public de0(fe0 fe0Var, fe0 fe0Var2) {
        this.a = fe0Var;
        this.b = fe0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || de0.class != obj.getClass()) {
            return false;
        }
        de0 de0Var = (de0) obj;
        return this.a.equals(de0Var.a) && this.b.equals(de0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        fe0 fe0Var = this.a;
        String string = fe0Var.toString();
        fe0 fe0Var2 = this.b;
        String strConcat = fe0Var.equals(fe0Var2) ? "" : ", ".concat(fe0Var2.toString());
        return ec.o(new StringBuilder(ec.f(strConcat, string.length() + 1, 1)), "[", string, strConcat, "]");
    }
}
