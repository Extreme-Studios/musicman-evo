package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements nl0 {
    public final el0 a;
    public final cw1 b = new cw1(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public fl0(el0 el0Var) {
        this.a = el0Var;
    }

    @Override // defpackage.nl0
    public final void a(int i, cw1 cw1Var) {
        int iK;
        int i2 = i & 1;
        if (i2 != 0) {
            iK = cw1Var.b + cw1Var.K();
        } else {
            iK = -1;
        }
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            cw1Var.E(iK);
            this.d = 0;
        }
        while (cw1Var.B() > 0) {
            int i3 = this.d;
            cw1 cw1Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iK2 = cw1Var.K();
                    cw1Var.E(cw1Var.b - 1);
                    if (iK2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(cw1Var.B(), 3 - this.d);
                cw1Var.H(cw1Var2.a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    cw1Var2.E(0);
                    cw1Var2.C(3);
                    cw1Var2.G(1);
                    int iK3 = cw1Var2.K();
                    boolean z = (iK3 & 128) != 0;
                    int iK4 = cw1Var2.K();
                    this.e = z;
                    int i5 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.c = i5;
                    byte[] bArr = cw1Var2.a;
                    if (bArr.length < i5) {
                        int length = bArr.length;
                        cw1Var2.A(Math.min(4098, Math.max(i5, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(cw1Var.B(), this.c - this.d);
                cw1Var.H(cw1Var2.a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        cw1Var2.C(i7);
                    } else {
                        if (qz1.f(0, i7, -1, cw1Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        cw1Var2.C(this.c - 4);
                    }
                    cw1Var2.E(0);
                    this.a.g(cw1Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.nl0
    public final void c() {
        this.f = true;
    }

    @Override // defpackage.nl0
    public final void d(ry1 ry1Var, pd0 pd0Var, ml0 ml0Var) {
        this.a.d(ry1Var, pd0Var, ml0Var);
        this.f = true;
    }
}
