package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class aj2 extends AbstractCollection implements List {
    public final Object f;
    public Collection g;
    public final aj2 h;
    public final Collection i;
    public final /* synthetic */ nk2 j;
    public final /* synthetic */ nk2 k;

    public aj2(nk2 nk2Var, Object obj, List list, aj2 aj2Var) {
        this.k = nk2Var;
        this.j = nk2Var;
        this.f = obj;
        this.g = list;
        this.h = aj2Var;
        this.i = aj2Var == null ? null : aj2Var.g;
    }

    public final void a() {
        aj2 aj2Var = this.h;
        if (aj2Var != null) {
            aj2Var.a();
            if (aj2Var.g != this.i) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.g.isEmpty()) {
            Collection collection = (Collection) this.j.i.get(this.f);
            if (collection != null) {
                this.g = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean zIsEmpty = this.g.isEmpty();
        boolean zAdd = this.g.add(obj);
        if (zAdd) {
            this.j.j++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.g).addAll(i, collection);
        if (zAddAll) {
            this.k.j += this.g.size() - size;
            if (size == 0) {
                c();
                return true;
            }
        }
        return zAddAll;
    }

    public final void b() {
        aj2 aj2Var = this.h;
        if (aj2Var != null) {
            aj2Var.b();
        } else if (this.g.isEmpty()) {
            this.j.i.remove(this.f);
        }
    }

    public final void c() {
        aj2 aj2Var = this.h;
        if (aj2Var != null) {
            aj2Var.c();
        } else {
            this.j.i.put(this.f, this.g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.g.clear();
        this.j.j -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.g.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.g.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.g).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.g.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.g).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new ri2(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.g).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new zi2(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = ((List) this.g).remove(i);
        this.k.j--;
        b();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.g.removeAll(collection);
        if (zRemoveAll) {
            this.j.j += this.g.size() - size;
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.g.retainAll(collection);
        if (zRetainAll) {
            this.j.j += this.g.size() - size;
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.g).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.g.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        a();
        List listSubList = ((List) this.g).subList(i, i2);
        aj2 aj2Var = this.h;
        if (aj2Var == null) {
            aj2Var = this;
        }
        nk2 nk2Var = this.k;
        nk2Var.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f;
        return z ? new wi2(nk2Var, obj, listSubList, aj2Var) : new aj2(nk2Var, obj, listSubList, aj2Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.g.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new zi2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean zRemove = this.g.remove(obj);
        if (zRemove) {
            this.j.j--;
            b();
        }
        return zRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean zIsEmpty = this.g.isEmpty();
        ((List) this.g).add(i, obj);
        this.k.j++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.g.addAll(collection);
        if (zAddAll) {
            this.j.j += this.g.size() - size;
            if (size == 0) {
                c();
                return true;
            }
        }
        return zAddAll;
    }
}
