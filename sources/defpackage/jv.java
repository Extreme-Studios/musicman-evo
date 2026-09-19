package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jv implements p9 {
    public final Class a;

    public jv(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.p9
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jv) {
            return this.a.equals(((jv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
