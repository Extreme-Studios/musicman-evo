package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eg0 extends bg0 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public eg0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eg0.class != obj.getClass()) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return this.b == eg0Var.b && this.c == eg0Var.c && this.d == eg0Var.d && Arrays.equals(this.e, eg0Var.e) && Arrays.equals(this.f, eg0Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
