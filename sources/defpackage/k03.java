package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class k03 {
    public final String a;
    public final de3 b;
    public final de3 c;
    public final int d;
    public final int e;

    public k03(String str, de3 de3Var, de3 de3Var2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            if (i2 == 0) {
                i2 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        hn.v(z);
        hn.v(true ^ TextUtils.isEmpty(str));
        this.a = str;
        this.b = de3Var;
        de3Var2.getClass();
        this.c = de3Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k03.class == obj.getClass()) {
            k03 k03Var = (k03) obj;
            if (this.d == k03Var.d && this.e == k03Var.e && this.a.equals(k03Var.a) && this.b.equals(k03Var.b) && this.c.equals(k03Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + ((((this.d + 527) * 31) + this.e) * 31)) * 31)) * 31);
    }
}
