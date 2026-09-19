package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class by2 extends st2 {
    public final xo2 a;
    public final zx2 b;
    public final wo2 c;
    public final bp2 d;

    public by2(xo2 xo2Var, zx2 zx2Var, wo2 wo2Var, bp2 bp2Var) {
        this.a = xo2Var;
        this.b = zx2Var;
        this.c = wo2Var;
        this.d = bp2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.d != bp2.p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return by2Var.a == this.a && by2Var.b == this.b && by2Var.c == this.c && by2Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(by2.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.g;
        int length = str.length();
        String str2 = this.c.g;
        int length2 = str2.length();
        String str3 = this.a.g;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        ec.x(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        ec.x(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
