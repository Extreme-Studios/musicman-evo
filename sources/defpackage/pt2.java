package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 extends st2 {
    public final int a;
    public final int b;
    public final ot2 c;
    public final nt2 d;

    public pt2(int i, int i2, ot2 ot2Var, nt2 nt2Var) {
        this.a = i;
        this.b = i2;
        this.c = ot2Var;
        this.d = nt2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.c != ot2.e;
    }

    public final int b() {
        ot2 ot2Var = ot2.e;
        int i = this.b;
        ot2 ot2Var2 = this.c;
        if (ot2Var2 == ot2Var) {
            return i;
        }
        if (ot2Var2 == ot2.b || ot2Var2 == ot2.c || ot2Var2 == ot2.d) {
            return i + 5;
        }
        j7.e("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pt2)) {
            return false;
        }
        pt2 pt2Var = (pt2) obj;
        return pt2Var.a == this.a && pt2Var.b() == b() && pt2Var.c == this.c && pt2Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(pt2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.b;
        int length3 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        ec.x(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        ec.v(sb, ", ", i, "-byte tags, and ", i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
