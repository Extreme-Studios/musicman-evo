package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pe3 {
    public final int a;
    public final boolean b;

    public pe3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pe3.class != obj.getClass()) {
            return false;
        }
        pe3 pe3Var = (pe3) obj;
        return this.a == pe3Var.a && this.b == pe3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
