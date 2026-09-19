package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class ck0 implements nd0 {
    public final dk0 a = new dk0(0, 0, null, "audio/ac3");
    public final cw1 b = new cw1(2786);
    public boolean c;

    static {
        int i = v51.r;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        fd0 fd0Var;
        int iL;
        cw1 cw1Var = new cw1(10);
        int i = 0;
        while (true) {
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            fd0Var.B(cw1Var.a, 0, 6, false);
            cw1Var.E(0);
            if (cw1Var.L() != 2935) {
                fd0Var.k = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                fd0Var.e(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = cw1Var.a;
                if (bArr.length < 6) {
                    iL = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i4 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iL = i4 + i4;
                } else {
                    byte b = bArr[4];
                    iL = jn.L((b & 192) >> 6, b & 63);
                }
                if (iL == -1) {
                    break;
                }
                fd0Var.e(iL - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException {
        cw1 cw1Var = this.b;
        int iD = ((fd0) od0Var).d(cw1Var.a, 0, 2786);
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
