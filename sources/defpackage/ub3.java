package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ub3 extends od1 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l <= 0) {
            int i2 = i - iMin;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer byteBufferI = i(length);
            int i3 = this.n;
            String str = qz1.a;
            int iMax = Math.max(0, Math.min(length, i3));
            byteBufferI.put(this.m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferI.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i4 = i2 - iMax2;
            int i5 = this.n - iMax;
            this.n = i5;
            byte[] bArr = this.m;
            System.arraycopy(bArr, iMax, bArr, 0, i5);
            byteBuffer.get(this.m, this.n, i4);
            this.n += i4;
            byteBufferI.flip();
        }
    }

    @Override // defpackage.od1, defpackage.cd1
    public final ByteBuffer d() {
        int i;
        if (super.e() && (i = this.n) > 0) {
            i(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // defpackage.od1, defpackage.cd1
    public final boolean e() {
        return super.e() && this.n == 0;
    }

    @Override // defpackage.cd1
    public final long f(long j) {
        return Math.max(0L, j - qz1.s(this.b.a, this.j + this.i));
    }

    @Override // defpackage.od1
    public final nb1 k(nb1 nb1Var) throws jc1 {
        if (!qz1.a(nb1Var.c)) {
            throw new jc1("Unhandled input format:", nb1Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? nb1.e : nb1Var;
    }

    @Override // defpackage.od1
    public final void l() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.od1
    public final void m() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.od1
    public final void n() {
        this.m = qz1.b;
    }
}
