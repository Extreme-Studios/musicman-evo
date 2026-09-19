package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xk0 implements jk0 {
    public final cw1 a;
    public final zd0 b;
    public final String c;
    public final int d;
    public final String e;
    public me0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public xk0(int i, String str, String str2) {
        cw1 cw1Var = new cw1(4);
        this.a = cw1Var;
        cw1Var.a[0] = -1;
        this.b = new zd0();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        this.f.getClass();
        while (cw1Var.B() > 0) {
            int i = this.h;
            cw1 cw1Var2 = this.a;
            if (i == 0) {
                byte[] bArr = cw1Var.a;
                int i2 = cw1Var.b;
                int i3 = cw1Var.c;
                while (true) {
                    if (i2 >= i3) {
                        cw1Var.E(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        cw1Var.E(i4);
                        this.k = false;
                        cw1Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(cw1Var.B(), this.m - this.i);
                this.f.a(cw1Var, iMin, 0);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    hn.M(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = Math.min(cw1Var.B(), 4 - this.i);
                cw1Var.H(cw1Var2.a, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    cw1Var2.E(0);
                    int iB = cw1Var2.b();
                    zd0 zd0Var = this.b;
                    if (zd0Var.a(iB)) {
                        this.m = zd0Var.b;
                        if (!this.j) {
                            this.l = (((long) zd0Var.f) * 1000000) / ((long) zd0Var.c);
                            uc3 uc3Var = new uc3();
                            uc3Var.a = this.g;
                            uc3Var.d(this.e);
                            uc3Var.e((String) zd0Var.g);
                            uc3Var.m = 4096;
                            uc3Var.D = zd0Var.d;
                            uc3Var.E = zd0Var.c;
                            uc3Var.d = this.c;
                            uc3Var.f = this.d;
                            this.f.d(new de3(uc3Var));
                            this.j = true;
                        }
                        cw1Var2.E(0);
                        this.f.a(cw1Var2, 4, 0);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.g = ml0Var.e;
        ml0Var.b();
        this.f = pd0Var.z(ml0Var.d, 1);
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
    }
}
