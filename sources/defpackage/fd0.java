package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements od0 {
    public final k73 g;
    public final long h;
    public long i;
    public int k;
    public int l;
    public byte[] j = new byte[65536];
    public final byte[] f = new byte[4096];

    static {
        ej0.a("media3.extractor");
    }

    public fd0(k73 k73Var, long j, long j2) {
        this.g = k73Var;
        this.i = j;
        this.h = j2;
    }

    @Override // defpackage.od0
    public final void A(int i) throws EOFException, InterruptedIOException {
        e(i, false);
    }

    @Override // defpackage.od0
    public final boolean B(byte[] bArr, int i, int i2, boolean z) {
        if (!e(i2, z)) {
            return false;
        }
        System.arraycopy(this.j, this.k - i2, bArr, i, i2);
        return true;
    }

    public final boolean b(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.l, i);
        j(iMin);
        int iK = iMin;
        while (iK < i && iK != -1) {
            iK = k(this.f, -iK, Math.min(i, iK + 4096), iK, z);
        }
        if (iK != -1) {
            this.i += (long) iK;
        }
        return iK != -1;
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        fd0 fd0Var;
        int i3 = this.l;
        int iK = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.j, 0, bArr, i, iMin);
            j(iMin);
            iK = iMin;
        }
        if (iK == 0) {
            fd0Var = this;
            iK = fd0Var.k(bArr, i, i2, 0, true);
        } else {
            fd0Var = this;
        }
        if (iK != -1) {
            fd0Var.i += (long) iK;
        }
        return iK;
    }

    public final boolean e(int i, boolean z) throws EOFException, InterruptedIOException {
        f(i);
        int iK = this.l - this.k;
        while (iK < i) {
            fd0 fd0Var = this;
            int i2 = i;
            boolean z2 = z;
            iK = fd0Var.k(this.j, this.k, i2, iK, z2);
            if (iK == -1) {
                return false;
            }
            fd0Var.l = fd0Var.k + iK;
            this = fd0Var;
            i = i2;
            z = z2;
        }
        this.k += i;
        return true;
    }

    public final void f(int i) {
        int i2 = this.k + i;
        int length = this.j.length;
        if (i2 > length) {
            String str = qz1.a;
            this.j = Arrays.copyOf(this.j, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    @Override // defpackage.od0
    public final void i() {
        this.k = 0;
    }

    public final void j(int i) {
        int i2 = this.l - i;
        this.l = i2;
        this.k = 0;
        byte[] bArr = this.j;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.j = bArr2;
    }

    public final int k(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.g.d(bArr, i + i3, i2 - i3);
        if (iD != -1) {
            return i3 + iD;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.od0
    public final int l() throws EOFException, InterruptedIOException {
        fd0 fd0Var;
        int iMin = Math.min(this.l, 1);
        j(iMin);
        if (iMin == 0) {
            fd0Var = this;
            iMin = fd0Var.k(this.f, 0, Math.min(1, 4096), 0, true);
        } else {
            fd0Var = this;
        }
        if (iMin != -1) {
            fd0Var.i += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.od0
    public final long m() {
        return this.i + ((long) this.k);
    }

    @Override // defpackage.od0
    public final long o() {
        return this.i;
    }

    @Override // defpackage.od0
    public final long p() {
        return this.h;
    }

    @Override // defpackage.od0
    public final void t(int i) throws EOFException, InterruptedIOException {
        b(i, false);
    }

    @Override // defpackage.od0
    public final void u(byte[] bArr, int i, int i2) {
        B(bArr, i, i2, false);
    }

    @Override // defpackage.od0
    public final boolean w(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.l;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.j, 0, bArr, i, iMin);
            j(iMin);
        }
        int iK = iMin;
        while (iK < i2 && iK != -1) {
            iK = k(bArr, i, i2, iK, z);
        }
        if (iK != -1) {
            this.i += (long) iK;
        }
        return iK != -1;
    }

    @Override // defpackage.od0
    public final void x(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        w(bArr, i, i2, false);
    }

    @Override // defpackage.od0
    public final int y(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        fd0 fd0Var;
        int iMin;
        f(i2);
        int i3 = this.l;
        int i4 = this.k;
        int i5 = i3 - i4;
        if (i5 == 0) {
            fd0Var = this;
            iMin = fd0Var.k(this.j, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            fd0Var.l += iMin;
        } else {
            fd0Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(fd0Var.j, fd0Var.k, bArr, i, iMin);
        fd0Var.k += iMin;
        return iMin;
    }
}
