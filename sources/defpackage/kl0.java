package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 implements nd0 {
    public final List a;
    public final cw1 b = new cw1(0, new byte[9400]);
    public final SparseIntArray c;
    public final dr0 d;
    public final zf0 e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final bl0 i;
    public df0 j;
    public pd0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;

    static {
        int i = i8.B;
    }

    public kl0(zf0 zf0Var, ry1 ry1Var, dr0 dr0Var) {
        this.d = dr0Var;
        this.e = zf0Var;
        this.a = Collections.singletonList(ry1Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.c = new SparseIntArray();
        this.i = new bl0(1);
        this.k = pd0.d;
        this.o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray3 = this.f;
            if (i >= size) {
                sparseArray3.put(0, new fl0(new us2(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i), (nl0) sparseArray2.valueAt(i));
                i++;
            }
        }
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.b.a;
        fd0 fd0Var = (fd0) od0Var;
        fd0Var.B(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    fd0Var.b(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [nl0] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.util.SparseBooleanArray] */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException {
        od0 od0Var2;
        int i;
        ?? r3;
        ?? r7;
        nl0 nl0Var;
        long j;
        long jW;
        long j2 = ((fd0) od0Var).h;
        if (this.l) {
            long j3 = -9223372036854775807L;
            bl0 bl0Var = this.i;
            if (j2 != -1 && !bl0Var.c) {
                int i2 = this.o;
                cw1 cw1Var = bl0Var.b;
                if (i2 <= 0) {
                    bl0Var.b(od0Var);
                    return 0;
                }
                if (bl0Var.e) {
                    if (bl0Var.g == -9223372036854775807L) {
                        bl0Var.b(od0Var);
                        return 0;
                    }
                    if (bl0Var.d) {
                        long j4 = bl0Var.f;
                        if (j4 == -9223372036854775807L) {
                            bl0Var.b(od0Var);
                            return 0;
                        }
                        ry1 ry1Var = bl0Var.a;
                        bl0Var.h = ry1Var.d(bl0Var.g) - ry1Var.c(j4);
                        bl0Var.b(od0Var);
                        return 0;
                    }
                    fd0 fd0Var = (fd0) od0Var;
                    int iMin = (int) Math.min(112800L, fd0Var.h);
                    if (fd0Var.i != 0) {
                        rd0Var.a = 0L;
                        return 1;
                    }
                    cw1Var.y(iMin);
                    fd0Var.k = 0;
                    fd0Var.B(cw1Var.a, 0, iMin, false);
                    int i3 = cw1Var.c;
                    for (int i4 = cw1Var.b; i4 < i3; i4++) {
                        if (cw1Var.a[i4] == 71) {
                            jW = yd.w(cw1Var, i4, i2);
                            if (jW != -9223372036854775807L) {
                                bl0Var.f = jW;
                                bl0Var.d = true;
                                return 0;
                            }
                        }
                    }
                    jW = -9223372036854775807L;
                    bl0Var.f = jW;
                    bl0Var.d = true;
                    return 0;
                }
                fd0 fd0Var2 = (fd0) od0Var;
                long j5 = fd0Var2.h;
                int iMin2 = (int) Math.min(112800L, j5);
                long j6 = j5 - ((long) iMin2);
                if (fd0Var2.i != j6) {
                    rd0Var.a = j6;
                    return 1;
                }
                cw1Var.y(iMin2);
                fd0Var2.k = 0;
                fd0Var2.B(cw1Var.a, 0, iMin2, false);
                int i5 = cw1Var.b;
                int i6 = cw1Var.c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = cw1Var.a;
                    int i8 = 0;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                            i8++;
                            if (i8 == 5) {
                                long jW2 = yd.w(cw1Var, i7, i2);
                                if (jW2 == -9223372036854775807L) {
                                    break;
                                }
                                j3 = jW2;
                                break;
                            }
                        } else {
                            i8 = 0;
                        }
                    }
                }
                bl0Var.g = j3;
                bl0Var.e = true;
                return 0;
            }
            if (this.m) {
                i = 1;
                j = 0;
            } else {
                this.m = true;
                long j7 = bl0Var.h;
                if (j7 != -9223372036854775807L) {
                    ry1 ry1Var2 = bl0Var.a;
                    int i11 = this.o;
                    ig igVar = new ig(27);
                    um0 um0Var = new um0();
                    um0Var.f = i11;
                    um0Var.g = ry1Var2;
                    um0Var.h = new cw1();
                    i = 1;
                    j = 0;
                    df0 df0Var = new df0(igVar, um0Var, j7, j7 + 1, 0L, j2, 188L, 940);
                    this.j = df0Var;
                    this.k.v(df0Var.a);
                } else {
                    i = 1;
                    j = 0;
                    this.k.v(new sd0(j7, 0L));
                }
            }
            if (this.n) {
                this.n = 0;
                f(j, j);
                if (((fd0) od0Var).i != j) {
                    rd0Var.a = j;
                    return i;
                }
            }
            df0 df0Var2 = this.j;
            if (df0Var2 != null && df0Var2.c != null) {
                return df0Var2.b(od0Var, rd0Var);
            }
            od0Var2 = od0Var;
        } else {
            od0Var2 = od0Var;
            i = 1;
            r3 = 0;
        }
        cw1 cw1Var2 = this.b;
        byte[] bArr2 = cw1Var2.a;
        if (9400 - cw1Var2.b < 188) {
            int iB = cw1Var2.B();
            if (iB > 0) {
                System.arraycopy(bArr2, cw1Var2.b, bArr2, r3, iB);
            }
            cw1Var2.z(iB, bArr2);
        }
        while (true) {
            int iB2 = cw1Var2.B();
            ?? r8 = this.f;
            if (iB2 >= 188) {
                int i12 = cw1Var2.b;
                int i13 = cw1Var2.c;
                byte[] bArr3 = cw1Var2.a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                cw1Var2.E(i12);
                int i14 = i12 + 188;
                int i15 = cw1Var2.c;
                if (i14 > i15) {
                    return r3;
                }
                int iB3 = cw1Var2.b();
                if ((8388608 & iB3) != 0) {
                    cw1Var2.E(i14);
                    return r3;
                }
                ?? r6 = (4194304 & iB3) != 0 ? 1 : r3;
                int i16 = iB3 & 32;
                int i17 = (iB3 >> 8) & 8191;
                if ((iB3 & 16) != 0) {
                    nl0Var = (nl0) r8.get(i17);
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = nl0Var;
                    cw1Var2.E(i14);
                    return r3;
                }
                int i18 = iB3 & 15;
                SparseIntArray sparseIntArray = this.c;
                int i19 = sparseIntArray.get(i17, i18 - 1);
                sparseIntArray.put(i17, i18);
                if (i19 == i18) {
                    r7 = nl0Var;
                    cw1Var2.E(i14);
                    return r3;
                }
                if (i18 != ((i19 + 1) & 15)) {
                    r7 = nl0Var;
                    r7.c();
                }
                if (i16 != 0) {
                    int iK = cw1Var2.K();
                    r6 = (r6 == true ? 1 : 0) | ((cw1Var2.K() & 64) != 0 ? 2 : r3);
                    cw1Var2.G(iK - 1);
                }
                boolean z = this.l;
                if (z || !this.h.get(i17, r3)) {
                    cw1Var2.C(i14);
                    r7.a(r6, cw1Var2);
                    cw1Var2.C(i15);
                    if (!z) {
                        if (this.l && j2 != -1) {
                            this.n = true;
                        }
                    }
                } else if (this.l) {
                    this.n = true;
                }
                cw1Var2.E(i14);
                return r3;
            }
            int i20 = cw1Var2.c;
            int iD = ((fd0) od0Var2).d(bArr2, i20, 9400 - i20);
            if (iD == -1) {
                for (?? r9 = r3; r9 < r8.size(); r9++) {
                    nl0 nl0Var2 = (nl0) r8.valueAt(r9);
                    if (nl0Var2 instanceof al0) {
                        al0 al0Var = (al0) nl0Var2;
                        if (al0Var.c == 3 && al0Var.j == -1) {
                            al0Var.a(i, new cw1());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            cw1Var2.C(i20 + iD);
            i = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        df0 df0Var;
        long j3;
        List list = this.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ry1 ry1Var = (ry1) list.get(i2);
            synchronized (ry1Var) {
                j3 = ry1Var.b;
            }
            if (j3 != -9223372036854775807L) {
                long jA = ry1Var.a();
                if (jA != -9223372036854775807L && jA != 0 && jA != j2) {
                    ry1Var.b(j2);
                }
            } else {
                ry1Var.b(j2);
            }
        }
        if (j2 != 0 && (df0Var = this.j) != null) {
            df0Var.a(j2);
        }
        this.b.y(0);
        this.c.clear();
        while (true) {
            SparseArray sparseArray = this.f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((nl0) sparseArray.valueAt(i)).c();
            i++;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.k = new md(pd0Var, this.e);
    }
}
