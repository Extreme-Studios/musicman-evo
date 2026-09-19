package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lp2 extends oo2 {
    public final int a;
    public final kp2 b;

    public lp2(int i, kp2 kp2Var) {
        this.a = i;
        this.b = kp2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.b != kp2.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        return lp2Var.a == this.a && lp2Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(lp2.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
