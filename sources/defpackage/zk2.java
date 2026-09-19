package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class zk2 extends AbstractCollection implements Set {
    public final Set f;
    public final zh2 g;

    public zk2(Set set, zh2 zh2Var) {
        this.f = set;
        this.g = zh2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        hn.v(this.g.b(obj));
        return this.f.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hn.v(this.g.b(it.next()));
        }
        return this.f.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f;
        boolean z = set instanceof RandomAccess;
        zh2 zh2Var = this.g;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            zh2Var.getClass();
            while (it.hasNext()) {
                if (zh2Var.b(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        zh2Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!zh2Var.b(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        v51.F(list, zh2Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        v51.F(list, zh2Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.g.b(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return a23.F(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return a23.A(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f.iterator();
        zh2 zh2Var = this.g;
        hn.O(zh2Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (zh2Var.b(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f.iterator();
        it.getClass();
        zh2 zh2Var = this.g;
        zh2Var.getClass();
        return new ek2(it, zh2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.g.b(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.g.b(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.g.b(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return na1.r((dl2) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return na1.r((dl2) iterator()).toArray(objArr);
    }
}
