package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd0 implements ee0 {
    public final e3 a;
    public final e3 b;
    public final long c;

    public yd0(long j, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        hn.v(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.a = new e3(length2, 10);
            this.b = new e3(length2, 10);
        } else {
            int i = length2 + 1;
            e3 e3Var = new e3(i, 10);
            this.a = e3Var;
            e3 e3Var2 = new e3(i, 10);
            this.b = e3Var2;
            e3Var.g();
            e3Var2.g();
        }
        this.a.l(jArr);
        this.b.l(jArr2);
        this.c = j;
    }

    @Override // defpackage.ee0
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ee0
    public final boolean c() {
        return this.b.g > 0;
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        e3 e3Var = this.b;
        int i = e3Var.g;
        if (i == 0) {
            fe0 fe0Var = fe0.c;
            return new de0(fe0Var, fe0Var);
        }
        String str = qz1.a;
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (e3Var.m(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < e3Var.g && e3Var.m(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        long jM = e3Var.m(i3);
        e3 e3Var2 = this.a;
        fe0 fe0Var2 = new fe0(jM, e3Var2.m(i3));
        if (jM == j || i3 == e3Var.g - 1) {
            return new de0(fe0Var2, fe0Var2);
        }
        int i7 = i3 + 1;
        return new de0(fe0Var2, new fe0(e3Var.m(i7), e3Var2.m(i7)));
    }
}
