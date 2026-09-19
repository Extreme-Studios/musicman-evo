package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lf3 {
    public final long a;
    public final long b;

    public lf3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3Var = (lf3) obj;
        return this.a == lf3Var.a && this.b == lf3Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
