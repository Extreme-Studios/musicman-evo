package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lv implements Serializable {
    public final Object f;
    public final Object g;

    public lv(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv)) {
            return false;
        }
        lv lvVar = (lv) obj;
        return jn.b(this.f, lvVar.f) && jn.b(this.g, lvVar.g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ')';
    }
}
