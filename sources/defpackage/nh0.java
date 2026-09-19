package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh0 {
    public final me0 a;
    public zh0 d;
    public kh0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final de3 j;
    public boolean m;
    public final yh0 b = new yh0();
    public final cw1 c = new cw1();
    public final cw1 k = new cw1(1);
    public final cw1 l = new cw1();

    public nh0(me0 me0Var, zh0 zh0Var, kh0 kh0Var, de3 de3Var) {
        this.a = me0Var;
        this.d = zh0Var;
        this.e = kh0Var;
        this.j = de3Var;
        this.d = zh0Var;
        this.e = kh0Var;
        me0Var.d(de3Var);
        a();
    }

    public final void a() {
        yh0 yh0Var = this.b;
        yh0Var.d = 0;
        yh0Var.p = 0L;
        yh0Var.q = false;
        yh0Var.k = false;
        yh0Var.o = false;
        yh0Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }

    public final int b() {
        int i;
        if (this.m) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return e() != null ? 1073741824 | i : i;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        cw1 cw1Var;
        xh0 xh0VarE = e();
        if (xh0VarE == null) {
            return 0;
        }
        int length = xh0VarE.d;
        yh0 yh0Var = this.b;
        if (length != 0) {
            cw1Var = yh0Var.n;
        } else {
            byte[] bArr = xh0VarE.e;
            String str = qz1.a;
            length = bArr.length;
            cw1 cw1Var2 = this.l;
            cw1Var2.z(length, bArr);
            cw1Var = cw1Var2;
        }
        boolean z = yh0Var.k && yh0Var.l[this.f];
        boolean z2 = z || i2 != 0;
        int i3 = true != z2 ? 0 : 128;
        cw1 cw1Var3 = this.k;
        cw1Var3.a[0] = (byte) (i3 | length);
        cw1Var3.E(0);
        me0 me0Var = this.a;
        me0Var.a(cw1Var3, 1, 1);
        me0Var.a(cw1Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        cw1 cw1Var4 = this.c;
        if (!z) {
            cw1Var4.y(8);
            byte[] bArr2 = cw1Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            me0Var.a(cw1Var4, 8, 1);
            return length + 9;
        }
        int i4 = length + 1;
        cw1 cw1Var5 = yh0Var.n;
        int iL = cw1Var5.L();
        cw1Var5.G(-2);
        int i5 = (iL * 6) + 2;
        if (i2 != 0) {
            cw1Var4.y(i5);
            byte[] bArr3 = cw1Var4.a;
            cw1Var5.H(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
        } else {
            cw1Var4 = cw1Var5;
        }
        me0Var.a(cw1Var4, i5, 1);
        return i4 + i5;
    }

    public final xh0 e() {
        if (!this.m) {
            return null;
        }
        yh0 yh0Var = this.b;
        kh0 kh0Var = yh0Var.a;
        String str = qz1.a;
        int i = kh0Var.a;
        xh0 xh0Var = yh0Var.m;
        if (xh0Var == null) {
            xh0Var = this.d.a.l[i];
        }
        if (xh0Var == null || !xh0Var.a) {
            return null;
        }
        return xh0Var;
    }
}
