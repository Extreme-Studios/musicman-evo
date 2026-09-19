package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fj2 extends pk2 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fj2 fj2Var = hg1.a;
        Integer numValueOf = Integer.valueOf(((tf1) obj).p);
        fj2 fj2Var2 = hg1.a;
        return numValueOf.compareTo(Integer.valueOf(((tf1) obj2).p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof fj2);
    }

    public final int hashCode() {
        return Objects.hash(lh0.g, ok2.g);
    }

    public final String toString() {
        String string = lh0.g.toString();
        return ec.n(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
