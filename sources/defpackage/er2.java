package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er2 extends dr2 {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public er2(vg2 vg2Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.d = jArr3;
        r52 r52Var = (r52) vg2Var.g;
        s90.F(jArr, (long[]) r52Var.h, (long[]) r52Var.g);
        s90.M(jArr2, (long[]) r52Var.h, (long[]) r52Var.g);
        System.arraycopy((long[]) r52Var.i, 0, jArr3, 0, 10);
        s90.Z(jArr4, (long[]) vg2Var.h, fr2.b);
    }

    @Override // defpackage.dr2
    public final void a(long[] jArr, long[] jArr2) {
        s90.Z(jArr, jArr2, this.d);
    }
}
