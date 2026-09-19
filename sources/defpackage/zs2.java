package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zs2 {
    public final Class a;
    public final j03 b;

    public /* synthetic */ zs2(Class cls, j03 j03Var) {
        this.a = cls;
        this.b = j03Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zs2)) {
            return false;
        }
        zs2 zs2Var = (zs2) obj;
        return zs2Var.a.equals(this.a) && zs2Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String strValueOf = String.valueOf(this.b);
        return ec.n(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
