package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class m63 extends AbstractList {
    public static final na1 h = na1.y(m63.class);
    public final List f;
    public final k63 g;

    public m63(ArrayList arrayList, k63 k63Var) {
        this.f = arrayList;
        this.g = k63Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f;
        if (list.size() > i) {
            return list.get(i);
        }
        k63 k63Var = this.g;
        if (!k63Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(k63Var.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        na1 na1Var = h;
        na1Var.v("potentially expensive size() call");
        na1Var.v("blowup running");
        while (true) {
            k63 k63Var = this.g;
            boolean zHasNext = k63Var.hasNext();
            List list = this.f;
            if (!zHasNext) {
                return list.size();
            }
            list.add(k63Var.next());
        }
    }
}
