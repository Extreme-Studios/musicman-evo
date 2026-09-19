package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c93 {
    public static final c93 c;
    public static final c93 d;
    public final long a;
    public final long b;

    static {
        c93 c93Var = new c93(0L, 0L);
        new c93(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new c93(Long.MAX_VALUE, 0L);
        new c93(0L, Long.MAX_VALUE);
        d = c93Var;
    }

    public c93(long j, long j2) {
        hn.v(j >= 0);
        hn.v(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c93.class == obj.getClass()) {
            c93 c93Var = (c93) obj;
            if (this.a == c93Var.a && this.b == c93Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
