package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i83 {
    public final yd3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public i83(yd3 yd3Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        hn.v(!z3 || z);
        hn.v(!z2 || z);
        this.a = yd3Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final i83 a(long j) {
        return j == this.b ? this : new i83(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final i83 b(long j) {
        return j == this.c ? this : new i83(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i83.class == obj.getClass()) {
            i83 i83Var = (i83) obj;
            if (this.b == i83Var.b && this.c == i83Var.c && this.d == i83Var.d && this.e == i83Var.e && this.f == i83Var.f && this.g == i83Var.g && this.h == i83Var.h && Objects.equals(this.a, i83Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 29791) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
