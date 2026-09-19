package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mf3 implements bg3 {
    public final cy0 a;
    public final int b;
    public final int[] c;
    public final de3[] d;
    public int e;

    public mf3(cy0 cy0Var, int[] iArr) {
        de3[] de3VarArr;
        int length = iArr.length;
        hn.M(length > 0);
        cy0Var.getClass();
        de3[] de3VarArr2 = cy0Var.d;
        this.a = cy0Var;
        this.b = length;
        this.d = new de3[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            de3VarArr = this.d;
            if (i >= length2) {
                break;
            }
            de3VarArr[i] = de3VarArr2[iArr[i]];
            i++;
        }
        Arrays.sort(de3VarArr, ts.j);
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            de3 de3Var = this.d[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= de3VarArr2.length) {
                    i3 = -1;
                    break;
                } else if (de3Var == de3VarArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    public static void c(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sj2 sj2Var = (sj2) arrayList.get(i2);
            if (sj2Var != null) {
                sj2Var.a(new lf3(j, jArr[i2]));
            }
        }
    }

    @Override // defpackage.bg3
    public final cy0 a() {
        return this.a;
    }

    @Override // defpackage.bg3
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.bg3
    public final de3 d(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mf3 mf3Var = (mf3) obj;
            if (this.a.equals(mf3Var.a) && Arrays.equals(this.c, mf3Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bg3
    public final int f() {
        return this.c[0];
    }

    @Override // defpackage.bg3
    public final de3 h() {
        return this.d[0];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.bg3
    public final int m0(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bg3
    public final int t(int i) {
        return this.c[i];
    }
}
