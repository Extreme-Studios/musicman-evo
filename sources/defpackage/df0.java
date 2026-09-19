package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df0 {
    public final zc0 a;
    public final dd0 b;
    public ad0 c;
    public final int d;

    public df0(bd0 bd0Var, dd0 dd0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = dd0Var;
        this.d = i;
        this.a = new zc0(bd0Var, j, j2, j3, j4, j5);
    }

    public static final int c(od0 od0Var, long j, rd0 rd0Var) {
        if (j == od0Var.o()) {
            return 0;
        }
        rd0Var.a = j;
        return 1;
    }

    public static /* synthetic */ int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(long j) {
        ad0 ad0Var = this.c;
        if (ad0Var == null || ad0Var.a != j) {
            zc0 zc0Var = this.a;
            long jF = zc0Var.a.f(j);
            long j2 = zc0Var.c;
            long j3 = zc0Var.d;
            long j4 = zc0Var.e;
            long j5 = zc0Var.f;
            ad0 ad0Var2 = new ad0();
            ad0Var2.a = j;
            ad0Var2.b = jF;
            ad0Var2.d = 0L;
            ad0Var2.e = j2;
            ad0Var2.f = j3;
            ad0Var2.g = j4;
            ad0Var2.c = j5;
            ad0Var2.h = ad0.a(jF, 0L, j2, j3, j4, j5);
            this.c = ad0Var2;
        }
    }

    public final int b(od0 od0Var, rd0 rd0Var) {
        while (true) {
            ad0 ad0Var = this.c;
            ad0Var.getClass();
            long j = ad0Var.f;
            long j2 = ad0Var.g;
            long j3 = ad0Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            dd0 dd0Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                dd0Var.mo16c();
                return c(od0Var, j, rd0Var);
            }
            long jO = j3 - od0Var.o();
            if (jO < 0 || jO > 262144) {
                return c(od0Var, j3, rd0Var);
            }
            od0Var.t((int) jO);
            od0Var.i();
            cd0 cd0VarF = dd0Var.f(od0Var, ad0Var.b);
            int i = cd0VarF.c;
            long j6 = cd0VarF.a;
            long j7 = cd0VarF.b;
            if (i == -3) {
                this.c = null;
                dd0Var.mo16c();
                return c(od0Var, j3, rd0Var);
            }
            if (i == -2) {
                ad0Var.d = j6;
                ad0Var.f = j7;
                ad0Var.h = ad0.a(ad0Var.b, j6, ad0Var.e, j7, ad0Var.g, ad0Var.c);
            } else {
                if (i != -1) {
                    long jO2 = j7 - od0Var.o();
                    if (jO2 >= 0 && jO2 <= 262144) {
                        od0Var.t((int) jO2);
                    }
                    this.c = null;
                    dd0Var.mo16c();
                    return c(od0Var, j7, rd0Var);
                }
                ad0Var.e = j6;
                ad0Var.g = j7;
                ad0Var.h = ad0.a(ad0Var.b, ad0Var.d, j6, ad0Var.f, j7, ad0Var.c);
            }
        }
    }
}
