package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yf0 extends bg0 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public yf0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yf0.class != obj.getClass()) {
            return false;
        }
        yf0 yf0Var = (yf0) obj;
        return Objects.equals(this.b, yf0Var.b) && this.c.equals(yf0Var.c) && this.d.equals(yf0Var.d) && Arrays.equals(this.e, yf0Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.c;
        int length3 = str3.length() + length2 + 14;
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(str4.length() + length3);
        ec.x(sb, str, ": mimeType=", str2, ", filename=");
        return ec.n(sb, str3, ", description=", str4);
    }
}
