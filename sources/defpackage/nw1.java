package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nw1 {
    public static final nw1 c = new nw1(-1, -1);
    public final int a;
    public final int b;

    static {
        new nw1(0, 0);
    }

    public nw1(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        hn.v(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof nw1) {
            nw1 nw1Var = (nw1) obj;
            if (this.a == nw1Var.a && this.b == nw1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
