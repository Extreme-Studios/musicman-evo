package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jk2 extends cl2 implements ListIterator {
    public final /* synthetic */ int g;
    public final /* synthetic */ AbstractList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk2(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.g = i;
        this.h = abstractList;
    }

    @Override // defpackage.cl2
    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                return ((kk2) this.h).g.apply(obj);
            default:
                return ((lk2) this.h).g.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
