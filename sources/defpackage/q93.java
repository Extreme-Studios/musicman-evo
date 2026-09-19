package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q93 {
    public final long a;
    public final ox0 b;
    public final int c;
    public final yd3 d;
    public final long e;
    public final ox0 f;
    public final int g;
    public final yd3 h;
    public final long i;
    public final long j;

    public q93(long j, ox0 ox0Var, int i, yd3 yd3Var, long j2, ox0 ox0Var2, int i2, yd3 yd3Var2, long j3, long j4) {
        this.a = j;
        this.b = ox0Var;
        this.c = i;
        this.d = yd3Var;
        this.e = j2;
        this.f = ox0Var2;
        this.g = i2;
        this.h = yd3Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q93.class != obj.getClass()) {
            return false;
        }
        q93 q93Var = (q93) obj;
        return this.a == q93Var.a && this.c == q93Var.c && this.e == q93Var.e && this.g == q93Var.g && this.i == q93Var.i && this.j == q93Var.j && this.b.equals(q93Var.b) && Objects.equals(this.d, q93Var.d) && Objects.equals(this.f, q93Var.f) && Objects.equals(this.h, q93Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
