package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fg0 extends bg0 {
    public final String b;
    public final byte[] c;

    public fg0(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fg0.class != obj.getClass()) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return this.b.equals(fg0Var.b) && Arrays.equals(this.c, fg0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String str = this.a;
        int length = str.length() + 8;
        String str2 = this.b;
        return ec.n(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
