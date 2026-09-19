package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class dr2 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public dr2() {
        dr2 dr2Var = w40.v;
        this.a = Arrays.copyOf(dr2Var.a, 10);
        this.b = Arrays.copyOf(dr2Var.b, 10);
        this.c = Arrays.copyOf(dr2Var.c, 10);
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(dr2 dr2Var, int i) {
        s90.E(this.a, dr2Var.a, i);
        s90.E(this.b, dr2Var.b, i);
        s90.E(this.c, dr2Var.c, i);
    }

    public dr2(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
