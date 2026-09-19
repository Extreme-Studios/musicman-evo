package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uk2 extends vj2 {
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    public uk2(Object[] objArr, int i, int i2) {
        this.h = objArr;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hn.P(i, this.j);
        Object obj = this.h[i + i + this.i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }
}
