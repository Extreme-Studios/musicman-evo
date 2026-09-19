package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 {
    public static final fe0 c = new fe0(0, 0);
    public final long a;
    public final long b;

    public fe0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fe0.class == obj.getClass()) {
            fe0 fe0Var = (fe0) obj;
            if (this.a == fe0Var.a && this.b == fe0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        ec.w(sb, "[timeUs=", j, ", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
