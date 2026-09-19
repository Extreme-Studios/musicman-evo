package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 extends AbstractSet {
    public final /* synthetic */ Set f;
    public final /* synthetic */ Set g;

    public yk2(Set set, Set set2) {
        this.f = set;
        this.g = set2;
    }

    public final int a() {
        Set set = this.f;
        int iA = set instanceof yk2 ? ((yk2) set).a() : set.size();
        Set set2 = this.g;
        return Math.min(iA, set2 instanceof yk2 ? ((yk2) set2).a() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.contains(obj) && this.g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f.containsAll(collection) && this.g.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z = set instanceof yk2;
                int iA = z ? ((yk2) set).a() : set.size();
                if (iA >= 0) {
                    int size = z ? 0 : set.size();
                    if (a() >= size) {
                        ek2 ek2Var = new ek2(this, this.f, this.g);
                        int i = 0;
                        while (ek2Var.hasNext()) {
                            try {
                                if (set.contains(ek2Var.next())) {
                                    i++;
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
                        if (i != iA) {
                            if (i >= size) {
                                Iterator it = set.iterator();
                                int i2 = 0;
                                while (it.hasNext()) {
                                    it.next();
                                    i2++;
                                    if (i2 > i) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.g, this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ek2(this, this.f, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.g.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
