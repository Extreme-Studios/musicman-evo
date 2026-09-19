package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class cf0 implements dd0 {
    public final td0 f;
    public final int g;
    public final rd0 h = new rd0();

    public cf0(td0 td0Var, int i) {
        this.f = td0Var;
        this.g = i;
    }

    public final long a(od0 od0Var) {
        rd0 rd0Var;
        td0 td0Var;
        int iY;
        while (true) {
            long jM = od0Var.m();
            long jP = od0Var.p() - 6;
            rd0Var = this.h;
            td0Var = this.f;
            if (jM >= jP) {
                break;
            }
            long jM2 = od0Var.m();
            cw1 cw1Var = new cw1(17);
            int i = 0;
            od0Var.u(cw1Var.a, 0, 2);
            char cR = cw1Var.r(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.g;
            if (cR != i2) {
                od0Var.i();
                od0Var.A((int) (jM2 - od0Var.o()));
            } else {
                byte[] bArr = cw1Var.a;
                while (i < 15 && (iY = od0Var.y(bArr, 2 + i, 15 - i)) != -1) {
                    i += iY;
                }
                cw1Var.C(i + 2);
                od0Var.i();
                od0Var.A((int) (jM2 - od0Var.o()));
                if (ss0.F(cw1Var, td0Var, i2, rd0Var)) {
                    break;
                }
            }
            od0Var.A(1);
        }
        if (od0Var.m() < od0Var.p() - 6) {
            return rd0Var.a;
        }
        od0Var.A((int) (od0Var.p() - od0Var.m()));
        return td0Var.j;
    }

    @Override // defpackage.dd0
    public final cd0 f(od0 od0Var, long j) {
        long jO = od0Var.o();
        long jA = a(od0Var);
        long jM = od0Var.m();
        od0Var.A(Math.max(6, this.f.c));
        long jA2 = a(od0Var);
        long jM2 = od0Var.m();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new cd0(-2, jA2, jM2) : new cd0(-1, jA, jO);
        }
        return new cd0(0, -9223372036854775807L, jM);
    }
}
