package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h33 implements Iterator {
    public final ArrayDeque f;
    public l13 g;

    public h33(n13 n13Var) {
        if (!(n13Var instanceof i33)) {
            this.f = null;
            this.g = (l13) n13Var;
            return;
        }
        i33 i33Var = (i33) n13Var;
        ArrayDeque arrayDeque = new ArrayDeque(i33Var.l);
        this.f = arrayDeque;
        arrayDeque.push(i33Var);
        n13 n13Var2 = i33Var.i;
        while (n13Var2 instanceof i33) {
            i33 i33Var2 = (i33) n13Var2;
            this.f.push(i33Var2);
            n13Var2 = i33Var2.i;
        }
        this.g = (l13) n13Var2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l13 next() {
        l13 l13Var;
        l13 l13Var2 = this.g;
        if (l13Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f;
            l13Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            n13 n13Var = ((i33) arrayDeque.pop()).j;
            while (n13Var instanceof i33) {
                i33 i33Var = (i33) n13Var;
                arrayDeque.push(i33Var);
                n13Var = i33Var.i;
            }
            l13Var = (l13) n13Var;
        } while (l13Var.d() == 0);
        this.g = l13Var;
        return l13Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
