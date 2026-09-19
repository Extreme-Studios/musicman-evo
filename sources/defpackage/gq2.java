package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gq2 extends oo2 {
    public final gp2 a;
    public final int b;

    public gq2(int i, gp2 gp2Var) {
        this.a = gp2Var;
        this.b = i;
    }

    public static gq2 b(int i, gp2 gp2Var) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new gq2(i, gp2Var);
        }
        j7.r("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.a != gp2.l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gq2)) {
            return false;
        }
        gq2 gq2Var = (gq2) obj;
        return gq2Var.a == this.a && gq2Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(gq2.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String str = this.a.g;
        int length = str.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
