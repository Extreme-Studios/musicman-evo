package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ru0 {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public ru0(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return s90.d(this.a, ru0Var.a) && this.b == ru0Var.b && this.c == ru0Var.c && this.e == ru0Var.e && Double.compare(this.d, ru0Var.d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        vg2 vg2Var = new vg2(this);
        vg2Var.b(this.a, "name");
        vg2Var.b(Double.valueOf(this.c), "minBound");
        vg2Var.b(Double.valueOf(this.b), "maxBound");
        vg2Var.b(Double.valueOf(this.d), "percent");
        vg2Var.b(Integer.valueOf(this.e), "count");
        return vg2Var.toString();
    }
}
