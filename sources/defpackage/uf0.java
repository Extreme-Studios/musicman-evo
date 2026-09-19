package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 extends bg0 {
    public final byte[] b;

    public uf0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uf0.class != obj.getClass()) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        return this.a.equals(uf0Var.a) && Arrays.equals(this.b, uf0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ((this.a.hashCode() + 527) * 31);
    }
}
