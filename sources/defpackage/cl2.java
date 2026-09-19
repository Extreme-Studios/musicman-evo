package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cl2 implements Iterator {
    public final Iterator f;

    public cl2(Iterator it) {
        it.getClass();
        this.f = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f.remove();
    }
}
