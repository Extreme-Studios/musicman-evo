package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class ql0 implements pl0 {
    public final pd0 a;
    public final me0 b;
    public final ih0 c;
    public final de3 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public ql0(pd0 pd0Var, me0 me0Var, ih0 ih0Var, String str, int i) throws no0 {
        this.a = pd0Var;
        this.b = me0Var;
        this.c = ih0Var;
        int i2 = ih0Var.f;
        int i3 = ih0Var.g;
        int i4 = ih0Var.i * i2;
        int i5 = ih0Var.h;
        int i6 = i4 / 8;
        if (i5 != i6) {
            throw no0.a(null, ec.l(new StringBuilder(String.valueOf(i6).length() + 28 + String.valueOf(i5).length()), "Expected block size: ", i6, "; got: ", i5));
        }
        int i7 = i3 * i6;
        int i8 = i7 * 8;
        int iMax = Math.max(i6, i7 / 10);
        this.e = iMax;
        uc3 uc3Var = new uc3();
        uc3Var.d("audio/wav");
        uc3Var.e(str);
        uc3Var.g = i8;
        uc3Var.h = i8;
        uc3Var.m = iMax;
        uc3Var.D = i2;
        uc3Var.E = i3;
        uc3Var.F = i;
        this.d = new de3(uc3Var);
    }

    @Override // defpackage.pl0
    public final void a(int i, long j) {
        this.a.v(new tl0(this.c, 1, i, j));
        this.b.d(this.d);
    }

    @Override // defpackage.pl0
    public final boolean b(od0 od0Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iB = this.b.b(od0Var, (int) Math.min(i2 - i, j2), true);
            if (iB == -1) {
                j2 = 0;
            } else {
                this.g += iB;
                j2 -= (long) iB;
            }
        }
        int i3 = this.g;
        ih0 ih0Var = this.c;
        int i4 = ih0Var.h;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jT = this.f + qz1.t(this.h, 1000000L, ih0Var.g, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.c(jT, 1, i6, i7, null);
            this.h += (long) i5;
            this.g = i7;
        }
        return j2 <= 0;
    }

    @Override // defpackage.pl0
    public final void f(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
