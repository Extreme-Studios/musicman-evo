package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eu0 {
    public final long a;
    public final String b;
    public final int c;

    public eu0(int i, long j, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return eu0Var.a == this.a && eu0Var.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
