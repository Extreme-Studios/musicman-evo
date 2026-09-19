package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 extends bg0 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public tf0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.il0
    public final void a(ak0 ak0Var) {
        ak0Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tf0.class != obj.getClass()) {
            return false;
        }
        tf0 tf0Var = (tf0) obj;
        return this.d == tf0Var.d && this.b.equals(tf0Var.b) && Objects.equals(this.c, tf0Var.c) && Arrays.equals(this.e, tf0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        String str = this.c;
        return Arrays.hashCode(this.e) + ((((((this.d + 527) * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int length2 = str2.length();
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        ec.x(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
