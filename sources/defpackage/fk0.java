package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class fk0 implements nd0 {
    public final cw1 c;
    public final oe0 d;
    public pd0 e;
    public long f;
    public boolean h;
    public boolean i;
    public final gk0 a = new gk0(null, 0, "audio/mp4a-latm", true);
    public final cw1 b = new cw1(2048);
    public long g = -1;

    static {
        int i = ej1.o;
    }

    public fk0() {
        cw1 cw1Var = new cw1(10);
        this.c = cw1Var;
        byte[] bArr = cw1Var.a;
        this.d = new oe0(bArr.length, bArr);
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        cw1 cw1Var;
        fd0 fd0Var;
        int i = 0;
        while (true) {
            cw1Var = this.c;
            fd0Var = (fd0) od0Var;
            fd0Var.B(cw1Var.a, 0, 10, false);
            cw1Var.E(0);
            if (cw1Var.O() != 4801587) {
                break;
            }
            cw1Var.G(3);
            int iG = cw1Var.g();
            i += iG + 10;
            fd0Var.e(iG, false);
        }
        fd0Var.k = 0;
        fd0Var.e(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            fd0Var.B(cw1Var.a, 0, 2, false);
            cw1Var.E(0);
            if ((cw1Var.L() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                fd0Var.B(cw1Var.a, 0, 4, false);
                oe0 oe0Var = this.d;
                oe0Var.l(14);
                int iR = oe0Var.r(13);
                if (iR <= 6) {
                    i4++;
                    fd0Var.k = 0;
                    fd0Var.e(i4, false);
                } else {
                    fd0Var.e(iR - 6, false);
                    i3 += iR;
                }
            } else {
                i4++;
                fd0Var.k = 0;
                fd0Var.e(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        this.e.getClass();
        cw1 cw1Var = this.b;
        int iD = ((fd0) od0Var).d(cw1Var.a, 0, 2048);
        if (!this.i) {
            this.e.v(new sd0(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iD == -1) {
            return -1;
        }
        cw1Var.E(0);
        cw1Var.C(iD);
        boolean z = this.h;
        gk0 gk0Var = this.a;
        if (!z) {
            gk0Var.u = this.f;
            this.h = true;
        }
        gk0Var.b(cw1Var);
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.e = pd0Var;
        this.a.e(pd0Var, new ml0(Integer.MIN_VALUE, 0, 1));
        pd0Var.s();
    }
}
