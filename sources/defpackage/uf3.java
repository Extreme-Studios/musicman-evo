package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uf3 extends xf3 implements Comparable {
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;

    public uf3(int i, cy0 cy0Var, int i2, sf3 sf3Var, int i3, String str, String str2) {
        int iD;
        super(i, cy0Var, i2);
        int i4 = 0;
        this.k = yc3.I(i3, false);
        int i5 = this.i.e;
        sf3Var.getClass();
        vj2 vj2Var = sf3Var.r;
        this.l = 1 == (i5 & 1);
        this.m = (i5 & 2) != 0;
        vj2 vj2VarI = str2 != null ? vj2.i(str2) : vj2Var.isEmpty() ? vj2.i("") : vj2Var;
        int i6 = 0;
        while (true) {
            if (i6 >= vj2VarI.size()) {
                iD = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iD = zf3.d(this.i, (String) vj2VarI.get(i6), false);
                if (iD > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.n = i6;
        this.o = iD;
        int i7 = str2 != null ? 1088 : 0;
        int i8 = this.i.f;
        int iBitCount = (i8 == 0 || i8 != i7) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        this.p = iBitCount;
        de3 de3Var = this.i;
        this.s = (1088 & de3Var.f) != 0;
        int iE = zf3.e(de3Var, sf3Var.s);
        this.q = iE;
        int iD2 = zf3.d(this.i, str, zf3.c(str) == null);
        this.r = iD2;
        boolean z = iD > 0 || (vj2Var.isEmpty() && iBitCount > 0) || ((vj2Var.isEmpty() && iE != Integer.MAX_VALUE) || this.l || (this.m && iD2 > 0));
        if (yc3.I(i3, sf3Var.B) && z) {
            i4 = 1;
        }
        this.j = i4;
    }

    @Override // defpackage.xf3
    public final int a() {
        return this.j;
    }

    @Override // defpackage.xf3
    public final /* bridge */ /* synthetic */ boolean b(xf3 xf3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(uf3 uf3Var) {
        nj2 nj2VarD = nj2.a.d(this.k, uf3Var.k);
        Integer numValueOf = Integer.valueOf(this.n);
        Integer numValueOf2 = Integer.valueOf(uf3Var.n);
        ok2 ok2Var = ok2.g;
        ok2 ok2Var2 = ok2.h;
        nj2 nj2VarA = nj2VarD.a(numValueOf, numValueOf2, ok2Var2);
        int i = uf3Var.o;
        int i2 = this.o;
        nj2 nj2VarB = nj2VarA.b(i2, i);
        int i3 = uf3Var.p;
        int i4 = this.p;
        nj2 nj2VarD2 = nj2VarB.b(i4, i3).a(Integer.valueOf(this.q), Integer.valueOf(uf3Var.q), ok2Var2).d(this.l, uf3Var.l);
        Boolean boolValueOf = Boolean.valueOf(this.m);
        Boolean boolValueOf2 = Boolean.valueOf(uf3Var.m);
        if (i2 != 0) {
            ok2Var = ok2Var2;
        }
        nj2 nj2VarB2 = nj2VarD2.a(boolValueOf, boolValueOf2, ok2Var).b(this.r, uf3Var.r);
        if (i4 == 0) {
            nj2VarB2 = nj2VarB2.c(this.s, uf3Var.s);
        }
        return nj2VarB2.e();
    }
}
