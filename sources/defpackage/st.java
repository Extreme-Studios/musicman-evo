package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return this.a == stVar.a && this.b == stVar.b && this.c == stVar.c && this.d == stVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.a + " Validated=" + this.b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}
