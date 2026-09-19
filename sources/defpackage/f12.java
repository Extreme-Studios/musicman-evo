package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f12 implements il0 {
    public final int a;

    public f12(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f12) && this.a == ((f12) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return ec.j(new StringBuilder(String.valueOf(i).length() + 19), "Mp4AlternateGroup: ", i);
    }
}
