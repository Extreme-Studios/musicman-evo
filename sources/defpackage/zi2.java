package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class zi2 extends ri2 implements ListIterator {
    public final /* synthetic */ aj2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi2(aj2 aj2Var, int i) {
        super(aj2Var, ((List) aj2Var.g).listIterator(i));
        this.j = aj2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        aj2 aj2Var = this.j;
        boolean zIsEmpty = aj2Var.isEmpty();
        a();
        ((ListIterator) this.g).add(obj);
        aj2Var.k.j++;
        if (zIsEmpty) {
            aj2Var.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.g).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.g).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.g).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.g).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.g).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi2(aj2 aj2Var) {
        super(aj2Var);
        this.j = aj2Var;
    }
}
