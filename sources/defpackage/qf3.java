package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf3 implements Comparable {
    public final boolean f;
    public final boolean g;

    public qf3(de3 de3Var, int i) {
        this.f = 1 == (de3Var.e & 1);
        this.g = yc3.I(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qf3 qf3Var = (qf3) obj;
        return nj2.a.d(this.g, qf3Var.g).d(this.f, qf3Var.f).e();
    }
}
