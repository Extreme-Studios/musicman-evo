package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 extends pk2 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof kj2);
    }

    public final int hashCode() {
        return ts.o.hashCode();
    }

    public final String toString() {
        return ts.o.toString();
    }
}
