package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gj2 implements Iterator {
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ jj2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ jj2 k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gj2(jj2 jj2Var, int i) {
        this(jj2Var, (char) 0);
        this.j = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(jj2Var);
                this.k = jj2Var;
                this(jj2Var, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(jj2Var);
                this.k = jj2Var;
                this(jj2Var, (char) 0);
                break;
            default:
                Objects.requireNonNull(jj2Var);
                this.k = jj2Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object ij2Var;
        jj2 jj2Var = this.i;
        if (jj2Var.j != this.f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        this.h = i;
        int i2 = this.j;
        jj2 jj2Var2 = this.k;
        switch (i2) {
            case 0:
                ij2Var = jj2Var2.b()[i];
                break;
            case 1:
                ij2Var = new ij2(jj2Var2, i);
                break;
            default:
                ij2Var = jj2Var2.c()[i];
                break;
        }
        int i3 = this.g + 1;
        if (i3 >= jj2Var.k) {
            i3 = -1;
        }
        this.g = i3;
        return ij2Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        jj2 jj2Var = this.i;
        if (jj2Var.j != this.f) {
            throw new ConcurrentModificationException();
        }
        hn.N("no calls to next() since the last call to remove()", this.h >= 0);
        this.f += 32;
        jj2Var.remove(jj2Var.b()[this.h]);
        this.g--;
        this.h = -1;
    }

    public gj2(jj2 jj2Var, char c) {
        Objects.requireNonNull(jj2Var);
        this.i = jj2Var;
        this.f = jj2Var.j;
        this.g = jj2Var.isEmpty() ? -1 : 0;
        this.h = -1;
    }
}
