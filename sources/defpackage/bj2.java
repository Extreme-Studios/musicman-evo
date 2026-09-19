package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bj2 extends AbstractCollection {
    public final /* synthetic */ int f;
    public final Object g;

    public bj2(si2 si2Var) {
        this.f = 2;
        this.g = si2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f) {
            case 0:
                ((nk2) this.g).e();
                break;
            case 1:
                ((jj2) this.g).clear();
                break;
            default:
                ((si2) this.g).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                return ((nk2) this.g).c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((si2) this.g).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f) {
            case 2:
                return ((si2) this.g).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                nk2 nk2Var = (nk2) obj;
                nk2Var.getClass();
                return new pi2(nk2Var);
            case 1:
                jj2 jj2Var = (jj2) obj;
                Map mapE = jj2Var.e();
                return mapE != null ? mapE.values().iterator() : new gj2(jj2Var, 2);
            default:
                return new mk2(((si2) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    si2 si2Var = (si2) this.g;
                    for (Map.Entry entry : si2Var.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            si2Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    si2 si2Var = (si2) this.g;
                    for (Map.Entry entry : si2Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return si2Var.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    si2 si2Var = (si2) this.g;
                    for (Map.Entry entry : si2Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return si2Var.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f) {
            case 0:
                return ((nk2) this.g).j;
            case 1:
                return ((jj2) this.g).size();
            default:
                return ((si2) this.g).h.size();
        }
    }

    public /* synthetic */ bj2(int i, Serializable serializable) {
        this.f = i;
        this.g = serializable;
    }
}
