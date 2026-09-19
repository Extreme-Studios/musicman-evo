package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nf3 extends xf3 implements Comparable {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int j;
    public final boolean k;
    public final String l;
    public final sf3 m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;
    public final int t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public nf3(int i, cy0 cy0Var, int i2, sf3 sf3Var, int i3, boolean z, of3 of3Var) {
        int i4;
        int iD;
        int iHashCode;
        int iD2;
        boolean z2;
        super(i, cy0Var, i2);
        this.m = sf3Var;
        boolean z3 = sf3Var.z;
        vj2 vj2Var = sf3Var.p;
        vj2 vj2Var2 = sf3Var.l;
        int i5 = 1;
        int i6 = true != z3 ? 16 : 24;
        this.l = zf3.c(this.i.d);
        this.n = yc3.I(i3, false);
        int i7 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i7 >= vj2Var2.size()) {
                iD = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iD = zf3.d(this.i, (String) vj2Var2.get(i7), false);
                if (iD > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.p = i7;
        this.o = iD;
        int i8 = this.i.f;
        this.q = (i8 == 0 || i8 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.r = zf3.e(this.i, sf3Var.m);
        de3 de3Var = this.i;
        int i9 = de3Var.f;
        this.s = i9 == 0 || (i9 & 1) != 0;
        this.v = 1 == (de3Var.e & 1);
        String str = de3Var.m;
        this.C = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i10 = de3Var.E;
        this.w = i10;
        this.x = de3Var.F;
        int i11 = de3Var.i;
        this.y = i11;
        this.k = (i11 == -1 || i11 <= sf3Var.o) && (i10 == -1 || i10 <= sf3Var.n) && of3Var.b(de3Var);
        String str2 = qz1.a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            strArrSplit[i12] = qz1.n(strArrSplit[i12]);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= strArrSplit.length) {
                iD2 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iD2 = zf3.d(this.i, strArrSplit[i13], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.t = i13;
        this.u = iD2;
        for (int i14 = 0; i14 < vj2Var.size(); i14++) {
            String str3 = this.i.m;
            if (str3 != null && str3.equals(vj2Var.get(i14))) {
                i4 = i14;
                break;
            }
        }
        this.z = i4;
        this.A = (i3 & 384) == 128;
        this.B = (i3 & 64) == 64;
        sf3 sf3Var2 = this.m;
        if (yc3.I(i3, sf3Var2.B) && ((z2 = this.k) || sf3Var2.y)) {
            sf3Var2.q.getClass();
            if (yc3.I(i3, false) && z2 && this.i.i != -1 && ((sf3Var2.C || !z) && (i6 & i3) != 0)) {
                i5 = 2;
            }
        } else {
            i5 = 0;
        }
        this.j = i5;
    }

    @Override // defpackage.xf3
    public final int a() {
        return this.j;
    }

    @Override // defpackage.xf3
    public final /* bridge */ /* synthetic */ boolean b(xf3 xf3Var) {
        String str;
        int i;
        nf3 nf3Var = (nf3) xf3Var;
        this.m.getClass();
        de3 de3Var = this.i;
        int i2 = de3Var.E;
        if (i2 == -1) {
            return false;
        }
        de3 de3Var2 = nf3Var.i;
        return i2 == de3Var2.E && (str = de3Var.m) != null && TextUtils.equals(str, de3Var2.m) && (i = de3Var.F) != -1 && i == de3Var2.F && this.A == nf3Var.A && this.B == nf3Var.B;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nf3 nf3Var) {
        boolean z = this.n;
        boolean z2 = this.k;
        Comparator xk2Var = (z2 && z) ? zf3.k : new xk2();
        nj2 nj2VarD = nj2.a.d(z, nf3Var.n);
        Integer numValueOf = Integer.valueOf(this.p);
        Integer numValueOf2 = Integer.valueOf(nf3Var.p);
        ok2 ok2Var = ok2.h;
        nj2 nj2VarA = nj2VarD.a(numValueOf, numValueOf2, ok2Var).b(this.o, nf3Var.o).b(this.q, nf3Var.q).a(Integer.valueOf(this.r), Integer.valueOf(nf3Var.r), ok2Var).d(this.v, nf3Var.v).d(this.s, nf3Var.s).a(Integer.valueOf(this.t), Integer.valueOf(nf3Var.t), ok2Var).b(this.u, nf3Var.u).d(z2, nf3Var.k).a(Integer.valueOf(this.z), Integer.valueOf(nf3Var.z), ok2Var);
        this.m.getClass();
        nj2 nj2VarA2 = nj2VarA.d(this.A, nf3Var.A).d(this.B, nf3Var.B).d(this.C, nf3Var.C).a(Integer.valueOf(this.w), Integer.valueOf(nf3Var.w), xk2Var).a(Integer.valueOf(this.x), Integer.valueOf(nf3Var.x), xk2Var);
        if (Objects.equals(this.l, nf3Var.l)) {
            nj2VarA2 = nj2VarA2.a(Integer.valueOf(this.y), Integer.valueOf(nf3Var.y), xk2Var);
        }
        return nj2VarA2.e();
    }
}
