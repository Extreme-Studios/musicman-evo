package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd3 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public yd3(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final yd3 a(Object obj) {
        return this.a.equals(obj) ? this : new yd3(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd3)) {
            return false;
        }
        yd3 yd3Var = (yd3) obj;
        return this.a.equals(yd3Var.a) && this.b == yd3Var.b && this.c == yd3Var.c && this.d == yd3Var.d && this.e == yd3Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public yd3(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public yd3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
