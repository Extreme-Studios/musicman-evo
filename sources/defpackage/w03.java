package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w03 implements Map.Entry {
    public w03 f;
    public w03 g;
    public w03 h;
    public w03 i;
    public w03 j;
    public final Object k;
    public Object l;
    public int m;

    public w03(w03 w03Var, Object obj, w03 w03Var2, w03 w03Var3) {
        this.f = w03Var;
        this.k = obj;
        this.m = 1;
        this.i = w03Var2;
        this.j = w03Var3;
        w03Var3.i = this;
        w03Var2.j = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.k;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.l;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.k;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.l;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            j7.l("value == null");
            return null;
        }
        Object obj2 = this.l;
        this.l = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.k);
        String strValueOf2 = String.valueOf(this.l);
        return ec.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public w03() {
        this.k = null;
        this.j = this;
        this.i = this;
    }
}
