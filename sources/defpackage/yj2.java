package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yj2 extends dl2 {
    public final tj2 g;
    public dl2 h;

    public yj2(dk2 dk2Var) {
        super(0);
        Objects.requireNonNull(dk2Var);
        this.g = ((vj2) dk2Var.i.values()).listIterator(0);
        this.h = fk2.j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h.hasNext() || this.g.hasNext();
    }

    @Override // defpackage.dl2, java.util.Iterator
    public final Object next() {
        if (!this.h.hasNext()) {
            this.h = ((rj2) this.g.next()).a();
        }
        return this.h.next();
    }
}
