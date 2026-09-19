package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 extends oo2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final xo2 e;
    public final wo2 f;

    public yo2(int i, int i2, int i3, int i4, xo2 xo2Var, wo2 wo2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = xo2Var;
        this.f = wo2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.e != xo2.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yo2)) {
            return false;
        }
        yo2 yo2Var = (yo2) obj;
        return yo2Var.a == this.a && yo2Var.b == this.b && yo2Var.c == this.c && yo2Var.d == this.d && yo2Var.e == this.e && yo2Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(yo2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        int i2 = this.d;
        int length4 = String.valueOf(i2).length();
        int i3 = this.a;
        int length5 = String.valueOf(i3).length();
        int i4 = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        ec.x(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        ec.v(sb, ", ", i, "-byte IV, and ", i2);
        ec.v(sb, "-byte tags, and ", i3, "-byte AES key, and ", i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
