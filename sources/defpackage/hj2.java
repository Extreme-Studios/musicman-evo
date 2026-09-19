package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hj2 extends AbstractSet {
    public final /* synthetic */ int f;
    public final /* synthetic */ jj2 g;

    public /* synthetic */ hj2(jj2 jj2Var, int i) {
        this.f = i;
        this.g = jj2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f;
        jj2 jj2Var = this.g;
        switch (i) {
            case 0:
                Map mapE = jj2Var.e();
                if (mapE != null) {
                    return mapE.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i2 = jj2Var.i(entry.getKey());
                    if (i2 != -1 && Objects.equals(jj2Var.c()[i2], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return jj2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f;
        jj2 jj2Var = this.g;
        switch (i) {
            case 0:
                Map mapE = jj2Var.e();
                return mapE != null ? mapE.entrySet().iterator() : new gj2(jj2Var, 1);
            default:
                Map mapE2 = jj2Var.e();
                return mapE2 != null ? mapE2.keySet().iterator() : new gj2(jj2Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f;
        jj2 jj2Var = this.g;
        switch (i) {
            case 0:
                Map mapE = jj2Var.e();
                if (mapE != null) {
                    return mapE.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!jj2Var.d()) {
                        int iG = jj2Var.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = jj2Var.f;
                        Objects.requireNonNull(obj2);
                        int iW = s90.W(key, value, iG, obj2, jj2Var.a(), jj2Var.b(), jj2Var.c());
                        if (iW != -1) {
                            jj2Var.f(iW, iG);
                            jj2Var.k--;
                            jj2Var.j += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map mapE2 = jj2Var.e();
                if (mapE2 != null) {
                    return mapE2.keySet().remove(obj);
                }
                return jj2Var.j(obj) != jj2.o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f) {
            case 0:
                break;
        }
        return this.g.size();
    }
}
