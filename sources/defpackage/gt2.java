package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gt2 extends st2 {
    public final int a;
    public final int b;
    public final ao2 c;

    public gt2(int i, int i2, ao2 ao2Var) {
        this.a = i;
        this.b = i2;
        this.c = ao2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.c != ao2.q;
    }

    public final int b() {
        ao2 ao2Var = ao2.q;
        int i = this.b;
        ao2 ao2Var2 = this.c;
        if (ao2Var2 == ao2Var) {
            return i;
        }
        if (ao2Var2 == ao2.n || ao2Var2 == ao2.o || ao2Var2 == ao2.p) {
            return i + 5;
        }
        j7.e("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt2)) {
            return false;
        }
        gt2 gt2Var = (gt2) obj;
        return gt2Var.a == this.a && gt2Var.b() == b() && gt2Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(gt2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return ec.k(sb, "-byte tags, and ", i2, "-byte key)");
    }
}
