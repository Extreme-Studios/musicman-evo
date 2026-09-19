package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o13 extends r13 {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public /* synthetic */ o13(byte[] bArr, int i, int i2) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // defpackage.r13
    public final long A() {
        return r13.g(F());
    }

    @Override // defpackage.r13
    public final int B(int i) throws o23 {
        if (i < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = (this.g - this.h) + i;
        if (i2 < 0) {
            j7.s("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.j;
        if (i2 > i3) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.j = i2;
        D();
        return i3;
    }

    public final void C(int i) throws o23 {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void D() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final int E() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            long j7 = (j6 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i6] >= 0) {
                                                    j = j7;
                                                    i4 = i11;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j;
            }
        }
        return G();
    }

    public final long G() throws o23 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        j7.s("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int H() throws o23 {
        int i = this.g;
        if (this.e - i < 4) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long I() throws o23 {
        int i = this.g;
        if (this.e - i < 8) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.r13
    public final void a(int i) {
        this.j = i;
        D();
    }

    @Override // defpackage.r13
    public final boolean b() {
        return this.g == this.e;
    }

    @Override // defpackage.r13
    public final int c() {
        return this.g - this.h;
    }

    @Override // defpackage.r13
    public final int h() throws o23 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iE = E();
        this.i = iE;
        if ((iE >>> 3) != 0) {
            return iE;
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
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                C(8);
                return true;
            }
            if (i2 == 2) {
                C(E());
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
                C(4);
                return true;
            }
            j7.q();
            return false;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            j7.s("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        j7.s("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.r13
    public final double k() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.r13
    public final float l() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.r13
    public final long m() {
        return F();
    }

    @Override // defpackage.r13
    public final long n() {
        return F();
    }

    @Override // defpackage.r13
    public final int o() {
        return E();
    }

    @Override // defpackage.r13
    public final long p() {
        return I();
    }

    @Override // defpackage.r13
    public final int q() {
        return H();
    }

    @Override // defpackage.r13
    public final boolean r() {
        return F() != 0;
    }

    @Override // defpackage.r13
    public final String s() throws o23 {
        int iE = E();
        if (iE > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iE <= i - i2) {
                String str = new String(this.d, i2, iE, m23.a);
                this.g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final String t() throws o23 {
        int iE = E();
        if (iE > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iE <= i - i2) {
                x33.a.getClass();
                String strC = v33.c(this.d, i2, iE);
                this.g += iE;
                return strC;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final l13 u() throws o23 {
        int iE = E();
        byte[] bArr = this.d;
        if (iE > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iE <= i - i2) {
                l13 l13VarN = n13.n(bArr, i2, iE);
                this.g += iE;
                return l13VarN;
            }
        }
        if (iE == 0) {
            return n13.g;
        }
        if (iE > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iE <= i3 - i4) {
                int i5 = iE + i4;
                this.g = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                l13 l13Var = n13.g;
                return new l13(bArrCopyOfRange);
            }
        }
        if (iE <= 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.r13
    public final int v() {
        return E();
    }

    @Override // defpackage.r13
    public final int w() {
        return E();
    }

    @Override // defpackage.r13
    public final int x() {
        return H();
    }

    @Override // defpackage.r13
    public final long y() {
        return I();
    }

    @Override // defpackage.r13
    public final int z() {
        return r13.f(E());
    }
}
