package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ai2 implements Serializable, zh2 {
    public final List f;

    @Override // defpackage.zh2
    public final boolean b(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return true;
            }
            if (!((zh2) list.get(i)).b(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai2) {
            return this.f.equals(((ai2) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
