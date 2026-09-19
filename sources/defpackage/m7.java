package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m7 extends q00 implements Map {
    public g7 i;
    public i7 j;
    public l7 k;

    @Override // java.util.Map
    public final Set entrySet() {
        g7 g7Var = this.i;
        if (g7Var != null) {
            return g7Var;
        }
        g7 g7Var2 = new g7(0, this);
        this.i = g7Var2;
        return g7Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        i7 i7Var = this.j;
        if (i7Var != null) {
            return i7Var;
        }
        i7 i7Var2 = new i7(this);
        this.j = i7Var2;
        return i7Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        l7 l7Var = this.k;
        if (l7Var != null) {
            return l7Var;
        }
        l7 l7Var2 = new l7(this);
        this.k = l7Var2;
        return l7Var2;
    }
}
