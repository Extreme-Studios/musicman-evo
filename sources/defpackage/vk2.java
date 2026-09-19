package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class vk2 implements Map, Serializable {
    public static final vk2 l = new vk2(null, new Object[0], 0);
    public transient sk2 f;
    public transient tk2 g;
    public transient uk2 h;
    public final transient Object i;
    public final transient Object[] j;
    public final transient int k;

    public vk2(Object obj, Object[] objArr, int i) {
        this.i = obj;
        this.j = objArr;
        this.k = i;
    }

    public static vk2 a(Map map) {
        int size;
        Object[] objArr;
        int length;
        int size2;
        if ((map instanceof vk2) && !(map instanceof SortedMap)) {
            return (vk2) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        um0 um0Var = new um0(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null && (size2 = (size = setEntrySet.size()) + size) > (length = (objArr = (Object[]) um0Var.g).length)) {
            um0Var.g = Arrays.copyOf(objArr, pj2.d(length, size2));
        }
        for (Map.Entry entry : setEntrySet) {
            um0Var.m(entry.getKey(), entry.getValue());
        }
        return um0Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static vk2 d(int i, Object[] objArr, um0 um0Var) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        wj2 wj2Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return l;
        }
        wj2 wj2Var2 = null;
        ?? r5 = 0;
        wj2 wj2Var3 = null;
        wj2 wj2Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new vk2(null, objArrCopyOf, 1);
        }
        hn.Q(i4, objArrCopyOf.length >> 1);
        int i6 = bk2.i(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i7 = i6 - 1;
            if (i6 <= 128) {
                byte[] bArr = new byte[i6];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i4) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj = objArrCopyOf[i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i11 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iG = ss0.G(obj.hashCode());
                    while (true) {
                        int i12 = iG & i7;
                        z2 = z5;
                        i3 = i5;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            wj2 wj2Var5 = new wj2(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            wj2Var3 = wj2Var5;
                            break;
                        }
                        iG = i12 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i8++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i9 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i9);
                    sArr[2] = wj2Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (i6 <= 32768) {
                    sArr = new short[i6];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i4; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj4 = objArrCopyOf[i18];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i18 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iG2 = ss0.G(obj4.hashCode());
                        while (true) {
                            int i19 = iG2 & i7;
                            char c4 = (char) sArr[i19];
                            if (c4 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i20 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                wj2 wj2Var6 = new wj2(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                wj2Var4 = wj2Var6;
                                break;
                            }
                            iG2 = i19 + 1;
                        }
                    }
                    if (i15 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), wj2Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[i6];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iG3 = ss0.G(obj7.hashCode());
                        while (true) {
                            int i25 = iG3 & i7;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i23;
                                if (i22 < i21) {
                                    objArrCopyOf[i23] = obj7;
                                    objArrCopyOf[i23 ^ 1] = obj8;
                                }
                                i22++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                wj2 wj2Var7 = new wj2(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                wj2Var2 = wj2Var7;
                                break;
                            }
                            iG3 = i25 + 1;
                            c3 = c2;
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c] = wj2Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                wj2Var = (wj2) objArr2[c];
                if (um0Var != null) {
                    throw wj2Var.a();
                }
                um0Var.h = wj2Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new vk2(r4, objArrCopyOf, i4);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            wj2Var = (wj2) objArr2[c];
            if (um0Var != null) {
                throw wj2Var.a();
            }
            um0Var.h = wj2Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new vk2(r4, objArrCopyOf, i4);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bk2 entrySet() {
        sk2 sk2Var = this.f;
        if (sk2Var != null) {
            return sk2Var;
        }
        sk2 sk2Var2 = new sk2(this, this.j, this.k);
        this.f = sk2Var2;
        return sk2Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final rj2 values() {
        uk2 uk2Var = this.h;
        if (uk2Var != null) {
            return uk2Var;
        }
        uk2 uk2Var2 = new uk2(this.j, 1, this.k);
        this.h = uk2Var2;
        return uk2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ej1.w(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.k;
            Object[] objArr = this.j;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.i;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iG = ss0.G(obj.hashCode());
                    while (true) {
                        int i2 = iG & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iG = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iG2 = ss0.G(obj.hashCode());
                    while (true) {
                        int i4 = iG2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iG2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iG3 = ss0.G(obj.hashCode());
                    while (true) {
                        int i5 = iG3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iG3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a23.A(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        tk2 tk2Var = this.g;
        if (tk2Var != null) {
            return tk2Var;
        }
        tk2 tk2Var2 = new tk2(this, new uk2(this.j, 0, this.k));
        this.g = tk2Var2;
        return tk2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.k;
    }

    public final String toString() {
        int i = this.k;
        w40.k0("size", i);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (sk2) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
