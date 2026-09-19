package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 {
    public final ry1 a;
    public final cw1 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public bl0(int i) {
        switch (i) {
            case 1:
                this.a = new ry1();
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new cw1();
                break;
            default:
                this.a = new ry1();
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new cw1();
                break;
        }
    }

    public static long a(cw1 cw1Var) {
        int i = cw1Var.b;
        if (cw1Var.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        cw1Var.H(bArr, 0, 9);
        cw1Var.E(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(od0 od0Var) {
        byte[] bArr = qz1.b;
        int length = bArr.length;
        this.b.z(0, bArr);
        this.c = true;
        od0Var.i();
    }
}
