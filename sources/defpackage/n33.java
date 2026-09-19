package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n33 implements Iterator {
    public int f;
    public boolean g;
    public Iterator h;
    public final /* synthetic */ l33 i;

    public /* synthetic */ n33(l33 l33Var) {
        Objects.requireNonNull(l33Var);
        this.i = l33Var;
        this.f = -1;
    }

    public final Iterator a() {
        if (this.h == null) {
            this.h = this.i.h.entrySet().iterator();
        }
        return this.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f + 1;
        l33 l33Var = this.i;
        if (i >= l33Var.g) {
            return !l33Var.h.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.g = true;
        int i = this.f + 1;
        this.f = i;
        l33 l33Var = this.i;
        return i < l33Var.g ? (m33) l33Var.f[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            j7.e("remove() was called before next()");
            return;
        }
        this.g = false;
        l33 l33Var = this.i;
        l33Var.f();
        int i = this.f;
        if (i >= l33Var.g) {
            a().remove();
        } else {
            this.f = i - 1;
            l33Var.d(i);
        }
    }
}
