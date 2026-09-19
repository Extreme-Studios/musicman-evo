package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class u extends t implements ListIterator {
    public final /* synthetic */ w i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, int i) {
        super(0, wVar);
        this.i = wVar;
        int iA = wVar.a();
        if (i < 0 || i > iA) {
            j7.g("index: ", i, ", size: ", iA);
            throw null;
        }
        this.g = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.g - 1;
        this.g = i;
        return this.i.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
