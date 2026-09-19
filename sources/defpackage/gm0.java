package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gm0 {
    public final String a;
    public final String b;

    public gm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gm0.class == obj.getClass()) {
            gm0 gm0Var = (gm0) obj;
            if (TextUtils.equals(this.a, gm0Var.a) && TextUtils.equals(this.b, gm0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        ec.x(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
