package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ub {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ub.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ub) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
