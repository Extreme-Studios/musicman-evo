package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a22 implements il0 {
    public final float a;
    public final float b;

    public a22(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        hn.B("Invalid latitude or longitude", z);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a22.class == obj.getClass()) {
            a22 a22Var = (a22) obj;
            if (this.a == a22Var.a && this.b == a22Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + ((Float.hashCode(this.a) + 527) * 31);
    }

    public final String toString() {
        float f = this.a;
        int length = String.valueOf(f).length();
        float f2 = this.b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f2).length());
        sb.append("xyz: latitude=");
        sb.append(f);
        sb.append(", longitude=");
        sb.append(f2);
        return sb.toString();
    }
}
