package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class di0 implements nd0 {
    public pd0 a;
    public ii0 b;
    public boolean c;

    static {
        int i = w40.y;
    }

    public final boolean a(od0 od0Var) {
        fi0 fi0Var = new fi0();
        if (fi0Var.b(od0Var, true) && (fi0Var.a & 2) == 2) {
            int iMin = Math.min(fi0Var.e, 8);
            cw1 cw1Var = new cw1(iMin);
            od0Var.u(cw1Var.a, 0, iMin);
            cw1Var.E(0);
            if (cw1Var.B() >= 5 && cw1Var.K() == 127 && cw1Var.P() == 1179402563) {
                this.b = new ci0();
                return true;
            }
            cw1Var.E(0);
            try {
                if (ej1.D(1, cw1Var, true)) {
                    this.b = new ji0();
                    return true;
                }
            } catch (no0 unused) {
            }
            cw1Var.E(0);
            if (hi0.e(cw1Var, hi0.o)) {
                this.b = new hi0();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        try {
            return a(od0Var);
        } catch (no0 unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!a(od0Var)) {
                throw no0.a(null, "Failed to determine bitstream type");
            }
            ((fd0) od0Var).k = 0;
        }
        int i = 1;
        if (!this.c) {
            me0 me0VarZ = this.a.z(0, 1);
            this.a.s();
            ii0 ii0Var = this.b;
            ii0Var.c = this.a;
            ii0Var.b = me0VarZ;
            ii0Var.a(true);
            this.c = true;
        }
        ii0 ii0Var2 = this.b;
        ei0 ei0Var = ii0Var2.a;
        ii0Var2.b.getClass();
        String str = qz1.a;
        int i2 = ii0Var2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                ((fd0) od0Var).b((int) ii0Var2.f, false);
                ii0Var2.h = 2;
                return 0;
            }
            if (i2 != 2) {
                return -1;
            }
            long jD = ii0Var2.d.d(od0Var);
            if (jD >= 0) {
                rd0Var.a = jD;
                return 1;
            }
            if (jD < -1) {
                ii0Var2.d(-(jD + 2));
            }
            if (!ii0Var2.l) {
                ee0 ee0VarH = ii0Var2.d.h();
                ee0VarH.getClass();
                ii0Var2.c.v(ee0VarH);
                ee0VarH.a();
                ii0Var2.l = true;
            }
            if (ii0Var2.k <= 0 && !ei0Var.a(od0Var)) {
                ii0Var2.h = 3;
                return -1;
            }
            ii0Var2.k = 0L;
            cw1 cw1Var = ei0Var.b;
            long jB = ii0Var2.b(cw1Var);
            if (jB >= 0) {
                long j = ii0Var2.g;
                if (j + jB >= ii0Var2.e) {
                    long j2 = (j * 1000000) / ((long) ii0Var2.i);
                    ii0Var2.b.a(cw1Var, cw1Var.c, 0);
                    ii0Var2.b.c(j2, 1, cw1Var.c, 0, null);
                    ii0Var2.e = -1L;
                }
            }
            ii0Var2.g += jB;
            return 0;
        }
        while (true) {
            boolean zA = ei0Var.a(od0Var);
            cw1 cw1Var2 = ei0Var.b;
            if (!zA) {
                ii0Var2.h = 3;
                return -1;
            }
            long j3 = ((fd0) od0Var).i;
            long j4 = ii0Var2.f;
            ii0Var2.k = j3 - j4;
            if (!ii0Var2.c(cw1Var2, j4, ii0Var2.j)) {
                de3 de3Var = (de3) ii0Var2.j.g;
                ii0Var2.i = de3Var.F;
                if (!ii0Var2.m) {
                    ii0Var2.b.d(de3Var);
                    ii0Var2.m = true;
                }
                gh0 gh0Var = (gh0) ii0Var2.j.h;
                if (gh0Var == null) {
                    long j5 = ((fd0) od0Var).h;
                    if (j5 == -1) {
                        ii0Var2.d = new ue0(i);
                    } else {
                        fi0 fi0Var = ei0Var.a;
                        ii0Var2.d = new bi0(ii0Var2, ii0Var2.f, j5, fi0Var.d + fi0Var.e, fi0Var.b, (fi0Var.a & 4) != 0);
                    }
                    ii0Var2.h = 2;
                    bArr = cw1Var2.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    cw1Var2.z(cw1Var2.c, Arrays.copyOf(bArr, Math.max(65025, cw1Var2.c)));
                    return 0;
                }
                ii0Var2.d = gh0Var;
                ii0Var2.h = 2;
                bArr = cw1Var2.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                cw1Var2.z(cw1Var2.c, Arrays.copyOf(bArr, Math.max(65025, cw1Var2.c)));
                return 0;
            }
            ii0Var2.f = ((fd0) od0Var).i;
        }
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        ii0 ii0Var = this.b;
        if (ii0Var != null) {
            ei0 ei0Var = ii0Var.a;
            fi0 fi0Var = ei0Var.a;
            fi0Var.a = 0;
            fi0Var.b = 0L;
            fi0Var.c = 0;
            fi0Var.d = 0;
            fi0Var.e = 0;
            ei0Var.b.y(0);
            ei0Var.c = -1;
            ei0Var.e = false;
            if (j == 0) {
                ii0Var.a(!ii0Var.l);
                return;
            }
            if (ii0Var.h != 0) {
                long j3 = (((long) ii0Var.i) * j2) / 1000000;
                ii0Var.e = j3;
                gi0 gi0Var = ii0Var.d;
                String str = qz1.a;
                gi0Var.j(j3);
                ii0Var.h = 2;
            }
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.a = pd0Var;
    }
}
