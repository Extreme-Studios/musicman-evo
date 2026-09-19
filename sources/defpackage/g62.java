package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g62 implements e62 {
    public final String a;

    public g62(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g62) {
            return this.a.equals(((g62) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
