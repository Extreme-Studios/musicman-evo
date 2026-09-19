package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    public static final s2 h = new s2("320x50_mb", 320, 50);
    public static final s2 i = new s2("468x60_as", 468, 60);
    public static final s2 j = new s2("320x100_as", 320, 100);
    public static final s2 k = new s2("728x90_as", 728, 90);
    public static final s2 l = new s2("300x250_as", 300, 250);
    public static final s2 m = new s2("160x600_as", 160, 600);
    public static final s2 n = new s2("smart_banner", -1, -2);
    public static final s2 o = new s2("fluid", -3, -4);
    public static final s2 p = new s2("invalid", 0, 0);
    public static final s2 q = new s2("50x50_mb", 50, 50);
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    static {
        new s2("search_v2", -3, 0);
    }

    public s2(String str, int i2, int i3) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            j7.p(ec.j(new StringBuilder(String.valueOf(i2).length() + 26), "Invalid width for AdSize: ", i2));
            throw null;
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            j7.p(ec.j(new StringBuilder(String.valueOf(i3).length() + 27), "Invalid height for AdSize: ", i3));
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return this.a == s2Var.a && this.b == s2Var.b && this.c.equals(s2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s2(int i2, int i3) {
        String strValueOf;
        if (i2 == -1) {
            strValueOf = "FULL";
        } else {
            strValueOf = String.valueOf(i2);
        }
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        this(ec.o(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"), i2, i3);
    }
}
