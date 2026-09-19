package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qk2 extends vj2 {
    public static final qk2 j = new qk2(new Object[0], 0);
    public final transient Object[] h;
    public final transient int i;

    public qk2(Object[] objArr, int i) {
        this.h = objArr;
        this.i = i;
    }

    @Override // defpackage.rj2
    public final Object[] b() {
        return this.h;
    }

    @Override // defpackage.rj2
    public final int c() {
        return 0;
    }

    @Override // defpackage.rj2
    public final int d() {
        return this.i;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.vj2, defpackage.rj2
    public final int g(Object[] objArr, int i) {
        Object[] objArr2 = this.h;
        int i2 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hn.P(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
