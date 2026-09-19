package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class l82 {
    public final long a;
    public final long b;
    public long e;
    public long d = 5;
    public final Random f = new Random();
    public long c = 0;

    public l82(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.e = j;
    }

    public final boolean a() {
        ix0 ix0Var = lx0.G;
        tu0 tu0Var = tu0.e;
        return ((Integer) tu0Var.c.a(ix0Var)).intValue() >= 0 && this.c > Math.max(this.d, (long) ((Integer) tu0Var.c.a(ix0Var)).intValue()) && this.e >= this.b;
    }
}
