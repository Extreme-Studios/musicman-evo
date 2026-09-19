package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ie3 implements xd3, wd3 {
    public final xd3[] f;
    public final boolean[] g;
    public final IdentityHashMap h;
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public wd3 k;
    public gf3 l;
    public xd3[] m;
    public nd3 n;

    public ie3(long[] jArr, xd3... xd3VarArr) {
        this.f = xd3VarArr;
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        this.n = new nd3(qk2Var, qk2Var);
        this.h = new IdentityHashMap();
        this.m = new xd3[0];
        this.g = new boolean[xd3VarArr.length];
        for (int i = 0; i < xd3VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.g[i] = true;
                this.f[i] = new ff3(xd3VarArr[i], j);
            }
        }
    }

    @Override // defpackage.xd3
    public final void a(wd3 wd3Var, long j) {
        this.k = wd3Var;
        ArrayList arrayList = this.i;
        xd3[] xd3VarArr = this.f;
        Collections.addAll(arrayList, xd3VarArr);
        for (xd3 xd3Var : xd3VarArr) {
            xd3Var.a(this, j);
        }
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return this.n.b(f83Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xd3) arrayList.get(i)).b(f83Var);
        }
        return false;
    }

    @Override // defpackage.wd3
    public final /* bridge */ /* synthetic */ void c(bf3 bf3Var) {
        wd3 wd3Var = this.k;
        wd3Var.getClass();
        wd3Var.c(this);
    }

    @Override // defpackage.xd3
    public final long d(long j) {
        long jD = this.m[0].d(j);
        int i = 1;
        while (true) {
            xd3[] xd3VarArr = this.m;
            if (i >= xd3VarArr.length) {
                return jD;
            }
            if (xd3VarArr[i].d(jD) != jD) {
                j7.e("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.xd3
    public final void e(long j) {
        for (xd3 xd3Var : this.m) {
            xd3Var.e(j);
        }
    }

    @Override // defpackage.xd3
    public final long f() {
        long j = -9223372036854775807L;
        for (xd3 xd3Var : this.m) {
            long jF = xd3Var.f();
            if (jF == -9223372036854775807L) {
                if (j != -9223372036854775807L && xd3Var.d(j) != j) {
                    j7.e("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j == -9223372036854775807L) {
                for (xd3 xd3Var2 : this.m) {
                    if (xd3Var2 == xd3Var) {
                        break;
                    }
                    if (xd3Var2.d(jF) != jF) {
                        j7.e("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j = jF;
            } else if (jF != j) {
                j7.e("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j;
    }

    @Override // defpackage.wd3
    public final void g(xd3 xd3Var) {
        xd3[] xd3VarArr;
        ArrayList arrayList = this.i;
        arrayList.remove(xd3Var);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                xd3VarArr = this.f;
                if (i >= xd3VarArr.length) {
                    break;
                }
                i2 += xd3VarArr[i].l().a;
                i++;
            }
            cy0[] cy0VarArr = new cy0[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < xd3VarArr.length; i4++) {
                gf3 gf3VarL = xd3VarArr[i4].l();
                int i5 = gf3VarL.a;
                int i6 = 0;
                while (i6 < i5) {
                    cy0 cy0VarA = gf3VarL.a(i6);
                    int i7 = cy0VarA.a;
                    de3[] de3VarArr = new de3[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        de3 de3Var = cy0VarA.d[i8];
                        de3Var.getClass();
                        uc3 uc3Var = new uc3(de3Var);
                        String str = de3Var.a;
                        if (str == null) {
                            str = "";
                        }
                        xd3[] xd3VarArr2 = xd3VarArr;
                        StringBuilder sb = new StringBuilder(str.length() + g72.a(i4, 1));
                        sb.append(i4);
                        sb.append(":");
                        sb.append(str);
                        uc3Var.a = sb.toString();
                        de3VarArr[i8] = new de3(uc3Var);
                        i8++;
                        xd3VarArr = xd3VarArr2;
                    }
                    xd3[] xd3VarArr3 = xd3VarArr;
                    String str2 = cy0VarA.b;
                    StringBuilder sb2 = new StringBuilder(g72.a(i4, 1) + String.valueOf(str2).length());
                    sb2.append(i4);
                    sb2.append(":");
                    sb2.append(str2);
                    cy0 cy0Var = new cy0(sb2.toString(), de3VarArr);
                    this.j.put(cy0Var, cy0VarA);
                    cy0VarArr[i3] = cy0Var;
                    i6++;
                    i3++;
                    xd3VarArr = xd3VarArr3;
                }
            }
            this.l = new gf3(cy0VarArr);
            wd3 wd3Var = this.k;
            wd3Var.getClass();
            wd3Var.g(this);
        }
    }

    @Override // defpackage.xd3
    public final long h(long j, c93 c93Var) {
        xd3[] xd3VarArr = this.m;
        return (xd3VarArr.length > 0 ? xd3VarArr[0] : this.f[0]).h(j, c93Var);
    }

    @Override // defpackage.bf3
    public final long i() {
        return this.n.i();
    }

    @Override // defpackage.bf3
    public final long j() {
        return this.n.j();
    }

    @Override // defpackage.bf3
    public final void k(long j) {
        this.n.k(j);
    }

    @Override // defpackage.xd3
    public final gf3 l() {
        gf3 gf3Var = this.l;
        gf3Var.getClass();
        return gf3Var;
    }

    @Override // defpackage.xd3
    public final long m(bg3[] bg3VarArr, boolean[] zArr, af3[] af3VarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        int length2 = bg3VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bg3VarArr.length;
            identityHashMap = this.h;
            if (i2 >= length) {
                break;
            }
            af3 af3Var = af3VarArr[i2];
            Integer num = af3Var == null ? null : (Integer) identityHashMap.get(af3Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            bg3 bg3Var = bg3VarArr[i2];
            if (bg3Var != null) {
                String str = bg3Var.a().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        af3[] af3VarArr2 = new af3[length];
        af3[] af3VarArr3 = new af3[length];
        bg3[] bg3VarArr2 = new bg3[length];
        xd3[] xd3VarArr = this.f;
        ArrayList arrayList = new ArrayList(xd3VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < xd3VarArr.length) {
            int i4 = i;
            while (i4 < bg3VarArr.length) {
                af3VarArr3[i4] = iArr[i4] == i3 ? af3VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    bg3 bg3Var2 = bg3VarArr[i4];
                    bg3Var2.getClass();
                    cy0 cy0Var = (cy0) this.j.get(bg3Var2.a());
                    cy0Var.getClass();
                    bg3VarArr2[i4] = new he3(bg3Var2, cy0Var);
                } else {
                    bg3VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr2;
                iArr = iArr;
            }
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            ArrayList arrayList2 = arrayList;
            xd3[] xd3VarArr2 = xd3VarArr;
            int i5 = i3;
            long jM = xd3VarArr[i3].m(bg3VarArr2, zArr, af3VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jM;
            } else if (jM != j2) {
                j7.e("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < bg3VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    af3 af3Var2 = af3VarArr3[i6];
                    af3Var2.getClass();
                    af3VarArr2[i6] = af3Var2;
                    identityHashMap.put(af3Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    hn.M(af3VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(xd3VarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            xd3VarArr = xd3VarArr2;
            iArr2 = iArr3;
            iArr = iArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(af3VarArr2, i7, af3VarArr, i7, length);
        this.m = (xd3[]) arrayList3.toArray(new xd3[i7]);
        this.n = new nd3(arrayList3, na1.B(arrayList3, zf2.h));
        return j2;
    }

    @Override // defpackage.bf3
    public final boolean o() {
        return this.n.o();
    }

    @Override // defpackage.xd3
    public final void r() {
        int i = 0;
        while (true) {
            xd3[] xd3VarArr = this.f;
            if (i >= xd3VarArr.length) {
                return;
            }
            xd3VarArr[i].r();
            i++;
        }
    }
}
