package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e23 extends g13 implements RandomAccess, h23, c33 {
    public static final int[] i;
    public static final e23 j;
    public int[] g;
    public int h;

    static {
        int[] iArr = new int[0];
        i = iArr;
        j = new e23(iArr, 0, false);
    }

    public e23(int[] iArr, int i2, boolean z) {
        super(z);
        this.g = iArr;
        this.h = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        int i4 = i2 + 1;
        int[] iArr = this.g;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.g, 0, iArr2, 0, i2);
            System.arraycopy(this.g, i2, iArr2, i4, this.h - i2);
            this.g = iArr2;
        }
        this.g[i2] = iIntValue;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g13, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m23.a;
        collection.getClass();
        if (!(collection instanceof e23)) {
            return super.addAll(collection);
        }
        e23 e23Var = (e23) collection;
        int i2 = e23Var.h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.g;
        if (i4 > iArr.length) {
            this.g = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(e23Var.g, 0, this.g, this.h, e23Var.h);
        this.h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.l23
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e23 z(int i2) {
        if (i2 >= this.h) {
            return new e23(i2 == 0 ? i : Arrays.copyOf(this.g, i2), this.h, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i2) {
        e(i2);
        return this.g[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        a();
        int i3 = this.h;
        int length = this.g.length;
        if (i3 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.g, 0, iArr, 0, this.h);
            this.g = iArr;
        }
        int[] iArr2 = this.g;
        int i4 = this.h;
        this.h = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // defpackage.g13, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e23)) {
            return super.equals(obj);
        }
        e23 e23Var = (e23) obj;
        if (this.h != e23Var.h) {
            return false;
        }
        int[] iArr = e23Var.g;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i2) {
        int i3 = this.h;
        return ec.l(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Integer.valueOf(this.g[i2]);
    }

    @Override // defpackage.g13, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 = (i2 * 31) + this.g[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.g[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.g13, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        int[] iArr = this.g;
        int i3 = iArr[i2];
        int i4 = this.h;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.g;
        System.arraycopy(iArr, i3, iArr, i2, this.h - i3);
        this.h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        e(i2);
        int[] iArr = this.g;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
