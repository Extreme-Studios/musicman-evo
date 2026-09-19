package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i61 {
    public static final i61 d = new i61(1.0f, 0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public i61(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i61) {
            i61 i61Var = (i61) obj;
            if (this.a == i61Var.a && this.b == i61Var.b && this.c == i61Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((this.a + 217) * 31) + this.b) * 31);
    }
}
