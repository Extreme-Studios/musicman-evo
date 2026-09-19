package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jf3 {
    public final String a;
    public final String b;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public jf3(String str, String str2) {
        this.a = qz1.n(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf3.class == obj.getClass()) {
            jf3 jf3Var = (jf3) obj;
            if (Objects.equals(this.a, jf3Var.a) && Objects.equals(this.b, jf3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
