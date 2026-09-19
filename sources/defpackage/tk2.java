package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends bk2 {
    public final transient vk2 i;
    public final transient uk2 j;

    public tk2(vk2 vk2Var, uk2 uk2Var) {
        this.i = vk2Var;
        this.j = uk2Var;
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        return this.j.listIterator(0);
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.i.get(obj) != null;
    }

    @Override // defpackage.bk2, defpackage.rj2
    public final vj2 e() {
        return this.j;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return true;
    }

    @Override // defpackage.rj2
    public final int g(Object[] objArr, int i) {
        return this.j.g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.k;
    }
}
