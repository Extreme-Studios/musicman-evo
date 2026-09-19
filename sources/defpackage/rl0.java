package defpackage;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rl0 implements nd0 {
    public pd0 a;
    public me0 b;
    public int c;
    public long d;
    public pl0 e;
    public int f;
    public long g;

    static {
        int i = hn.t;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        return na1.w(od0Var);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0263  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        byte[] bArr;
        int iY;
        this.b.getClass();
        String str = qz1.a;
        int i = this.c;
        if (i == 0) {
            hn.M(((fd0) od0Var).i == 0);
            int i2 = this.f;
            if (i2 != -1) {
                ((fd0) od0Var).b(i2, false);
                this.c = 4;
                return 0;
            }
            if (!na1.w(od0Var)) {
                throw no0.a(null, "Unsupported or unrecognized wav file type.");
            }
            fd0 fd0Var = (fd0) od0Var;
            fd0Var.b((int) (fd0Var.m() - fd0Var.i), false);
            this.c = 1;
            return 0;
        }
        long jE = -1;
        if (i == 1) {
            cw1 cw1Var = new cw1(8);
            sl0 sl0VarA = sl0.a(od0Var, cw1Var);
            if (sl0VarA.a != 1685272116) {
                ((fd0) od0Var).k = 0;
            } else {
                fd0 fd0Var2 = (fd0) od0Var;
                fd0Var2.e(8, false);
                cw1Var.E(0);
                fd0Var2.B(cw1Var.a, 0, 8, false);
                jE = cw1Var.e();
                fd0Var2.b(((int) sl0VarA.b) + 8, false);
            }
            this.d = jE;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 3) {
                hn.M(this.g != -1);
                long j = this.g - ((fd0) od0Var).i;
                pl0 pl0Var = this.e;
                pl0Var.getClass();
                return pl0Var.b(od0Var, j) ? -1 : 0;
            }
            ((fd0) od0Var).k = 0;
            sl0 sl0VarE = na1.E(1684108385, od0Var, new cw1(8));
            fd0 fd0Var3 = (fd0) od0Var;
            fd0Var3.b(8, false);
            Pair pairCreate = Pair.create(Long.valueOf(fd0Var3.i), Long.valueOf(sl0VarE.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && jLongValue == 4294967295L) {
                jLongValue = j2;
            }
            long j3 = ((long) this.f) + jLongValue;
            this.g = j3;
            long j4 = fd0Var3.h;
            if (j4 != -1 && j3 > j4) {
                StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(j4).length());
                ec.w(sb, "Data exceeds input length: ", j3, ", ");
                sb.append(j4);
                s90.Q("WavExtractor", sb.toString());
                this.g = j4;
                j3 = j4;
            }
            pl0 pl0Var2 = this.e;
            pl0Var2.getClass();
            pl0Var2.a(this.f, j3);
            this.c = 4;
            return 0;
        }
        cw1 cw1Var2 = new cw1(16);
        long j5 = na1.E(1718449184, od0Var, cw1Var2).b;
        hn.M(j5 >= 16);
        fd0 fd0Var4 = (fd0) od0Var;
        fd0Var4.B(cw1Var2.a, 0, 16, false);
        cw1Var2.E(0);
        int iM = cw1Var2.M();
        int iM2 = cw1Var2.M();
        int i3 = cw1Var2.i();
        cw1Var2.i();
        int iM3 = cw1Var2.M();
        int iM4 = cw1Var2.M();
        int i4 = ((int) j5) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            fd0Var4.B(bArr, 0, i4, false);
            if (iM == 65534) {
                if (i4 == 24) {
                    cw1 cw1Var3 = new cw1(bArr);
                    cw1Var3.M();
                    int iM5 = cw1Var3.M();
                    if (iM5 != 0 && iM5 != iM4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iM4).length() + String.valueOf(iM5).length() + 33 + 19);
                        ec.v(sb2, "validBits ( ", iM5, ")  != bitsPerSample( ", iM4);
                        sb2.append(") are not supported");
                        throw no0.b(sb2.toString());
                    }
                    int i5 = cw1Var3.i();
                    if ((i5 >> 18) != 0) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 21);
                        sb3.append("invalid channel mask ");
                        sb3.append(i5);
                        throw no0.b(sb3.toString());
                    }
                    if (i5 != 0 && Integer.bitCount(i5) != iM2) {
                        int iBitCount = Integer.bitCount(i5);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(i5).length());
                        sb4.append("invalid number of channels (");
                        sb4.append(iBitCount);
                        sb4.append(") in channel mask ");
                        sb4.append(i5);
                        throw no0.b(sb4.toString());
                    }
                    int iM6 = cw1Var3.M();
                    byte[] bArr2 = new byte[14];
                    cw1Var3.H(bArr2, 0, 14);
                    if (!Arrays.equals(bArr2, na1.j) && !Arrays.equals(bArr2, na1.k)) {
                        throw no0.b("invalid wav format extension guid");
                    }
                    iM = iM6;
                } else {
                    iM = 65534;
                }
            }
        } else {
            bArr = qz1.b;
        }
        fd0Var4.b((int) (fd0Var4.m() - fd0Var4.i), false);
        ih0 ih0Var = new ih0();
        ih0Var.f = iM2;
        ih0Var.g = i3;
        ih0Var.h = iM3;
        ih0Var.i = iM4;
        ih0Var.j = bArr;
        if (iM == 17) {
            this.e = new ol0(this.a, this.b, ih0Var);
        } else if (iM == 6) {
            this.e = new ql0(this.a, this.b, ih0Var, "audio/g711-alaw", -1);
        } else if (iM == 7) {
            this.e = new ql0(this.a, this.b, ih0Var, "audio/g711-mlaw", -1);
        } else {
            if (iM == 1) {
                iY = qz1.y(iM4, ByteOrder.LITTLE_ENDIAN);
            } else {
                if (iM != 3) {
                    if (iM == 65534) {
                        iY = qz1.y(iM4, ByteOrder.LITTLE_ENDIAN);
                    }
                } else if (iM4 == 32) {
                    iY = 4;
                }
                iY = 0;
            }
            if (iY == 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(iM).length() + 29);
                sb5.append("Unsupported WAV format type: ");
                sb5.append(iM);
                throw no0.b(sb5.toString());
            }
            this.e = new ql0(this.a, this.b, ih0Var, "audio/raw", iY);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        pl0 pl0Var = this.e;
        if (pl0Var != null) {
            pl0Var.f(j2);
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.a = pd0Var;
        this.b = pd0Var.z(0, 1);
        pd0Var.s();
    }
}
