package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u03 implements Iterator {
    public w03 f;
    public w03 g;
    public int h;
    public final /* synthetic */ x03 i;
    public final /* synthetic */ int j;

    public u03(x03 x03Var, int i) {
        this.j = i;
        Objects.requireNonNull(x03Var);
        this.i = x03Var;
        this.f = x03Var.j.i;
        this.g = null;
        this.h = x03Var.i;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w03 a() {
        w03 w03Var = this.f;
        x03 x03Var = this.i;
        if (w03Var == x03Var.j) {
            throw new NoSuchElementException();
        }
        if (x03Var.i != this.h) {
            throw new ConcurrentModificationException();
        }
        this.f = w03Var.i;
        this.g = w03Var;
        return w03Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != this.i.j;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.j) {
            case 1:
                return a().k;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        w03 w03Var = this.g;
        if (w03Var == null) {
            j7.a();
            return;
        }
        x03 x03Var = this.i;
        x03Var.b(w03Var, true);
        this.g = null;
        this.h = x03Var.i;
    }
}
