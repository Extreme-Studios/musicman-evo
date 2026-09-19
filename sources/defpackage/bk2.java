package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class bk2 extends rj2 implements Set {
    public static final /* synthetic */ int h = 0;
    public transient vj2 g;

    public static bk2 h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m(objArr2, i);
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            hn.B("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static bk2 j(Set set) {
        if ((set instanceof bk2) && !(set instanceof SortedSet)) {
            bk2 bk2Var = (bk2) set;
            if (!bk2Var.f()) {
                return bk2Var;
            }
        }
        Object[] array = set.toArray();
        return m(array, array.length);
    }

    public static ak2 l(int i) {
        w40.k0("expectedSize", i);
        ak2 ak2Var = new ak2(i);
        ak2Var.d = new Object[i(i)];
        return ak2Var;
    }

    public static bk2 m(Object[] objArr, int i) {
        if (i == 0) {
            return wk2.o;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new ck2(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            dq.B(i6, obj2);
            int iHashCode = obj2.hashCode();
            int iG = ss0.G(iHashCode);
            while (true) {
                int i7 = iG & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iG++;
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ck2(obj4);
        }
        if (i(i5) < i2 / 2) {
            return m(objArr, i5);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new wk2(i4, i3, i5, objArr, objArr2);
    }

    @Override // defpackage.rj2
    public vj2 e() {
        vj2 vj2Var = this.g;
        if (vj2Var != null) {
            return vj2Var;
        }
        vj2 vj2VarK = k();
        this.g = vj2VarK;
        return vj2VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bk2) && (this instanceof wk2) && (((bk2) obj) instanceof wk2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return a23.F(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a23.A(this);
    }

    public vj2 k() {
        Object[] array = toArray(rj2.f);
        tj2 tj2Var = vj2.g;
        return vj2.o(array, array.length);
    }
}
