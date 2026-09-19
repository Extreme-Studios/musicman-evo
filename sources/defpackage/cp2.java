package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cp2 extends oo2 {
    public final int a;
    public final int b;
    public final bp2 c;

    public cp2(int i, int i2, bp2 bp2Var) {
        this.a = i;
        this.b = i2;
        this.c = bp2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.c != bp2.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cp2)) {
            return false;
        }
        cp2 cp2Var = (cp2) obj;
        return cp2Var.a == this.a && cp2Var.b == this.b && cp2Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(cp2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return ec.k(sb, "-byte IV, 16-byte tag, and ", i2, "-byte key)");
    }
}
