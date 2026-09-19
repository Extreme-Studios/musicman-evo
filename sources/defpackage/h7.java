package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h7 implements Iterator {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h7(m7 m7Var, int i) {
        this(m7Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = m7Var;
                this(m7Var.h);
                break;
            default:
                this.j = m7Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                objF = ((m7) obj).f(i);
                break;
            case 1:
                objF = ((m7) obj).i(i);
                break;
            default:
                objF = ((n7) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            j7.e("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((m7) obj).g(i);
                break;
            case 1:
                ((m7) obj).g(i);
                break;
            default:
                ((n7) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h7(n7 n7Var) {
        this(n7Var.h);
        this.i = 2;
        this.j = n7Var;
    }

    public h7(int i) {
        this.f = i;
    }
}
