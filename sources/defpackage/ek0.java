package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements nd0 {
    public final dk0 a = new dk0(0, 1, null, "audio/ac4");
    public final cw1 b = new cw1(16384);
    public boolean c;

    static {
        int i = na1.p;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        fd0 fd0Var;
        int i;
        cw1 cw1Var = new cw1(10);
        int i2 = 0;
        while (true) {
            fd0Var = (fd0) od0Var;
            fd0Var.B(cw1Var.a, 0, 10, false);
            cw1Var.E(0);
            if (cw1Var.O() != 4801587) {
                break;
            }
            cw1Var.G(3);
            int iG = cw1Var.g();
            i2 += iG + 10;
            fd0Var.e(iG, false);
        }
        fd0Var.k = 0;
        fd0Var.e(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            fd0Var.B(cw1Var.a, 0, 7, false);
            cw1Var.E(0);
            int iL = cw1Var.L();
            if (iL != 44096 && iL != 44097) {
                fd0Var.k = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                fd0Var.e(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = cw1Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iL == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                fd0Var.e(i - 7, false);
            }
        }
        return false;
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException {
        cw1 cw1Var = this.b;
        int iD = ((fd0) od0Var).d(cw1Var.a, 0, 16384);
        if (iD == -1) {
            return -1;
        }
        cw1Var.E(0);
        cw1Var.C(iD);
        boolean z = this.c;
        dk0 dk0Var = this.a;
        if (!z) {
            dk0Var.o = 0L;
            this.c = true;
        }
        dk0Var.b(cw1Var);
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.a.e(pd0Var, new ml0(Integer.MIN_VALUE, 0, 1));
        pd0Var.s();
        pd0Var.v(new sd0(-9223372036854775807L, 0L));
    }
}
