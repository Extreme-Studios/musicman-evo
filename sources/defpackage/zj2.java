package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zj2 extends rj2 {
    public final transient dk2 g;

    public zj2(dk2 dk2Var) {
        this.g = dk2Var;
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        return new yj2(this.g);
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.c(obj);
    }

    @Override // defpackage.rj2
    public final int g(Object[] objArr, int i) {
        tj2 tj2VarListIterator = ((vj2) this.g.i.values()).listIterator(0);
        while (tj2VarListIterator.hasNext()) {
            i = ((rj2) tj2VarListIterator.next()).g(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yj2(this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.g.j;
    }
}
