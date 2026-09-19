package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jj2 extends AbstractMap implements Serializable {
    public static final Object o = new Object();
    public transient Object f;
    public transient int[] g;
    public transient Object[] h;
    public transient Object[] i;
    public transient int j = Math.min(Math.max(3, 1), 1073741823);
    public transient int k;
    public transient hj2 l;
    public transient hj2 m;
    public transient bj2 n;

    public jj2(int i) {
    }

    public final int[] a() {
        int[] iArr = this.g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.h;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.j += 32;
        Map mapE = e();
        if (mapE != null) {
            this.j = Math.min(Math.max(size(), 3), 1073741823);
            mapE.clear();
            this.f = null;
            this.k = 0;
            return;
        }
        Arrays.fill(b(), 0, this.k, (Object) null);
        Arrays.fill(c(), 0, this.k, (Object) null);
        Object obj = this.f;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.k, 0);
        this.k = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.containsKey(obj);
        }
        return i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.containsValue(obj);
        }
        for (int i = 0; i < this.k; i++) {
            if (Objects.equals(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f == null;
    }

    public final Map e() {
        Object obj = this.f;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        hj2 hj2Var = this.m;
        if (hj2Var != null) {
            return hj2Var;
        }
        hj2 hj2Var2 = new hj2(this, 0);
        this.m = hj2Var2;
        return hj2Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.f;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrB[i] = null;
            objArrC[i] = null;
            iArrA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrB[i3];
        objArrB[i] = obj2;
        objArrC[i] = objArrC[i3];
        objArrB[i3] = null;
        objArrC[i3] = null;
        iArrA[i] = iArrA[i3];
        iArrA[i3] = 0;
        int I = ss0.I(obj2) & i2;
        int iH = s90.H(I, obj);
        if (iH == size) {
            s90.O(I, i4, obj);
            return;
        }
        while (true) {
            int i5 = iH - 1;
            int i6 = iArrA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iH = i7;
        }
    }

    public final int g() {
        return (1 << (this.j & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return c()[i];
    }

    public final int h(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objY = s90.y(i2);
        if (i4 != 0) {
            s90.O(i3 & i5, i4 + 1, objY);
        }
        Object obj = this.f;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int iH = s90.H(i6, obj);
            while (iH != 0) {
                int i7 = iH - 1;
                int i8 = iArrA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iH2 = s90.H(i10, objY);
                s90.O(i10, iH, objY);
                iArrA[i7] = ((~i5) & i9) | (iH2 & i5);
                iH = i8 & i;
            }
        }
        this.f = objY;
        this.j = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.j & (-32));
        return i5;
    }

    public final int i(Object obj) {
        if (d()) {
            return -1;
        }
        int I = ss0.I(obj);
        int iG = g();
        Object obj2 = this.f;
        Objects.requireNonNull(obj2);
        int iH = s90.H(I & iG, obj2);
        if (iH != 0) {
            int i = ~iG;
            int i2 = I & i;
            do {
                int i3 = iH - 1;
                int i4 = a()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, b()[i3])) {
                    return i3;
                }
                iH = i4 & iG;
            } while (iH != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!d()) {
            int iG = g();
            Object obj2 = this.f;
            Objects.requireNonNull(obj2);
            int iW = s90.W(obj, null, iG, obj2, a(), b(), null);
            if (iW != -1) {
                Object obj3 = c()[iW];
                f(iW, iG);
                this.k--;
                this.j += 32;
                return obj3;
            }
        }
        return o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        hj2 hj2Var = this.l;
        if (hj2Var != null) {
            return hj2Var;
        }
        hj2 hj2Var2 = new hj2(this, 1);
        this.l = hj2Var2;
        return hj2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (d()) {
            hn.N("Arrays already allocated", d());
            int i3 = this.j;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f = s90.y(iMax2);
            this.j = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.j & (-32));
            this.g = new int[i3];
            this.h = new Object[i3];
            this.i = new Object[i3];
        }
        Map mapE = e();
        if (mapE != null) {
            return mapE.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i4 = this.k;
        int i5 = i4 + 1;
        int I = ss0.I(obj);
        int iG = g();
        int i6 = I & iG;
        Object obj3 = this.f;
        Objects.requireNonNull(obj3);
        int iH = s90.H(i6, obj3);
        if (iH == 0) {
            if (i5 > iG) {
                iG = h(iG, (iG + 1) * (iG < 32 ? 4 : 2), I, i4);
            } else {
                Object obj4 = this.f;
                Objects.requireNonNull(obj4);
                s90.O(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iG;
            int i8 = I & i7;
            int i9 = 0;
            while (true) {
                int i10 = iH - 1;
                int i11 = iArrA[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Objects.equals(obj, objArrB[i10])) {
                    Object obj5 = objArrC[i10];
                    objArrC[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iG;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iG) {
                            iArrA[i10] = (i5 & iG) | i12;
                            break;
                        }
                        iG = h(iG, (iG + 1) * (iG < i13 ? 4 : 2), I, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(b()[i16], c()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.k ? i17 : -1;
                    }
                    this.f = linkedHashMap;
                    this.g = null;
                    this.h = null;
                    this.i = null;
                    this.j += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i9 = i15;
                iH = i14;
                i2 = i13;
            }
        }
        int length = a().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.g = Arrays.copyOf(a(), iMin);
                this.h = Arrays.copyOf(b(), iMin);
                this.i = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i4] = (~iG) & I;
        b()[i4] = obj;
        c()[i4] = obj2;
        this.k = i5;
        this.j += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == o) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapE = e();
        return mapE != null ? mapE.size() : this.k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        bj2 bj2Var = this.n;
        if (bj2Var != null) {
            return bj2Var;
        }
        bj2 bj2Var2 = new bj2(1, this);
        this.n = bj2Var2;
        return bj2Var2;
    }

    public jj2() {
    }
}
