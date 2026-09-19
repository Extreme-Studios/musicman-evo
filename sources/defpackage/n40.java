package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {
    public final long a;
    public final long b;
    public final int c;

    public n40(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return this.a == n40Var.a && this.b == n40Var.b && this.c == n40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Topic { ".concat("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
