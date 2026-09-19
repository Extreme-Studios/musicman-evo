package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ri2 implements Iterator {
    public final /* synthetic */ int f = 2;
    public final Iterator g;
    public Object h;
    public final /* synthetic */ Object i;

    public ri2(aj2 aj2Var) {
        this.i = aj2Var;
        Collection collection = aj2Var.g;
        this.h = collection;
        this.g = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        aj2 aj2Var = (aj2) this.i;
        aj2Var.a();
        if (aj2Var.g != ((Collection) this.h)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Iterator it = this.g;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.h = (Collection) entry.getValue();
                return ((si2) this.i).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.h = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f;
        Object obj = this.i;
        Iterator it = this.g;
        switch (i) {
            case 0:
                hn.N("no calls to next() since the last call to remove()", ((Collection) this.h) != null);
                it.remove();
                ((si2) obj).i.j -= ((Collection) this.h).size();
                ((Collection) this.h).clear();
                this.h = null;
                break;
            case 1:
                hn.N("no calls to next() since the last call to remove()", ((Map.Entry) this.h) != null);
                Collection collection = (Collection) ((Map.Entry) this.h).getValue();
                it.remove();
                ((ti2) obj).g.j -= collection.size();
                collection.clear();
                this.h = null;
                break;
            default:
                it.remove();
                aj2 aj2Var = (aj2) obj;
                aj2Var.j.j--;
                aj2Var.b();
                break;
        }
    }

    public ri2(ti2 ti2Var, Iterator it) {
        this.g = it;
        this.i = ti2Var;
    }

    public ri2(si2 si2Var) {
        Objects.requireNonNull(si2Var);
        this.i = si2Var;
        this.g = si2Var.h.entrySet().iterator();
    }

    public ri2(aj2 aj2Var, ListIterator listIterator) {
        this.i = aj2Var;
        this.h = aj2Var.g;
        this.g = listIterator;
    }
}
