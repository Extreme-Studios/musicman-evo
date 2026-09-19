package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class sl2 implements Serializable {
    public static final sl2 h = new sl2(new int[0], 0);
    public final int[] f;
    public final int g;

    public sl2(int[] iArr, int i) {
        this.f = iArr;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        sl2 sl2Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof sl2) && (i2 = this.g) == (i = (sl2Var = (sl2) obj).g)) {
            for (int i3 = 0; i3 < i2; i3++) {
                hn.P(i3, i2);
                int i4 = this.f[i3];
                hn.P(i3, i);
                if (i4 == sl2Var.f[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.g; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
