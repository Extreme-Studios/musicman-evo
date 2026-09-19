package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pf3 extends xf3 implements Comparable {
    public final int j;
    public final int k;

    public pf3(int i, cy0 cy0Var, int i2, sf3 sf3Var, int i3) {
        int i4;
        super(i, cy0Var, i2);
        this.j = yc3.I(i3, sf3Var.B) ? 1 : 0;
        de3 de3Var = this.i;
        int i5 = de3Var.t;
        int i6 = -1;
        if (i5 != -1 && (i4 = de3Var.u) != -1) {
            i6 = i5 * i4;
        }
        this.k = i6;
    }

    @Override // defpackage.xf3
    public final int a() {
        return this.j;
    }

    @Override // defpackage.xf3
    public final /* bridge */ /* synthetic */ boolean b(xf3 xf3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.k, ((pf3) obj).k);
    }
}
