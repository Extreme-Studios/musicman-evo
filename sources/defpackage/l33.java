package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class l33 extends AbstractMap {
    public Object[] f;
    public int g;
    public Map h;
    public boolean i;
    public volatile g7 j;
    public Map k;

    public l33() {
        Map map = Collections.EMPTY_MAP;
        this.h = map;
        this.k = map;
    }

    public final m33 a(int i) {
        if (i < this.g) {
            return (m33) this.f[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.h.isEmpty() ? Collections.EMPTY_SET : this.h.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((m33) this.f[iE]).setValue(obj);
        }
        f();
        if (this.f == null) {
            this.f = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.g == 16) {
            m33 m33Var = (m33) this.f[15];
            this.g = 15;
            g().put(m33Var.f, m33Var.g);
        }
        Object[] objArr = this.f;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f[i] = new m33(this, comparable, obj);
        this.g++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.g != 0) {
            this.f = null;
            this.g = 0;
        }
        if (this.h.isEmpty()) {
            return;
        }
        this.h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.h.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f;
        Object obj = ((m33) objArr[i]).g;
        System.arraycopy(objArr, i + 1, objArr, i, (this.g - i) - 1);
        this.g--;
        if (!this.h.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f;
            int i2 = this.g;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new m33(this, (Comparable) entry.getKey(), entry.getValue());
            this.g++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.g;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((m33) this.f[i2]).f);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((m33) this.f[i4]).f);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.j == null) {
            this.j = new g7(1, this);
        }
        return this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return super.equals(obj);
        }
        l33 l33Var = (l33) obj;
        int size = size();
        if (size == l33Var.size()) {
            int i = this.g;
            if (i != l33Var.g) {
                return entrySet().equals(l33Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(l33Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.h.equals(l33Var.h);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.h.isEmpty() && !(this.h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.h = treeMap;
            this.k = treeMap.descendingMap();
        }
        return (SortedMap) this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((m33) this.f[iE]).g : this.h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.g;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f[i2].hashCode();
        }
        return this.h.size() > 0 ? this.h.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h.size() + this.g;
    }
}
