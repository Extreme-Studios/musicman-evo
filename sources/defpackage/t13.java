package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class t13 extends u13 {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public t13(OutputStream outputStream, int i) {
        if (i < 0) {
            j7.p("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.d = new byte[iMax];
        this.e = iMax;
        this.g = outputStream;
    }

    public final void A(int i) {
        if (this.e - this.f < i) {
            B();
        }
    }

    public final void B() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void C(int i) {
        boolean z = u13.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    u33.m(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f = i3 + 1;
                    u33.m(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void D(long j) {
        boolean z = u13.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f;
                if (j2 == 0) {
                    this.f = i2 + 1;
                    u33.m(bArr, i2, (byte) i);
                    return;
                } else {
                    this.f = i2 + 1;
                    u33.m(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f;
                if (j3 == 0) {
                    this.f = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void E(int i) {
        int i2 = this.f;
        byte[] bArr = this.d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f = i2 + 4;
    }

    public final void F(long j) {
        int i = this.f;
        byte[] bArr = this.d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f = i + 8;
    }

    public final void G(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.f = i4;
        B();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // defpackage.u13
    public final void f(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // defpackage.u13
    public final void g(int i, int i2) {
        A(20);
        C(i << 3);
        if (i2 >= 0) {
            C(i2);
        } else {
            D(i2);
        }
    }

    @Override // defpackage.u13
    public final void h(int i, int i2) {
        A(20);
        C(i << 3);
        C(i2);
    }

    @Override // defpackage.u13
    public final void i(int i, int i2) {
        A(14);
        C((i << 3) | 5);
        E(i2);
    }

    @Override // defpackage.u13
    public final void j(int i, long j) {
        A(20);
        C(i << 3);
        D(j);
    }

    @Override // defpackage.u13
    public final void k(byte[] bArr, int i, int i2) throws IOException {
        G(bArr, i, i2);
    }

    @Override // defpackage.u13
    public final int l() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.u13
    public final void m(int i, long j) {
        A(18);
        C((i << 3) | 1);
        F(j);
    }

    @Override // defpackage.u13
    public final void n(int i, boolean z) {
        A(11);
        C(i << 3);
        int i2 = this.f;
        this.d[i2] = z ? (byte) 1 : (byte) 0;
        this.f = i2 + 1;
    }

    @Override // defpackage.u13
    public final void o(String str, int i) throws IOException {
        v((i << 3) | 2);
        z(str);
    }

    @Override // defpackage.u13
    public final void p(int i, n13 n13Var) {
        v((i << 3) | 2);
        q(n13Var);
    }

    @Override // defpackage.u13
    public final void q(n13 n13Var) {
        v(n13Var.d());
        n13Var.j(this);
    }

    @Override // defpackage.u13
    public final void r(int i, byte[] bArr) throws IOException {
        v(i);
        G(bArr, 0, i);
    }

    @Override // defpackage.u13
    public final void s(f13 f13Var) {
        v(((d23) f13Var).d(null));
        ((d23) f13Var).u(this);
    }

    @Override // defpackage.u13
    public final void t(byte b) {
        if (this.f == this.e) {
            B();
        }
        int i = this.f;
        this.d[i] = b;
        this.f = i + 1;
    }

    @Override // defpackage.u13
    public final void u(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.u13
    public final void v(int i) {
        A(5);
        C(i);
    }

    @Override // defpackage.u13
    public final void w(int i) {
        A(4);
        E(i);
    }

    @Override // defpackage.u13
    public final void x(long j) {
        A(10);
        D(j);
    }

    @Override // defpackage.u13
    public final void y(long j) {
        A(8);
        F(j);
    }

    @Override // defpackage.u13
    public final void z(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iA = u13.a(length);
            int i = iA + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iC = x33.c(str, bArr, 0, length);
                v(iC);
                G(bArr, 0, iC);
                return;
            }
            if (i > i2 - this.f) {
                B();
            }
            int iA2 = u13.a(str.length());
            int i3 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (iA2 == iA) {
                    int i4 = i3 + iA2;
                    this.f = i4;
                    int iC2 = x33.c(str, bArr2, i4, i2 - i4);
                    this.f = i3;
                    C((iC2 - i3) - iA2);
                    this.f = iC2;
                } else {
                    int iB = x33.b(str);
                    C(iB);
                    this.f = x33.c(str, bArr2, this.f, iB);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new e13(e);
            } catch (w33 e2) {
                this.f = i3;
                throw e2;
            }
        } catch (w33 e3) {
            e(str, e3);
        }
    }
}
