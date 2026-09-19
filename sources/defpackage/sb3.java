package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class sb3 extends od1 {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            if (this.k != 0) {
                hn.M(this.o < this.n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i2 = this.i;
                        iLimit = (iPosition2 / i2) * i2;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.o;
                int i4 = this.p;
                int i5 = i3 + i4;
                int length = this.n.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.n, i5, iMin);
                int i6 = this.p + iMin;
                this.p = i6;
                hn.M(i6 <= this.n.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                o(z);
                if (z) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i7 = this.i;
                        iPosition = ((iLimit4 / i7) * i7) + i7;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    i(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // defpackage.od1, defpackage.cd1
    public final boolean h() {
        return super.h() && this.j;
    }

    @Override // defpackage.od1
    public final nb1 k(nb1 nb1Var) throws jc1 {
        if (nb1Var.c == 2) {
            return nb1Var.a == -1 ? nb1.e : nb1Var;
        }
        throw new jc1("Unhandled input format:", nb1Var);
    }

    @Override // defpackage.od1
    public final void l() {
        if (this.p > 0) {
            o(true);
            this.m = 0;
        }
    }

    @Override // defpackage.od1
    public final void m() {
        if (h()) {
            nb1 nb1Var = this.b;
            int i = nb1Var.b;
            int i2 = i + i;
            this.i = i2;
            int i3 = ((((int) ((100000 * ((long) nb1Var.a)) / 1000000)) / 2) / i2) * i2;
            int i4 = i3 + i3;
            if (this.n.length != i4) {
                this.n = new byte[i4];
                this.q = new byte[i4];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // defpackage.od1
    public final void n() {
        this.j = false;
        byte[] bArr = qz1.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final void o(boolean z) {
        int i;
        int length;
        int i2 = this.p;
        int length2 = this.n.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.m == 0) {
            if (z) {
                q(i2, 3);
                length = i2;
            } else {
                hn.M(i2 >= (length2 >> 1));
                length = this.n.length >> 1;
                q(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iP = p(i4) + (this.n.length >> 1);
                q(iP, 2);
                int i5 = i3 + i4;
                i = iP;
                length = i5;
            } else {
                int iP2 = p(i4);
                q(iP2, 1);
                i = iP2;
                length = i4;
            }
        }
        if (length % this.i != 0) {
            j7.e(jn.E("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            return;
        }
        hn.M(i2 >= i);
        this.p -= length;
        int i6 = this.o + length;
        this.o = i6;
        this.o = i6 % this.n.length;
        int i7 = this.m;
        int i8 = this.i;
        this.m = (i / i8) + i7;
        this.l += (long) ((length - i) / i8);
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * ((long) this.b.a)) / 1000000)) - this.m) * this.i) - (this.n.length >> 1);
        hn.M(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (iMin / i2) * i2;
    }

    public final void q(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        hn.v(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            int length = bArr.length;
            byte[] bArr2 = this.q;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, bArr2, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, bArr2, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, bArr2, 0, i8);
                    System.arraycopy(this.n, 0, this.q, i8, i7);
                }
            }
        } else {
            int i9 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i9 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int i10 = length2 - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, i10);
                System.arraycopy(this.n, 0, this.q, i10, i - i10);
            }
        }
        hn.F(i % this.i == 0, "sizeToOutput is not aligned to frame size: %s", i);
        hn.M(this.o < this.n.length);
        byte[] bArr5 = this.q;
        hn.F(i % this.i == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i2 != 3) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                int i12 = i11 + 1;
                int i13 = (bArr5[i12] << 8) | (bArr5[i11] & 255);
                if (i2 == 0) {
                    i3 = ((((i11 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i11) / (i - 1)) / 1000);
                    }
                }
                int i14 = (i13 * i3) / 100;
                if (i14 >= 32767) {
                    bArr5[i11] = -1;
                    bArr5[i12] = 127;
                } else if (i14 <= -32768) {
                    bArr5[i11] = 0;
                    bArr5[i12] = -128;
                } else {
                    bArr5[i11] = (byte) (i14 & 255);
                    bArr5[i12] = (byte) (i14 >> 8);
                }
            }
        }
        i(i).put(bArr5, 0, i).flip();
    }
}
