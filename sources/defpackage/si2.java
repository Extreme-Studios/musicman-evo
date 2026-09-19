package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public class si2 extends AbstractMap {
    public transient qi2 f;
    public transient bj2 g;
    public final transient Map h;
    public final /* synthetic */ nk2 i;

    public si2(nk2 nk2Var, Map map) {
        Objects.requireNonNull(nk2Var);
        this.i = nk2Var;
        this.h = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        nk2 nk2Var = this.i;
        nk2Var.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new wi2(nk2Var, key, list, null) : new aj2(nk2Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.h;
        nk2 nk2Var = this.i;
        if (map == nk2Var.i) {
            nk2Var.e();
            return;
        }
        ri2 ri2Var = new ri2(this);
        while (ri2Var.hasNext()) {
            ri2Var.next();
            ri2Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.h;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        qi2 qi2Var = this.f;
        if (qi2Var != null) {
            return qi2Var;
        }
        qi2 qi2Var2 = new qi2(this);
        this.f = qi2Var2;
        return qi2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.h.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.h;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        nk2 nk2Var = this.i;
        nk2Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new wi2(nk2Var, obj, list, null) : new aj2(nk2Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set yi2Var;
        nk2 nk2Var = this.i;
        Set set = nk2Var.f;
        if (set != null) {
            return set;
        }
        Map map = nk2Var.i;
        if (map instanceof NavigableMap) {
            yi2Var = new vi2(nk2Var, (NavigableMap) map);
        } else {
            yi2Var = map instanceof SortedMap ? new yi2(nk2Var, (SortedMap) map) : new ti2(nk2Var, map);
        }
        nk2Var.f = yi2Var;
        return yi2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.h.remove(obj);
        if (collection == null) {
            return null;
        }
        nk2 nk2Var = this.i;
        List list = (List) nk2Var.k.a();
        list.addAll(collection);
        nk2Var.j -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.h.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        bj2 bj2Var = this.g;
        if (bj2Var != null) {
            return bj2Var;
        }
        bj2 bj2Var2 = new bj2(this);
        this.g = bj2Var2;
        return bj2Var2;
    }
}
