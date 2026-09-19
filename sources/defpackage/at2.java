package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class at2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ at2(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at2)) {
            return false;
        }
        at2 at2Var = (at2) obj;
        return at2Var.a.equals(this.a) && at2Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.b.getSimpleName();
        return ec.n(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
