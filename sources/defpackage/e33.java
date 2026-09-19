package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e33 extends g13 implements RandomAccess {
    public static final Object[] i;
    public static final e33 j;
    public Object[] g;
    public int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new e33(objArr, 0, false);
    }

    public e33(Object[] objArr, int i2, boolean z) {
        super(z);
        this.g = objArr;
        this.h = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.g;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.g, 0, objArr2, 0, i2);
            System.arraycopy(this.g, i2, objArr2, i4, this.h - i2);
            this.g = objArr2;
        }
        this.g[i2] = obj;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        int i3 = this.h;
        return ec.l(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.g[i2];
    }

    @Override // defpackage.g13, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.g;
        Object obj = objArr[i2];
        int i3 = this.h;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    @Override // defpackage.l23
    public final /* bridge */ /* synthetic */ l23 z(int i2) {
        if (i2 >= this.h) {
            return new e33(i2 == 0 ? i : Arrays.copyOf(this.g, i2), this.h, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.h;
        int length = this.g.length;
        if (i2 == length) {
            this.g = Arrays.copyOf(this.g, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
