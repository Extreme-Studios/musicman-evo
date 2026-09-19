package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z11 {
    public final int a;
    public final cy0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public z11(cy0 cy0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = cy0Var.a;
        this.a = i;
        hn.v(i == iArr.length && i == zArr.length);
        this.b = cy0Var;
        this.c = z && i > 1;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z11.class == obj.getClass()) {
            z11 z11Var = (z11) obj;
            if (this.c == z11Var.c && this.b.equals(z11Var.b) && Arrays.equals(this.d, z11Var.d) && Arrays.equals(this.e, z11Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
