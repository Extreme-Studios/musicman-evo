package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr2 extends hn {
    public static final o03 T(c13 c13Var) throws IOException {
        String strF;
        int iD = c13Var.d();
        o03 o03VarV = V(c13Var, iD);
        if (o03VarV == null) {
            return U(c13Var, iD);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iA = c13Var.l;
            if (iA == 0) {
                iA = c13Var.a();
            }
            String str = null;
            if (iA == 2 || iA == 4 || iA == 17) {
                boolean z = o03VarV instanceof n03;
                int iA2 = c13Var.l;
                if (z) {
                    if (iA2 == 0) {
                        iA2 = c13Var.a();
                    }
                    if (iA2 != 4) {
                        throw c13Var.n("END_ARRAY");
                    }
                    int i = c13Var.p;
                    c13Var.p = i - 1;
                    int[] iArr = c13Var.r;
                    int i2 = i - 2;
                    iArr[i2] = iArr[i2] + 1;
                    c13Var.l = 0;
                } else {
                    if (iA2 == 0) {
                        iA2 = c13Var.a();
                    }
                    if (iA2 != 2) {
                        throw c13Var.n("END_OBJECT");
                    }
                    int i3 = c13Var.p;
                    int i4 = i3 - 1;
                    c13Var.p = i4;
                    c13Var.q[i4] = null;
                    int[] iArr2 = c13Var.r;
                    int i5 = i3 - 2;
                    iArr2[i5] = iArr2[i5] + 1;
                    c13Var.l = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return o03VarV;
                }
                o03VarV = (o03) arrayDeque.removeLast();
            } else {
                if (o03VarV instanceof q03) {
                    int iA3 = c13Var.l;
                    if (iA3 == 0) {
                        iA3 = c13Var.a();
                    }
                    if (iA3 == 14) {
                        strF = c13Var.g();
                    } else if (iA3 == 12) {
                        strF = c13Var.f('\'');
                    } else {
                        if (iA3 != 13) {
                            throw c13Var.n("a name");
                        }
                        strF = c13Var.f('\"');
                    }
                    str = strF;
                    c13Var.l = 0;
                    c13Var.q[c13Var.p - 1] = str;
                    if (!ss0.D(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iD2 = c13Var.d();
                o03 o03VarV2 = V(c13Var, iD2);
                o03 o03VarU = o03VarV2 == null ? U(c13Var, iD2) : o03VarV2;
                if (o03VarV instanceof n03) {
                    ((n03) o03VarV).f.add(o03VarU);
                } else {
                    q03 q03Var = (q03) o03VarV;
                    if (q03Var.f.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    q03Var.f.put(str, o03VarU);
                }
                if (o03VarV2 != null) {
                    arrayDeque.addLast(o03VarV);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    o03VarV = o03VarU;
                } else {
                    continue;
                }
            }
        }
    }

    public static final o03 U(c13 c13Var, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String strB = c13Var.b();
            if (ss0.D(strB)) {
                return new s03(strB);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new s03(new kr2(c13Var.b()));
        }
        boolean z = true;
        if (i2 != 7) {
            if (i2 != 8) {
                j7.e("Unexpected token: ".concat(ar.q(i)));
                return null;
            }
            int iA = c13Var.l;
            if (iA == 0) {
                iA = c13Var.a();
            }
            if (iA != 7) {
                throw c13Var.n("null");
            }
            c13Var.l = 0;
            int[] iArr = c13Var.r;
            int i3 = c13Var.p - 1;
            iArr[i3] = iArr[i3] + 1;
            return p03.f;
        }
        int iA2 = c13Var.l;
        if (iA2 == 0) {
            iA2 = c13Var.a();
        }
        if (iA2 == 5) {
            c13Var.l = 0;
            int[] iArr2 = c13Var.r;
            int i4 = c13Var.p - 1;
            iArr2[i4] = iArr2[i4] + 1;
        } else {
            if (iA2 != 6) {
                throw c13Var.n("a boolean");
            }
            c13Var.l = 0;
            int[] iArr3 = c13Var.r;
            int i5 = c13Var.p - 1;
            iArr3[i5] = iArr3[i5] + 1;
            z = false;
        }
        return new s03(Boolean.valueOf(z));
    }

    public static final o03 V(c13 c13Var, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            int iA = c13Var.l;
            if (iA == 0) {
                iA = c13Var.a();
            }
            if (iA != 3) {
                throw c13Var.n("BEGIN_ARRAY");
            }
            c13Var.h(1);
            c13Var.r[c13Var.p - 1] = 0;
            c13Var.l = 0;
            return new n03();
        }
        if (i2 != 2) {
            return null;
        }
        int iA2 = c13Var.l;
        if (iA2 == 0) {
            iA2 = c13Var.a();
        }
        if (iA2 != 1) {
            throw c13Var.n("BEGIN_OBJECT");
        }
        c13Var.h(3);
        c13Var.l = 0;
        return new q03();
    }
}
