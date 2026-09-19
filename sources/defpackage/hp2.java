package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hp2 extends oo2 {
    public final int a;
    public final gp2 b;

    public hp2(int i, gp2 gp2Var) {
        this.a = i;
        this.b = gp2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.b != gp2.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hp2)) {
            return false;
        }
        hp2 hp2Var = (hp2) obj;
        return hp2Var.a == this.a && hp2Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(hp2.class, Integer.valueOf(this.a), 12, 16, this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
