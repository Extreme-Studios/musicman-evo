package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oe0 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public oe0(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        u();
    }

    public void a() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (true == s(i2 + 1) ? 2 : 1);
        }
        u();
    }

    public void b(cw1 cw1Var) {
        byte[] bArr = cw1Var.a;
        int i = cw1Var.c;
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
        l(cw1Var.b * 8);
    }

    public boolean c() {
        int i = (this.a[this.c] & 255) >> this.d;
        g(1);
        return 1 == (i & 1);
    }

    public int d(int i) {
        int i2 = this.c;
        int i3 = 8 - this.d;
        int i4 = i2 + 1;
        byte[] bArr = this.a;
        int iMin = Math.min(i, i3);
        int i5 = ((bArr[i2] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i5 |= (bArr[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        g(i);
        return i6;
    }

    public void e(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                u();
                return;
            } else if (s(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public int f() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public void g(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        hn.M(z);
    }

    public boolean h(int i) {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i / 8;
        int i5 = i3 + i4;
        int i6 = (this.d + i) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= i2) {
                break;
            }
            if (s(i3)) {
                i5++;
                i3 += 2;
            }
        }
        if (i5 >= i2) {
            return i5 == i2 && i6 == 0;
        }
        return true;
    }

    public int i() {
        hn.M(this.c == 0);
        return this.b;
    }

    public boolean j() {
        int i = this.a[this.c] & (128 >> this.d);
        a();
        return i != 0;
    }

    public int k(int i) {
        int i2;
        byte[] bArr = this.a;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            int i6 = this.c;
            i3 |= (bArr[i6] & 255) << i5;
            if (true != s(i6 + 1)) {
                i4 = 1;
            }
            this.c = i6 + i4;
        }
        int i7 = this.c;
        int i8 = ((bArr[i7] & 255) >> (8 - i2)) | i3;
        int i9 = 32 - i;
        if (i2 == 8) {
            this.d = 0;
            this.c = i7 + (true != s(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        u();
        return i10;
    }

    public void l(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        y();
    }

    public void m() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        y();
    }

    public int n() {
        int iP = p();
        int i = iP % 2;
        return ((iP + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public void o(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        y();
    }

    public int p() {
        int i = 0;
        while (!j()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? k(i) : 0);
    }

    public boolean q() {
        int i = this.a[this.b] & (128 >> this.c);
        m();
        return i != 0;
    }

    public int r(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        y();
        return i9;
    }

    public boolean s(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public long t(int i) {
        if (i <= 32) {
            int iR = r(i);
            String str = qz1.a;
            return ((long) iR) & 4294967295L;
        }
        int iR2 = r(i - 32);
        int iR3 = r(32);
        String str2 = qz1.a;
        return ((((long) iR2) & 4294967295L) << 32) | (4294967295L & ((long) iR3));
    }

    public void u() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0))) {
            z = true;
        }
        hn.M(z);
    }

    public void v(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((bArr2[i5] & 255) >> (8 - i6)) | b2);
            i3++;
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        y();
    }

    public void w() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        y();
    }

    public void x(int i) {
        hn.M(this.c == 0);
        this.b += i;
        y();
    }

    public void y() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0))) {
            z = true;
        }
        hn.M(z);
    }

    public oe0() {
        this.a = qz1.b;
    }

    public oe0(int i, byte[] bArr) {
        this.a = bArr;
        this.d = i;
    }
}
