package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pe0 implements nd0 {
    public static final int[] l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] n;
    public static final byte[] o;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public pd0 g;
    public me0 h;
    public sd0 j;
    public boolean k;
    public final byte[] a = new byte[1];
    public int f = -1;
    public me0 i = new id0();

    static {
        String str = qz1.a;
        Charset charset = StandardCharsets.UTF_8;
        n = "#!AMR\n".getBytes(charset);
        o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(od0 od0Var) {
        od0Var.i();
        byte[] bArr = n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        od0Var.u(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            od0Var.t(bArr.length);
            return true;
        }
        od0Var.i();
        byte[] bArr3 = o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        od0Var.u(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        od0Var.t(bArr3.length);
        return true;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        return a(od0Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws no0 {
        byte b;
        int iB;
        int i;
        this.h.getClass();
        String str = qz1.a;
        if (((fd0) od0Var).i == 0 && !a(od0Var)) {
            throw no0.a(null, "Could not find AMR header.");
        }
        boolean z = this.k;
        int[] iArr = l;
        int[] iArr2 = m;
        if (!z) {
            this.k = true;
            boolean z2 = this.b;
            String str2 = true != z2 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z2 ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z2 ? 8000 : 16000;
            int i3 = z2 ? iArr2[8] : iArr[7];
            me0 me0Var = this.h;
            uc3 uc3Var = new uc3();
            uc3Var.d(str2);
            uc3Var.e(str3);
            uc3Var.m = i3;
            uc3Var.D = 1;
            uc3Var.E = i2;
            me0Var.d(new de3(uc3Var));
        }
        int i4 = this.e;
        if (i4 == 0) {
            try {
                ((fd0) od0Var).k = 0;
                byte[] bArr = this.a;
                ((fd0) od0Var).B(bArr, 0, 1, false);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b2).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b2);
                    throw no0.a(null, sb.toString());
                }
                boolean z3 = this.b;
                int i5 = (b2 >> 3) & 15;
                if (!z3) {
                    if (!z3) {
                        if (i5 >= 12 && i5 <= 14) {
                        }
                    }
                    String str4 = true != z3 ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(str4.length() + 24 + String.valueOf(i5).length());
                    sb2.append("Illegal AMR ");
                    sb2.append(str4);
                    sb2.append(" frame type ");
                    sb2.append(i5);
                    throw no0.a(null, sb2.toString());
                }
                if (i5 >= 10 && i5 <= 13) {
                    if (!z3) {
                        if (i5 >= 12) {
                        }
                    }
                    if (true != z3) {
                    }
                    StringBuilder sb3 = new StringBuilder(str4.length() + 24 + String.valueOf(i5).length());
                    sb3.append("Illegal AMR ");
                    sb3.append(str4);
                    sb3.append(" frame type ");
                    sb3.append(i5);
                    throw no0.a(null, sb3.toString());
                }
                i4 = z3 ? iArr2[i5] : iArr[i5];
                this.d = i4;
                this.e = i4;
                if (this.f == -1) {
                    this.f = i4;
                }
                iB = this.i.b(od0Var, i4, true);
                if (iB == -1) {
                    b = -1;
                } else {
                    i = this.e - iB;
                    this.e = i;
                    if (i <= 0) {
                        this.i.c(this.c, 1, this.d, 0, null);
                        this.c += 20000;
                    }
                    b = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iB = this.i.b(od0Var, i4, true);
            if (iB == -1) {
                b = -1;
            } else {
                i = this.e - iB;
                this.e = i;
                if (i <= 0) {
                    this.i.c(this.c, 1, this.d, 0, null);
                    this.c += 20000;
                }
                b = 0;
            }
        }
        if (this.j == null) {
            sd0 sd0Var = new sd0(-9223372036854775807L, 0L);
            this.j = sd0Var;
            this.g.v(sd0Var);
        }
        return b == -1 ? -1 : 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.g = pd0Var;
        me0 me0VarZ = pd0Var.z(0, 1);
        this.h = me0VarZ;
        this.i = me0VarZ;
        pd0Var.s();
    }
}
