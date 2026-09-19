package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o03 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final q03 b() {
        if (this instanceof q03) {
            return (q03) this;
        }
        j7.e("Not a JSON Object: ".concat(toString()));
        return null;
    }

    public final s03 c() {
        if (this instanceof s03) {
            return (s03) this;
        }
        j7.e("Not a JSON Primitive: ".concat(toString()));
        return null;
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            d13 d13Var = new d13(new xp(sb));
            d13Var.m = 1;
            b13.a.getClass();
            a13.T(d13Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
