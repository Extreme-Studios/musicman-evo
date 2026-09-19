package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p93 extends IllegalStateException {
    public final int f;
    public final int g;

    public p93(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? ec.k(new StringBuilder(String.valueOf(i2).length() + 31), "Player stuck suppressed for ", i2, " ms") : ec.k(new StringBuilder(String.valueOf(i2).length() + 43), "Player stuck playing without ending for ", i2, " ms") : ec.k(new StringBuilder(String.valueOf(i2).length() + 45), "Player stuck playing with no progress for ", i2, " ms") : ec.k(new StringBuilder(String.valueOf(i2).length() + 47), "Player stuck buffering with no progress for ", i2, " ms") : ec.k(new StringBuilder(String.valueOf(i2).length() + 46), "Player stuck buffering and not loading for ", i2, " ms"));
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p93.class != obj.getClass()) {
            return false;
        }
        p93 p93Var = (p93) obj;
        return this.f == p93Var.f && this.g == p93Var.g;
    }

    public final int hashCode() {
        return ((this.f + 527) * 31) + this.g;
    }
}
