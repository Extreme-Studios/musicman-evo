package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends bg0 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final bg0[] g;

    public vf0(String str, int i, int i2, long j, long j2, bg0[] bg0VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = bg0VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vf0.class != obj.getClass()) {
            return false;
        }
        vf0 vf0Var = (vf0) obj;
        return this.c == vf0Var.c && this.d == vf0Var.d && this.e == vf0Var.e && this.f == vf0Var.f && this.b.equals(vf0Var.b) && Arrays.equals(this.g, vf0Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((this.c + 527) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
