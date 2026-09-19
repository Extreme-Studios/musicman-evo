package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ji2 implements Serializable, ii2 {
    public final transient o8 f = new o8();
    public final ii2 g;
    public volatile transient boolean h;
    public transient Object i;

    public ji2(ii2 ii2Var) {
        this.g = ii2Var;
    }

    @Override // defpackage.ii2
    public final Object a() {
        if (!this.h) {
            synchronized (this.f) {
                try {
                    if (!this.h) {
                        Object objA = this.g.a();
                        this.i = objA;
                        this.h = true;
                        return objA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public final String toString() {
        Object objN;
        if (this.h) {
            String strValueOf = String.valueOf(this.i);
            objN = ec.n(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objN = this.g;
        }
        String string = objN.toString();
        return ec.n(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }
}
