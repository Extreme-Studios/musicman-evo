package defpackage;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class az2 extends st2 {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final zy2 c;
    public final yy2 d;
    public final yy2 e;
    public final int f;

    public az2(int i, BigInteger bigInteger, zy2 zy2Var, yy2 yy2Var, yy2 yy2Var2, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = zy2Var;
        this.d = yy2Var;
        this.e = yy2Var2;
        this.f = i2;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.c != zy2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        return az2Var.a == this.a && Objects.equals(az2Var.b, this.b) && Objects.equals(az2Var.c, this.c) && Objects.equals(az2Var.d, this.d) && Objects.equals(az2Var.e, this.e) && az2Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(az2.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        ec.x(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
