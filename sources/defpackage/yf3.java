package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yf3 extends xf3 {
    public final int A;
    public final boolean j;
    public final sf3 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    public yf3(int i, cy0 cy0Var, int i2, sf3 sf3Var, int i3, String str, boolean z) {
        boolean z2;
        boolean z3;
        int i4;
        int iD;
        int i5;
        boolean z4;
        int i6;
        de3 de3Var;
        int i7;
        int i8;
        int i9;
        de3 de3Var2;
        int i10;
        int i11;
        int i12;
        super(i, cy0Var, i2);
        this.k = sf3Var;
        boolean z5 = sf3Var.x;
        vj2 vj2Var = sf3Var.i;
        vj2 vj2Var2 = sf3Var.k;
        int i13 = 1;
        int i14 = true != z5 ? 16 : 24;
        if (!z || (((i10 = (de3Var2 = this.i).t) != -1 && i10 > sf3Var.a) || ((i11 = de3Var2.u) != -1 && i11 > sf3Var.b))) {
            z2 = false;
        } else {
            float f = de3Var2.x;
            if ((f == -1.0f || f <= sf3Var.c) && ((i12 = de3Var2.i) == -1 || i12 <= sf3Var.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.j = z2;
        if (!z || (((i7 = (de3Var = this.i).t) != -1 && i7 < 0) || ((i8 = de3Var.u) != -1 && i8 < 0))) {
            z3 = false;
        } else {
            float f2 = de3Var.x;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i9 = de3Var.i) == -1 || i9 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.l = z3;
        this.m = yc3.I(i3, false);
        de3 de3Var3 = this.i;
        float f3 = de3Var3.x;
        this.n = f3 != -1.0f && f3 >= 10.0f;
        this.o = de3Var3.i;
        int i15 = de3Var3.t;
        this.p = (i15 == -1 || (i6 = de3Var3.u) == -1) ? -1 : i15 * i6;
        int i16 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i16 >= vj2Var2.size()) {
                iD = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iD = zf3.d(this.i, (String) vj2Var2.get(i16), false);
                if (iD > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.r = i16;
        this.s = iD;
        int i17 = this.i.f;
        this.t = (i17 == 0 || i17 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i18 = this.i.f;
        this.v = i18 == 0 || (i18 & 1) != 0;
        this.w = zf3.d(this.i, str, zf3.c(str) == null);
        for (int i19 = 0; i19 < vj2Var.size(); i19++) {
            String str2 = this.i.m;
            if (str2 != null && str2.equals(vj2Var.get(i19))) {
                i4 = i19;
                break;
            }
        }
        this.q = i4;
        this.u = zf3.e(this.i, sf3Var.j);
        this.y = (i3 & 384) == 128;
        this.z = (i3 & 64) == 64;
        de3 de3Var4 = this.i;
        String str3 = de3Var4.m;
        if (str3 != null) {
            switch (str3) {
                case "video/dolby-vision":
                    i5 = 5;
                    break;
                case "video/av01":
                    i5 = 4;
                    break;
                case "video/hevc":
                    i5 = 3;
                    break;
                case "video/avc":
                    i5 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.A = i5;
        if ((de3Var4.f & 16384) != 0) {
            i13 = 0;
        } else {
            sf3 sf3Var2 = this.k;
            if (!yc3.I(i3, sf3Var2.B) || (!(z4 = this.j) && !sf3Var2.w)) {
                i13 = 0;
            } else if (yc3.I(i3, false) && this.l && z4 && de3Var4.i != -1 && (i14 & i3) != 0) {
                i13 = 2;
            }
        }
        this.x = i13;
    }

    public static int c(yf3 yf3Var, yf3 yf3Var2) {
        nj2 nj2VarD = nj2.a.d(yf3Var.m, yf3Var2.m);
        Integer numValueOf = Integer.valueOf(yf3Var.r);
        Integer numValueOf2 = Integer.valueOf(yf3Var2.r);
        ok2 ok2Var = ok2.h;
        nj2 nj2VarA = nj2VarD.a(numValueOf, numValueOf2, ok2Var).b(yf3Var.s, yf3Var2.s).b(yf3Var.t, yf3Var2.t).a(Integer.valueOf(yf3Var.u), Integer.valueOf(yf3Var2.u), ok2Var).d(yf3Var.v, yf3Var2.v).b(yf3Var.w, yf3Var2.w).d(yf3Var.n, yf3Var2.n).d(yf3Var.j, yf3Var2.j).d(yf3Var.l, yf3Var2.l).a(Integer.valueOf(yf3Var.q), Integer.valueOf(yf3Var2.q), ok2Var);
        boolean z = yf3Var.y;
        nj2 nj2VarD2 = nj2VarA.d(z, yf3Var2.y);
        boolean z2 = yf3Var.z;
        nj2 nj2VarD3 = nj2VarD2.d(z2, yf3Var2.z);
        if (z && z2) {
            nj2VarD3 = nj2VarD3.b(yf3Var.A, yf3Var2.A);
        }
        return nj2VarD3.e();
    }

    public static int d(yf3 yf3Var, yf3 yf3Var2) {
        Comparator xk2Var = (yf3Var.j && yf3Var.m) ? zf3.k : new xk2();
        yf3Var.k.getClass();
        return lj2.f(xk2Var.compare(Integer.valueOf(yf3Var.p), Integer.valueOf(yf3Var2.p))).a(Integer.valueOf(yf3Var.o), Integer.valueOf(yf3Var2.o), xk2Var).e();
    }

    @Override // defpackage.xf3
    public final int a() {
        return this.x;
    }

    @Override // defpackage.xf3
    public final /* bridge */ /* synthetic */ boolean b(xf3 xf3Var) {
        yf3 yf3Var = (yf3) xf3Var;
        if (!Objects.equals(this.i.m, yf3Var.i.m)) {
            return false;
        }
        this.k.getClass();
        return this.y == yf3Var.y && this.z == yf3Var.z;
    }
}
