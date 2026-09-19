package defpackage;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ty2 extends st2 {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final sy2 c;
    public final ry2 d;

    public ty2(int i, BigInteger bigInteger, sy2 sy2Var, ry2 ry2Var) {
        this.a = i;
        this.b = bigInteger;
        this.c = sy2Var;
        this.d = ry2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.c != sy2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return ty2Var.a == this.a && Objects.equals(ty2Var.b, this.b) && ty2Var.c == this.c && ty2Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(ty2.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        ec.x(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
