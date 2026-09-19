package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 implements il0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public rf0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static rf0 b(cw1 cw1Var) {
        int iB = cw1Var.b();
        String strI = rn0.i(cw1Var.k(cw1Var.b(), StandardCharsets.US_ASCII));
        String strK = cw1Var.k(cw1Var.b(), StandardCharsets.UTF_8);
        int iB2 = cw1Var.b();
        int iB3 = cw1Var.b();
        int iB4 = cw1Var.b();
        int iB5 = cw1Var.b();
        int iB6 = cw1Var.b();
        byte[] bArr = new byte[iB6];
        cw1Var.H(bArr, 0, iB6);
        return new rf0(iB, strI, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // defpackage.il0
    public final void a(ak0 ak0Var) {
        ak0Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rf0.class != obj.getClass()) {
            return false;
        }
        rf0 rf0Var = (rf0) obj;
        return this.a == rf0Var.a && this.b.equals(rf0Var.b) && this.c.equals(rf0Var.c) && this.d == rf0Var.d && this.e == rf0Var.e && this.f == rf0Var.f && this.g == rf0Var.g && Arrays.equals(this.h, rf0Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((((this.c.hashCode() + ((this.b.hashCode() + ((this.a + 527) * 31)) * 31)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.c;
        return ec.o(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
