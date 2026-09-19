package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z3 {
    public final int a;
    public final z61 b;
    public final s3 c;
    public final String d;

    public z3(z61 z61Var, s3 s3Var, String str) {
        this.b = z61Var;
        this.c = s3Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{z61Var, s3Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return s90.d(this.b, z3Var.b) && s90.d(this.c, z3Var.c) && s90.d(this.d, z3Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
