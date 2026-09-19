package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends oo2 {
    public final bp2 a;
    public final String b;
    public final xo2 c;
    public final oo2 d;

    public wp2(bp2 bp2Var, String str, xo2 xo2Var, oo2 oo2Var) {
        this.a = bp2Var;
        this.b = str;
        this.c = xo2Var;
        this.d = oo2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.a != bp2.l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wp2) {
            wp2 wp2Var = (wp2) obj;
            return wp2Var.c == this.c && wp2Var.d.equals(this.d) && wp2Var.b.equals(this.b) && wp2Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(wp2.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        String str = this.b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        ec.x(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        ec.x(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
