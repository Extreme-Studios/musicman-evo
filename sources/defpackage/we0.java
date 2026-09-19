package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class we0 {
    public final ve0 a;
    public final me0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public we0(int i, ve0 ve0Var, me0 me0Var) {
        int i2 = ve0Var.d;
        this.a = ve0Var;
        int iB = ve0Var.b();
        boolean z = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z = false;
            }
        }
        hn.v(z);
        int i3 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.c = (iB == 2 ? 1667497984 : 1651965952) | i3;
        this.e = qz1.t(i2, ((long) ve0Var.b) * 1000000, ve0Var.c, RoundingMode.DOWN);
        this.b = me0Var;
        this.d = iB == 2 ? 1650720768 | i3 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final de0 a(long j) {
        if (this.k == 0) {
            fe0 fe0Var = new fe0(0L, this.l);
            return new de0(fe0Var, fe0Var);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iO = qz1.o(this.n, i, true, true);
        if (this.n[iO] == i) {
            fe0 fe0VarB = b(iO);
            return new de0(fe0VarB, fe0VarB);
        }
        fe0 fe0VarB2 = b(iO);
        int i2 = iO + 1;
        return i2 < this.m.length ? new de0(fe0VarB2, b(i2)) : new de0(fe0VarB2, fe0VarB2);
    }

    public final fe0 b(int i) {
        return new fe0((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }
}
