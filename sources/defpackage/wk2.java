package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wk2 extends bk2 {
    public static final Object[] n;
    public static final wk2 o;
    public final transient Object[] i;
    public final transient int j;
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new wk2(0, 0, 0, objArr, objArr);
    }

    public wk2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.i = objArr;
        this.j = i;
        this.k = objArr2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        return e().listIterator(0);
    }

    @Override // defpackage.rj2
    public final Object[] b() {
        return this.i;
    }

    @Override // defpackage.rj2
    public final int c() {
        return 0;
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.k;
            if (objArr.length != 0) {
                int I = ss0.I(obj);
                while (true) {
                    int i = I & this.l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    I = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rj2
    public final int d() {
        return this.m;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.rj2
    public final int g(Object[] objArr, int i) {
        Object[] objArr2 = this.i;
        int i2 = this.m;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.bk2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.bk2
    public final vj2 k() {
        return vj2.o(this.i, this.m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }
}
