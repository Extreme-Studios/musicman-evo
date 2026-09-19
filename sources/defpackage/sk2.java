package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sk2 extends bk2 {
    public final transient vk2 i;
    public final transient Object[] j;
    public final transient int k;

    public sk2(vk2 vk2Var, Object[] objArr, int i) {
        this.i = vk2Var;
        this.j = objArr;
        this.k = i;
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        return e().listIterator(0);
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return true;
    }

    @Override // defpackage.rj2
    public final int g(Object[] objArr, int i) {
        return e().g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.bk2
    public final vj2 k() {
        return new rk2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k;
    }
}
