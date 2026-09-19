package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh2 {
    public final int a;
    public final String b;
    public final int c;

    public lh2(String str, int i, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lh2) {
            lh2 lh2Var = (lh2) obj;
            if (this.a == lh2Var.a) {
                String str = lh2Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c == lh2Var.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return this.c ^ (((str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i2).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        return ec.k(sb, ", uiMode=", i2, "}");
    }
}
