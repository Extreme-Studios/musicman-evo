package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y83 extends ox0 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final cf3 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final ox0[] h;
    public final Object[] i;
    public final HashMap j;

    public y83(ox0[] ox0VarArr, Object[] objArr, cf3 cf3Var) {
        this.c = cf3Var;
        this.b = cf3Var.b.length;
        this.h = ox0VarArr;
        int length = ox0VarArr.length;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int i = 0;
        int iA = 0;
        int iC = 0;
        int i2 = 0;
        while (i < ox0VarArr.length) {
            ox0 ox0Var = ox0VarArr[i];
            this.h[i2] = ox0Var;
            this.g[i2] = iA;
            this.f[i2] = iC;
            iA += ox0Var.a();
            iC += this.h[i2].c();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iA;
        this.e = iC;
    }

    @Override // defpackage.ox0
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ox0
    public final ex0 b(int i, ex0 ex0Var, long j) {
        int[] iArr = this.g;
        int iO = qz1.o(iArr, i + 1, false, false);
        int i2 = iArr[iO];
        int i3 = this.f[iO];
        this.h[iO].b(i - i2, ex0Var, j);
        Object objCreate = this.i[iO];
        Object obj = ex0.m;
        Object obj2 = ex0Var.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        ex0Var.a = objCreate;
        ex0Var.k += i3;
        ex0Var.l += i3;
        return ex0Var;
    }

    @Override // defpackage.ox0
    public final int c() {
        return this.e;
    }

    @Override // defpackage.ox0
    public final su0 d(int i, su0 su0Var, boolean z) {
        int[] iArr = this.f;
        int iO = qz1.o(iArr, i + 1, false, false);
        int i2 = this.g[iO];
        this.h[iO].d(i - iArr[iO], su0Var, z);
        su0Var.c += i2;
        if (z) {
            Object obj = this.i[iO];
            Object obj2 = su0Var.b;
            obj2.getClass();
            su0Var.b = Pair.create(obj, obj2);
        }
        return su0Var;
    }

    @Override // defpackage.ox0
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.h[iIntValue].e(obj3)) != -1) {
                return this.f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // defpackage.ox0
    public final Object f(int i) {
        int[] iArr = this.f;
        int iO = qz1.o(iArr, i + 1, false, false);
        return Pair.create(this.i[iO], this.h[iO].f(i - iArr[iO]));
    }

    @Override // defpackage.ox0
    public final int h(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iO = qz1.o(iArr, i + 1, false, false);
        int i3 = iArr[iO];
        ox0[] ox0VarArr = this.h;
        int iH = ox0VarArr[iO].h(i - i3, i2 != 2 ? i2 : 0, z);
        if (iH != -1) {
            return i3 + iH;
        }
        int iP = p(iO, z);
        while (iP != -1 && ox0VarArr[iP].g()) {
            iP = p(iP, z);
        }
        if (iP != -1) {
            return ox0VarArr[iP].k(z) + iArr[iP];
        }
        if (i2 == 2) {
            return k(z);
        }
        return -1;
    }

    @Override // defpackage.ox0
    public final int i(int i) {
        int[] iArr = this.g;
        int iO = qz1.o(iArr, i + 1, false, false);
        int i2 = iArr[iO];
        ox0[] ox0VarArr = this.h;
        int i3 = ox0VarArr[iO].i(i - i2);
        if (i3 != -1) {
            return i2 + i3;
        }
        int iQ = q(iO, false);
        while (iQ != -1 && ox0VarArr[iQ].g()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return ox0VarArr[iQ].j(false) + iArr[iQ];
    }

    @Override // defpackage.ox0
    public final int j(boolean z) {
        int iQ;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i - 1;
            }
            do {
                ox0[] ox0VarArr = this.h;
                if (!ox0VarArr[iQ].g()) {
                    return ox0VarArr[iQ].j(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.ox0
    public final int k(boolean z) {
        if (this.b != 0) {
            int iP = 0;
            if (z) {
                int[] iArr = this.c.b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                ox0[] ox0VarArr = this.h;
                if (!ox0VarArr[iP].g()) {
                    return ox0VarArr[iP].k(z) + this.g[iP];
                }
                iP = p(iP, z);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // defpackage.ox0
    public final su0 o(Object obj, su0 su0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].o(obj3, su0Var);
        su0Var.c += i;
        su0Var.b = obj;
        return su0Var;
    }

    public final int p(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        cf3 cf3Var = this.c;
        int i2 = cf3Var.c[i] + 1;
        int[] iArr = cf3Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        cf3 cf3Var = this.c;
        int i2 = cf3Var.c[i] - 1;
        if (i2 >= 0) {
            return cf3Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y83(List list, cf3 cf3Var) {
        ox0[] ox0VarArr = new ox0[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ox0VarArr[i2] = ((k83) it.next()).c();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((k83) it2.next()).a();
            i++;
        }
        this(ox0VarArr, objArr, cf3Var);
    }
}
