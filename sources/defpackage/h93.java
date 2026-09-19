package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h93 {
    public final int a;
    public final int b;
    public final boolean c;

    public h93(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h93) {
            h93 h93Var = (h93) obj;
            if (this.a == h93Var.a && this.b == h93Var.b && this.c == h93Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z).length() + 1);
        ec.v(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i2);
        sb.append(", notificationFlowEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
