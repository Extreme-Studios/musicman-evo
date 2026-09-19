package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class up0 {
    public static final up0 d = new up0(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public up0(float f, float f2) {
        hn.v(f > 0.0f);
        hn.v(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && up0.class == obj.getClass()) {
            up0 up0Var = (up0) obj;
            if (this.a == up0Var.a && this.b == up0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = qz1.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
