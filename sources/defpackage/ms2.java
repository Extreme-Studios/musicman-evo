package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ms2 implements Iterator {
    public final Iterator f;
    public final Iterator g;

    public /* synthetic */ ms2(Iterator it, Iterator it2) {
        this.f = it;
        this.g = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext() || this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f;
        return it.hasNext() ? it.next() : this.g.next();
    }
}
