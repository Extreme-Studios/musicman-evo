package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class kr2 extends Number {
    public final String f;

    public kr2(String str) {
        this.f = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kr2) {
            return this.f.equals(((kr2) obj).f);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f;
    }
}
