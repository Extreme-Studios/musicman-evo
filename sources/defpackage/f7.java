package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends AbstractList implements List {
    public static final Object[] i = new Object[0];
    public int f;
    public Object[] g = i;
    public int h;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.g.length;
        while (i2 < length && it.hasNext()) {
            this.g[i2] = it.next();
            i2++;
        }
        int i3 = this.f;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.g[i4] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.h;
        if (i2 < 0 || i2 > i3) {
            j7.g("index: ", i2, ", size: ", i3);
            return;
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.h + 1);
        int iF = f(this.f + i2);
        int i4 = this.h;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iF == 0) {
                Object[] objArr = this.g;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iF - 1;
            }
            int length2 = this.f;
            if (length2 == 0) {
                Object[] objArr2 = this.g;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i5 = length2 - 1;
            int i6 = this.f;
            Object[] objArr3 = this.g;
            if (length >= i6) {
                objArr3[i5] = objArr3[i6];
                o7.b1(i6, i6 + 1, length + 1, objArr3, objArr3);
            } else {
                o7.b1(i6 - 1, i6, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.g;
                objArr4[objArr4.length - 1] = objArr4[0];
                o7.b1(0, 1, length + 1, objArr4, objArr4);
            }
            this.g[length] = obj;
            this.f = i5;
        } else {
            int iF2 = f(this.f + i4);
            Object[] objArr5 = this.g;
            if (iF < iF2) {
                o7.b1(iF + 1, iF, iF2, objArr5, objArr5);
            } else {
                o7.b1(1, 0, iF2, objArr5, objArr5);
                Object[] objArr6 = this.g;
                objArr6[0] = objArr6[objArr6.length - 1];
                o7.b1(iF + 1, iF, objArr6.length - 1, objArr6, objArr6);
            }
            this.g[iF] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        int i3 = this.h;
        if (i2 < 0 || i2 > i3) {
            j7.g("index: ", i2, ", size: ", i3);
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.h) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.h);
        int iF = f(this.f + this.h);
        int iF2 = f(this.f + i2);
        int size = collection.size();
        if (i2 >= ((this.h + 1) >> 1)) {
            int i4 = iF2 + size;
            Object[] objArr = this.g;
            if (iF2 < iF) {
                int i5 = size + iF;
                if (i5 <= objArr.length) {
                    o7.b1(i4, iF2, iF, objArr, objArr);
                } else if (i4 >= objArr.length) {
                    o7.b1(i4 - objArr.length, iF2, iF, objArr, objArr);
                } else {
                    int length = iF - (i5 - objArr.length);
                    o7.b1(0, length, iF, objArr, objArr);
                    Object[] objArr2 = this.g;
                    o7.b1(i4, iF2, length, objArr2, objArr2);
                }
            } else {
                o7.b1(size, 0, iF, objArr, objArr);
                Object[] objArr3 = this.g;
                if (i4 >= objArr3.length) {
                    o7.b1(i4 - objArr3.length, iF2, objArr3.length, objArr3, objArr3);
                } else {
                    o7.b1(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.g;
                    o7.b1(i4, iF2, objArr4.length - size, objArr4, objArr4);
                }
            }
            a(iF2, collection);
            return true;
        }
        int i6 = this.f;
        int length2 = i6 - size;
        Object[] objArr5 = this.g;
        if (iF2 < i6) {
            o7.b1(length2, i6, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.g;
            if (size >= iF2) {
                o7.b1(objArr6.length - size, 0, iF2, objArr6, objArr6);
            } else {
                o7.b1(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.g;
                o7.b1(0, size, iF2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            o7.b1(length2, i6, iF2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i7 = iF2 - i6;
            int length3 = objArr5.length - length2;
            if (length3 >= i7) {
                o7.b1(length2, i6, iF2, objArr5, objArr5);
            } else {
                o7.b1(length2, i6, i6 + length3, objArr5, objArr5);
                Object[] objArr8 = this.g;
                o7.b1(0, this.f + length3, iF2, objArr8, objArr8);
            }
        }
        this.f = length2;
        a(d(iF2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.h + 1);
        int length = this.f;
        if (length == 0) {
            Object[] objArr = this.g;
            objArr.getClass();
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f = i2;
        this.g[i2] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.h + 1);
        this.g[f(this.f + this.h)] = obj;
        this.h++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            j7.e("Deque is too big.");
            return;
        }
        Object[] objArr = this.g;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.g = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        o7.b1(0, this.f, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.g;
        int length2 = objArr3.length;
        int i4 = this.f;
        o7.b1(length2 - i4, 0, i4, objArr3, objArr2);
        this.f = 0;
        this.g = objArr2;
    }

    public final int c(int i2) {
        Object[] objArr = this.g;
        objArr.getClass();
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f, f(this.f + this.h));
        }
        this.f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.g.length : i2;
    }

    public final void e(int i2, int i3) {
        Object[] objArr = this.g;
        if (i2 < i3) {
            objArr.getClass();
            Arrays.fill(objArr, i2, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i2, objArr.length, (Object) null);
            Object[] objArr2 = this.g;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i3, (Object) null);
        }
    }

    public final int f(int i2) {
        Object[] objArr = this.g;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.h;
        if (i2 >= 0 && i2 < i3) {
            return this.g[f(this.f + i2)];
        }
        j7.g("index: ", i2, ", size: ", i3);
        return null;
    }

    public final Object h(int i2) {
        int i3 = this.h;
        if (i2 < 0 || i2 >= i3) {
            j7.g("index: ", i2, ", size: ", i3);
            return null;
        }
        if (i2 == i3 - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int iF = f(this.f + i2);
        Object[] objArr = this.g;
        Object obj = objArr[iF];
        int i4 = this.h;
        int i5 = i4 >> 1;
        int i6 = this.f;
        if (i2 < i5) {
            if (iF >= i6) {
                o7.b1(i6 + 1, i6, iF, objArr, objArr);
            } else {
                o7.b1(1, 0, iF, objArr, objArr);
                Object[] objArr2 = this.g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f;
                o7.b1(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.g;
            int i8 = this.f;
            objArr3[i8] = null;
            this.f = c(i8);
        } else {
            int iF2 = f((i4 - 1) + i6);
            Object[] objArr4 = this.g;
            if (iF <= iF2) {
                o7.b1(iF, iF + 1, iF2 + 1, objArr4, objArr4);
            } else {
                o7.b1(iF, iF + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.g;
                objArr5[objArr5.length - 1] = objArr5[0];
                o7.b1(0, 1, iF2 + 1, objArr5, objArr5);
            }
            this.g[iF2] = null;
        }
        this.h--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iF = f(this.f + this.h);
        int length = this.f;
        if (length < iF) {
            while (length < iF) {
                if (jn.b(obj, this.g[length])) {
                    i2 = this.f;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.g.length;
        while (length < length2) {
            if (jn.b(obj, this.g[length])) {
                i2 = this.f;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iF; i3++) {
            if (jn.b(obj, this.g[i3])) {
                length = i3 + this.g.length;
                i2 = this.f;
            }
        }
        return -1;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i2;
        int iF = f(this.f + this.h);
        int i3 = this.f;
        if (i3 < iF) {
            length = iF - 1;
            if (i3 <= length) {
                while (!jn.b(obj, this.g[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iF) {
            do {
                iF--;
                objArr = this.g;
                if (-1 >= iF) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.f;
                    if (i4 <= length) {
                        while (!jn.b(obj, this.g[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i2 = this.f;
                    }
                }
                return length - i2;
            } while (!jn.b(obj, objArr[iF]));
            length = iF + this.g.length;
            i2 = this.f;
            return length - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int iF2 = f(this.f + this.h);
            int i2 = this.f;
            if (i2 < iF2) {
                iF = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= iF2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.g[iF] = obj;
                        iF++;
                    }
                    i2++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.g[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.g[iF] = obj3;
                        iF = c(iF);
                    }
                }
                z = z2;
            }
            if (z) {
                g();
                this.h = d(iF - this.f);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.g;
        int i2 = this.f;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f = c(i2);
        this.h--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int iF = f((size() - 1) + this.f);
        Object[] objArr = this.g;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.h--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        v51.c(i2, i3, this.h);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.h) {
            clear();
            return;
        }
        if (i4 == 1) {
            h(i2);
            return;
        }
        g();
        int i5 = this.h - i3;
        int i6 = this.f;
        if (i2 < i5) {
            int iF = f((i2 - 1) + i6);
            int iF2 = f(this.f + (i3 - 1));
            while (i2 > 0) {
                int i7 = iF + 1;
                int iMin = Math.min(i2, Math.min(i7, iF2 + 1));
                Object[] objArr = this.g;
                int i8 = iF2 - iMin;
                int i9 = iF - iMin;
                o7.b1(i8 + 1, i9 + 1, i7, objArr, objArr);
                iF = d(i9);
                iF2 = d(i8);
                i2 -= iMin;
            }
            int iF3 = f(this.f + i4);
            e(this.f, iF3);
            this.f = iF3;
        } else {
            int iF4 = f(i6 + i3);
            int iF5 = f(this.f + i2);
            int i10 = this.h;
            while (true) {
                i10 -= i3;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.g;
                i3 = Math.min(i10, Math.min(objArr2.length - iF4, objArr2.length - iF5));
                Object[] objArr3 = this.g;
                int i11 = iF4 + i3;
                o7.b1(iF5, iF4, i11, objArr3, objArr3);
                iF4 = f(i11);
                iF5 = f(iF5 + i3);
            }
            int iF6 = f(this.f + this.h);
            e(d(iF6 - i4), iF6);
        }
        this.h -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int iF2 = f(this.f + this.h);
            int i2 = this.f;
            if (i2 < iF2) {
                iF = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= iF2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.g[iF] = obj;
                        iF++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.g[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.g[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                g();
                this.h = d(iF - this.f);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.h;
        if (i2 < 0 || i2 >= i3) {
            j7.g("index: ", i2, ", size: ", i3);
            return null;
        }
        int iF = f(this.f + i2);
        Object[] objArr = this.g;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.h;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.f + this.h);
        int i3 = this.f;
        if (i3 < iF) {
            o7.c1(i3, iF, 2, this.g, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.g;
            o7.b1(0, this.f, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.g;
            o7.b1(objArr3.length - this.f, 0, iF, objArr3, objArr);
        }
        int i4 = this.h;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return h(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.h]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.h);
        a(f(this.f + this.h), collection);
        return true;
    }
}
