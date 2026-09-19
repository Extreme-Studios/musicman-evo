package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ql extends p8 implements pl, xn, ol {
    public final int l;
    public final int m;

    public ql(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.l = i;
        this.m = 0;
    }

    @Override // defpackage.pl
    public final int b() {
        return this.l;
    }

    public final xn d() {
        tw.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ql) {
            ql qlVar = (ql) obj;
            return this.i.equals(qlVar.i) && this.j.equals(qlVar.j) && this.m == qlVar.m && this.l == qlVar.l && jn.b(this.g, qlVar.g) && c().equals(qlVar.c());
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        xn xnVar = this.f;
        if (xnVar == null) {
            d();
            this.f = this;
            this = this;
        } else {
            r2 = xnVar;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        c();
        return this.j.hashCode() + ((this.i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xn xnVar = this.f;
        if (xnVar == null) {
            d();
            this.f = this;
            xnVar = this;
        }
        if (xnVar != this) {
            return xnVar.toString();
        }
        String str = this.i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : ec.i("function ", str, " (Kotlin reflection is not available)");
    }

    public ql(int i, Class cls, String str, String str2, int i2) {
        this(i, o8.f, cls, str, str2, i2, 0);
    }
}
