package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class vj2 extends rj2 implements List, RandomAccess {
    public static final tj2 g = new tj2(qk2.j, 0);

    public static qk2 i(Object obj) {
        Object[] objArr = {obj};
        dq.y(objArr, 1);
        return o(objArr, 1);
    }

    public static qk2 j(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        dq.y(objArr, 2);
        return o(objArr, 2);
    }

    public static qk2 k(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        dq.y(objArr, 5);
        return o(objArr, 5);
    }

    public static qk2 l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        dq.y(objArr2, i);
        return o(objArr2, i);
    }

    public static vj2 m(Collection collection) {
        if (!(collection instanceof rj2)) {
            Object[] array = collection.toArray();
            int length = array.length;
            dq.y(array, length);
            return o(array, length);
        }
        vj2 vj2VarE = ((rj2) collection).e();
        if (!vj2VarE.f()) {
            return vj2VarE;
        }
        Object[] array2 = vj2VarE.toArray(rj2.f);
        return o(array2, array2.length);
    }

    public static qk2 n(Object[] objArr) {
        if (objArr.length == 0) {
            return qk2.j;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        dq.y(objArr2, length);
        return o(objArr2, length);
    }

    public static qk2 o(Object[] objArr, int i) {
        return i == 0 ? qk2.j : new qk2(objArr, i);
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                tj2 tj2VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (tj2VarListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(tj2VarListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rj2
    public int g(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public vj2 subList(int i, int i2) {
        hn.R(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? qk2.j : new uj2(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final tj2 listIterator(int i) {
        hn.Q(i, size());
        return isEmpty() ? g : new tj2(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rj2
    public final vj2 e() {
        return this;
    }
}
