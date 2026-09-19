package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qs2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ qs2(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs2)) {
            return false;
        }
        qs2 qs2Var = (qs2) obj;
        return qs2Var.a.equals(this.a) && qs2Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.b.getSimpleName();
        return ec.n(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
