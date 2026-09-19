package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class aw1 {
    public final Activity a;
    public final nf0 b;
    public final String c;
    public final String d;

    public aw1(Activity activity, nf0 nf0Var, String str, String str2) {
        this.a = activity;
        this.b = nf0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw1) {
            aw1 aw1Var = (aw1) obj;
            if (this.a.equals(aw1Var.a)) {
                nf0 nf0Var = aw1Var.b;
                nf0 nf0Var2 = this.b;
                if (nf0Var2 != null ? nf0Var2.equals(nf0Var) : nf0Var == null) {
                    String str = aw1Var.c;
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = aw1Var.d;
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        nf0 nf0Var = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (nf0Var == null ? 0 : nf0Var.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        int length2 = strValueOf.length();
        String str = this.c;
        int length3 = String.valueOf(str).length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        ec.x(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        ec.x(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
