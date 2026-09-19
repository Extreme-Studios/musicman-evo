package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 {
    public final cc3 a;

    static {
        new mn0(3).d();
        String str = qz1.a;
        Integer.toString(0, 36);
    }

    public /* synthetic */ xq0(cc3 cc3Var) {
        this.a = cc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xq0) {
            return this.a.equals(((xq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
