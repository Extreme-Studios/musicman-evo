package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class l13 extends n13 {
    public final byte[] h;

    public l13(byte[] bArr) {
        bArr.getClass();
        this.h = bArr;
    }

    @Override // defpackage.n13
    public byte b(int i) {
        return this.h[i];
    }

    @Override // defpackage.n13
    public byte c(int i) {
        return this.h[i];
    }

    @Override // defpackage.n13
    public int d() {
        return this.h.length;
    }

    @Override // defpackage.n13
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n13) && d() == ((n13) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof l13)) {
                return obj.equals(this);
            }
            l13 l13Var = (l13) obj;
            int i = this.f;
            int i2 = l13Var.f;
            if (i == 0 || i2 == 0 || i == i2) {
                return s(l13Var, 0, d());
            }
        }
        return false;
    }

    @Override // defpackage.n13
    public void f(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.h, i, bArr, i2, i3);
    }

    @Override // defpackage.n13
    public final int g() {
        return 0;
    }

    @Override // defpackage.n13
    public final boolean h() {
        return true;
    }

    @Override // defpackage.n13
    public final n13 i(int i, int i2) {
        int iA = n13.a(i, i2, d());
        if (iA == 0) {
            return n13.g;
        }
        return new k13(this.h, r() + i, iA);
    }

    @Override // defpackage.n13
    public final void j(u13 u13Var) {
        u13Var.k(this.h, r(), d());
    }

    @Override // defpackage.n13
    public final int k(int i, int i2, int i3) {
        int iR = r() + i2;
        Charset charset = m23.a;
        for (int i4 = iR; i4 < iR + i3; i4++) {
            i = (i * 31) + this.h[i4];
        }
        return i;
    }

    @Override // defpackage.n13
    public final r13 l() {
        return r13.d(this.h, r(), d());
    }

    public int r() {
        return 0;
    }

    public final boolean s(l13 l13Var, int i, int i2) {
        if (i2 > l13Var.d()) {
            int iD = d();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(iD).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iD);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > l13Var.d()) {
            int iD2 = l13Var.d();
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iD2).length());
            ec.v(sb2, "Ran off end of other: ", i, ", ", i2);
            j7.p(ec.j(sb2, ", ", iD2));
            return false;
        }
        byte[] bArr = l13Var.h;
        int iR = r() + i2;
        int iR2 = r();
        int iR3 = l13Var.r() + i;
        while (iR2 < iR) {
            if (this.h[iR2] != bArr[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }
}
