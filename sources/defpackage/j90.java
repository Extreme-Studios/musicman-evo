package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j90 {
    public String a;
    public int b;
    public String c;
    public String d;
    public qd e;
    public qd f;
    public long g;
    public long h;
    public long i;
    public kb j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    static {
        yp.f("WorkSpec");
    }

    public final long a() {
        int i;
        if (this.b == 1 && (i = this.k) > 0) {
            int i2 = this.l;
            long j = this.m;
            return Math.min(18000000L, i2 == 2 ? j * ((long) i) : (long) Math.scalb(j, i - 1)) + this.n;
        }
        if (this.h == 0) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.n;
        if (j2 == 0) {
            j2 = this.g + jCurrentTimeMillis2;
        }
        long j3 = this.i;
        long j4 = this.h;
        if (j3 != j4) {
            return j2 + j4 + (j2 == 0 ? (-1) * j3 : 0L);
        }
        return j2 + (j2 != 0 ? j4 : 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j90.class != obj.getClass()) {
            return false;
        }
        j90 j90Var = (j90) obj;
        if (this.g != j90Var.g || this.h != j90Var.h || this.i != j90Var.i || this.k != j90Var.k || this.m != j90Var.m || this.n != j90Var.n || this.o != j90Var.o || this.p != j90Var.p || this.q != j90Var.q || !this.a.equals(j90Var.a) || this.b != j90Var.b || !this.c.equals(j90Var.c)) {
            return false;
        }
        String str = this.d;
        String str2 = j90Var.d;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return this.e.equals(j90Var.e) && this.f.equals(j90Var.f) && this.j.equals(j90Var.j) && this.l == j90Var.l && this.r == j90Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((ec.z(this.b) + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.g;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iZ = (ec.z(this.l) + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (iZ + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return ec.z(this.r) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return ec.m(new StringBuilder("{WorkSpec: "), this.a, "}");
    }
}
