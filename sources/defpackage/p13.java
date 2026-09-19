package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p13 extends r13 {
    public final Iterator d;
    public ByteBuffer e;
    public int f;
    public int g;
    public int i;
    public long k;
    public long l;
    public long m;
    public int h = Integer.MAX_VALUE;
    public int j = 0;

    public /* synthetic */ p13(int i, ArrayList arrayList) {
        this.f = i;
        this.d = arrayList.iterator();
        if (i != 0) {
            F();
            return;
        }
        this.e = m23.c;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // defpackage.r13
    public final long A() {
        return r13.g(J());
    }

    @Override // defpackage.r13
    public final int B(int i) throws o23 {
        if (i < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int iC = c() + i;
        int i2 = this.h;
        if (iC > i2) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.h = iC;
        int i3 = this.f + this.g;
        this.f = i3;
        if (i3 <= iC) {
            this.g = 0;
            return i2;
        }
        int i4 = i3 - iC;
        this.g = i4;
        this.f = i3 - i4;
        return i2;
    }

    public final byte C() throws o23 {
        if (this.m - this.k == 0) {
            E();
        }
        long j = this.k;
        this.k = 1 + j;
        return u33.c.x1(j);
    }

    public final void D(int i) throws o23 {
        if (i >= 0) {
            if (i <= (((long) (this.f - this.j)) - this.k) + this.l) {
                while (i > 0) {
                    if (this.m - this.k == 0) {
                        E();
                    }
                    int iMin = Math.min(i, (int) (this.m - this.k));
                    i -= iMin;
                    this.k += (long) iMin;
                }
                return;
            }
        }
        if (i < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void E() throws o23 {
        if (this.d.hasNext()) {
            F();
        } else {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void F() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d.next();
        this.e = byteBuffer;
        this.j += (int) (this.k - this.l);
        long jPosition = byteBuffer.position();
        this.k = jPosition;
        this.l = jPosition;
        this.m = this.e.limit();
        long jN = u33.n(this.e);
        this.k += jN;
        this.l += jN;
        this.m += jN;
    }

    public final void G(int i, byte[] bArr) throws o23 {
        if (i > H()) {
            if (i <= 0) {
                return;
            }
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.m - this.k == 0) {
                E();
            }
            int iMin = Math.min(i2, (int) (this.m - this.k));
            long j = iMin;
            u33.c.A1(this.k, bArr, i - i2, j);
            i2 -= iMin;
            this.k += j;
        }
    }

    public final int H() {
        return (int) ((((long) (this.f - this.j)) - this.k) + this.l);
    }

    public final int I() {
        int i;
        long j = this.k;
        if (this.m != j) {
            long j2 = j + 1;
            t33 t33Var = u33.c;
            byte bX1 = t33Var.x1(j);
            if (bX1 >= 0) {
                this.k++;
                return bX1;
            }
            if (this.m - this.k >= 10) {
                long j3 = 2 + j;
                int iX1 = (t33Var.x1(j2) << 7) ^ bX1;
                if (iX1 < 0) {
                    i = iX1 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iX2 = (t33Var.x1(j3) << 14) ^ iX1;
                    if (iX2 >= 0) {
                        i = iX2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iX3 = iX2 ^ (t33Var.x1(j4) << 21);
                        if (iX3 < 0) {
                            i = (-2080896) ^ iX3;
                        } else {
                            j4 = 5 + j;
                            byte bX2 = t33Var.x1(j5);
                            int i2 = (iX3 ^ (bX2 << 28)) ^ 266354560;
                            if (bX2 < 0) {
                                j5 = 6 + j;
                                if (t33Var.x1(j4) < 0) {
                                    j4 = 7 + j;
                                    if (t33Var.x1(j5) < 0) {
                                        j5 = 8 + j;
                                        if (t33Var.x1(j4) < 0) {
                                            j4 = 9 + j;
                                            if (t33Var.x1(j5) < 0) {
                                                long j6 = j + 10;
                                                if (t33Var.x1(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.k = j3;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        long j4 = this.k;
        if (this.m != j4) {
            long j5 = j4 + 1;
            t33 t33Var = u33.c;
            byte bX1 = t33Var.x1(j4);
            if (bX1 >= 0) {
                this.k++;
                return bX1;
            }
            if (this.m - this.k >= 10) {
                long j6 = 2 + j4;
                int iX1 = (t33Var.x1(j5) << 7) ^ bX1;
                if (iX1 < 0) {
                    j = iX1 ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iX2 = (t33Var.x1(j6) << 14) ^ iX1;
                    if (iX2 >= 0) {
                        j = iX2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iX3 = iX2 ^ (t33Var.x1(j7) << 21);
                        if (iX3 < 0) {
                            j = (-2080896) ^ iX3;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long jX1 = (((long) t33Var.x1(j8)) << 28) ^ ((long) iX3);
                            if (jX1 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = 6 + j4;
                                long jX2 = jX1 ^ (((long) t33Var.x1(j7)) << 35);
                                if (jX2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jX1 = jX2 ^ (((long) t33Var.x1(j9)) << 42);
                                    if (jX1 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j4;
                                        jX2 = jX1 ^ (((long) t33Var.x1(j7)) << 49);
                                        if (jX2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = 9 + j4;
                                            long jX3 = (jX2 ^ (((long) t33Var.x1(j9)) << 56)) ^ 71499008037633920L;
                                            if (jX3 < 0) {
                                                long j10 = j4 + 10;
                                                if (t33Var.x1(j7) >= 0) {
                                                    j6 = j10;
                                                    j = jX3;
                                                }
                                            } else {
                                                j = jX3;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jX2;
                                j6 = j9;
                            }
                            j = j3 ^ jX1;
                        }
                    }
                    j6 = j7;
                }
                this.k = j6;
                return j;
            }
        }
        return K();
    }

    public final long K() throws o23 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bC = C();
            j |= ((long) (bC & 127)) << i;
            if ((bC & 128) == 0) {
                return j;
            }
        }
        j7.s("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int L() {
        int iC;
        int i;
        long j = this.m;
        long j2 = this.k;
        if (j - j2 >= 4) {
            this.k = 4 + j2;
            t33 t33Var = u33.c;
            int iX1 = t33Var.x1(j2) & 255;
            int iX2 = (t33Var.x1(1 + j2) & 255) << 8;
            int iX3 = (t33Var.x1(2 + j2) & 255) << 16;
            iC = (t33Var.x1(j2 + 3) & 255) << 24;
            i = iX1 | iX2 | iX3;
        } else {
            int iC2 = C() & 255;
            int iC3 = (C() & 255) << 8;
            int iC4 = (C() & 255) << 16;
            iC = (C() & 255) << 24;
            i = iC2 | iC3 | iC4;
        }
        return iC | i;
    }

    public final long M() {
        long j = this.m;
        long j2 = this.k;
        if (j - j2 < 8) {
            long jC = ((long) C()) & 255;
            long jC2 = (((long) C()) & 255) << 8;
            long jC3 = (((long) C()) & 255) << 16;
            long jC4 = (((long) C()) & 255) << 24;
            long jC5 = (((long) C()) & 255) << 32;
            long jC6 = (((long) C()) & 255) << 40;
            return ((((long) C()) & 255) << 56) | jC | jC2 | jC3 | jC4 | jC5 | jC6 | ((((long) C()) & 255) << 48);
        }
        this.k = 8 + j2;
        t33 t33Var = u33.c;
        long jX1 = ((long) t33Var.x1(j2)) & 255;
        long jX2 = (((long) t33Var.x1(j2 + 1)) & 255) << 8;
        long jX3 = (((long) t33Var.x1(j2 + 2)) & 255) << 16;
        long jX4 = (((long) t33Var.x1(j2 + 3)) & 255) << 24;
        long jX5 = (((long) t33Var.x1(j2 + 4)) & 255) << 32;
        long jX6 = (((long) t33Var.x1(j2 + 5)) & 255) << 40;
        long jX7 = (((long) t33Var.x1(j2 + 6)) & 255) << 48;
        return jX1 | jX2 | jX3 | jX4 | jX5 | jX6 | jX7 | ((((long) t33Var.x1(j2 + 7)) & 255) << 56);
    }

    @Override // defpackage.r13
    public final void a(int i) {
        this.h = i;
        int i2 = this.f + this.g;
        this.f = i2;
        if (i2 <= i) {
            this.g = 0;
            return;
        }
        int i3 = i2 - i;
        this.g = i3;
        this.f = i2 - i3;
    }

    @Override // defpackage.r13
    public final boolean b() {
        return (((long) this.j) + this.k) - this.l == ((long) this.f);
    }

    @Override // defpackage.r13
    public final int c() {
        return (int) ((((long) this.j) + this.k) - this.l);
    }

    @Override // defpackage.r13
    public final int h() throws o23 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int I = I();
        this.i = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        j7.s("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.r13
    public final void i(int i) throws o23 {
        if (this.i == i) {
            return;
        }
        j7.s("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.r13
    public final boolean j(int i) throws o23 {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (C() >= 0) {
                    return true;
                }
            }
            j7.s("CodedInputStream encountered a malformed varint.");
            return false;
        }
        if (i2 == 1) {
            D(8);
            return true;
        }
        if (i2 == 2) {
            D(I());
            return true;
        }
        if (i2 == 3) {
            e();
            i(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (this.b == 0) {
                i(0);
            }
            return false;
        }
        if (i2 == 5) {
            D(4);
            return true;
        }
        j7.q();
        return false;
    }

    @Override // defpackage.r13
    public final double k() {
        return Double.longBitsToDouble(M());
    }

    @Override // defpackage.r13
    public final float l() {
        return Float.intBitsToFloat(L());
    }

    @Override // defpackage.r13
    public final long m() {
        return J();
    }

    @Override // defpackage.r13
    public final long n() {
        return J();
    }

    @Override // defpackage.r13
    public final int o() {
        return I();
    }

    @Override // defpackage.r13
    public final long p() {
        return M();
    }

    @Override // defpackage.r13
    public final int q() {
        return L();
    }

    @Override // defpackage.r13
    public final boolean r() {
        return J() != 0;
    }

    @Override // defpackage.r13
    public final String s() throws o23 {
        int I = I();
        if (I > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = I;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[I];
                u33.c.A1(j2, bArr, 0L, j3);
                String str = new String(bArr, m23.a);
                this.k += j3;
                return str;
            }
        }
        if (I > 0 && I <= H()) {
            byte[] bArr2 = new byte[I];
            G(I, bArr2);
            return new String(bArr2, m23.a);
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final String t() throws o23 {
        String strE;
        int I = I();
        if (I > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = I;
            if (j3 <= j - j2) {
                long j4 = j2 - this.l;
                ByteBuffer byteBuffer = this.e;
                int i = (int) j4;
                v33 v33Var = x33.a;
                if (byteBuffer.hasArray()) {
                    int iArrayOffset = byteBuffer.arrayOffset();
                    v33Var.getClass();
                    strE = v33.c(byteBuffer.array(), iArrayOffset + i, I);
                } else {
                    strE = byteBuffer.isDirect() ? v33.e(byteBuffer, i, I) : v33.e(byteBuffer, i, I);
                }
                this.k += j3;
                return strE;
            }
        }
        if (I >= 0 && I <= H()) {
            byte[] bArr = new byte[I];
            G(I, bArr);
            x33.a.getClass();
            return v33.c(bArr, 0, I);
        }
        if (I == 0) {
            return "";
        }
        if (I <= 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final l13 u() throws o23 {
        int I = I();
        if (I > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = I;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[I];
                u33.c.A1(j2, bArr, 0L, j3);
                this.k += j3;
                l13 l13Var = n13.g;
                return new l13(bArr);
            }
        }
        if (I > 0 && I <= H()) {
            byte[] bArr2 = new byte[I];
            G(I, bArr2);
            l13 l13Var2 = n13.g;
            return new l13(bArr2);
        }
        if (I == 0) {
            return n13.g;
        }
        if (I < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final int v() {
        return I();
    }

    @Override // defpackage.r13
    public final int w() {
        return I();
    }

    @Override // defpackage.r13
    public final int x() {
        return L();
    }

    @Override // defpackage.r13
    public final long y() {
        return M();
    }

    @Override // defpackage.r13
    public final int z() {
        return r13.f(I());
    }
}
