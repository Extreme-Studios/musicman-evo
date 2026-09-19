package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 extends rs0 implements Map {
    public final Map v;

    public rh2(Map map) {
        super(22);
        this.v = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.v.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.v.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((zk2) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return a23.w(this.v.entrySet(), vd0.i);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && ej1.w(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.v.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a23.A(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.v;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return a23.w(this.v.keySet(), vd0.j);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.v.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.v.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.v.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.v;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // defpackage.rs0
    public final /* synthetic */ Object u() {
        return this.v;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.v.values();
    }
}
