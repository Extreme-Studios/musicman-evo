package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements Map.Entry {
    public final Object f;
    public int g;
    public final /* synthetic */ jj2 h;

    public ij2(jj2 jj2Var, int i) {
        Objects.requireNonNull(jj2Var);
        this.h = jj2Var;
        this.f = jj2Var.b()[i];
        this.g = i;
    }

    public final void a() {
        int i = this.g;
        Object obj = this.f;
        jj2 jj2Var = this.h;
        if (i != -1 && i < jj2Var.size()) {
            if (Objects.equals(obj, jj2Var.b()[this.g])) {
                return;
            }
        }
        this.g = jj2Var.i(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        jj2 jj2Var = this.h;
        Map mapE = jj2Var.e();
        if (mapE != null) {
            return mapE.get(this.f);
        }
        a();
        int i = this.g;
        if (i == -1) {
            return null;
        }
        return jj2Var.c()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        jj2 jj2Var = this.h;
        Map mapE = jj2Var.e();
        Object obj2 = this.f;
        if (mapE != null) {
            return mapE.put(obj2, obj);
        }
        a();
        int i = this.g;
        if (i == -1) {
            jj2Var.put(obj2, obj);
            return null;
        }
        Object obj3 = jj2Var.c()[i];
        jj2Var.c()[this.g] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return ec.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
