package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class le0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public le0(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || le0.class != obj.getClass()) {
            return false;
        }
        le0 le0Var = (le0) obj;
        return this.a == le0Var.a && this.c == le0Var.c && this.d == le0Var.d && Arrays.equals(this.b, le0Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
