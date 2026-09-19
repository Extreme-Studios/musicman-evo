package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 extends dl2 {
    public final tj2 g;
    public Object h;
    public dl2 i;

    public xj2(dk2 dk2Var) {
        super(0);
        Objects.requireNonNull(dk2Var);
        this.g = dk2Var.i.entrySet().e().listIterator(0);
        this.h = null;
        this.i = fk2.j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i.hasNext() || this.g.hasNext();
    }

    @Override // defpackage.dl2, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.i.hasNext()) {
            Map.Entry entry = (Map.Entry) this.g.next();
            this.h = entry.getKey();
            this.i = ((rj2) entry.getValue()).a();
        }
        Object obj = this.h;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.i.next());
    }
}
