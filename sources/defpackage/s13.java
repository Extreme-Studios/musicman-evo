package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s13 extends u13 {
    public final byte[] d;
    public final int e;
    public int f;

    public s13(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.d = bArr;
            this.f = 0;
            this.e = i;
        } else {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Array range is invalid. Buffer.length=" + length + ", offset=0, length=" + i);
        }
    }

    public final void A(byte[] bArr, int i, int i2) throws e13 {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new e13(this.f, this.e, i2, e);
        }
    }

    @Override // defpackage.u13
    public final void f(int i, int i2) throws e13 {
        v((i << 3) | i2);
    }

    @Override // defpackage.u13
    public final void g(int i, int i2) throws e13 {
        v(i << 3);
        u(i2);
    }

    @Override // defpackage.u13
    public final void h(int i, int i2) throws e13 {
        v(i << 3);
        v(i2);
    }

    @Override // defpackage.u13
    public final void i(int i, int i2) throws e13 {
        v((i << 3) | 5);
        w(i2);
    }

    @Override // defpackage.u13
    public final void j(int i, long j) throws e13 {
        v(i << 3);
        x(j);
    }

    @Override // defpackage.u13
    public final void k(byte[] bArr, int i, int i2) throws e13 {
        A(bArr, i, i2);
    }

    @Override // defpackage.u13
    public final int l() {
        return this.e - this.f;
    }

    @Override // defpackage.u13
    public final void m(int i, long j) throws e13 {
        v((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.u13
    public final void n(int i, boolean z) throws e13 {
        v(i << 3);
        t(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.u13
    public final void o(String str, int i) throws e13 {
        v((i << 3) | 2);
        z(str);
    }

    @Override // defpackage.u13
    public final void p(int i, n13 n13Var) throws e13 {
        v((i << 3) | 2);
        q(n13Var);
    }

    @Override // defpackage.u13
    public final void q(n13 n13Var) throws e13 {
        v(n13Var.d());
        n13Var.j(this);
    }

    @Override // defpackage.u13
    public final void r(int i, byte[] bArr) throws e13 {
        v(i);
        A(bArr, 0, i);
    }

    @Override // defpackage.u13
    public final void s(f13 f13Var) throws e13 {
        v(((d23) f13Var).d(null));
        ((d23) f13Var).u(this);
    }

    @Override // defpackage.u13
    public final void t(byte b) throws e13 {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new e13(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.u13
    public final void u(int i) throws e13 {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.u13
    public final void v(int i) throws e13 {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new e13(i2, this.e, 1, e);
                }
            }
            throw new e13(i2, this.e, 1, e);
        }
    }

    @Override // defpackage.u13
    public final void w(int i) throws e13 {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new e13(i2, this.e, 4, e);
        }
    }

    @Override // defpackage.u13
    public final void x(long j) throws e13 {
        int i;
        int i2 = this.f;
        byte[] bArr = this.d;
        int i3 = this.e;
        if (!u13.c || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new e13(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new e13(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                u33.m(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            u33.m(bArr, i2, (byte) j);
        }
        this.f = i;
    }

    @Override // defpackage.u13
    public final void y(long j) throws e13 {
        int i = this.f;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new e13(i, this.e, 8, e);
        }
    }

    @Override // defpackage.u13
    public final void z(String str) throws e13 {
        int i = this.f;
        try {
            int iA = u13.a(str.length() * 3);
            int iA2 = u13.a(str.length());
            int i2 = this.e;
            byte[] bArr = this.d;
            if (iA2 != iA) {
                v(x33.b(str));
                int i3 = this.f;
                this.f = x33.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iA2;
                this.f = i4;
                int iC = x33.c(str, bArr, i4, i2 - i4);
                this.f = i;
                v((iC - i) - iA2);
                this.f = iC;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new e13(e);
        } catch (w33 e2) {
            this.f = i;
            e(str, e2);
        }
    }
}
