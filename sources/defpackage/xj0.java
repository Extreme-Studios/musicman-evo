package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements Comparable {
    public final int f;
    public final tj0 g;

    public xj0(int i, tj0 tj0Var) {
        this.f = i;
        this.g = tj0Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f, ((xj0) obj).f);
    }
}
