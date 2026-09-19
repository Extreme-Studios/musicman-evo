package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class gn {
    public static final gn e = new gn(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gn(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static gn a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new gn(i, i2, i3, i4);
    }

    public static gn b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return z6.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gn.class != obj.getClass()) {
            return false;
        }
        gn gnVar = (gn) obj;
        return this.d == gnVar.d && this.a == gnVar.a && this.c == gnVar.c && this.b == gnVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
