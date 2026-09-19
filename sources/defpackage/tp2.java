package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tp2 extends oo2 {
    public final String a;
    public final wo2 b;

    public tp2(String str, wo2 wo2Var) {
        this.a = str;
        this.b = wo2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.b != wo2.n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tp2) {
            tp2 tp2Var = (tp2) obj;
            return tp2Var.a.equals(this.a) && tp2Var.b == this.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(tp2.class, this.a, this.b);
    }

    public final String toString() {
        String str = this.b.g;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        ec.x(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
