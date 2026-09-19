package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f83 {
    public final long a;
    public final float b;
    public final long c;

    public /* synthetic */ f83(e83 e83Var) {
        this.a = e83Var.a;
        this.b = e83Var.b;
        this.c = e83Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return this.a == f83Var.a && this.b == f83Var.b && this.c == f83Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
