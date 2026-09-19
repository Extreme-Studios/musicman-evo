package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class fi0 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final cw1 g = new cw1(255);

    public final boolean a(od0 od0Var, long j) {
        boolean zB;
        hn.v(od0Var.o() == od0Var.m());
        cw1 cw1Var = this.g;
        cw1Var.y(4);
        while (true) {
            if (j != -1 && od0Var.o() + 4 >= j) {
                break;
            }
            try {
                zB = od0Var.B(cw1Var.a, 0, 4, true);
            } catch (EOFException unused) {
                zB = false;
            }
            if (!zB) {
                break;
            }
            cw1Var.E(0);
            if (cw1Var.P() == 1332176723) {
                od0Var.i();
                return true;
            }
            od0Var.t(1);
        }
        do {
            if (j != -1 && od0Var.o() >= j) {
                break;
            }
        } while (od0Var.l() != -1);
        return false;
    }

    public final boolean b(od0 od0Var, boolean z) throws EOFException, no0 {
        boolean zB;
        boolean zB2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        cw1 cw1Var = this.g;
        cw1Var.y(27);
        try {
            zB = od0Var.B(cw1Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zB = false;
        }
        if (zB && cw1Var.P() == 1332176723) {
            if (cw1Var.K() == 0) {
                this.a = cw1Var.K();
                this.b = cw1Var.e();
                cw1Var.a();
                cw1Var.a();
                cw1Var.a();
                int iK = cw1Var.K();
                this.c = iK;
                this.d = iK + 27;
                cw1Var.y(iK);
                try {
                    zB2 = od0Var.B(cw1Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zB2 = false;
                }
                if (zB2) {
                    for (int i = 0; i < this.c; i++) {
                        int iK2 = cw1Var.K();
                        this.f[i] = iK2;
                        this.e += iK2;
                    }
                    return true;
                }
            } else if (!z) {
                throw no0.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
